const Base = require("./base"),
    crypto = require("node:crypto");

// inherit all the properties and methods from the Base class
class ContentModel extends Base {

    constructor(db) {
        // call the parent class constructor and pass the db argument
        super(db);
    }
    // insert into database function
    insert(data, callback) {
        // generates a cryptographically strong pseudorandom data
        data.ID = crypto.randomBytes(20).toString("hex");
        //insert data into a collection, with no options, pass a callback function if passed otherwise just a blank callback function
        this.collection().insert(data, {}, callback || function() {});        
    }
    // update function
    update(data, callback) {
        // update the document with the specified ID, and data is the updated data
        this.collection().update(
            { ID: data.ID },
            data,
            {},
            callback || function() {}
        );
    }
    // get the data inside the collection
    getlist(callback, query) {
        this.collection()
            .find(query || {})
            .toArray(callback);            
    }
    // remove the record
    remove(ID, callback) {
        this.collection().findAndModify(
            { ID: ID },
            [],
            {},
            { remove: true },
            callback
        );
    }
}

// export the model
module.exports = ContentModel;