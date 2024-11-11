import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

function Garage(props)
{
  const cars = props.cars;
  return (
    <>
      <h1>Garage</h1>
      {cars.length > 0 && 
      <h2>You have {cars.length} cars in your garage</h2>
      }
    </>
  );
}

const cars = ['Ford', 'BMW', 'Audi'];

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<Garage cars = {cars} />);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

/*
Logical && operator
--------------------

*/
