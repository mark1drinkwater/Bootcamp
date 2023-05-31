import { MongoClient } from "mongodb";

const connectionString = process.env.ATLAS_URI || "mongodb+srv://admin:razRJv5W8vtcfOM6@cluster0.1ztmqpn.mongodb.net/";

const client = new MongoClient(connectionString, {
  useNewUrlParser: true,
  useUnifiedTopology: true,
});

let dbConnection;

export function connectToServer(callback) {
  client.connect(function (err, db) {
    if (err || !db) {
      return callback(err);
    }

    dbConnection = db.db("sample_airbnb");
    console.log("Successfully connected to MongoDB.");

    return callback();
  });
}

export function getDb() {
  return dbConnection;
}
