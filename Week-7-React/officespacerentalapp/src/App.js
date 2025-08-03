import React from 'react';
import './App.css';

function App() {
  const officeList = [
    { Name: "DBS", Rent: 50000, Address: "Chennai", Image: "officeImage-2.png" },
    { Name: "Cognizant", Rent: 70000, Address: "Bangalore", Image: "officeImage-1.png" },
    { Name: "Innov8", Rent: 45000, Address: "Delhi", Image: "officeImage-3.png" }
  ];

  const heading = "Office Space";

  return (
    <div className="App">
      <h1>{heading}, at Affordable Range</h1>
      {officeList.map((ItemName, index) => {
        const rentClass = ItemName.Rent <= 60000 ? "textRed" : "textGreen";
        const imagePath = process.env.PUBLIC_URL + '/' + ItemName.Image;

        return (
          <div key={index} style={{ marginBottom: '30px' }}>
            <img src={imagePath} width="25%" height="25%" alt="Office Space" />
            <h1>Name: {ItemName.Name}</h1>
            <h3 className={rentClass}>Rent: Rs. {ItemName.Rent}</h3>
            <h3>Address: {ItemName.Address}</h3>
          </div>
        );
      })}
    </div>
  );
}

export default App;
