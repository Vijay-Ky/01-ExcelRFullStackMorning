//In regular functions the this keyword represent the object that called the function, which could be the window, the document, a button.
//with arrow functions this keyword always represents the object that defined the arrow function.

class Header
{
    constructor()
    {
        this.color = "red";
    }
    
    //regular function
    /*changeColor = function()
    {
        document.getElementById("demo").innerHTML += this;
    }*/

    //arrow function
    //in case of arrow function, this represents the Header object no matter who called the function.
    changeColor = () => 
    {
         document.getElementById("demo").style.color += this.color;
        //document.getElementById("demo").style.backgroundColor = this.color;
    }
}
const myheader = new Header();

//The window object calls the function:
window.addEventListener("load", myheader.changeColor);

//A button object calls the function
document.getElementById("btn").addEventListener("click", myheader.changeColor);