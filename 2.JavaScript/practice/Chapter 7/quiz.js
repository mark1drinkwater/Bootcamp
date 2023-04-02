// Self-check quiz
// 1. What is the keyword used to create a class?
// class

// 2. How would you set up a class for a person's first and last names that could
// include first and last as initial properties?
class Person {
    firstname;
    lastname;
    constructor(firstname, lastname) {
        this.firstname;
        this.lastname;
    }
}

// 3. What is the concept of one thing gaining the properties and behaviors of another thing called?
// Inheritance

// 4. Which of the following are true about the constructor method?
// • It gets executed automatically when a new object is created.  TRUE
// • It should only be added afterward.                            FALSE
// • It has to include the constructor keyword.                    TRUE
// • It is used to initialize object properties.                   TRUE
// • It can be used when you have multiple values.                 FALSE

// 5. Troubleshoot the following code so that the prototype outputs the first and
// last name of the Person into the console. Which is the correct syntax for the  Person prototype?
// ANSWER IS: B

function Person(first, last) {
    this.first = first;
    this.last = last;
}
// What should go here: A, B, or C?: B
const friend1 = new Person("Laurence", "Svekis");
console.log(friend1.getName());

// A)
Person.prototype.getName = (first, last) {
    return this.first + " " + this.last;
};

// B)
Person.prototype.getName = function getName() {
    return this.first + " " + this.last;
};

// C)
Person.prototype = function getName() {
    return this.first + " " + this.last;
};