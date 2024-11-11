import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

const myElement = (
       <h1 className = "myclass">Hello World!!</h1>
);

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(myElement);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

/*
Attribute class = className

There is a attribute called class in the HTML, but since JSX is rendered as Javascript, and the class keyword is a reserved word in javascript, we are  not allowed to use it in JSX

- use attribute className instead

- JSX  translates className attributes into class attributes.
*/
