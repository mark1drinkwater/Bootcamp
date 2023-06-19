const mongoose = require('mongoose');

const Tutorial = mongoose.model(
    'Tutorial',
    new mongoose.Schema({
        title: String,
        author: String,
        images: [],
        comments: [
            {
                type: mongoose.Schema.Types.ObjectId,
                // Ref helps us get full fields of Comment when we call populate()
                ref: 'Comment'
            }
        ],
        category: {
            type: mongoose.Schema.Types.ObjectId,
            ref: 'Category'
        }
    })
)

module.exports = Tutorial;