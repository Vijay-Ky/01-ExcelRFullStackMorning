/*
Destructing
- we may have an array or object that we are working with, but we only need some of the items contained in these
- destructing makes it easy to extract only what is needed.
*/

//old way of assigning array items to a variable
const vehicles = ['mustang', 'f-150', 'expedition'];

//old way

//const car = vehicles[0];
//const truck = vehicles[1];
//const suv = vehicles[2];

//document.write(car + " " + truck + " " + suv);

//new way
const [car, , suv] = vehicles;

document.write(car + " " + suv);