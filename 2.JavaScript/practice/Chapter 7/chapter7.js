// Exercise 7.1
console.log("\nExercise 7.1");

class Person {
    firstname;
    lastname;
    constructor(firstname, lastname) {
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
    constructor(firstname, lastname) {
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

    constructor(species, sound) {
        this.species = species;
        this.sound = sound;
    }

    makeSound() {
        return `The ${this.species} is making a ${this.sound} sound.`;
    }
}

Animal.prototype.sleep = function () {
    return "I am sleeping.";
}

let zebra = new Animal("zebra", "bray");
console.log(zebra.makeSound());
console.log(zebra);