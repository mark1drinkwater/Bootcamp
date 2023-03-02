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
console.log('\n Age: ' + age + ' in seconds' + age * secondsInAYear);

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

// Cutting up strings
var longString = "My long string is long";
// The string gets sliced starting from position 3 to position 13, excluding position 14
console.log('\nSliced string' + longString.slice(3, 14));

console.log('\n2nd Sliced string' + longString.slice(3));

// ------- Changing all characters to capital or lower case --------
console.log('\nAll capital letters: ' + "Hello there, how are you doing?".toUpperCase());
console.log('All lower case: ' + "hELlo THERE, hOW ARE yOu doINg?".toLowerCase());


// Challenge
var sillyString = "hELlo THERE, hOW ARE yOu doINg?";
var lowerString = sillyString.toLowerCase();
var firstCharacter = lowerString[0];
var firstCharacterUpper = firstCharacter.toUpperCase();
var restOfString = lowerString.slice(1);
console.log('\nChallenge: ' + firstCharacterUpper + restOfString);

console.log('Do it in one line ' + sillyString[0].toUpperCase() + sillyString.slice(1).toLowerCase());

// ------------------------------------------- Booleans -------------------------------------------------------
var hadShower = true;
var hasBackpack = false;
console.log('\nAND Operator: ' + (hadShower && hasBackpack));

hadShower = true;
hasBackpack = true;
console.log('AND Operator: ' + (hadShower && hasBackpack));

var hasApple = true;
var hasOrange = false;
console.log('OR Operator: ' + (hasApple || hasOrange));

var isWeekend = true;
var needToShowerToday = !isWeekend;
console.log('NOT Operator: ' + needToShowerToday);

isWeekend = false;
hadShower = true;
hasApple = false;
hasOrange = true;
var shouldGoToSchool = !isWeekend && hadShower && (hasApple || hasOrange);
console.log('Multiple Operators: ' + shouldGoToSchool);

// ------ Comparing numbers with boolean ------
// Greater than
var height = 65;
var heightRestriction = 60;
console.log('\nGreater than: ' + (height > heightRestriction));

console.log('Greater than: ' + (height > heightRestriction));

console.log('Greater than or equal to: ' + (height >= heightRestriction));

// Less than
height = 60;
heightRestriction = 48;
console.log('\nLess than: ' + (height < heightRestriction));

// Less than or equal to
height = 48;
heightRestriction = 48;
height <= heightRestriction;
console.log('Less than or equal to: ' + (height <= heightRestriction));

// Equal to (===)
var mySecretNumber = 5;
var chicoGuess = 3;
console.log('\nEqual to: ' + (mySecretNumber === chicoGuess));

var harpoGuess = 7;
console.log('Equal to: ' + (mySecretNumber === harpoGuess));

var grouchoGuess = 5;
console.log('Equal to: ' + (mySecretNumber === grouchoGuess));

// Equal-ish (==)
var stringNumber = "5";
var actualNumber = 5;
console.log('\nExactly equal to: ' + (stringNumber === actualNumber));
console.log('\nEqual-ish: ' + (stringNumber == actualNumber));

console.log('Equal-ish: ' + (0 == false));
console.log('Equal-ish: ' + (false == "false"));

//Try it out
var age = 12;
var accompanied = true;
console.log('\nAllowed to watch PG-13 movie: ' + ((age >= 13) || (accompanied)));

// --------- Undefined and Null ------------
var myVariable;
console.log('\nUndefined: ' + myVariable);

var myNullVariable = null;
console.log('Null: ' + myNullVariable);