import { useState } from 'react';
import React from 'react';
import ReactDOM from 'react-dom/client';
//import './index.css';
import './App.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

const Header = () => {
  return (
    <>
      <h1 style={{color: "red"}}>Hello Style!</h1>
      <p>Add a little style!!</p>
    </>
  );
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<Header/>);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

/*
Styling React 
-------------


*/
