// Exercise 8.1
console.log("Exercise 8.1");
const strEncoded = "How's%20it%20going%3F";
const strPlain = "How's it going?";

console.log("Encoded:", encodeURIComponent(strPlain));
console.log("Decoded:", decodeURIComponent(strEncoded));

const webURI = encodeURI("http://www.basescripts.com?=Hello World");
console.log("Web URI:", webURI);

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 8.2
console.log("\nExercise 8.2");

const names = ["Laurence", "Mike", "Larry", "Kim", "Joanne", "Laurence", "Mike", "Laurence", "Mike", "Laurence", "Mike"];
let namesUnique = [];

namesUnique = names.filter(function (value, index, array) {
    console.log(index, value);
    if (names.indexOf(value) === index)
        return true;
    else
        return false;
});

console.log(namesUnique);

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 8.3
console.log("\nExercise 8.3");

const numbersArr = [5, 8, 99, 40, 56, 10, 94, 62, 71, 3, 7, 96, 7];

const multiplied = numbersArr.map(function (value, index, array) {
    return value * 2;
});

console.log("Anonymous function:", multiplied)

const multipliedArrow = numbersArr.map(value => value * 2);

console.log("Arrow function:", multipliedArrow);

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 8.4
console.log("\nExercise 8.4");

let sentence = "Why don't scientists trust ATOMS? Because they make up EVERYTHING!"

console.log(transformCase(sentence))

function transformCase(str) {
    let newStr = str.toLowerCase();
    let wordArr = [];
    let properWordsArr = []

    wordArr = newStr.split(" ");

    wordArr.forEach(word => {
        let firstLetter = word.slice(0, 1).toUpperCase();
        let restWord = word.slice(1);
        let properWord = firstLetter + restWord;
        properWordsArr.push(properWord);
    });

    return properWordsArr.join(" ");
}

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 8.5
console.log("\nExercise 8.5");

const sentence2 = "I love JavaScript";
const vowels = ['a', 'e', 'i', 'o', 'u'];

let noVowels = sentence2.toLowerCase();

vowels.forEach((letter, index) => {
    console.log(letter);
    noVowels = noVowels.replaceAll(letter, index);
})

console.log(noVowels);

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 8.6
console.log("\nExercise 8.6");

console.log(Math.PI);
console.log(Math.ceil(5.7));
console.log(Math.floor(5.7));
console.log(Math.round(5.7));

console.log(Math.random());
console.log(Math.floor(Math.random() * 11));
console.log(Math.floor(Math.random() * 10) + 1);
console.log(Math.floor(Math.random() * 100) + 1);

function randomNumber(min, max) {
    //return Math.floor(Math.random() * max) + min;
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

console.log("\n100 Random Numbers:");
for (let i = 0; i < 100; i++) {
    console.log(randomNumber(1, 100));
}

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 8.7
console.log("\nExercise 8.7");

let d = new Date();
console.log(d);

const months = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];

let day = d.getDate();
let year = d.getFullYear();
let month = d.getMonth();

let date = `${day} ${months[month-1]} ${year}`;

console.log(date);

/////////////////////////////////////////////////////////////////////////////////////////////////
// PROJECTS
// Project: Word scrambler
console.log("\nProject: Word scrambler");

const scrabbleWord = "programming";
scrabble(scrabbleWord);

function scrabble(value) {
    const length = value.length;
    let originalWord = "";

    let result = "";
    for (let i = 0; i < length; i++) {
        let rand = Math.floor(Math.random() * value.length);
        result += value[rand];
        value = value.slice(0, rand) + value.slice(rand+1);
        console.log(result[i], value, result);
    }
}

// Project: Word scrambler
console.log("\nProject: Countdown timer");

let endDate = "2023/05/20";

setInterval( function() { update(endDate) } , 1000);

function countdown(date) {
    let dateParsed = Date.parse(date);
    let timeDiff = dateParsed - new Date();

    // Time is in milliseconds
    // So to convert to days you have to convert milliseconds -> seconds -> minutes -> hours -> days
    let days = Math.floor(timeDiff/ 1000 / 60 / 60 / 24 );
    let hours = Math.floor(timeDiff/ 1000 / 60 / 60 % 24 );
    let minutes = Math.floor(timeDiff/ 1000 / 60 % 60 );
    let seconds = Math.floor(timeDiff/ 1000 % 60 );

    return {
        days,
        hours,
        minutes,
        seconds
    };
}

function update(date) {
    const temporary = countdown(date);
    let tempOutput = "";

    for (const [value, unit] of Object.entries(temporary)) {
        tempOutput += `${unit}${value} `;
    }
    console.log(tempOutput);
}