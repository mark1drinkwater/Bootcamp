import { Redirect } from 'react-router-dom';
import './App.css';
import Home from './pages/Home';
import ProductList from './pages/ProductList';
import Product from './pages/Product';
import Register from './pages/Register';
import Cart from './pages/Cart';
import Pay from './pages/Pay';
import Success from './pages/Success';
import Login from './pages/Login';

import {
  BrowserRouter as Router,
  Switch,
  Route
} from "react-router-dom";

function App() {

  const user = true;

  return (
    <Router>
      <Switch>
        <Route exact path="/">
          <Home/>
        </Route>

        <Route path="/products/:category">
          <ProductList/>
        </Route>

        <Route path="/product/:id">
          <Product />
        </Route>

        <Route path="/cart">
          <Cart />
        </Route>

        <Route path="/login">
          {user ? <Redirect to="/" /> : <Login />}
          <Login />
        </Route>

        <Route path="/register">
          {user ? <Redirect to="/" /> : <Register />}
        </Route>

      </Switch>
    </Router>
  );
}

export default App;
