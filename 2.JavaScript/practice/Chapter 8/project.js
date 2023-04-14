/////////////////////////////////////////////////////////////////////////////////////////////////
// PROJECTS
// Project: Word scrambler
console.log("\nProject: Word scrambler");

const scrabbleWord = "programming";
console.log("Scrabbled world: ", scrabble(scrabbleWord));

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
    return result;
}

// Project: Word scrambler
console.log("\nProject: Countdown timer");

let endDate = "2023/05/20";

// Callback is in an anonymous function in order to pass parameters, 
//   without the function being automatically invoked.
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