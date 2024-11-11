import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div className="App">
      <h2>Hello World!</h2>
    </div>
  );
}

export default App;

/*
- React's goal is in many ways to render HTML in a web page
- React renders HTML to the web page by using a function called 
createRoot() and its method render()
- createRoot() function takes one argument, an HTML element
- The purpose of the function is to define the HTML element where a React component should be displayed
- The render() method is then called to define the React component that should be rendered.

where to render?

- There is a folder in the root directory of our react project, named "public". in this folder there is an index.html file.
- we have a single <div> in the body of this file. this is where our react application will be rendered.

- div id can be anything it need not necesserily root

JSX(Javascript XML)
-----
- JSX allows to write HTML tags inside the Javascript code
*/
