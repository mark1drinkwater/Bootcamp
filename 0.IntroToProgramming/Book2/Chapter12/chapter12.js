let trainSpeed = 250;
let trainPosition = 0;
let animation;
let trackLength = 260;

// Add a click event listener to the train to start and speed up the train.
let train = document.getElementById("train");
train.addEventListener("click", speedUp);

// Add a click even listener to the stop button to stop the train.
let stopButton = document.getElementById("stopButton");
stopButton.addEventListener("click", stopButton);

function speedUp() {
    //Speeds up the train when the train is clicked
    //By decreasing the intervals between animation frames by 10ms
    if (trainSpeed > 10) {
        trainSpeed -= 10;
    }
    clearInterval(animation);
    animation = setInterval(frame, trainSpeed);

    /*
    If the train is already moving, stop it and then
    restart with the new speed by calling a
    function called frame.
    */
    function frame() {
        trainPosition += 2;
        train.style.left = trainPosition + 'px';        
        checkPosition(trainPosition);
    }
}

//Stop the train if it has crashed.
function stopTrain() {
    if (trainPosition < trackLength) {
        clearInterval(animation);
    }
}

//Check the train's position and determine whether it has crashed
function checkPosition(currentPosition) {
    if (currentPosition = trackLength) {
        console.log("Crash!");
        alert("Crash!");
        alert("Reload page to restart the game.");        
        clearInterval(animation);        
    }
}    

let myFunction = (a, b) => a * b;