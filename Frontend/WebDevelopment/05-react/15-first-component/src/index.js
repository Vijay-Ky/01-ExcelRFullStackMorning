import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

function Car()
{
       return <h2> Hello, I am a Car!</h2>
}


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<Car />);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

/*
React Components
-------------------
- Components are independent and reusable bits of code. they serve the same purpose as javascript functions, but work in isolation and retruns HTML

- 1. class components 2. function components

- Component name must start with a capital letter

*/
