"use strict";

const { verifyToken, verifyTokenAndAuthorization, verifyTokenAndAdmin } = require("./verifyToken");
const Product = require("../models/Product");
const Cart = require("../models/Cart");
const router = require("express").Router();

router.post("/", verifyTokenAndAuthorization, async (req, res) => {
    const newCart = new Product(req.body);

    try {
        const savedProduct = await newCart.save();
        res.status(200).json(savedProduct);
    } catch (error) {
        console.log("Error adding product to cart in DB", error)
        res.status(500).json(error);
    }
})

// UPDATE
router.put("/:id", verifyTokenAndAuthorization, async (req, res) => {
    try {
        const updatedCart = await Product.findByIdAndUpdate(
            req.params.id,
            {
                $set: req.body
            },
            { new: true }
        );
        res.status(200).json(updatedCart);
    } catch (error) {
        console.log("Error updating product in cart from DB", error)
        res.status(500).json(error);
    }
})

// DELETE
router.delete("/:id", verifyTokenAndAuthorization, async (req, res) => {
    try {
        await Cart.findByIdAndDelete(req.params.id);
        res.status(200).json("Cart has been deleted...");
    } catch (error) {
        console.log("Error deleting product in cart from DB", error)
        res.status(500).json(error);
    }
})

//GET USER CART
router.get("/find/:userId", verifyTokenAndAuthorization , async (req, res) => {
    try {
        const cart = await Cart.find({userId: req.params.userId});
        res.status(200).json(cart);
    } catch (error) {
        console.log("Error retrieving user's cart from DB", error)
        res.status(500).json(error);
    }
})

//GET ALL
router.get("/", verifyTokenAndAdmin, async(req, res) => {
    try {
        const carts = await Cart.find();
        res.status(200).json(carts);
    } catch (error) {
        console.log("Error retrieving all carts from DB", error)
        res.status(500).json(error);
    }
})

module.exports = router;