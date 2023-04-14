/////////////////////////////////////////////////////////////////////////////////////////////////
// PROJECTS
// Math multiplication table
console.log("\nMath multiplication table")
const multiplicationTable = [];
const value = 12;

for (let i = 0; i < value+1; i++) {
    let tempArr = [];
    for (let j = 0; j < value+1; j++) {
        tempArr.push(i*j);
    }
    multiplicationTable.push(tempArr);
}
console.table(multiplicationTable);