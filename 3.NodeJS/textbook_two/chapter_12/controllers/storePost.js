const BlogPost = require('../models/BlogPost.js')
const path = require('path')

module.exports = async (req, res) => {
    let image
    if (req.files) {
        image = req.files.image
    } else {
        const validationErrors = 'Please upload a image.';

    }

    // image.mv(path.resolve(__dirname, '..', 'public/img', image.name),
    //     async (error) => {
    //         //Need to use a try-catch block with async await functions
    //         try {
    //             await BlogPost.create({
    //                 // destructuring
    //                 ...req.body,
    //                 image: '/img/' + image.name
    //             })
    //         } catch (error) {
    //             const validationErrors = Object.keys(error.errors).map(key => error.errors[key].message)
    //             req.flash('validationErrors', validationErrors)
    //             req.flash('data', req.body)

    //             return res.redirect('/posts/new');
    //         }

    //         res.redirect('/')
    //     })

    let imgPath;
    let imageResult;

    try {
        imgResult = await image.mv(path.resolve(__dirname, '..', 'public/img', image.name));
        imgPath = '/img/' + image.name;
    } catch (error) {
        imgPath = null;
    }

    try {
        await BlogPost.create({
            // destructuring
            ...req.body,
            image: imgPath
        })
    } catch (error) {
        const validationErrors = Object.keys(error.errors).map(key => error.errors[key].message)

        req.flash('validationErrors', validationErrors)
        req.flash('data', req.body)

        return res.redirect('/posts/new');
    }

    res.redirect('/')
}