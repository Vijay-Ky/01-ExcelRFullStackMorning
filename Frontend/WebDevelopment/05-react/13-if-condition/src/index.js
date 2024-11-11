import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

const x = 5;
let text = "Goodbye";
if( x < 6)
{
    text = "Hello";
}

const myElement = (
       <h1>{text}</h1>
);

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(myElement);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

/*
Conditions - if statments

React supports if statements, but not inside JSX

To be able to use conditional statments in JSX, we should put the if statements outside of the JSX
*/
