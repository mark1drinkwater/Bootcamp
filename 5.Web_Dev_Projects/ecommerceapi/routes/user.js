"use strict";

const { verifyToken, verifyTokenAndAuthorization, verifyTokenAndAdmin } = require("./verifyToken");
const User = require("../models/User")
const CryptoJS = require("crypto-js")
const router = require("express").Router();

router.put("/:id", verifyTokenAndAuthorization, async (req, res) => {
    if (req.body.password) {
        req.body.password = CryptoJS.AES.encrypt(
            req.body.password, 
            process.env.PASS_SEC
        )
        .toString()
    }

    try {
        const updatedUser = await User.findByIdAndUpdate(req.params.id, {
            $set: req.body
        }, 
        {new:true}
        );
        res.status(200).json(updatedUser);
    } catch (error) {
        res.status(500).json(error);
    }
})

// DELETE
router.delete("/:id", verifyTokenAndAuthorization, async (req, res) => {
    try {
        await User.findByIdAndDelete(req.params.id);
        res.status(200).json("User has been deleted...");
    } catch (error) {
        res.status(500).json(error);
    }
})

//GET USER
router.get("/find/:id", verifyTokenAndAdmin, async (req, res) => {
    try {
        const user = await User.findById(req.params.id);
        // Exclude password field from being seny by destructuring.
        const { password, ...otherFields } = user._doc;
        res.status(200).json(otherFields);
    } catch(error) {
        res.status(500).json(error);
    }
})

//GET ALL USERS
router.get("/", verifyTokenAndAdmin, async (req, res) => {
    const query = req.query.new;
    try {
        const users = await User.find({});
        console.log(users);
        res.status(200).json(users);
    } catch(error) {
        res.status(500).json(error);
    }
})

module.exports = router;