import { useState } from 'react';
import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

function MyForm()
{
  const [name, setName] = useState("");

  const handleSubmit = (event) => {
    event.preventDefault();
    alert(`The name yo entered was: ${name}`)
  }

  return (
    <form onSubmit={handleSubmit}>
      <label>Enter your name:
        <input type="text" value={name} 
        onChange={(e) => setName(e.target.value)}/>     
      </label>
      <input type="submit"></input>
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
React Router
-------------
create React App doesnt include page routing
React Router is the most popular solution

In order to add react router in our application, we must run this command from the root directory of the application

npm i -D react-router-dom

*/
