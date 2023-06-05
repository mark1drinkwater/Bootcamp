module.exports = class BaseModel {
    constructor(db) {
        this.setDB(db);
    }
    // setter method
    setDB(db) {
        this.db = db;
    }
    // getter method
    collection() {
        if (this._collection) return this._collection;
        return (this._collection = this.db.collection("fastdelivery-content"));
    }
}