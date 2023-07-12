import './App.css';
import Home from './pages/Home';
import ProductList from './pages/ProductList';
import Product from './pages/Product';
import Register from './pages/Register';
import Cart from './pages/Cart';
import Pay from './pages/Pay';
import Success from './pages/Success';

import {
  BrowserRouter as Router,
  Switch,
  Route
} from "react-router-dom";

function App() {
  return (
    <Router>
      <Switch>
        <Route exact path="/">
          <Home/>
        </Route>

        <Route path="/products/:category">
          <ProductList/>
        </Route>

        <Route path="/products/:id">
          <ProductList/>
        </Route>

      </Switch>
    </Router>
  );
}

export default App;
