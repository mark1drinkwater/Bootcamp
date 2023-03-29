// class ClassName {
//   constructor(prop1, prop2) {
//     this.prop1 = prop1;
//     this.prop2 = prop2;
//   }
// }

// let obj = new ClassName("arg1", "arg2");

// function DogA(dogName, weight, color, breed) {
//   this.dogName = dogName;
//   this.weight = weight;
//   this.color = color;
//   this.breed = breed;
// }
// let dog1 = new DogA("Jacky", 30, "brown", "labrador");

// class DogB {
//   constructor(dogName, weight, color, breed) {
//     this.dogName = dogName;
//     this.weight = weight;
//     this.color = color;
//     this.breed = breed;
//   }
// }

// let dog2 = new DogB("JavaScript", 2.4, "brown", "chihuahua");

// console.log(dog1);
// console.log(dog2);

// class Person {
//   constructor(firstname, lastname) {
//     this.firstname = firstname;
//     this.lastname = lastname;
//   }
// }

// let p = new Person("Maaike", "van Putten");

// console.log(p);
// console.log("Hi", p.firstname);
// console.log("Hi", p.firstname, p.lastname);

// class Person {
//   constructor(firstname, lastname = "Doe") {
//     this.firstname = firstname;
//     this.lastname = lastname;
//   }
// }

// let p1 = new Person("Maaike");
// console.log("Hi", p1.firstname, p1.lastname);

// let p2 = new Person("John", "Smith");
// console.log("Hi", p2.firstname, p2.lastname);

// class Person {
//   constructor(firstname, lastname) {
//     this.firstname = firstname;
//     this.lastname = lastname;
//   }
//   greet() {
//     console.log("Hi there! I'm", this.firstname);
//   }
// }

// Class with Methods
// class Person {
//   constructor(firstname, lastname = "Doe") {
//     this.firstname = firstname;
//     this.lastname = lastname;
//   }
//   greet() {
//     console.log("Hi there! I'm", this.firstname);
//   }
//   compliment(name, object) {
//     return "That's a wonderful " + object + ", " + name + ".";
//   }
// }

// let p3 = new Person("Jane", "Pearson");
// p3.greet();
// console.log(p3.compliment("Sarah", "hairstyle"))

// Restrict access
// class Person {
//     #firstname;
//     #lastname;
//   constructor(firstname, lastname = "Doe") {
//     this.#firstname = firstname;
//     this.#lastname = lastname;
//   }
//   greet() {
//     // It needs the hash infront to work
//     console.log("Hi there! I'm", this.#firstname);
//   }
//   compliment(name, object) {
//     return "That's a wonderful " + object + ", " + name + ".";
//   }
// }

// let p3 = new Person("Jane", "Pearson");
// console.log(p3.firstname);
// p3.greet();

// Variables are private and able to be accessed because of the get and set methods
// class Person {
//   #firstname;
//   #lastname;
//   constructor(firstname, lastname) {
//     this.#firstname = firstname;
//     this.#lastname = lastname;
//   }
//   get firstname() {
//     return this.#firstname;
//   }
//   set firstname(firstname) {
//     if (firstname.length > 1) this.#firstname = firstname;
//     else alert("first name too short");
//   }
//   get lastname() {
//     return this.#lastname;
//   }
//   set lastname(lastname) {
//     this.#lastname = lastname;
//   }
// }

// let p = new Person("Maria", "Saga");
// // Calling get method
// console.log(p.firstname);
// // Using set method
// p.firstname = "J";
// p.firstname = "Joe";

// console.log(p.firstname);

// class Vehicle {
//   color = "red";
//   currentSpeed;
//   maxSpeed;
//   constructor(color, currentSpeed, maxSpeed) {
//     this.color = color;
//     this.currentSpeed = currentSpeed;
//     this.maxSpeed = maxSpeed;
//   }
//   move() {
//     console.log("moving at", this.currentSpeed);
//   }
//   accelerate(amount) {
//     this.currentSpeed += amount;
//   }
// }

// class Motorcycle extends Vehicle {
//   fuel;
//   constructor(color, currentSpeed, maxSpeed, fuel) {
//     super(color, currentSpeed, maxSpeed);
//     this.fuel = fuel;
//   }

//   doWheelie() {
//     console.log("Driving on one wheel!");
//   }
// }

// let motor = new Motorcycle("Black", 0, 250, "gasoline");
// console.log(motor.color);
// motor.accelerate(50);
// console.log(motor.currentSpeed)
// motor.move();
// motor.doWheelie();

class Person {
  constructor(firstname, lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
  }

  greet() {
    console.log("Hi there!");
  }
}

Person.prototype.introduce = function() {
  console.log("Hi, I'm", this.firstname);
};

Person.prototype.favouriteColour = "green";

let p = new Person("Maria", "Saga");
console.log(p.favouriteColour);
p.introduce();




















