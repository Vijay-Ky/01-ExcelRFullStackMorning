/*
spread operator allows us to quickly copy all or part of an existing array or object into another array or object
*/

const abc = [1, 2, 3];
const xyz = [4, 5, 6];

const final = [...abc, ...xyz];

document.write(final);