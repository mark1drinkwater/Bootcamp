/////////////////////////////////////////////////////////////////////////////////////////////////
// EXERCISE 3.1
// No 1
let shoppingList = ["Milk", "Bread", "Apples"];
console.log("Exercise 3.1");
// No 2
console.log("Length of the array", shoppingList.length);
// No 3
shoppingList[1] = "Bannas";
// No 4
console.log(shoppingList);

/////////////////////////////////////////////////////////////////////////////////////////////////
// EXERCISE 3.2
console.log("\nExercise 3.2:");
// No 1
shoppingList = [];
// No 2
shoppingList.push("Milk");
shoppingList.push("Bread");
shoppingList.push("Apples");
// No 3
// Splice arguments: 1st: which position to start. 2nd: how many elements to delete, if you want to add set it to 0. 3rd+: elements to insert
shoppingList.splice(1, 0, "Bannas", "Eggs");
// No 4
console.log(shoppingList.pop());
// No 5
shoppingList.sort();
// No 6
console.log(shoppingList.indexOf("Milk"));
// No 7
const bannasIndex = shoppingList.indexOf("Bannas");
shoppingList.splice(bannasIndex + 1, 1, "Carrots", "Lettuce");
// No 8
let newShoppingList = ["Juice", "Pop"];
// No 9
let lastList = shoppingList.concat(newShoppingList).concat(newShoppingList);
// No 10
console.log(lastList.lastIndexOf("Pop"));
// No 11
// Yes, it looks the same.
console.log(lastList);

/////////////////////////////////////////////////////////////////////////////////////////////////
// EXERCISE 3.3
console.log("\nExercise 3.3:");
// No 1
let arr = [1, 2, 3];
// No 2
let arrayOfArrays = [arr, arr, arr];
// No 3
console.log(arrayOfArrays[0][1]);

/////////////////////////////////////////////////////////////////////////////////////////////////
// EXERCISE 3.4
console.log("\nExercise 3.4:");
// No 1
myCar = {
  make: "Honda",
  model: "Civic",
  weight: 1268,
};
// No 2
let color = "color";
myCar[color] = "white";
// No 3
color = "forSale";
myCar[color] = true;
// No 4
console.log(myCar.make);
console.log(myCar.model);
// No 5
console.log(myCar.forSale);

/////////////////////////////////////////////////////////////////////////////////////////////////
// EXERCISE 3.5
console.log("\nExercise 3.5:");
// No 1
let people = {
  friends: [],
};
// No 2
let friend1 = {
  firstName: "Donovan",
  lastName: "Heunis",
  id: 99515,
};
let friend2 = {
  firstName: "John",
  lastName: "Smith",
  id: 69431,
};
let friend3 = {
  firstName: "Jane",
  lastName: "Peterson",
  id: 22561,
};
// No 3
people.friends.push(friend1, friend2, friend3);
// No 4
console.log(people.friends);

/////////////////////////////////////////////////////////////////////////////////////////////////
// PROJECTS
// Manipulating an array
console.log("\n PROJECTS:\nManiupulating an array");
const theList = [
  "Laurence",
  "Svekis",
  true,
  35,
  null,
  undefined,
  { test: "one", score: 55 },
  ["one", "two"],
];

theList.shift();
theList.pop();
theList.unshift("FIRST");
theList[3] = "hello world";
theList[2] = "MIDDLE";
theList.push("LAST");
console.log(theList);

/////////////////////////////////////////////////////////////////////////////////////////////////
// Company product catalog
console.log("\nCompany product catalog");
// No 1
let inventory = [];
// No 2
let item1 = {
  name: "tv",
  model: "4k Sony Bravio",
  cost: 19999.99,
  quantity: 4,
};
let item2 = { name: "piano", model: "Yamaha", cost: 9999.99, quantity: 10 };
let item3 = { name: "car", model: "Nissan", cost: 149999.99, quantity: 2 };
// No 3
inventory.push(item1, item2, item3);
// No 4
console.log(item3.quantity);

/////////////////////////////////////////////////////////////////////////////////////////////////
// Self-check quiz
/*
1. Can you use const and update values within an array? 
    Yes, you can update values within an array but you can't re-declare the variable.

2. Which property in an array gives the number of items contained in the array?
    .length

3. What is the output in the console?
const myArr1 = [1,3,5,6,8,9,15];
console.log(myArr1.indexOf(0));
console.log(myArr1.indexOf(3));
    -1
    1

4. How do you replace the second element in an array myArr =
[1,3,5,6,8,9,15] with the value 4?
    myArr[1] = 4;

5. What is the output in the console?
const myArr2 = [];
myArr2[10] = 'test'
console.log(myArr2);
console.log(myArr2[2]);
    Array(11) [ <10 empty slots>, … ]
    10: "test"
    
    undefined

6. What is the output in the console?
const myArr3 = [3,6,8,9,3,55,553,434];
myArr3.sort();
myArr3.length = 0;
console.log(myArr3[0]);
    undefined
*/