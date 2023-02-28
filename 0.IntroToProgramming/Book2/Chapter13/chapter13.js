// Create an event listener for the print button, with a handler function called printView
let printButton = document.getElementById("printable");
printButton.addEventListener("click", printView);

// Create an event listener for the add button, with a handler function called addTheThing
let addButton = document.getElementById("addIt");
addButton.addEventListener("click", addTheThing);

// Create a blank array named myList
let myList = [];
// Create a variable: myListArea which references the element with the id of 'wishList'
let myListArea = document.getElementById("wishList");

/*
    function addTheThing gets the value of the text field and then passes it to a function
    called addToTheList. It then runs a function called resetInput
*/
function addTheThing() {
    let theThing = document.getElementById("iWant");
    addToTheList(theThing);
    resetInput(theThing);
}

/*
    function addToTheList, which takes one paramter, called thingToAddm
    pushes it into the myList array, and then adds it to myListArea
*/
function addToTheList(thingToAdd) {
    myList.push(thingToAdd.value);
    let newListItem = document.createElement("li");
    newListItem.innerHTML = myList[myList.length - 1];

    myListArea.appendChild(newListItem);
    resetInput(thingToAdd);
}

// function printView, which outputs a nicely formatted, view of the list 
function printView () {
    let listPage = document.getElementById("listPage");
    let formArea = document.getElementById("formArea");

    formArea.style.display = "none";
    listPage.className = "print";
    myListArea.innerHTML = "";
    myList.sort();

    for (let i = 0; i < myList.length; i++) {
        wishList.innerHTML += "<li>" + myList[i] + "</li>";
    }
    window.print();
}

/*
    function resetInput, which resets the value of the input field to blank ("")
*/
function resetInput(inputToReset) {
    inputToReset.value = "";
}

