// Mark Drinkwater
// Initialise variables
let secret = 0;
let guess = 0;

// Generate a random number from 1 to 10
secret = Math.floor(Math.random() * 10)+1;

// This while loop will always run at least once.
while (guess !== secret) {
    // Receive input from the user and Convert the string guess to an integer so that we can compare
    guess = parseInt(prompt('Please guess the secret number (1-10)'));

    if (guess < secret) {
        alert('Incorrect, too low');        
    } else if (guess > secret) {
        alert('Incorrect, too high');
    }    
}
alert('Correct!');