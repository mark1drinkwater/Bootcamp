const express = require("express");
const app = express();
const mongoose = require("mongoose");

mongoose.connect("mongodb+srv://admin:razRJv5W8vtcfOM6@cluster0.1ztmqpn.mongodb.net/shop?retryWrites=true&w=majority")
.then(() => console.log("DBConnection Successful!"))
.catch((error) => {
    console.log(error);
});

app.listen(5000, ()=> {
    console.log("Backend server is running!");
});