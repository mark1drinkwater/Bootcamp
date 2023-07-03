const express = require("express");
const app = express();
const mongoose = require("mongoose");
const dotenv = require("dotenv");
const authRoute = require("./routes/auth");
const userRoute = require("./routes/user");

dotenv.config();

mongoose.connect(process.env.MONGO_URL)
.then(() => console.log("DBConnection Successful!"))
.catch((error) => {
    console.log(error);
});

app.use(express.json())

app.use("/api/v1/auth", authRoute);
app.use("/api/v1/users", userRoute);

app.listen(process.env.PORT || 5000, ()=> {
    console.log("Backend server is running!");
});