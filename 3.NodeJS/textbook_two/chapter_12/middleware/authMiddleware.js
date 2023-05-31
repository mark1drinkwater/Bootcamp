const User = require('../models/User')

module.exports = (req, res, next) => {
    console.log('autttttttttttth')
    User.findById(req.session.userId, (error, user) => {
        // if error occurs or can't find user then redirect user to home page
        if (error || !user)
            return res.redirect('/')
        next()        
    })
}