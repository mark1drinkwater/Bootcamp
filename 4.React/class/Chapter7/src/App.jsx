import './App.css';
import React, { Component } from 'react';
import Products from './Products';
import JumboTronComponent from './JumboTronComponent';

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
        <JumboTronComponent>
          This is a long sentence, and I want to insert content into the
          jumbotron component from the outside.
        </JumboTronComponent>
        
        <Products />
      </div>
    );
  }
}

export default App;
