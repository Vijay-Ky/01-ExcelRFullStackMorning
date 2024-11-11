import { useState } from 'react';
import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

function MyForm()
{
  const [name, setName] = useState("");

  return (
    <form>
      <label>Enter your name:
        <input type="text" value={name} 
        onChange={(e) => setName(e.target.value)}/>     
      </label>
    </form>
  )
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<MyForm/>);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

/*
React Forms
------------
- In HTML form data is usually handled by the DOM
- In React, form data is usually handled by the components.
- When the data is handled by the components, all the data is stored in the component state.
- we can control changes by adding event handlers in the onChange attribute
- we can use useState Hook to keep track of each inputs value and provide a "single source of truth"for the entire application.

*/
