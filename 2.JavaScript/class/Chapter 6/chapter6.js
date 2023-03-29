/*function addTwoNumbers(x = 2, y = 3) {
    console.log(x + y);
}*/

//console.log(addTwoNumbers())

// Arrow functions
let doingArrowStuff = (x) => console.log(x);
//doingArrowStuff("Great!");

let addTwoNumbers = (x, y) => x + y;
//addTwoNumbers(5, 3);

const arrS = ["squirrel", "alpaca", "buddy"];
//arrS.forEach((e) => console.log(e));

// Spread operator
let spread = ["so", "much", "fun"];
let message = ["JavaScript", "is", ...spread, "and", "very", "powerful"];
//console.log(message);

let arr = [5, 9];
//addTwoNumbers(...arr);

// Can use the spread operator multiple times
function addFourNumbers(x, y, z, a) {
  console.log(x + y + z + a);
}
let arr1 = [5, 9];
let arr2 = [6, 7];
//addFourNumbers(...arr1, ...arr2);

// REST operator
function someFunction(param1, ...param2) {
  //console.log(param1, param2);
}
someFunction("hi", "there!", "How are you?");

//let result = addTwoNumbers(4, 5);
//console.log(result);

let resultsArr = [];
for (let i = 0; i < 10; i++) {
  let result = addTwoNumbers(i, 2 * i);
  resultsArr.push(result);
}
//console.log(resultsArr);

//let addTwoNumbers = (x, y) => x + y;
//let result = addTwoNumbers(12, 15);
//console.log(result);

// function testAvailability(x) {
//   console.log("Available here:", x);
// }

// testAvailability("Hi!");
// console.log("Not available here:", x);

// function testAvailability() {
//   var y = "Local variable!";
//   console.log("Available here:", y);
// }

// testAvailability();
// console.log("Not available here:", y);

// function testAvailability() {
//   let y = "I'll return";
//   console.log("Available here:", y);
//   return y;
// }

// let z = testAvailability();
// console.log("Outside the function:", z);
// console.log("Not available here:", y);

// LET is block scoped and VAR is function scoped
// function doingStuff() {
//   if (true) {
//     let x = "local";
//   }
//   console.log(x);
// }
//   doingStuff();

// var y = 10;

// function doingStuff() {
//   var y = 20;
//   console.log(y);
// }

// console.log(y)
// doingStuff();
// console.log(y);

// let globalVar = "Accessible everywhere!";
// console.log("Outside function:", globalVar);
// function creatingNewScope(x) {
//   console.log("Access to global vars inside function." , globalVar);
// }
// creatingNewScope("some parameter");
// console.log("Still available:", globalVar);

// let x = "global";
// function doingStuff(x) {
//   console.log(x);
// }
// doingStuff("param");

// function confuseReader() {
//   x = "Guess my scope...";
//   console.log("Inside the function:", x);
// }
//   confuseReader();
//   console.log("Outside of function:", x);

// Immediately invoked function expression
// (function () {
//   console.log("IIFE!");
// })();

// // 1
// let x = "1000";

// // 2
// (function () {
//   let x = 2000;
//   console.log(x);
// })();

// // 3
// let result = (() => {
//   let x = 3000;
//   return x;
// })();

// // 4
// let result2 = ((y) => {
//   let x = 3000;
//   return y;
// })(4000);

// console.log("X is " + x);
// console.log("result is " + result);
// console.log("result2 is " + result2);

// function getRecursive(nr) {
//   console.log(nr);
//   if (nr > 0) {
//     getRecursive(--nr);
//   }
// }
// getRecursive(3);

// function logRecursive(nr) {
//   if (nr > 0) {
//     console.log("Started function:", nr);
//     logRecursive(nr - 1);
//   } else {
//     console.log("done with recursion");
//   }
//   console.log("Ended function:", nr);
// }
// logRecursive(3);

// function doOuterFunctionStuff(nr) {
//   console.log("Outer function");
//   doInnerFunctionStuff(nr);
//   function doInnerFunctionStuff(x) {
//     console.log(x + 7);
//     console.log("I can access outer variables:", nr);
//   }
// }
// doOuterFunctionStuff(2);

// function doOuterFunctionStuff(nr) {
//   doInnerFunctionStuff(nr);
//   function doInnerFunctionStuff(x) {
//     let z = 10;
//   }
//   console.log("Not accessible:", z);
// }
// doOuterFunctionStuff(2);

// //IIFE
// (function (nr) {
//   (function (x) {
//     let z = 10;
//     console.log(z)
//   })(nr);
// })(3);

// //IIFE Arrow function
// (nr =>
//   (x => {
//     let z = 10;
//     console.log(z)
//   })(nr)
// )(3);

// Anonymous function
// let functionVariable = function () {
//   console.log("Not so secret though.");
// };

// doFlexibleStuff(functionVariable);

// function doFlexibleStuff(executeStuff) {
//   executeStuff();
//   console.log("Inside doFlexibleStuffFunction.");
// }

// //
// let anotherFunctionVariable = function () {
//   console.log("Another anonymous function implementation.");
// };
// doFlexibleStuff(anotherFunctionVariable);

// let youGotThis = function () {
//   console.log("You're doing really well, keep coding!");
// };

// setTimeout(youGotThis, 1000);

// Self-test quiz
// let val = 10;
// function tester(val) {
//   val += 10;
//   if (val < 100) {
//     return tester(val);
//   }
//   return val;
// }
// tester(val);
// console.log(val);

// (function () {
//   console.log("Hello");
// })();

// (function () {
//   console.log("Welcome");
// })();
// (function () {
//   let firstName = "Laurence";
// })();
// let result = (function () {
//   let firstName = "Laurence";
//   return firstName;
// })();
// console.log(result);
// (function (firstName) {
//   console.log("My Name is " + firstName);
// })("Laurence");




























