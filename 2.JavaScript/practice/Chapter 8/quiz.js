// Self - check quiz
// 1. Which method will decode the following ?
// A

var c = "http://www.google.com?id=1000&n=500";
var e = encodeURIComponent(c);
A.  decodeURIComponent(e)
B.  e.decodeUriComponent()
C.  decoderURIComponent(c)
D.  decoderURIComponent(e)

// 2. What will be output into the console from the following syntax ?
// 4
const arr = ["hi", "world", "hello", "hii", "hi", "hi World", "Hi"];
console.log(arr.lastIndexOf("hi"));

// 3. What is the result of the below code in the console ?
// ["Hii", "hi", "hello", "Hii", "hi", "hi World", "Hi"]
const arr = ["Hi", "world", "hello", "Hii", "hi", "hi World", "Hi"];
arr.copyWithin(0, 3, 5);
console.log(arr);

// 4. What is the result of the below code in the console ?
// ["hi", "hi World"]
const arr = ["Hi", "world", "hello", "Hii", "hi", "hi World", "Hi"];
const arr2 = arr.filter((element, index) => {
    const ele2 = element.substring(0, 2);
    return (ele2 == "hi");
});
console.log(arr2);