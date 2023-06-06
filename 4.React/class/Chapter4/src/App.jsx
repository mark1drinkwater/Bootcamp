import './App.css';
import React, { Component } from 'react';
import Products from './Products';

class App extends Component {
  formatName(user) {
    return user.firstName + ' ' + user.lastName;
  }

  render() {
    const user = {
      firstName: 'Mark',
      lastName: 'Drinkwater'
    }
    const isValid = true;

    return (
      <div className="App">
        <Products />
      </div>
    );
  }
}

export default App;
