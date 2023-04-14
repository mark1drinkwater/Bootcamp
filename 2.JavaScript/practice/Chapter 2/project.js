// Miles-to-kilometers converter project
let miles = 10;
let kilometers = miles * 1.60934;
console.log("Project: Miles-to-kilometers converter");
console.log(`The distance of ${kilometers} kms is equal to ${miles} miles`)

// BMI Calculator Project
let inches = 55;
let pounds = 85;

let centimeters = inches * 2.54;
let kilograms = pounds / 2.2046;
let bmi = kilograms / (centimeters / 100) ** 2

console.log("\nProject : BMI calculator");
console.log(`Your height is: ${centimeters.toFixed(2)} cm and weight is: ${kilograms.toFixed(2)} kg`);
console.log(`Your BMI is: ${bmi.toFixed(2)}`);