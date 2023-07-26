const mongoose = require("mongoose");

const UserSchema = new mongoose.Schema(
    {
        username: { type: String, required: true, unique: true },
        email: { type: String, required: true, unique: true },
        firstName: {type: String, required: true},
        lastName: {type: String, required: true},
        password: { type: String, required: true, unique: false },
        isAdmin: {
            type: Boolean,
            default: false,
        },
        img: { type: String },
    },
    { timestamps: true }
)

module.exports = mongoose.model("User", UserSchema);