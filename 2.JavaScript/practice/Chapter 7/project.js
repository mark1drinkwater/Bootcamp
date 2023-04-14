/////////////////////////////////////////////////////////////////////////////////////////////////
// PROJECTS
// Project: Employee tracking app
console.log("Project: Employee tracking app");

class Employee {
    firstname;
    lastname;
    yearsWorked;

    constructor(firstname, lastname, yearsWorked) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearsWorked = yearsWorked;
    }
}

let emp1 = new Employee("Cristiano", "Ronaldo", 10);
let emp2 = new Employee("Britney", "Spears", 5);

const employees = [];
employees.push(emp1, emp2);

Employee.prototype.toString = function () {
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

    constructor(qty1, qty2) {
        this.#qty1 = qty1;
        this.#qty2 = qty2;
    }

    calculateCost() {
        return ((this.#qty1 * this.#price1) + (this.#qty2 * this.#price2)).toFixed(2);
    }

    get totalCost() {
        return this.calculateCost();
    }
}

const order1 = new Menu(1, 2);
const order2 = new Menu(3, 5);
const order3 = new Menu(0, 10);

console.log("R"+order1.totalCost);
console.log("R"+order2.totalCost);
console.log("R"+order3.totalCost);