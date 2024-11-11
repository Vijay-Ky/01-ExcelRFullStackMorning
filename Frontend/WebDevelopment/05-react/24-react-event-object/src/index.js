import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import Confirm from './Confirm';
import reportWebVitals from './reportWebVitals';


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<Confirm />);



// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

/*
React Event Object
------------------------
Event handlers have access to the react event that triggered the function.

in our example event is the "click" event

*/
