const express = require("express");
const app = express();
app.use(express.static("public"));
const layouts = require("express-ejs-layouts");

app.set("view engine", "ejs");
app.use(layouts);
const homeController = require("./controllers/homeController");
errorController = require("./controllers/errorController")

// Set the port
app.set("port", process.env.PORT || 3000);

// Middleware
app.use(express.json());
app.use(
    express.urlencoded({
        extended: false
    })
)

// Routing
// GET requests
app.get("/courses", homeController.showCourses);
app.get("/contact", homeController.showSignUp);
// POST request
app.post("/contact", homeController.postedSignUpForm);

// Root adress
app.get("/", (req, res) => {
    res.send("Welcome to Confetti Cuisin!");
})

// Error handling
app.use(errorController.pageNotFoundError);
app.use(errorController.internalServerError);

// Start the server
app.listen(app.get("port"), () => {
    console.log(`Server running at http://localhost:${app.get("port")}`);
})