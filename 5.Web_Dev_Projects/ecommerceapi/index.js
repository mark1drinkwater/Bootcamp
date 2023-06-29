const express = require("express");
const app = express();
const mongoose = require("mongoose");

mongoose.connect("")
.then(() => console.log("DBConnection Successful!"))
.catch((error) => {
    console.log(error);
});

app.listen(5000, ()=> {
    console.log("Backend server is running!");
});