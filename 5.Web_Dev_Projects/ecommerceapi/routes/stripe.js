const router = require("express").Router();
const KEY = process.env.STRIPE_KEY
const stripe = require("stripe")(KEY);

router.post("/payment", (req, res) => {
  console.log("SK key", process.env.STRIPE_KEY)

  stripe.charges.create(
    {
      source: req.body.tokenId,
      amount: req.body.amount,
      currency: "usd",
    },
    (stripeErr, stripeRes) => {
      if (stripeErr) {
        console.log("Error occured in stripe", stripeErr)
        res.status(500).json(stripeErr);
      } else {
        res.status(200).json(stripeRes);
      }
    }
  );
});

module.exports = router;