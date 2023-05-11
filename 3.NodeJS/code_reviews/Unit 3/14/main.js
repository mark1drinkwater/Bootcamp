const mongoose = require("mongoose");
const Subscriber = require("./models/subscriber");

// Connect with mongoose instead of mongodb
mongoose.connect(
    "mongodb://127.0.0.1:27017/recipe_db",
    { useNewUrlParser: true }
);
const db = mongoose.connection;

db.once("open", () => {
    console.log("Successfully connected to MongoDB using Mongoose!");
});

// Exported the below code to a separate file.
// const subscriberSchema = mongoose.Schema({
//     name: String,
//     email: String,
//     zipCode: Number
// });

// const Subscriber = mongoose.model("Subscriber", subscriberSchema)

// Instantiate a new subscriber.
var subscriber1 = new Subscriber({
    name: "Jon Wexler",
    email: "jon@jonwexler.com"
});

// Save a subscriber to the database
subscriber1.save()
    .then(data => console.log(data)) // Log saved data document
    .catch(error => console.log(error)); // Log errors





// Create and save a subscriber in a single step.
Subscriber.create(
    {
        name: "Jon2 Wexler",
        email: "jon2@jonwexler.com"
    }
)
    .catch(err => console.log(err))





// Run a query
var myQuery = Subscriber.findOne({
    name: "Jon Wexler"
})
.where("email", /wexler/);

myQuery.exec()
.then(data => console.log(data))
.catch(err => console.log(err));
