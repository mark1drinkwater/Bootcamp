const express = require('express');
const router = express.Router();
const Model = require('../model/model')

//Post method
router.post('/post', (req, res) => {
    console.log('attempting to create model')

    Model.create({
        name: req.body.name,
        age: req.body.age
    })
        .then(data => {
            res.status(200).json(data)
        })
        .catch(error => {
            res.status(400).json({ message: error.message })

        })
})

//Get all method
router.get('/getAll', async (req, res) => {
    try {
        const data = await Model.find();
        res.json(data)
    } catch (error) {
        res.status(500).json({ message: error.message })
    }
})

//Get by ID method
router.get('/getOne/:id', (req, res) => {
    Model.findById(req.params.id)
        .then(data => res.json(data))
        .catch(error => res.status(500).json({ message: error.message }))
})

//Update by ID method
router.patch('/update/:id', async (req, res) => {
    //Update by ID Method
    try {
        const id = req.params.id;
        const updatedData = req.body;
        // whether to return updated data in body or not
        const options = { new: true };

        const result = await Model.findByIdAndUpdate(
            id, updatedData, options
        )

        res.send(result)
    }
    catch (error) {
        res.status(400).json({ message: error.message })
    }
})

//Delete by ID method
router.delete('/delete/:id', async (req, res) => {
    try {
        const id = req.params.id
        const data = await Model.findByIdAndDelete(id)
        res.send(`Document with ${data.name} has been deleted`)
    }
    catch (error) {
        res.status(400).json({message: error.message})
    }
})

module.exports = router;