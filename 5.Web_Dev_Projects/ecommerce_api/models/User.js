const mongoose = require("mongoose");

const UserSchema = new mongoose.Schema(
    {
        username: { type: String, required: [true, "Please provide a username."], unique: true },
        email: { type: String, required: [true, "Please provide a email."], unique: true },
        firstName: {type: String, required: [true, "Please provide your first name."]},
        lastName: {type: String, required: [true, "Please provide your last name."]},
        password: { type: String, required: [true, "Please provide your password."], unique: false },
        isAdmin: {
            type: Boolean,
            default: false,
        },
        img: { type: String },
    },
    { timestamps: true }
)

module.exports = mongoose.model("User", UserSchema);