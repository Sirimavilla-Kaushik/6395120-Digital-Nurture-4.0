import React from 'react';
import './index.css';
import officeImage from './office.jpg'; 

function App() {
  const heading = "Office Space";
  const office = { Name: "DBS", Rent: 50000, Address: "Chennai" };
  const rentClass = office.Rent <= 60000 ? "textRed" : "textGreen";

  return (
    <div className="App">
      <h1>{heading}, at Affordable Range</h1>
      <img src={officeImage} width="25%" height="25%" alt="Office Space" />

      <h2>Name: {office.Name}</h2>
      <h3 className={rentClass}>Rent: Rs. {office.Rent}</h3>
      <h3>Address: {office.Address}</h3>
    </div>
  );
}

export default App;
