// Exercise 5.1
console.log("Exercise 5.1")
// No 1
let max = 5;
// No 2
const rand = Math.floor(Math.random() * max) + 1;
console.log(rand);
// No 3
let correctGuess = false;
// No 4
while (!correctGuess) {
    let guess = Number(prompt("Enter a number between 1 and 5"));
    // No 5
    if (guess == rand) {
        correctGuess = true;
        alert("Correct answer.");
    } else if (guess > rand) {
        alert("Guessed too high.");
    } else {
        alert("Guessed too low");
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 5.2
console.log("\nExercise 5.2");
// No 1
let counter = 0;
// No 2
let step = 10;
// No 3
do {
    console.log(counter);
    counter += step;
} while (counter <= 100);

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 5.3
console.log("\nExercise 5.3");
// No 1
const myWork = [];
// No 2
for (let i = 1; i < 11; i++) {
    let tempObj = { 
                name: `Lesson: ${i}`, status: `${i%2?true:false}`
              }    
    myWork.push(tempObj);
}
console.log(myWork);

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 5.4
console.log("\nExercise 5.4");
const myTable = [];

const rows = 20;
const cols = 6;

let counter2 = 0;

for (let i = 0; i < rows; i++) {
    const tempTable = [];
    for (let j = 0; j < cols; j++) {                
        counter2++;        
        tempTable.push(counter2);
    }
    myTable.push(tempTable);
}
console.table(myTable);

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 5.5
console.log("\nExercise 5.5");
const grid = [];
const noCells = 64;
let counter3 = 0;
let row;

for (let i = 0; i < noCells/*+1*/; i++) {
    if (i % 8 === 0) {
        if (typeof row !== 'undefined') {
            grid.push(row);
        }
        row = [];
    }    
    //if (counter3 === 8) grid.push(row);    
    counter3++;
    let tempCounter = counter3;
    row.push(tempCounter);
}
// Alternative solution
grid.push(row);

console.table(grid);

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 5.6
console.log("\nExercise 5.6");
const myArr = [];
for (let i = 0; i < 10; i++) {
    myArr.push(i);
}
console.log(myArr);

for (const value of myArr) {
    console.log(value);
}

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 5.7
console.log("\nExercise 5.7");
const planets = {name: "Mars", diameter:6779, mass: 6.39e23};

for (const key in planets) {
    const value = planets[key];
    console.log(key, value);
}

const planetsArr = ["Mars", "6779", 6.39e23];

for (let i = 0; i < planetsArr.length; i++) {
    console.log(planetsArr[i]);
}

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 5.8
console.log("\nExercise 5.8");
let output = "";
const skip = 5;

for (let i = 0; i < 11; i++) {
    if (i === skip)
        continue;
    output += i;
}
console.log(output)

output = "";

for (let i = 0; i < 11; i++) {
    if (i === skip)
        break;
    output += i;
}
console.log(output)