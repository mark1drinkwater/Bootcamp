/////////////////////////////////////////////////////////////////////////////////////////////////
// PROJECTS
// Evaluating a number game
console.log("Project: Evaluating a number game");
let dynamicNum = Math.floor(Math.random() * 11);
let userNum2 = Number(prompt("Please enter a number from 0 to 10"));
if (userNum2 > dynamicNum) {
    console.log(`Your number: ${userNum2} is greater than the randomly generated number of: ${dynamicNum}`);
} else if (userNum2 === dynamicNum) {
    console.log(`Your number: ${userNum2} is equal to the randomly generated number of: ${dynamicNum}`);
} else {
    console.log(`Your number: ${userNum2} is less than the randomly generated number of: ${dynamicNum}`);
}

// Friend checker game
console.log("\nProject: Friend checker game");
const userName = prompt("Please enter your name").toLowerCase();
const userNameProper = userName.slice(0,1).toUpperCase() + userName.slice(1);
switch (userNameProper) {
    case "John":
    case "Jane":
    case "Mary":
    case "Harry":
    case "Larry":
        console.log(`Yes, ${userNameProper} is my friend.`)
        break;
    default:
        console.log(`I don't know ${userNameProper}`);
        break;
}

// Rock paper scissors
console.log("\nProject: Rock Paper Scissors game");
outcomes = ["Rock", "Paper", "Scissors"];

const generateRandomNumber = () => Math.floor(Math.random() * 3);

//let playerChoice = generateRandomNumber();
let playerRPS = prompt("Choose Rock, Paper, Scissors");
let playerCapitalised = playerRPS[0].toUpperCase() + playerRPS.slice(1).toLowerCase();
let playerChoice = outcomes.indexOf(playerCapitalised);

let computerChoice = generateRandomNumber();

let message3 = `Player choice: ${outcomes[playerChoice]} and Computer choice: ${outcomes[computerChoice]}\n`;

if (playerChoice === computerChoice) {
    message3 += "It's a tie";
} else if (playerChoice === 2 && computerChoice === 0) {
    message3 += "Computer wins";
} else if (playerChoice === 0 && computerChoice === 2) {
    message3 += "Players wins";
} else if (playerChoice > computerChoice) {
    message3 += "Player wins";
} else {
    message3 += "Computer wins";
}
console.log(message3);