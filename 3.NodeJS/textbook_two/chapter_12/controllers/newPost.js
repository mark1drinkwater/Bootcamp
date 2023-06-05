module.exports = (req, res) => {
    let title = "";
    let body = "";
    const data = req.flash('data')[0];

    console.log("Retrieving data:", data)

    if (typeof data != "undefined") {
        title = data.title
        body = data.body
    }

    res.render("create", {
        errors: req.flash('validationErrors'),
        title,
        body,
    })
}