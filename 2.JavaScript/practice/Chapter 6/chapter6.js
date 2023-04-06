// Exercise 6.1
console.log("Exercise 6.1");
function addTogether(a, b) {
    return a + b;
}

const a = 5;
const b = 10;

console.log(addTogether(a, b));
console.log(addTogether(8, 9));

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 6.2
console.log("\nExercise 6.2");
const words = ["beautiful", "short", "tall", "bright"];

function adjectiveName() {
    const name = prompt("Enter your name.");
    const randNum = Math.floor(Math.random() * words.length);
    console.log(words[randNum], name);
}

adjectiveName();

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 6.3
console.log("\nExercise 6.3");
const num1 = 89;
const num2 = 19;
const operator = "-";

function calculate(num1, num2, operator) {
    if (operator === "-") {
        console.log(num1 - num2);
    } else {
        console.log(num1 + num2);
    }
}

console.log(calculate(num1, num2, operator));

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 6.4
console.log("\nExercise 6.4");

const calcValuesArr = [];

function calculateReturn(num1, num2, operator) {
    if (operator === "-") {
        return num1 - num2;
    } else {
        return num1 + num2;
    }
}

for (let i = 0; i < 10; i++) {
    let num1 = i * 5;
    let num2 = i * i;
    let result = calculateReturn(num1, num2, "+");
    calcValuesArr.push(result);
}

console.log(calcValuesArr);

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 6.5
console.log("\nExercise 6.5");
let numberStr = "1000";

(function () {
    let numberStr = "500";
    console.log(numberStr);
})();

let result = (function () {
    let numberStr = " 300";
    return numberStr
})();
console.log("numberStr", numberStr);

(function (param) {
    let numberStr = param;
    console.log(`And the number is: ${numberStr}`);
})("999");

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 6.6
console.log("\nExercise 6.6");

function factorial(num) {
    if (num === 0) {
        return 1;
    } else {
        return num * factorial(--num);
    }
}
console.log("Factorial of 7:", factorial(7));

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 6.7
console.log("\nExercise 6.7");
let start = 10;

function countdown(value) {
    console.log(value);
    if (value < 1) {
        return value;
    } else {
        value--;
        countdown(value);
    }
}

countdown(start);

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 6.8
console.log("\nExercise 6.8");
const funcVar = function (param) {
    console.log(param);
}
funcVar("hello world");

function func(param) {
    console.log(param)
}
func("hello world");

/////////////////////////////////////////////////////////////////////////////////////////////////
// PROJECTS
// Create a recursive function
console.log("\nProject: Recursive function");
function countTillTen(counter) {
    console.log(counter);
    if (counter > 9) {
        return counter;
    } else {
        return countTillTen(counter + 1);
    }
}
countTillTen(3);

/////////////////////////////////////////////////////////////////////////////////////////////////
// PROJECTS
// Project: Set timeout order
console.log("\nProject: Set timeout order");
const one = () => console.log("one");
const two = () => console.log("two");
const three = () => {
    console.log("three")
    one();
    two();
};
const four = () => {
    console.log("four");
    setTimeout(one, 0);
    three();
}
four();
