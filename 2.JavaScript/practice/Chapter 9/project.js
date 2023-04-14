// Chapter 9 Project
const output = document.querySelector('.output');
const mainList = document.querySelector("ul");
mainList.id = "mainList";

const divTags = document.querySelectorAll("div");
console.log(divTags);

for (let i = 0; i < divTags.length; i++) {
    console.log(divTags[i].tagName);
    divTags[i].id = "id" + (i+1);
    if (i % 2) {
        divTags[i].style.color = "red";
    } else {
        divTags[i].style.color = "blue";
    }
}