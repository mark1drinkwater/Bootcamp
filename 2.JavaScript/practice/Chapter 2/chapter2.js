// EXERCISE 2.1
let str1 = 'Laurence'; // String
let str2 = "Svekis"; // String
let val1 = undefined; // Undefined
let val2 = null; // Object 
let myNum = 1000; // Number

console.log("Exercise: 2.1");
console.log(typeof str1, typeof str2, typeof val1, typeof val2, typeof myNum);
/////////////////////////////////////////////////////////////////////////////////////////////////
// EXERCISE 2.2
let myName = "Mark";
let age = 24;
let canCodeJS = true;
console.log("Exercise: 2.2");
console.log(`Hello, my name is ${myName}, I am ${age} years old and I can code JavaScript: ${canCodeJS}`);

/////////////////////////////////////////////////////////////////////////////////////////////////
// EXERCISE 2.3
let a = Number(prompt("Enter the first side of the triangle."));
let b = Number(prompt("Enter the second side of the triangle."));

let c = Math.sqrt(a**2 + b**2);
console.log("Exercise: 2.3");
console.log("The length of the hypotenuse of the triangel is: " + c);
/////////////////////////////////////////////////////////////////////////////////////////////////
// EXERCISE 2.4
let a2 = 5;
let b2 = 10;
let c2 = 2;
// Add b to a
a2 += b;
// Divide a by c
a2 /= c;
// Replace the value of c with the modulus of c and b
c2 %= b;
console.log("Exercise: 2.4");
console.log(a2, b2, c2);

/////////////////////////////////////////////////////////////////////////////////////////////////
// PROJECTS
// Miles-to-kilometers converter project
let miles = 80.7783;
let kilometers = miles * 1.60934;
console.log("Project: Miles-to-kilometers converter");
console.log(`The distance of ${kilometers} kms is equal to ${miles} miles`)

// BMI Calculator
let inches = 55;
let pounds = 85;

let centimeters = inches * 2.54;
let kilograms = pounds / 2.2046;
let bmi = kilograms / (centimeters/100)**2

console.log("Project : BMI calculator");
console.log(`Your height is: ${centimeters.toFixed(2)} cm and weight is: ${kilograms.toFixed(2)} kg`);
console.log(`Your BMI is: ${bmi.toFixed(2)}`);

/////////////////////////////////////////////////////////////////////////////////////////////////
// Self-check quiz
/*
1. What data type is the following variable? -- String
const c = "5";

2. What data type is the following variable? -- Number
const c = 91;

3. Which one is generally better, line 1 or line 2? -- Line 2
let empty1 = undefined; //line 1
let empty2 = null; //line 2

4. What is the console output for the following? -- world
let a = "Hello";
a = "world";
console.log(a);

5. What will be logged to the console? -- Hello world!
let a = "world";
let b = `Hello ${a}!`;
console.log(b);

6. What is the value of a? -- The user's input
let a = "Hello";
a = prompt("world");
console.log(a);

7. What is the value of b output to the console? -- 71
let a = 5;
let b = 70;
let c = "5";
b++;
console.log(b);

8. What is the value of result? -- 3 + (4*2/8) --> 3 + (8/8) --> 3 + 1 --> 4
let result = 3 + 4 * 2 / 8;

9. What is the value of total and total2? (total1 = 16) (total2 = 536)
let firstNum = 5;
let secondNum = 10;
firstNum++;
secondNum--;

let total = ++firstNum + secondNum;
console.log(total);
let total2 = 500 + 100 / 5 + total--;
console.log(total2);

10. What is logged to the console here? 
const a = 5;
const b = 10;
console.log(a > 0 && b > 0);     --> true
console.log(a == 5 && b == 4);   --> false
console.log(true ||false);       --> true
console.log(a == 3 || b == 10);  --> true
console.log(a == 3 || b == 7);   --> false
*/