import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

const myElement = (
    <div>
        <p> I am a paragraph one</p>
        <p> I am a paragraph two</p>
    </div>
);

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(myElement);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

/*
One top level element

The HTML code must be wrapped in ONE top level element

if we want to write two paragraphs, we must put them inside a parent element, like div



*/
