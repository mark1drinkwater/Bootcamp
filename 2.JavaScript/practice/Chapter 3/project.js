/////////////////////////////////////////////////////////////////////////////////////////////////
// PROJECTS
// Manipulating an array
console.log("PROJECTS:\nManiupulating an array");
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

let inventory = [];

let item1 = {
  name: "tv",
  model: "4k Sony Bravio",
  cost: 19999.99,
  quantity: 4,
};
let item2 = { name: "piano", model: "Yamaha", cost: 9999.99, quantity: 10 };
let item3 = { name: "car", model: "Nissan", cost: 149999.99, quantity: 2 };

inventory.push(item1, item2, item3);

console.log("Item: 3 Quantity:", item3.quantity);
console.log("Item: 2 Name:", item2.name);
console.log(`Item: 1 Name: ${item1.name}, Model: ${item1.model}, Cost: R${item1.cost}, Quantity: ${item1.quantity}`);