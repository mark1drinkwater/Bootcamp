// Simple function
var ourFirstFunction = function () {
    console.log("Hello world!");
};

// Calling a function
ourFirstFunction();

// Passing arguments into functions
var sayHelloTo = function (name) {
    console.log("Hello " + name + "!");
};

console.log();

sayHelloTo("Nick");

// Printing cat faces
var drawCats = function (howManyTimes) {
    for (var i = 0; i < howManyTimes; i++) {
        console.log(i + " =^.^=");
    }
};

console.log();

drawCats(5);


// Passing multiple arguments to a function
var printMultipleTimes = function (howManyTimes, whatToDraw) {
    for (var i = 0; i < howManyTimes; i++) {
        console.log(i + " " + whatToDraw);
    }
};

console.log();

printMultipleTimes(5, "=^.^=");

// Returning values from functions
var double = function (number) {
    return number * 2;
};

console.log();

console.log(double(3));

// Using function calls as values
console.log(double(double(3)));

// Using functions to simplify code
// A function to pick a random word
var pickRandomWord = function (words) {
    return words[Math.floor(Math.random() * words.length)];
};

console.log(pickRandomWord(["Charlie", "Raj", "Nicole", "Kate", "Sandy"]));

// A random insult generator into function
generateRandomInsult = function () {
    var randomBodyParts = ["Face", "Nose", "Hair"];
    var randomAdjectives = ["Smelly", "Boring", "Stupid"];
    var randomWords = ["Fly", "Marmot", "Stick", "Monkey", "Rat"];
    // Join all the random strings into a sentence:
    var randomString = "Your " + pickRandomWord(randomBodyParts) +
    " is like a " + pickRandomWord(randomAdjectives) +
    " " + pickRandomWord(randomWords) + "!!!";
    return randomString;
};

console.log(generateRandomInsult());

// Leaving a function early with return
var fifthLetter = function (name) {
    if (name.length < 5) {
    return;
}
    return "The fifth letter of your name is " + name[4] + ".";
};

fifthLetter("Nicholas");


// --------------- Programming challenges -----------------
// #1 Doing arithmetic with functions
function add(num1, num2) {
    return num1 + num2;
}

console.log();
console.log(add(5,3));

function multiply(num1, num2) {
    return num1 * num2;
}

console.log();
console.log(multiply(5,3));

// #2 Are these arrays the same?
function areArraysSame(arr1, arr2) {
    let arr1_length = arr1.length;
    let arr2_length = arr2.length;    
    let len = 0;

    if (arr1_length !== arr2_length) {
        return false;
    }

    if (arr1_length >= arr2_length) {
        len = arr1_length;
    } else {
        len = arr2_length;
    }

    for (let i = 0; i < len; i++) {
        if (arr1[i] !== arr2[i]) {
            return false;
        }
    }
    return true;
}

console.log(areArraysSame([1, 2, 3], [1, 2, 3]));
console.log(areArraysSame([1, 2, 3], [1, 2, 3, 4]));

// #3 Hangman with functions
// Write your functions here
var words = [
    "javascript",
    "monkey",
    "amazing",
    "pancake"
];

var pickWord = function () {
    // Return a random word
    return words[Math.floor(Math.random() * words.length)];
};

var setupAnswerArray = function (word) {
    // Return the answer array
    let tempAnswerArray = [];
    for (var i = 0; i < word.length; i++) {
        tempAnswerArray[i] = "_";
    }
    return tempAnswerArray;
};

var showPlayerProgress = function (answerArray) {
    // Use alert to show the player their progress
    alert(answerArray.join(" "));
};

var getGuess = function () {
    // Use prompt to get a guess
    return prompt("Guess a letter, or click Cancel to stop playing.");
};

var updateGameState = function (guess, word, answerArray) {
    // Update answerArray and return a number showing how many
    // times the guess appears in the word so remainingLetters
    // can be updated
    let guessedLetters = 0;

    for (var j = 0; j < word.length; j++) {
        if (word[j] === guess.toLowerCase()) {
            if (answerArray[j] === "_") {
                answerArray[j] = guess.toLowerCase();
                guessedLetters++;
            } else {
                alert("That letter has already been guessed.")
                break;
            }
        }
    }
    return guessedLetters;
};

var showAnswerAndCongratulatePlayer = function (answerArray) {
    // Use alert to show the answer and congratulate the player
    alert(answerArray.join(" "));
    alert("Good job! The answer was " + word);    
};




var word = pickWord();
var answerArray = setupAnswerArray(word);
var remainingLetters = word.length;

while (remainingLetters > 0) {
    showPlayerProgress(answerArray);
    var guess = getGuess();
    if (guess === null) {
        break;
    } else if (guess.length !== 1) {
        alert("Please enter a single letter.");
    } else {
        var correctGuesses = updateGameState(guess, word, answerArray);
        remainingLetters -= correctGuesses;
    }
}
showAnswerAndCongratulatePlayer(answerArray);