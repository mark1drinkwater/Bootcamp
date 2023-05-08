const httpStatus = require("http-status-codes");

exports.respondNoResourceFound = (req, res) => {
    let errorCode = httpStatus.NOT_FOUND;
    console.log(`400 ERROR occured`)
    res.status(errorCode);
    // res.send(`${errorCode} | The page does not exist!`);
    res.sendFile(`./public/${errorCode}.html`, {
        root: "./"
    })
};

exports.respondInternalError = (error, req, res, next) => {
    let errorCode = httpStatus.INTERNAL_SERVER_ERROR;
    console.log(`500 ERROR occured: ${error.stack}`)
    res.status(errorCode);
    // res.send(`${errorCode} | Sorry, our application is experiencing a problem!`)
    res.sendFile(`./public/${errorCode}.html`, {
        root: "./"
    })
}

exports.logErrors = (error, req, res, next) => {
    // console.error(error.stack)
    console.log("I am handling the error.")
    next(error);
}