var people = ["Kareem", "Fatma", "Sumaya", "Eddie", "Mr. Hobson", "Bobby", "Ms. Young", "Mrs. O' Doherty"];
var otherPeople = ["Emilie", "Mommy", "Dad", "Kathy"];





// toString and valueOf do the same thing
//document.getElementById("peopleIKnow").innerHTML = people.toString();
//document.getElementById("peopleIKnow").innerHTML = people.valueOf();

// Join together arrays
//people = people.concat(otherPeople);

// Find position of 'Eddie' in the array
//people = people.indexOf("Eddie");

// Convert the array into a string and separate the elements by specified delimeter
//people = people.join(",");

// Find the last position of 'Bobby' in the array
//people = people.lastIndexOf("Bobby");

// Remove the last element of the array, and store the element that was removed
//people.pop();

// Only remove the last element of the arra.
//people.pop();

// Add an element to the end of the array
//people.push("Teddy");

// Reverse the elements of an array
//people = people.reverse();

// Remove the first element of the array
//people.shift();

// Add an element to the beginning of the array
//people.unshift("Mary");

// Pick certain elements from your array to create a new array
//people = people.slice(0,3);

// Sort the elements of an array alphabetically
//people = people.sort();

// Add or remove elements at certain positions
// 0 means to insert an element not remove
//people.splice(1,0,"Kareem");


// Display array on webpage
document.getElementById("peopleIKnow").innerHTML = people.toString();