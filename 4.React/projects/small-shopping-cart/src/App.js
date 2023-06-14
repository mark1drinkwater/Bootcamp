import Header from './components/Header';
import Main from './components/Main';
import Basket from './components/Basket';
import data from './data';
import { useState } from 'react';

function App() {
  // extract products from the data
  const { products } = data;
  const [cartItems, setCartItems] = useState([]);

  const onAdd = (product) => {
    const exist = cartItems.find(x => x.id === product.id)
    if (exist) {
      setCartItems(cartItems.map(x =>
        x.id === product.id ? { ...exist, qty: exist.qty + 1 } : x
      )
      );
    } else {
      setCartItems([...cartItems, { ...product, qty: 1 }])
    }
  };

  const onRemove = (product) => {
    const exist = cartItems.find(x => x.id === product.id)
    if (exist.qty === 1) {
      // only remove the specific product from the cart
      setCartItems(cartItems.filter((x) => x.id !== product.id))
    } else {
      setCartItems(cartItems.map(x =>
        x.id === product.id ? { ...exist, qty: exist.qty - 1 } : x
      )
      );
    }
  }

  return (
    <div className="App">
      <Header countCartItems={cartItems.length}/>
      <div className='row'>
        <Main onAdd={onAdd}  products={products} />
        <Basket onAdd={onAdd} onRemove={onRemove} cartItems={cartItems} />
      </div>
    </div>
  );
}

export default App;
