// Exercise 4.1
console.log("Exercise 4.1:");
// No 1
let bool = true;
// No 2
console.log(bool);
// No 3
if (bool) {
    console.log("It is true.");
}

// No 4
bool = false;
if (!bool) {
    console.log("It is false");
}

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 4.2
console.log("\nExercise 4.2:")
// No 1
let ageStr = prompt("Please enter your age.");
// No 2
let age = Number(ageStr);
// No 3
let message = "";
// No 4
if (age >= 21) {
    message = "You are allowed to enter the venue and purchase alcohol.";
    // No 5
} else if (age >= 19) {
    message = "You are allowed to enter the venue but you may not purchase alcohol.";
}
// No 6
else {
    message = "Entry is denied";
}
// No 7
console.log(message);

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 4.3
console.log("\nExercise 4.3");
// No 1
let idBool = false;
// No 2
let message2 = "";
idBool ? message2 = "You may enter the venue." : message2 = "You may not enter the venue.";
// No 3
console.log(message2);

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 4.4
console.log("\nExercise 4.4");
// No 1
let randNum = Math.floor(Math.random() * 6);
// No 2
const question = prompt("Please enter a question");
// No 3
let response = "";

switch (randNum) {
    case 0:
        response = "It is certain.";
        break;
    case 1:
        response = "As I see it, yes.";
        break;
    case 2:
        response = "Reply hazy, try again.";
        break;
    case 3:
        response = "Don't count on it.";
        break;
    case 4:
        response = "It is decidedly so.";
        break;
    case 5:
        response = "Very doubtful. ";
        break;
    default:
        reponse = "Something went wrong";
        break;
}
// No 5
console.log(`You asked: ${question} and I foresee: ${response}`);

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 4.5
console.log("\nExercise 4.5");
// No 1 
let prize = "";
let userStr = prompt("Please enter a number from 0 to 10");
// No 2
let userNum = Number.parseInt(userStr);
// No 3
let output = "My Selection: ";
// No 4
switch (userNum) {
    case 0:
        prize += "Teddy bear";
        break;
    case 1:
        prize += "Leather lounge set";
        break;
    case 2:
        prize += "Cellphone";
        break;
    case 3:
        prize += "PS4";
        break;
    case 4:
        prize += "Egyptian painting";
        break;
    case 5:
        prize += "Giraffee statue";
        break;
    case 6:
        prize += "4k TV";
        break;
    case 7:
        prize += "Holiday to Maritius";
        break;
    case 8:
        prize += "Laptop";
        break;
    case 9:
        prize += "Unlucky, play again.";
        break;
    case 10:
        prize += "A million dollars!";
        break;
    default:
        prize += "Invalid chouce."
        break;
}
console.log(`Your number is ${userNum} and your prize is ${prize}`);