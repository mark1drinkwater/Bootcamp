// // When to use local storage
// // You should only use local storage when storing insensitive information. 
// // This is because third-party individuals can easily access the information. 
// // Local storage can help in storing temporary data before it is pushed to the server. 
// // It is important to clear the local storage once this operation is completed.

// // Limitations:
// // Insecure data.
// // Synchronous operations.
// // Limited storage capacity.

// // Main methods in local storage
// // The primary methods when using local storage are key(), setItem(), removeItem(), getItem(), and clear().

// // How to get the value of the second item in localStorage.
// var answer = localStorage.key(1);

// // We must stringify objects before storing them in localStorage.
// let Car1 = {
//   brand: "Suzuki",
//   color: "white",
//   price: 10000
// }
// // window.localStorage.setItem('car', JSON.stringify(Car1));

// // How to access items in the localStorage by using their key.
// // const carStored = window.localStorage.getItem('car');
// // console.log(carStored); // "{brand:"Suzuki",color:"white",price:"10000"}"

// // You should convert it to an object using JSON.parse() to use it in your code.
// // const carObject = JSON.parse(window.localStorage.getItem('car'));

// // How to remove an item from the localStorage by passing it a key value.
// window.localStorage.removeItem('car');

// // How to clear all values stored in the localStorage
// window.localStorage.clear();

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function store() { //stores items in the localStorage
  var brand = document.getElementById('carBrand').value;
  var price = document.getElementById('carPrice').value;
  var key = document.getElementById('key').value; //gets the key from the user

  const car = {
    brand: brand,
    price: price,
  }

  window.localStorage.setItem(key, JSON.stringify(car));
  //converting object to string
}

function retrieveRecords() { //retrieves items in the localStorage
  console.log("retrieve records");
  var key = document.getElementById('retrieveKey').value;
  var records = window.localStorage.getItem(key);
  var paragraph = document.createElement("p");
  var infor = document.createTextNode(records);
  paragraph.appendChild(infor);
  var element = document.getElementById("retrieve");
  element.appendChild(paragraph);
}

function removeItem() {  //deletes item from localStorage
  var key = document.getElementById('removeKey').value;
  localStorage.removeItem(key)
  console.log("remove items");
}

function clearStorage() {
  //clears the entire localStorage
  localStorage.clear()
  console.log("clear records");
}

window.onload = function () { //ensures the page is loaded before functions are executed.
  document.getElementById("carForm").onsubmit = store
  document.getElementById("clearButton").onclick = clearStorage
  document.getElementById("removeButton").onclick = removeItem
  document.getElementById("retrieveButton").onclick = retrieveRecords
}