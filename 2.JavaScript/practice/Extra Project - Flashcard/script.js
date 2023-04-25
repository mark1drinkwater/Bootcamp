// Main div that houses the add flashcard button and the flashcards container.
const container = document.querySelector('.container');

// Display flashcard form button.
const btnAdd = document.querySelector('#add-flashcard');

// Contains the flashcard elements to be displayed
const cardListCon = document.querySelector('.card-list-container');

/////////////////////////////////////////////////////////////////////////////////////////////
// Add Flashcard Form & Subsequent Elements:
// Add Flashcard that gets displayed.
const addFlashcardForm = document.querySelector('#add-question-card');
// Error message text element
const errorMsg = document.querySelector('#error');
// Close button
const btnClose = document.querySelector('#close-btn');
// Textarea element, where user types in the question.
const questionInput = document.querySelector('#question');
// Textarea element, where user types in the answer.
const answerInput = document.querySelector('#answer');
// Save flashcard button
const btnSave = document.querySelector('#save-btn');

// Global variable, to keep track if a flash card is being edited
let edit = {
    mode: false,
    current: '',
};

// Display add flashcard form & hide button, when button is clicked.
btnAdd.addEventListener('click', e => {
    show(addFlashcardForm);
    hide(container);
});

// Closes the form and displays the main page
btnClose.addEventListener('click', e => {
    hide(addFlashcardForm);
    show(container);
    // Disable edit mode
    edit.mode = false;
    edit.current = '';
});

// Call the add flashcard function, close the add flashcard form.
btnSave.addEventListener('click', e => {
    const ques = questionInput.value;
    const ans = answerInput.value;

    if (!ques && !ans) {
        show(errorMsg);
        return; //exit function
    } else {
        hide(errorMsg);
    }

    if (edit.mode) {
        saveChanges(ques, ans);
    } else {        
        addFlashcard(ques, ans)
    }

    hide(addFlashcardForm);
    show(container);
});

// Custom functions:
// Hide function
function hide(el) {
    el.classList.add('hide');
}

// Show function
function show(el) {
    el.classList.remove('hide');
}

// Create the flashcard and append it to the card list container
function addFlashcard(question, answer) {
    // Create all the various elements that'll we'll need to create the flashcard.
    const flashCard = document.createElement('div');
    const questionDiv = document.createElement('div');
    const btnShowHide = document.createElement('div');
    const answerDiv = document.createElement('div');
    const buttonContainer = document.createElement('div');
    const btnEdit = document.createElement('button');
    const btnDelete = document.createElement('button');

    // Adding the appropriate class to each element
    flashCard.classList.add('card');
    questionDiv.classList.add('question-div');
    btnShowHide.classList.add('show-hide-btn');
    answerDiv.classList.add('answer-div');
    // Want the answer to be hidden by default
    answerDiv.classList.add('hide');
    buttonContainer.classList.add('buttons-con');
    btnEdit.classList.add('edit');
    btnDelete.classList.add('delete');
    
    /* Visualisation of the nesting of the elements.
    .card
        .question-div
        .show-hide-btn
        .answer-div + .hide
        .buttons-con
            .edit
            .delete
    */  
    // Implementing element nesting.
    flashCard.appendChild(questionDiv);
    flashCard.appendChild(btnShowHide);
    flashCard.appendChild(answerDiv);
    flashCard.appendChild(buttonContainer);
    buttonContainer.appendChild(btnEdit);
    buttonContainer.appendChild(btnDelete);
    // Add flashcard to the page
    cardListCon.appendChild(flashCard);

    // Setting the values of the elements
    questionDiv.textContent = question;
    btnShowHide.textContent = 'Show or Hide';
    answerDiv.textContent = answer;    

    // Add a picture to the edit, delete anchors (buttons), by inserting a font awesome icon.
    // Hide non-interactive content from the accessibility API by setting aria-hidden to true.
    btnEdit.innerHTML = '<i class="fa fa-edit" aria-hidden="true"></i>';
    btnDelete.innerHTML = '<i class="fa fa-trash" aria-hidden="true"></i>';

    /////////////////////////////////////////////////////////////////////////////////////////
    // Button functionality:
    btnShowHide.addEventListener('click', showHideAnswer);
    btnEdit.addEventListener('click', editCard);
    btnDelete.addEventListener('click', deleteCard);

    // Clear user's input
    // questionInput.value = "";
    // answerInput.value = "";

};

function showHideAnswer(e) {
    // Get the answer div element.
    // The showHide button and answer div element are siblings.
    const answerDiv = e.target.nextElementSibling;
    // Toggle the hide class.
    // Remove the hide class if present, Add it if absent.
    answerDiv.classList.toggle('hide');
}

function editCard(e) {
    // Get the card element
    const flashCard = getCardElement(e);
    // Get the flashcard's question.
    const question = flashCard.querySelector('.question-div').textContent;
    // Get the flashcard's answer.
    const answer = flashCard.querySelector('.answer-div').textContent;
    show(addFlashcardForm);
    hide(container);

    // Set the form's values to the flashcard values.
    questionInput.value = question;
    answerInput.value = answer;

    // Set editMode global flag to true
    edit.mode = true;
    edit.current = flashCard;
}

function saveChanges(question, answer) {
    // Get the card element
    const flashCard = edit.current;
    // Save the user inputs to the flashcard
    flashCard.querySelector('.question-div').textContent = question;
    flashCard.querySelector('.answer-div').textContent = answer;
    // Set edit mode to false
    edit.mode = false;
    edit.current = '';
}

function deleteCard(e) {
    // Get the parent card element
    const flashCard = getCardElement(e);
    // Delete the flash card.
    flashCard.remove();
}

// Re-factored the code into a function.
// To keep the code DRY - Don't Repeat Yourself.
function getCardElement(e) {
    // Get the delete button that was clicked
    const btnDelete = e.target;
    // We can find the flashcard parent of the delete button
    // Using the cloest() we can, traverse the DOM tree upwards, (the reverse of a query selector)
    // Need to use closest because we are looking at the parent elements.
    // querySelector() works for the child elements.
    const flashCard = btnDelete.closest('.card');
    return flashCard;
}