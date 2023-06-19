const mongoose = require('mongoose');
const db = require('./models');

const createTutorial = function (tutorial) {
    // Want to return the database after creation
    // So that we can work with the latest database object
    return db.Tutorial.create(tutorial)
        .then(docTutorial => {
            console.log('\n>> Created Tutorial:\n', docTutorial)
            return docTutorial;
        })
}

const createImage = function (tutorialId, image) {
    return db.Image
        // First create image in it's own collection
        .create(image)
        //Then add the image id to the tutorial collection.
        .then(docImage => {
            console.log('\n>> Created Image:\n', image);
            return db.Tutorial.findByIdAndUpdate(
                tutorialId,
                {
                    $push: {
                        images: {
                            // Added _id:
                            _id: docImage._id,
                            url: image.url,
                            caption: image.caption
                        }
                    }
                },
                { new: true, useFindAndModify: false }
            );
        })
};

// First create the comment in the comment collection, then
//
// Find the record in the tutorial collection by it's id
// Then add the id of the record in the comment collection
// Into the Tutorial collection comment field, which is an array
// to reference.
const createComment = function (tutorialId, comment) {
    return db.Comment.create(comment).then(docComment => {
        return db.Tutorial.findByIdAndUpdate(
            tutorialId,
            { $push: { comments: docComment._id } },
            { new: true, useFindAndModify: false }
        )
    })
}

// The comments array field of Tutorial contains reference IDS to comments.
// Let's use that to extract the information from comments and display it within the tutorial collection.
const getTutorialWithPopulate = function(id) {
    return db.Tutorial.findById(id).populate('comments', '-_id -__v');
}

const run = async function () {

    var tutorial = await createTutorial({
        title: 'Tutorial #2',
        author: 'bezkoder'
    });

    // tutorial = await createImage(tutorial._id, {
    //     path: 'sites/uploads/images/one-to-many.png',
    //     url: '/images/one-to-many.png',
    //     caption: 'One to Many Relationship',
    //     createdAt: Date.now()
    // });

    tutorial = await createComment(tutorial._id, {
        username: 'jack',
        text: 'This is a great tutorial.',
        createdAt: Date.now()
    });
    console.log("\n>> Tutorial:\n", tutorial);

    tutorial = await createComment(tutorial._id, {
        username: "mary",
        text: "Thank you, it helps me alot.",
        createdAt: Date.now()
    });    
    console.log('\n>> Tutorial Without Population:\n', tutorial);
    
    tutorial = await getTutorialWithPopulate(tutorial._id);    
    console.log('\n>> Populated Tutorial:\n', tutorial);
}

mongoose
    .connect('mongodb://127.0.0.1/case_2', {
        useNewUrlParser: true,
        useUnifiedTopology: true
    })
    .then((connection) => {
        // Drop the database for me
        connection.db.dropDatabase();
        console.log('Successfully connected to MongoDB.');
    })
    .catch(err => console.error('Connection error', err))


run();