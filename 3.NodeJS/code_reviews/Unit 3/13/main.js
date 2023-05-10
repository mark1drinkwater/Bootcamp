const MongoDB = require("mongodb").MongoClient,
    dbURL = "mongodb://127.0.0.1:27017",
    dbName = "recipe_db";

MongoDB.connect(dbURL, (error, client) => {
    if (error) throw error;

    var db = client.db(dbName);

    db.collection("contacts")
        .insert({
            name: "Freddie Mercury",
            email: "fred@queen.com"
        }, (error, db) => {
            if (error) throw error;
            console.log(db);
        });

    db.collection("contacts")
        .find()
        .toArray((error, data) => {
            if (error) throw error;
            console.log(data);
        });
});