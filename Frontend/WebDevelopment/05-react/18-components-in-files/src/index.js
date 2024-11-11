import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import Garage from './Garage';
import reportWebVitals from './reportWebVitals';


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<Garage />);



// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

/*
Components in Files
------------------
React is all about re-using code, and it is recommedded to split our components into seperate files
- to do that, create a new file with a .js extension and put the code inside it.
- the file name must start with an uppercase character.



*/
