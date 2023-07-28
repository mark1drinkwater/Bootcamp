"use strict";

const { verifyToken, verifyTokenAndAuthorization, verifyTokenAndAdmin } = require("./verifyToken");
const Order = require("../models/Order")
const router = require("express").Router();

router.post("/", async (req, res) => {
    const newOrder = new Order(req.body);
  
    try {
      const savedOrder = await newOrder.save();
      res.status(200).json(savedOrder);
    } catch (err) {
      console.log("Error creating new order in DB", error)
      res.status(500).json(err);
    }
  });

// UPDATE
router.put("/:id", verifyTokenAndAdmin, async (req, res) => {
    try {
        const updatedOrder = await Order.findByIdAndUpdate(
            req.params.id,
            {
                $set: req.body
            },
            { new: true }
        );
        res.status(200).json(updatedOrder);
    } catch (error) {
        console.log("Error updating existing order in DB", error)
        res.status(500).json(error);
    }
})

// DELETE
router.delete("/:id", verifyTokenAndAdmin, async (req, res) => {
    try {
        await Order.findByIdAndDelete(req.params.id);
        res.status(200).json("Order has been deleted...");
    } catch (error) {
        console.log("Error deleting order in DB", error)
        res.status(500).json(error);
    }
})

//GET USER ORDERS
router.get("/find/:userId", verifyTokenAndAdmin, async (req, res) => {
    try {
        const orders = await Order.find({ userId: req.params.userId });
        res.status(200).json(orders);
    } catch (error) {
        console.log("Error retrieving order from user from DB", error)
        res.status(500).json(error);
    }
})

//GET ALL ORDERS
router.get("/", verifyTokenAndAdmin, async (req, res) => {
    const qNew = req.query.new;
    const qCategory = req.query.category;
    let products;
    try {
        const orders = await Order.find();
        // HELP
        const orders2 = await Order.find().populate('userId', '-_id -__v');
        console.log("Populated query", orders2);

        res.status(200).json(orders);
    } catch (error) {
      console.log("Error retrieving all orders from DB", error)
        res.status(500).json(error);
    }
})

//GET MONTHLY INCOME STATS
router.get("/income", verifyTokenAndAdmin, async (req, res) => {
    const productId = req.query.pid;
    const date = new Date();
    const lastMonth = new Date(date.setMonth(date.getMonth() - 1));
    const previousMonth = new Date(new Date().setMonth(lastMonth.getMonth() - 1));
  
    try {
      const income = await Order.aggregate([
        {
          $match: {
            createdAt: { $gte: previousMonth },
            ...(productId && {
              products: { $elemMatch: { productId } },
            }),
          },
        },
        {
          $project: {
            month: { $month: "$createdAt" },
            sales: "$amount",
          },
        },
        {
          $group: {
            _id: "$month",
            total: { $sum: "$sales" },
          },
        },
      ]);
      res.status(200).json(income);
    } catch (err) {
      console.log("Error retrieving order statistics from DB", error)
      res.status(500).json(err);
    }
  });

module.exports = router;