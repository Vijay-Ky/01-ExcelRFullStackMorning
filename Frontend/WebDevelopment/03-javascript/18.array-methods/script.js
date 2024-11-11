/*
- There are many javascript array methods
- one of the most useful in react is .map() array method
- the .map() method allows to run a function on each item in the array, returning a new array as the result
- in React, map() can be used to generate lists.
*/

// const myArray = ['apple', 'banana', 'orange'];

// const myList = myArray.map((item) => <p>{item}</p>)

// document.getElementById('demo').innerHTML = myArray;


// Define the arrays
const myArray = ['apple', 'banana', 'orange'];
const myList = myArray.map((item) => <p>${item}</p>);

// Display myArray
const arrayListElement = document.getElementById('arrayList');
myArray.forEach((item) => 
{
    const listItem = document.createElement('li');
    listItem.textContent = item;
    arrayListElement.appendChild(listItem);
});

// Display myList
const listContainerElement = document.getElementById('listContainer');
listContainerElement.innerHTML = myList.join('');

