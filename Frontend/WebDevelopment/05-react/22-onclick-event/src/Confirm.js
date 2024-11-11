

function Confirm()
{
      const hit = () => {
       alert("Thanks for confirmation!");
      }

      return (
       <button onClick={hit}>Click here to confirm!</button>
      );
}

export default Confirm;