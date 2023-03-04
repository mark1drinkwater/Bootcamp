// ---------------------- Objects -------------------------
var cat = {
    legs: 3,
    name: "Harmony",
    color: "Tortoiseshell"
};

// Accessing object properties
console.log(cat["name"]);
console.log(cat.name);


// Return all the keys of an object
var dog = { name: "Pancake", age: 6, color: "white", bark: "Yip yap yip!" };
var cat = { name: "Harmony", age: 8, color: "tortoiseshell" };

console.log(" ");

console.log(Object.keys(dog));
console.log(Object.keys(cat));

// Add values to objects
var cat = {};
cat["legs"] = 3;
cat["name"] = "Harmony";
cat["color"] = "Tortoiseshell";

console.log(" ")
console.log(cat);

// Add keys with dot notation
var cat = {};
cat.legs = 3;
cat.name = "Harmony";
cat.color = "Tortoiseshell";

console.log(" ")
console.log(cat);

// -------------------- Combining Arrays and objects ------------------------
var dinosaurs = [
    { name: "Tyrannosaurus Rex", period: "Late Cretaceous" },
    { name: "Stegosaurus", period: "Late Jurassic" },
    { name: "Plateosaurus", period: "Triassic" }
];

console.log();
console.log(dinosaurs[0]);
console.log(dinosaurs[0]["name"]);
console.log(dinosaurs[1].period);

// --------- Array of friends -----------
var anna = { name: "Anna", age: 11, luckyNumbers: [2, 4, 8, 16] };
var dave = { name: "Dave", age: 5, luckyNumbers: [3, 9, 40] };
var kate = { name: "Kate", age: 9, luckyNumbers: [1, 2, 3] };

var friends = [anna, dave, kate];

console.log();
console.log(friends[1]);
console.log(friends[2].name);
console.log(friends[0].luckyNumbers[1]);

// ----------------- Useful Things to Do with objects ---------------------------
// ---------- Keeping Track of owed Money -------------
var owedMoney = {};
owedMoney["Jimmy"] = 5;
owedMoney["Anna"] = 7;

console.log();
console.log(owedMoney["Jimmy"]);
console.log(owedMoney["Jinen"]);

// Jimmy borrows money
owedMoney["Jimmy"] += 3;
console.log(owedMoney["Jimmy"]);


// ---------- Storing Information About Your Movies -----------
var movies = {
    "Finding Nemo": { // Need to use quotes because of the space.
    releaseDate: 2003,
    duration: 100,
    actors: ["Albert Brooks", "Ellen DeGeneres", "Alexander Gould"],
    format: "DVD"
    },
    "Star Wars: Episode VI - Return of the Jedi": {
    releaseDate: 1983,
    duration: 134,
    actors: ["Mark Hamill", "Harrison Ford", "Carrie Fisher"],
    format: "DVD"
    },
    "Harry Potter and the Goblet of Fire": {
    releaseDate: 2005,
    duration: 157,
    actors: ["Daniel Radcliffe", "Emma Watson", "Rupert Grint"],
    format: "Blu-ray"
    }
};

console.log();
var findingNemo = movies["Finding Nemo"];
console.log(findingNemo.duration);
console.log(findingNemo.format);

// Create a cars movie object
var cars = {
    releaseDate: 2006,
    duration: 117,
    actors: ["Owen Wilson", "Bonnie Hunt", "Paul Newman"],
    format: "Blu-ray"
};

// Insert cars object into movies array
movies["Cars"] = cars;

console.log();
console.log(movies);

// -------------------- Scorekeeper ------------------
var scores = {
    John: 0,
    Piet: 0,
    Kwesi: 0,
    Donovan: 0
};

// Increase scores
scores.John++;
scores.Piet++;

console.log(scores.John);

// ---------------- Digging into objects and arrays ---------
var myCrazyObject = {
    "name": "A ridiculous object",
    "some array": [7, 9, { purpose: "confusion", number: 123 }, 3.3],
    "random animal": "Banana Shark"
};

console.log("\n Crazy Object:");
console.log( myCrazyObject["some array"][2]["number"] );