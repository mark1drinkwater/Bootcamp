"use strict";
const port = 3000,
    express = require("express"),
    app = express();
// app.post("/", (req, res) => {
//     console.log("Params:", req.params);
//     console.log("Body:", req.body);
//     console.log("URL:", req.url);
//     console.log("Query:", req.query);
//     res.send("Hello, Universe!");
// })
// exports.sendReqParam = (req, res) => {
//     let veg = req.params.vegetable;
//     res.send(`This is the page for ${veg}`);
// }
const homeController = require("./controllers/homeController");

// app.use(
//     express.urlencoded({
//         extended: false
//     })
// );
// app.use(express.json());
// app.post("/", (req, res) => {
//     console.log(req.body);
//     console.log(req.query);
//     console.log(req.params);
//     res.send("POST Successful!");
// })
app.get("/items/:vegetable", homeController.sendReqParam)
    .listen(port, () => {
    console.log(`The Express.js server has started and is listening ➥ on port number: ${port}`);
});

