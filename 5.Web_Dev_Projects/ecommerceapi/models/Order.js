const mongoose = require("mongoose");

const OrderSchema = new mongoose.Schema(
    {
        userId: { 
            type: mongoose.Schema.Types.ObjectId,
            // Ref helps us get full fields of Comment when we call populate()
            ref: 'userId' 
        },
        products: [
            {
                productId: {
                    type: String,
                },
                quantity:{
                    type: Number,
                    default:1,
                }
            }
        ],
        amount: {type: Number, required: true},
        address: {type: Object, required: true},
        status: {type:String, default: "paid" },
    },
    { timestamps: true }
)

module.exports = mongoose.model("Order", OrderSchema);