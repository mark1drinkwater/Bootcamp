// Exercise 7.1
console.log("\nExercise 7.1");

class Person {
    firstname;
    lastname;
    constructor (firstname, lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}

let p = new Person("John", "Smith");
let p2 = new Person("Jane", "Peterson");

console.log("Hello", p.firstname, p.lastname);
console.log("Hello", p2.firstname, p2.lastname);

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 7.2
console.log("\nExercise 7.2");

class Individual {
    firstname;
    lastname;
    constructor (firstname, lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    fullname() {
        return this.firstname + " " + this.lastname;
    }
}

let person1 = new Individual("Angelina", "Jolie");
let person2 = new Individual("Bradd", "Pitt");

console.log(person1.fullname());
console.log(person2.fullname());

/////////////////////////////////////////////////////////////////////////////////////////////////
// Exercise 7.3
console.log("\nExercise 7.3");

class Animal {
    species;
    sound;

    constructor (species, sound) {
        this.species = species;
        this.sound = sound;
    }

    makeSound() {
        return `The ${this.species} is making a ${this.sound} sound.`;
    }
}

Animal.prototype.sleep = function() {
    return "I am sleeping.";
}

let zebra = new Animal("zebra", "bray");
console.log(zebra.makeSound());
console.log(zebra);

/////////////////////////////////////////////////////////////////////////////////////////////////
// PROJECTS
// Project: Employee tracking app
console.log("\nProject: Employee tracking app");

class Employee {
    firstname;
    lastname;
    yearsWorked;

    constructor (firstname, lastname, yearsWorked) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearsWorked = yearsWorked;
    }    
}   

let emp1 = new Employee("Christiano", "Ronaldo", 10);
let emp2 = new Employee("Britney", "Spears", 5);

const employees = [];
employees.push(emp1, emp2);

Employee.prototype.toString = function() {
    return `${this.firstname} ${this.lastname} has worked for this company for ${this.yearsWorked} years.`;
}

employees.forEach(employee => console.log(employee.toString()));

/////////////////////////////////////////////////////////////////////////////////////////////////
// Project: Menu items price calculator
console.log("\nProject: Menu items price calculator");

class Menu {
    #price1 = 30.99;
    #price2 = 25.99;
    #qty1;
    #qty2;

    constructor (qty1, qty2) {
        this.#qty1 = qty1;
        this.#qty2 = qty2;
    }

    calculateCost() {
        return (this.#qty1 * this.#price1) + (this.#qty2 + this.#price2);
    }

    get totalCost() {
        return this.calculateCost();
    }
}

const order1 = new Menu(1, 2);
const order2 = new Menu(3, 5);
const order3 = new Menu(0, 10);

console.log(order1.totalCost());
console.log(order2.totalCost());
console.log(order3.totalCost());