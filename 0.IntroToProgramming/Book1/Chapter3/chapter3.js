// Topic 3: Arrays

// Dinosaur array
var dinosaurs = [
    "T-Rex",
    "Velociraptor",
    "Stegosaurus",
    "Triceratops",
    "Brachiosaurus",
    "Pteranodon",
    "Apatosaurus",
    "Diplodocus",
    "Compsognathus"
];

// Accessing an array's elements
console.log('1st element: ' + dinosaurs[0]);

// Setting or changing elements in an array
dinosaurs[0] = "Tyrannosaurus Rex";
console.log(dinosaurs);


// Another way to create an array
var dinosaurs = [];
dinosaurs[0] = "T-Rex";
dinosaurs[1] = "Velociraptor";
dinosaurs[2] = "Stegosaurus";
dinosaurs[3] = "Triceratops";
dinosaurs[4] = "Brachiosaurus";
dinosaurs[5] = "Pteranodon";
dinosaurs[6] = "Apatosaurus";
dinosaurs[7] = "Diplodocus";
dinosaurs[8] = "Compsognathus";

// You can actually add an element at any index you want
dinosaurs[33] = "Philosoraptor";

console.log('\nShow dinosaur array: ' + dinosaurs);

// Mixing data types in an array
var dinosaursAndNumbers = [3, "dinosaurs", ["triceratops", "stegosaurus", 3627.5], 10];
console.log('\nDinosaurs and Numbers: ' + dinosaursAndNumbers);

// Accessing inner arrays
console.log('\nAccessing inner arrays:');
console.log(dinosaursAndNumbers[2]);
console.log(dinosaursAndNumbers[2][0]);


// --------------- Working with arrays -------------------
var maniacs = ["Yakko", "Wakko", "Dot"];
console.log('\nLength of maniacs array: ' + maniacs.length);

// How to access last element of array
console.log('Access last element of array: ' + maniacs[maniacs.length- 1 ]);

// --- Adding elements to an array ---
// Add an element to the end of an array
var animals = [];
animals.push("Cat");
animals.push("Dog");
animals.push("Llama");

console.log('\n Animals array: ' + animals);
console.log('With length of ' + animals.length);


// Add an element to the beginning of an array
animals.unshift("Monkey");
console.log('\n Animals array: ' + animals);
animals.unshift("Polar Bear");
console.log('Animals array: ' + animals);

// --- Removing elements from an array ---
var lastAnimal = animals.pop();
console.log('\nAnimal removed from the array: ' + lastAnimal);
console.log('Animals array: ' + animals);

console.log('\n' + animals.pop() + ' was removed');
console.log('Animals array: ' + animals);

// Add llama back
animals.unshift(lastAnimal);
console.log('\nAnimals array: ' + animals);

// Shift does the same thing as pop except for the beginning of the array instead of the end
var firstAnimal = animals.shift();
console.log('\n' + firstAnimal + ' was removed from the beginning of the array');

// ---------------------- Adding arrays ---------------------
var furryAnimals = ["Alpaca", "Ring-tailed Lemur", "Yeti"];
var scalyAnimals = ["Boa Constrictor", "Godzilla"];
// Neither array actually gets modified
var furryAndScalyAnimals = furryAnimals.concat(scalyAnimals);
console.log('\nFurry and scaly animals: ' + furryAndScalyAnimals);

// You can concatenate more than 2 arrays together
var furryAnimals = ["Alpaca", "Ring-tailed Lemur", "Yeti"];
var scalyAnimals = ["Boa Constrictor", "Godzilla"];
var featheredAnimals = ["Macaw", "Dodo"];
var allAnimals = furryAnimals.concat(scalyAnimals, featheredAnimals);
console.log('\nAll animals: ' + furryAndScalyAnimals);

// Finding the index of an element in an array
var colors = ["red", "green", "blue"];
console.log('\nPosition of blue in the array: ' + colors.indexOf("blue"));

// If it doesn't exist java script will return -1
console.log("Purple doens't exist: " + colors.indexOf("purple"));

// ------------- Turning an array into a string --------------
var boringAnimals = ["Monkey", "Cat", "Fish", "Lizard"];
console.log('\n Turn an array into a string: ' + boringAnimals.join());

// Different delimeters
console.log(boringAnimals.join(" - "));
console.log(boringAnimals.join("*"));
console.log(boringAnimals.join(" sees "));

// ------------------------------------------- Finding your way home -----------------------------------
var landmarks = [];
landmarks.push("My house");
landmarks.push("Front path");
landmarks.push("Flickering streetlamp");
landmarks.push("Leaky fire hydrant");
landmarks.push("Fire station");
landmarks.push("Cat rescue center");
landmarks.push("My old school");
landmarks.push("My friend's house");

console.log("\nFinding your way home: ");
console.log(landmarks.pop());
console.log(landmarks.pop());
console.log(landmarks.pop());
console.log(landmarks.pop());
console.log(landmarks.pop());
console.log(landmarks.pop());
console.log(landmarks.pop());
console.log(landmarks.pop());

// ------------------------------------------- Decision maker -------------------------------------------
// Generate a random number between 0 and 1
console.log('\n' + Math.random());

// If you wanted numbers between 0 and 10, you would multiply Math.random() by 10
console.log(Math.random() * 10);

// Round down
console.log('\nRounding down:');
console.log(Math.floor(3.7463463));
console.log(Math.floor(9.9999));

// Could be 0, 1, 2, or 3
console.log(Math.floor(Math.random() * 4));

var randomWords = ["Explosion", "Cave", "Princess", "Pen"];
var randomIndex = Math.floor(Math.random() * 4);
console.log("Random words: " + randomWords[randomIndex]);

// ----------------------------------------- Complete decision maker -----------------------------------
var phrases = [
    "That sounds good",
    "Yes, you should definitely do that",
    "I'm not sure that's a great idea",
    "Maybe not today?",
    "Computer says no."
];

console.log("\nShould I have another milkshake? " + phrases[Math.floor(Math.random() * 5)]);


// ----------------------------------- Creating a Random Insult Generator ------------------------------
var randomBodyParts = ["Face", "Nose", "Hair"];
var randomAdjectives = ["Smelly", "Boring", "Stupid"];
var randomWords = ["Fly", "Marmot", "Stick", "Monkey", "Rat"];

// Pick a random body part from the randomBodyParts array:
var randomBodyPart = randomBodyParts[Math.floor(Math.random() * 3)];
// Pick a random adjective from the randomAdjectives array:
var randomAdjective = randomAdjectives[Math.floor(Math.random() * 3)];
// Pick a random word from the randomWords array:
var randomWord = randomWords[Math.floor(Math.random() * randomWords.length)];
// Join all the random strings into a sentence:
var randomInsult = "Your " + randomBodyPart + " is like a " + randomAdjective + " " + randomWord + "!!!";

console.log("\nRandom insult: " + randomInsult);