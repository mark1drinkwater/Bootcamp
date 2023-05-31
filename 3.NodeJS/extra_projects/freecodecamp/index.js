const express = require('express')
const mongoose = require('mongoose')
require('dotenv').config()
const app = express()
const routes = require('./routes/routes')

// const mongoString = process.env.DATABASE_URL

// still had to change it to 127.0.0.1 hmm
mongoose.connect("mongodb://127.0.0.1:27017/testDatabase",
{ useNewUrlParser: true });

const database = mongoose.connection;

database.on('error', (error) => {
    console.log(error)
})

database.once('connected', () => {
    console.log('Database Connected')
})


app.use(express.json())
app.use('/api', routes)

app.listen(3000, () => {
    console.log(`Server started on port 3000`)
})