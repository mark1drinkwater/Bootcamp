const mongoose = require("mongoose"),
    Subscriber = require("./models/subscriber");
mongoose.connect(
    "mongodb://127.0.0.1:27017/recipe_db",
    { useNewUrlParser: true }
);
mongoose.Promise = global.Promise;


Subscriber.create({
    name: "Jon",
    email: "john@gmail.com",
    zipCode: 12345
})
Subscriber.create({
    name: "Jon3",
    email: "john3@gmail.com",
    zipCode: 12345
})
Subscriber.create({
    name: "Jon4",
    email: "john4@gmail.com",
    zipCode: 12345
})
    .then(result => {
        console.log("result");
        console.log(result);
    })
    .catch(err => {
        console.log("err");
        console.log(err);
    })




// How to find subscribers    
Subscriber.findOne({
    name: "Jon Wexler"
})
    .then(result => {
        console.log(result);
    });




Subscriber.findOne({
    name: "Jon"
})
    .then(subscr => {
        console.log("Finding local subscribers")
        subscr.findLocalSubscribers()
            .then(result => {
                console.log(result)
            })
    })
    .catch(error => {
        console.log("Error occurred");
        console.log(error);
    })



const Course = require("./models/course");
var testCourse, testSubscriber;
Course.create({
    title: "Tomato Land",
    description: "Locally farmed tomatoes only",
    zipCode: 12345,
    items: ["cherry", "heirloom"]
}).then(course => testCourse = course);

Subscriber.findOne({}).then(
    subscriber => testSubscriber = subscriber
);
testSubscriber.courses.push(testCourse._id);
testSubscriber.save();
Subscriber.populate(testSubscriber, "courses").then(subscriber =>
    console.log(subscriber)
);



const User = require("./models/user");
var testUser;
User.create({
    name: {
        first: "Jon",
        last: "Wexler"
    },
    email: "jon@jonwexler.com",
    password: "pass123"
})
    .then(user => testUser = user)
    .catch(error => console.log(error.message));