import React, { Component } from 'react';
import './App.css';

class CurrencyConverter extends Component {
  constructor(props) {
    super(props);
    this.state = {
      amount: '',
      currency: '',
    };
  }

  handleAmountChange = (e) => {
    this.setState({ amount: e.target.value });
  };

  handleCurrencyChange = (e) => {
    this.setState({ currency: e.target.value });
  };

  handleSubmit = (e) => {
    e.preventDefault();
    const { amount, currency } = this.state;
    const conversionRate = 80; // 1 Euro = 80 INR
    const convertedAmount = amount * conversionRate;
    alert(`Converting to ${currency} Amount is ${convertedAmount}`);
  };

  render() {
    return (
      <div>
        <h1 style={{ color: "green" }}>Currency Convertor!!!</h1>
        <form onSubmit={this.handleSubmit}>
          <label>
            Amount:
            <input type="text" value={this.state.amount} onChange={this.handleAmountChange} />
          </label>
          <br /><br />
          <label>
            Currency:
            <textarea value={this.state.currency} onChange={this.handleCurrencyChange} />
          </label>
          <br /><br />
          <button type="submit">Submit</button>
        </form>
      </div>
    );
  }
}

class App extends Component {
  constructor() {
    super();
    this.state = {
      count: 5,
    };
  }

  increment = () => {
    this.setState({ count: this.state.count + 1 });
    this.sayHello();
  };

  sayHello = () => {
    alert("Hello! Member1");
  };

  decrement = () => {
    this.setState({ count: this.state.count - 1 });
        this.sayHello();
  };

  sayWelcome = (message) => {
    alert(message);
  };

  handleClick = (event) => {
    alert("I was clicked");
  };

  render() {
    return (
      <div className="App">
        <p>{this.state.count}</p>
        <button onClick={this.increment}>Increment</button>
        <br />
        <button onClick={this.decrement}>Decrement</button>
        <br />
        <button onClick={() => this.sayWelcome("welcome")}>Say welcome</button>
        <br />
        <button onClick={this.handleClick}>Click on me</button>

        <br /><br />
        <CurrencyConverter />
      </div>
    );
  }
}

export default App;
