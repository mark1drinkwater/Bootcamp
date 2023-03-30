// Chapter 9 Project
// No 1
const output = document.querySelector('.output');
// No 2
const mainList = document.querySelector("ul");
mainList.id = "mainList";
// No 3
const divTags = document.querySelectorAll("div");
console.log(divTags);
// No 4
for (let i = 0; i < divTags.length; i++) {
    divTags[i].id = "id" + (i+1);
    if (i % 2) {
        divTags[i].style.color = "red";
    } else {
        divTags[i].style.color = "blue";
    }
}