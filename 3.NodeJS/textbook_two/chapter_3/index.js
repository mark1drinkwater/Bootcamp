const express = require('express')
const app = new express()
const path = require('path');

app.use(express.static('public'))

app.get('/', (req, res) => {
    res.sendFile(path.resolve(__dirname, 'public/pages/index.html'))
})

app.get('/about', (req, res) => {
    res.sendFile(path.resolve(__dirname, 'public/pages/about.html'))
})
app.get('/contact', (req, res) => {
    res.sendFile(path.resolve(__dirname, 'public/pages/contact.html'))
})
app.get('/post', (req, res) => {
    res.sendFile(path.resolve(__dirname, 'public/pages/post.html'))
})

app.listen(4000, () => {
    console.log('App listening on port 4000')
})