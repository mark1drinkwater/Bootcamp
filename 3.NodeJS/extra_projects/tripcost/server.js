const express = require("express");
const { MongoClient } = require("mongodb");

const app = express();
const url = "mongodb://127.0.0.1:27017/tripcost"

const client = new MongoClient(url)

let db, trips, expenses;

async function run() {
    try {
        await client.connect("tripcost");

        await client.db("tripcost").command({ ping: 1 });

        db = client.db()
        trips = db.collection("trips");
        expenses = db.collection("expenses")


        console.log("Successfully connected to MongoDB")
    } catch (err) {

    }
}

run()

app.use(express.json())

app.post("/trip", async (req, res) => {
    console.log(req.body)
    const name = req.body.name;

try {
    const result = await trips.insertOne({ name: name });
    console.log(result);
    res.status(200).json({ status: "success" });
  } catch (err) {
    console.error(err);
    res.status(500).json({ err: err });
  }
})

app.get("/trips", (req, res) =>  {
    trips.find({}).toArray()
        .then( (items) => {
            res.status(200).json({ trips: items })
        })
        .catch( (err) => {
            console.log(err)
            res.status(500).json({ err: err })

        })
})

app.get("/expenses", (req, res) => {
    expenses.find({ trip: req.body.trip }).toArray()
    .then(items => {
        res.status(200).json({ expenses: items })
    })
    .catch( err => {
        console.error(err)
        res.status(500).json({ err: err })
        return
    })
})

app.post("/expense", (req, res) => {
    expenses.insertOne(
        {
            trip: req.body.trip,
            date: req.body.date,
            amount: req.body.amount,
            category: req.body.category,
            description: req.body.description,
        }
    )
    .then( result => res.status(200).json({ status: "success" }))
    .catch( err => res.status(500).json({ err: err }) )
})

app.listen(3000, () => console.log("Server ready on port 3000"))