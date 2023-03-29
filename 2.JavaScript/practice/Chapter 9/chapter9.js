/////////////////////////////////////////////////////////////////////////////////////////////////
// EXERCISE 9.1
// No 1 -- done
// No 2 -- done
// No 3 -- window.innerHeight --> 4312
          // window.innerWidth  --> 1086

/////////////////////////////////////////////////////////////////////////////////////////////////        
// EXERCISE 9.2
console.log("\nExercise 9.2:");
console.log(window.location.protocol);
console.log(window.location.href);

/////////////////////////////////////////////////////////////////////////////////////////////////
// EXERCISE 9.3
console.log("\nExercise 9.3");
// No 1
const page = document.querySelector('.output');
// No 2
page.textContent = "Ahoy there!";
// No 3
page.classList.add("red");
// No 4
page.id = "tester";
// No 5
page.style.backgroundColor = "red";
// No 6
const url = document.URL;
console.log(url);
page.textContent = url;

/////////////////////////////////////////////////////////////////////////////////////////////////
// Self-check quiz
// 1. Go to your favorite website and open the browser console. Type document.
// body. What do you see in the console?
//     All the elements of the website.
// 2. As we know, with objects, we can write to the property value and assign a
// new value with the assignment operator. Update the textContent property
// of the document.body object on a web page of your choosing to contain the    
// string Hello World.
//     document.body.textContent="Hello world";
// 3. Use what we learned about objects to list out BOM object properties and
// values. Try it on the document object.
    // Why does this not work????
    // for (const value of document) {
    //     console.log(`${value}`);
    // }
    // Textbook answer
    for (const property in document) {
        console.log(`${property}: ${document[property]}`);
    }
// 4. Now do the same for the window object.
    // Textbook answer
    for (const property in window) {
        console.log(`${property}: ${window[property]}`);
    }
// 5. Create an HTML file with an h1 tag. Use JavaScript and select the page
// element with the h1 tag and assign the element into a variable. Update the
// textContent property of the variable to Hello World.
const header = document.querySelector('h1');
header.textContent = "Hello World";