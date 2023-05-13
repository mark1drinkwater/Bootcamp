const mongoose = require("mongoose");
const express = require("express");
const app = express();

const subscriberSchema = new mongoose.Schema({
    name: {
      type: String,
      required: true // New property
    },
    email: {
      type: String,
      required: true, // New property
      lowercase: true, // New property
      unique: true // New property
    },
    zipCode: {
      type: Number, // New property
      min: [10000, "Zip code too short"], // New property
      max: 99999 // New property
    },
    courses: [{ type: mongoose.Schema.Types.ObjectId, ref: "Course" }]
  });

  const Subscriber = module.exports = mongoose.model("Subscriber", subscriberSchema);
  console.log('Attempting to connect to mongodb')

mongoose.connect(
  "mongodb://127.0.0.1:27017/recipe_db",
  { useNewUrlParser: true }
);
const db = mongoose.connection;

console.log('Connecting to mongo db... ')
db.once("open", () => {
  console.log("Successfully connected to MongoDB using Mongoose!");
});

app.set("port", process.env.PORT || 3000);
app.set("view engine", "ejs");

app.use(express.json());
app.use(express.urlencoded({ extended: true }));

console.log('Attempting to create new subscriber')
var subscriber1 = new Subscriber({
  name: "Jon Wexler",
  email: "jon@jonwexler.com"
});

console.log('Attemping to  saving new subscriber');
subscriber1.save()
  .then(data => console.log(data)) // Log saved data document
  .catch(error => console.log(error));

app.listen(app.get("port"), () => {
  console.log(`Server running at http://localhost:${app.get("port")}`);
});