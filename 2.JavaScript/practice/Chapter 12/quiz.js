// Self-check quiz
// 1. What will the following regex expression return from the following words?
enjoy avaScript
//Expression / ([a-e])\w+/g
"Hope you enjoy JavaScript"

//2. Are cookies part of the document object?
// Yes

//3. What will the following code do to a JavaScript cookie?
// It will set the expiration date of the cookie to the current time minus 1 millisecond.
// Effectively meaning the cookie has already expired.
// Therefore, the cookie will be deleted from the user's browser.

const mydate = new Date();
mydate.setTime(mydate.getTime() - 1);
document.cookie = "username=; expires=" + mydate.toGMTString();

//4. What is the output in the console from the following code?
// hello world
const a = "hello world";
(function () {
    const a = "JavaScript";
})();
console.log(a);

//5. What is the output in the console from the following code?
// error. a is not defined
<script>
    "use strict";
    myFun();
    console.log(a);
    function myFun() {
        a = "Hello World";
    }
</script>

// 6. What is the output of the following code?
// a then c then b
console.log("a");
setTimeout(() => {
console.log("b");
}, 0);
console.log("c")