// Topic: Data Types

// Number: 5;

// String: "Hi, I'm a string";

//Boolean: true; false;

// ---------- Numbers and Operators ----------

// Addition
console.log('Addition');
console.log(12345 + 56789);

// Subtraction
console.log('\nSubtraction');
console.log(1000 - 17);

// Multiplication
console.log('\nMultiplication');
console.log(123 * 456);

// Division
console.log('\nDivision');
console.log(12345 / 250);

// BODMAS -- Order of operations
console.log('\nOrder of operations');
console.log(1234 + 57 * 3 - 31 / 4);

// ---------- Variables ----------
console.log('\nVariables');
var age = 12;
console.log(age);
console.log('\nAge variable changes from 12 to 13');
age = 13;
console.log(age);

// JavaScript is case-sensitive!
// numberofcandles is NOT the same as numberOfCandles

// Creating new variables using math
var secondsInAMinute = 60;
var minutesInAnHour = 60;
var secondsInAnHour = secondsInAMinute * minutesInAnHour;
console.log('\n Seconds in an hour: ' + secondsInAnHour);

var hoursInADay = 24;
var secondsInADay = secondsInAnHour * hoursInADay;
console.log('\n Seconds in a day: ' + secondsInADay);

var daysInAYear = 365;
var secondsInAYear = secondsInADay * daysInAYear;
console.log('\n Seconds in a year: ' + secondsInAYear);

var age = 29;
age * secondsInAYear;
console.log('\n Age: ' + age + ' in seconds');

// Incrementing & Decrementing
var highFives = 0;
console.log('\nIncrement Before:');
++highFives;
console.log('You have: ' + highFives);
++highFives;
console.log('You have: ' + highFives);
++highFives;
console.log('You have: ' + highFives);

console.log('\nIncrement After:')
highFives++;
console.log('You have: ' + highFives);
highFives++;
console.log('You have: ' + highFives);
highFives++;
console.log('You have: ' + highFives);

// Plus-equals and Minus-equals
var x = 10;
x = x + 5;
x;
// Shorter way
x += 5;

//Minus-equals
x -= 20;

// ------------------------- Strings ------------------------
var myAwesomeString = "Something REALLY awesome!!!";
console.log('\nStrings:\n' + myAwesomeString);

// You can re-assign variables e.g.
 //A integer gets re-assigned to become a string
var myThing = 5;
myThing = "this is a string";

// A number is a string if it's inside quotes
var numberNine = 9;
var stringNine = "9";

// Add a number and a number
console.log('\n Add a number and a number' + (numberNine + numberNine) );
// Add a string and a string
console.log('\n Add a string and a string' + (stringNine + stringNine) );

// Add strings
var greeting = "Hello ";
var myName = "Nick";
console.log('\nAdd strings: ' + greeting + myName);

// --- Find the length of strings ---
console.log("Length of strings: " + "Supercalifragilisticexpialidocious".length);

// --- Getting a single character from a string ---
var myName = "Nick";
console.log('\nGetting a single character from a string')
console.log(myName[0]);
console.log(myName[1]);
console.log(myName[2]);

// Secret code
var codeWord1 = "are";
var codeWord2 = "tubas";
var codeWord3 = "unsafe";
var codeWord4 = "?!";
console.log('\n Secret code word' + codeWord1[1] + codeWord2[1] + codeWord3[1] + codeWord4[1]);

