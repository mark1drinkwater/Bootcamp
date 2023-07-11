import { Route, Routes } from 'react-router-dom';
import { Router } from 'react-router-dom';
import './App.css';
import Home from './pages/Home';
import ProductList from './pages/ProductList';
import Product from './pages/Product';
import Register from './pages/Register';
import Cart from './pages/Cart';
import Pay from './pages/Pay';
import Success from './pages/Success';
import {Switch}  from 'react-router-dom';

function App() {
  return (
    // <Router>
    //   <Switch>
    //     <Route path="/pay">
    //       <Pay />
    //     </Route>
    //     <Route path="/success">
    //       <Success />
    //     </Route>
    //   </Switch>
    // </Router>
    <Pay/>
  );
}

export default App;
