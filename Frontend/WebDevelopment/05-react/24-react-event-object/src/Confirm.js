

function Confirm()
{
      const hit = (arg1, arg2) => {
       alert(arg1 + " " +  arg2.type);
      }
      /*
       'arg2' represents the React event that triggered the function, in this case the 'click' event
      */

      return (
       <button onClick={(event) => hit("Confirmed!", event)}>Click to confirm!</button>
      );
}

export default Confirm;