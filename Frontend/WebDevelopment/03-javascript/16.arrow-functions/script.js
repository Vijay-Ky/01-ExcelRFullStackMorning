/*
hello = 
function()
{
     return "hello world!"; 
}
document.getElementById("demo").innerHTML = hello();
*/
/*
hello = () =>
{
    return "hello world! from Arrow function"; 
} 
document.getElementById("demo").innerHTML = hello();*/

//if the function has only one statement, we can remove the curly brackets and the return statement.

//shorter sysntax
/*
hello = () => "hello world! from shorter syntax";
document.getElementById("demo").innerHTML = hello();*/

//if we have the parameter
/*
hello = (val) => "hello " + val;
document.getElementById("demo").innerHTML = hello('welcome');*/

//if we have only one parameter, we can skip the parenthese as well
hello = val => "hello " + val;
document.getElementById("demo").innerHTML = hello('welcome');
