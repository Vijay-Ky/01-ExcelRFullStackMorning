import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

const x = 5;

const myElement = (
       <h1>{(x) < 10 ? "Hello": "Goodbye"}</h1>
);

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(myElement);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

/*
- in order to embed a javascript expression inside JSX the Javascript must be wrapped with curly braces, {}
*/
