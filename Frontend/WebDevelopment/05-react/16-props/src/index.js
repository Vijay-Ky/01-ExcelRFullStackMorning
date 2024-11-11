import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import reportWebVitals from './reportWebVitals';

function Car(props)
{
       return <h2> Hello, I am a {props.color} and {props.model} model Car!</h2>
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<Car color="blue" model="2023"/>);



// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

/*
Props
------------
- components can be passed as props which stands for properties.
- props are like function arguments, and we can send them into the component as attributes.

*/
