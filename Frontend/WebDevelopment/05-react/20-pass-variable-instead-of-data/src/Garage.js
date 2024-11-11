import Car from './Car';

function Garage()
{
    const carName = "Ford";
       return(
              <>
              <h1>Who lives in my Garage</h1>
              <Car brand={ carName }/>
              </>
       );
}

export default Garage;