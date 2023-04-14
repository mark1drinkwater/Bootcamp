/////////////////////////////////////////////////////////////////////////////////////////////////
// PROJECTS
// Create a recursive function
console.log("Project: Recursive function");
function countTillTen(counter) {
    console.log(counter);
    if (counter > 9) {
        return counter;
    } else {
        return countTillTen(counter + 1);
    }
}
countTillTen(3);

/////////////////////////////////////////////////////////////////////////////////////////////////
// PROJECTS
// Project: Set timeout order
console.log("\nProject: Set timeout order");
const one = () => console.log("one");
const two = () => console.log("two");
const three = () => {
    console.log("three")
    one();
    two();
};
const four = () => {
    console.log("four");
    setTimeout(one, 0);
    three();
}
four();