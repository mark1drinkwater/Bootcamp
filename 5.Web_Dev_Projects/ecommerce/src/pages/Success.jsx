import React from 'react'
import { useState } from 'react';
import { useEffect } from 'react';
import { useLocation } from 'react-router-dom/cjs/react-router-dom.min';
import { userRequest } from '../requestMethods';
import { useSelector } from 'react-redux';

const Success = () => {
  const location = useLocation();
  //in Cart.jsx I sent data and cart. Please check that page for the changes.(in video it's only data)
  // const data = location.state.stripeData;
  const cart = location.state.cart;
  const currentUser = useSelector((state) => state.user.currentUser);
  const [orderId, setOrderId] = useState(null);

  useEffect(() => {
    const createOrder = async () => {
      try {

        const res = await userRequest.post("/orders", {
          userId: currentUser.others._id,
          products: cart.products.map((item) => ({
            productId: item._id,
            quantity: item._quantity,
          })),
          amount: cart.total,
          address: "123 Sesame Street"
        });
        setOrderId(res.data._id);

      } catch (error) {
        console.log("Error has occured in Success page", error);
      }
    };
    cart && createOrder();
  }, [cart, /*data,*/ currentUser]);

  return (
    <div>
      {!currentUser && <h1>You must be logged in to checkout.</h1>}
      {orderId ?
        (<div>
          <h1>Thank you for shopping! Payment was Successful.</h1>
          <br/>
          <h1>Order will be on it's way 😃</h1>
          <br/>
          <h1>Your Order ID is: {orderId}</h1>
        </div>)
        : <h1>Payment failed.</h1>
      }
    </div>
  )
}

export default Success;