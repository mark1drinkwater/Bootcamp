var name = "Nicholas";
console.log("Hello " + name);

// If statements
if (name.length > 7) {
    console.log("Wow, you have a REALLY long name!");
} else {
    console.log("Your name isn't very long.");
}

console.log();

var lemonChicken = false;
var beefWithBlackBean = true;
var sweetAndSourPork = true;
if (lemonChicken) {
    console.log("Great! I'm having lemon chicken!");
} else if (beefWithBlackBean) {
    console.log("I'm having the beef.");
} else if (sweetAndSourPork) {
    console.log("OK, I'll have the pork.");
} else {
    console.log("Well, I guess I'll have rice then.");
}

console.log();

// While loops
var sheepCounted = 0;
while (sheepCounted < 10) {
    console.log("I have counted " + sheepCounted + " sheep!");
    sheepCounted++;
}
console.log("Zzzzzzzzzzz");

console.log();

for (var sheepCounted = 0; sheepCounted < 10; sheepCounted++) {
    console.log("I have counted " + sheepCounted + " sheep!");
}
console.log("Zzzzzzzzzzz");

console.log();

var timesToSayHello = 3;
for (var i = 0; i < timesToSayHello; i++) {
    console.log("Hello!");
}

console.log();

var animals = ["Lion", "Flamingo", "Polar Bear", "Boa Constrictor"];
for (var i = 0; i < animals.length; i++) {
    console.log("This zoo contains a " + animals[i] + ".");
}

console.log();

var name = "Nick";
for (var i = 0; i < name.length; i++) {
    console.log("My name contains the letter " + name[i] + ".");
}

/*
for (var x = 2; x < 10000; x = x * 2) {
    console.log(x);
}*/

console.log();

// Try it out
var exponent = 0;
var result = 0;
while (result < 10000) {
    result = Math.pow(3, exponent)
    console.log(result);    
    exponent++;
}

console.log();

// ----------------- Programming Challenges --------------
// --------------- Awesome Animals ------------------
var animals = ["Cat", "Fish", "Lemur", "Komodo Dragon"];
for (var i = 0; i < animals.length; i++) {
    animals[i] = "Awesome " + animals[i];
}
console.log(animals);

// ----------------- Random string generator -----------
var i = 0;
var result = "";
var alphabet = "abcdefghijklmnopqrstuvwxyz";
while (i < 6) {
    result += alphabet[ Math.floor(Math.random() * alphabet.length) ];
    i++;
}

console.log();
console.log(result);

// ----------------- h4ck3r sp34k -------------
var input = "javascript is awesome";
var output = "";
var letter = "";

for (var i = 0; i < input.length; i++) {
    letter = input[i];
    if (letter === "a") {
        output += "4";
    } else if (letter === "e") {
        output += "3";
    } else if (letter === "i") {
        output += "1";
    } else if (letter === "o") {
        output += "0";
    } else {
        output += letter;
    }
}

console.log();
console.log(output);