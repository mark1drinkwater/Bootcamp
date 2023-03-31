Self - check quiz:

// 1. What will be outputted to the console in this instance ?
// one

const p = '1';
switch (p) {
    case '1':
        answer = "one";
        break;
    case 1:
        answer = 1;
        break;
    case 2:
        answer = "this is the one";
        break;
    default:
        answer = "not working";
}
console.log(answer);

// 2. What will be outputted to the console in this instance ?
// this is the one (suprisingly not 1)

const q = 1;
switch (q) {
    case '1':
        answer = "one";
    case 1:
        answer = 1;
    case 2:
        answer = "this is the one";
        break;
    default:
        answer = "not working";
}
console.log(answer);

// 3. What will be outputted to the console in this instance ?
// login

let login = false;
let outputHolder = "";
let userOkay = login ? outputHolder = "logout" : outputHolder = "login";
console.log(userOkay);

// 4. What will be outputted to the console in this instance ?
// Welcome, that is a user: John

const userNames = ["Mike", "John", "Larry"];
const userInput = "John";
let htmlOutput = "";
if (userNames.indexOf(userInput) > -1) {
    htmlOutput = "Welcome, that is a user";
} else {
    htmlOutput = "Denied, not a user ";
}
console.log(htmlOutput + ": " + userInput);

// 5. What will be outputted to the console in this instance ?
// Wake up, it's morning

let myTime = 9;
let output;
if (myTime >= 8 && myTime < 12) {
    output = "Wake up, it's morning";
} else if (myTime >= 12 && myTime < 13) {
    output = "Go to lunch";
} else if (myTime >= 13 && myTime <= 16) {
    output = "Go to work";
} else if (myTime > 16 && myTime < 20) {
    output = "Dinner time";
} else if (myTime >= 22) {
    output = "Time to go to sleep";
} else {
    output = "You should be sleeping";
}
console.log(output);

// 6. What will be outputted to the console in this instance ?

let a = 5;
let b = 10;
let c = 20;
let d = 30;
console.log(a > b || b > a); // true
console.log(a > b && b > a); // false
console.log(d > b || b > a); // true
console.log(d > b && b > a); // true

// 7. What will be outputted to the console in this instance ?

let val = 100;
let message = (val > 100) ? `${val} was greater than 100` : `${val} was LESS or Equal to 100`;
console.log(message);
// 100 was LESS or Equal to 100

let check = (val % 2) ? `Odd` : `Even`;
check = `${val} is ${check}`;
console.log(check);
// 100 is Even