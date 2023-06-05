const BaseController = require("./base"),
    View = require("../views/base");

module.exports = new (class AdminController extends BaseController {
    constructor() {
        super("admin")
    }
    run(req, res, next) {
        // check if user is authorised
        if (this.authorize(req)) {
            req.session.fastDelivery = true;
            req.session.save(function (err) {
                // looks to see if the request contains a query of: action=delete&id=[id]
                this.del(req, function () {
                    // checks if form is submitted and updates or creates the records
                    this.form(req, res, function (formMarkup) {
                        // fetches information and prepares an HTML table
                        this.list(function (listMarkup) {
                            v.render({
                                title: "Administration",
                                content: "Welcome to the control panel",
                                list: listMarkup,
                                form: formMarkup,
                            })
                        })
                    })
                })

                var v = new View(res, "admin");
                v.render({
                    title: "Administration",
                    content: "Welcome to the control panel",
                });
            });
            // if user isn't authorised, then display login page
        } else {
            const v = new View(res, "admin-login");
            v.render({
                title: "Please login",
            })
        }
    }
    authorize(req) {
        return (
            (req.session &&
                req.session.fastDelivery &&
                req.session.fastDelivery === true) ||
            (req.body &&
                req.body.username === this.username &&
                req.body.password === this.password)
        );
    }
    handleFileUpload(req) {
        // checks if any files are not uploaded, or the files are missing properties such as a picture or name
        if (!req.files || !req.files.picture || !req.files.picture.name) {
            // return the currentPicture if there is one else return an empty string    
            return req.body.currentPicture || ""
        }

        // Synchronous operations. Would be better to use the asynchronous counter-parts for better performance, however does keep code simple.
        // path contains the raw content of the file
        const data = fs.readFileSync(req.files.picture.path);
        const fileName = req.files.picture.name;
        const uid = crypto.randomBytes(10).toString("hex");
        const dir = __dirname + "/../public/uploads/" + uid;
        fs.mkdirSync(dir, "0777");
        // data is written in a newly created directory
        fs.writeFileSync(dir + "/" + fileName, data);
        return "/uploads/" + uid + "/" + fileName;
    }

    //IIFE -- Immediately Invoked Function Expression
})();