console.clear();
// let s = "Hello";
// console.log(
//   s
//     .concat(" there!")
//     .toUpperCase()
//     .replace("THERE", "you")
//     .concat(" You're amazing!")
// );

// let x = 7;
// console.log(Number.isNaN(x));
// // This method is available directly. JS creators chose the methods they thought were the most common
// console.log(isNaN(x));

// There is encodeURI and encodeURIComponent
// let uri = "https://www.example.com/submit?name=maaike van putten";
// let encoded_uri = encodeURIComponent(uri);
// console.log("Encoded:", encoded_uri);
// let decoded_uri = decodeURIComponent(encoded_uri);
// console.log("Decoded:", decoded_uri);`

// Parsing numbers
// It stops parsing as soon as it encounters a non-numeric character
// let str_int = "7.6";
// let int_int = parseInt(str_int);
// console.log("Type of ", int_int, "is", typeof int_int);

// let str_binary = "0b101";
// let int_binary = parseInt(str_binary);
// console.log("Type of", int_binary, "is", typeof int_binary);

// let str_nan = "hello!";
// let int_nan = parseInt(str_nan);
// console.log("Type of", int_nan, "is", typeof int_nan);

// for each method
// let arr = ["grapefruit", 4, "hello", 5.6, true];
// function printStuff(element, index) {
//   console.log("Printing stuff:", element, "on array position:", index);
// }
// arr.forEach(printStuff);

// filter methods
// let arr = ["squirrel", 5, "Tjed", new Date(), true];
// function checkString(element, index) {
//   return typeof element === "string";
// }
// let filterArr = arr.filter(checkString);
// console.log(filterArr);

// console.log(arr.every(checkString));

// // Replace part of an array with another part of the array
// arr = ["grapefruit", 4, "hello", 5.6, true];
// // Replaces the first position of the array with 2 elements
// arr.copyWithin(0, 3, 5);
// console.log(arr);

// function go(msg) {
//     eval(msg.value);
// }

// Mapping the values of an array
// let arr = [1, 2, 3, 4];
// let mapped_arr = arr.map((x) => x + 1);

// // Need to explicitly use the return keyword if not using a single expression in an arrow function
// mapped_arr = arr.map(function (e) {
//   return e + 1;
// });

// console.log(mapped_arr);

// String methods
// Combining strings
// let s1 = "Hello ";
// let s2 = "JavaScript";
// let result = s1.concat(s2);
// console.log(result);

// Converting a string to an array
// let result = "Hello JavaScript";
// let arr_result = result.split(" ");
// // console.log(arr_result);

// // let favouriteFruits = "strawberry,watermelon,grapefruit";
// // let arr_fruits = favouriteFruits.split(",");
// // console.log(arr_fruits);

// // // Converting an array to a string
// // let letters = ["a", "b", "c"];
// // // By default it will join with a comma if no value is specified
// // let x = letters.join();
// // console.log(x);

// // Index and positions
// // let poem = "Roses are red, violets are blue, if I can do JS, then you can too!";
// // // let index_re = poem.indexOf("re");
// // // console.log(index_re);

// // // let indexNotFound = poem.indexOf("python");
// // // console.log(indexNotFound);

// // let searchStr = "When I see my fellow, I say hello";
// // let pos = searchStr.search("lo");
// // console.log(pos);

// // let lastIndex_re = poem.lastIndexOf("re");
// // console.log(lastIndex_re);

// // let pos1 = poem.charAt(10);
// // console.log(pos1);

// // let s3 = "hello hello";
// // let new_s3 = s3.replace("hello", "oh");
// // console.log(new_s3);

// // let s4 = "hello hello";
// // let new_s4 = s3.replaceAll("hello", "oh");
// // console.log(new_s3);

// // let caps = "HI HOW ARE YOU";
// // console.log(caps[0] + caps.slice(1).toLowerCase());

// // The start and end of a string
// let encouragement = "You are doing great, keep up the good work!";
// // let bool_start = encouragement.startsWith("You");
// // console.log(bool_start);

// // // startsWith is case-sensitive
// // let bool_start2 = encouragement.startsWith("you");
// // console.log(bool_start2);

// // // Trick to make the search case-insensitive
// // let bool_start3 = encouragement.toLowerCase().startsWith("you");
// // console.log(bool_start3);

// // Ends with
// let bool_end = encouragement.endsWith("Something else");
// console.log(bool_end);

// let x = 34;
// console.log(isNaN(x));
// console.log(!isNaN(x));
// let str = "hi";
// console.log(isNaN(str));

// let x = 3;
// let str = "finite";
// console.log(isFinite(x));
// console.log(isFinite(str));
// console.log(isFinite(Infinity));
// console.log(isFinite(10 / 0));

// NaN is a special value of numeric
// typeof (num = parseInt("a string")) === "number" ? console.log("true") : console.log("false");
// // Best way to check if it is a number
// isFinite(num = parseInt("a string")) ? console.log("true") : console.log("false");

// let x = 1.23456;
// let newX = x.toFixed(2);

// let x = 1.23456;
// let newX = x.toPrecision(4);
// console.log(x, newX);

// let highest = Math.max(2, 56, 12, 1, 233, 4);
// console.log(highest);

// let lowest = Math.min(2, 56, 12, 1, 233, 4);
// console.log(lowest);

// // Will return NaN
// let highestOfWords = Math.max("hi", 3, "bye");
// console.log(highestOfWords);

// let result = Math.sqrt(64);
// console.log(result);

// let result2 = Math.pow(5, 3);
// console.log(result2);

// let x = 6.78;
// let y = 5.34;
// // console.log("X:", x, "becomes", Math.round(x));
// // console.log("Y:", y, "becomes", Math.round(y));

// // console.log("X:", x, "becomes", Math.ceil(x));
// // console.log("Y:", y, "becomes", Math.ceil(y));

// // let negativeX = -x;
// // let negativeY = -y;
// // console.log("negativeX:", negativeX, "becomes", Math.ceil(negativeX));
// // console.log("negativeY:", negativeY, "becomes", Math.ceil(negativeY));

// // trunc() just cuts off decimals, it doesn't round off

// // let x = 2;
// // let exp = Math.exp(x);
// // console.log("Exp:", exp);
// // let log = Math.log(exp);
// // console.log("Log:", log);

// // Dates
// // 1st Method to create a date
// let now2 = Date.now();

// // Displays milliseconds
// console.log(now2)

// // 2nd Method to create a date
// // Displays actual date
// let currentDateTeime = new Date();
// console.log(currentDateTeime);

// let specificDate = new Date(2022, 1, 10, 12, 10, 15, 100);
// console.log(specificDate);

// let d1 = Date.parse("June 5, 2021");
// console.log(d1);






















































