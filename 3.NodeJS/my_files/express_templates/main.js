const express = require("express"),
    homeController = require("./controllers/homeController"),
    app = express(),
    layouts = require("express-ejs-layouts");
app.set("port", process.env.PORT || 3000);
app.set("view engine", "ejs");
// app.get("/items/:vegetable", homeController.sendReqParam);
app.get("/name/:myName", homeController.respondWithName)
app.use(layouts)
app.listen(app.get("port"), () => {
    console.log("The Express.js server has started and is listening on port number: " + app.get("port"));
})