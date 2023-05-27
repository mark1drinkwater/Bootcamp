const express = require('express') // require express module
const app = express() // calls express function to start new Express app
const path = require('path')
app.use(express.static('public'))

app.listen(3000, () => {
    console.log("App listening on port 3000")
})

app.get('/', (req, res) => {
    // res.json({
    //     name: 'Greg Lim'
    // })

    // The below single line would otherwise take 45 lines to implement
    // Node needs an absolute path that's why we need to resolve it
    res.sendFile(path.resolve(__dirname, 'index.html'))
})

app.get('/about', (req, res) => {
    // res.json({
    //     name: 'Greg Lim'
    // })
    res.sendFile(path.resolve(__dirname, 'about.html'))
})

app.get('/contact', (req, res) => { //called when request to /contact comes
    res.sendFile(path.resolve(__dirname, 'contact.html'))
})