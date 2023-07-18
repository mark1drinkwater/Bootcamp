import React from 'react'
import { useState } from 'react';
import { useEffect } from 'react';
import { useLocation } from 'react-router-dom/cjs/react-router-dom.min';
import { userRequest } from '../requestMethods';
import { useDispatch, useSelector } from 'react-redux';
import { clearCart } from '../redux/cartRedux';

const Success = () => {
  const location = useLocation();
  // const cart = location.state.cart;
  const currentUser = useSelector((state) => state.user.currentUser);
  const cart = useSelector((state) => state.cart);
  const [orderId, setOrderId] = useState(null);
  const dispatch = useDispatch();

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
        dispatch(clearCart());
      } catch (error) {
        console.log("Error has occured in Success page", error);
      }
    };
    cart && createOrder();
  }, [cart, currentUser]);

  // return (
  //   <div>
  //     {/* {!currentUser && <h1>You must be logged in to checkout.</h1>} */}
  //     {orderId ?
  //       (<div>
  //         <h1>Thank you for shopping! Payment was Successful.</h1>
  //         <br/>
  //         <h1>Order will be on it's way </h1>
  //         <br/>
  //         <h1>Your Order ID is: {orderId}</h1>
  //       </div>)
  //       : <h1>Payment failed.</h1>
  //     }
  //   </div>
  // )

  const handleContinueShopping = () => {
    window.location.href = '/';
  }

  return (
    <div style={styles.container}>
      <div style={styles.paymentSuccess}>
        <h1 style={styles.heading}>Payment Successful! 😃</h1>
        <p style={styles.message}>Thank you for your purchase. Your payment has been successfully processed.</p>
        <div style={styles.orderDetails}>
          <h2 style={styles.subHeading}>Order Details</h2>
          <ul style={styles.list}>
            <li>Product: Example Product</li>
            <li>Price: $99.99</li>
            <li>Order ID: 123456789</li>
            <li>Date: July 17, 2023</li>
          </ul>
        </div>
        <p style={styles.confirmationMessage}>A confirmation email has been sent to your registered email address.</p>
        <p style={styles.additionalInfo}>For any inquiries or issues, please contact our support team.</p>
        <button style={styles.button} onClick={handleContinueShopping}>Continue Shopping</button>
      </div>
    </div>
  );
}
export default Success;

const styles = {
  container: {
    display: 'flex',
    justifyContent: 'center',
    alignItems: 'center',
    height: '100vh',
  },
  paymentSuccess: {
    textAlign: 'center',
    backgroundColor: '#f1f1f1',
    padding: '30px',
    borderRadius: '10px',
    maxWidth: '600px',
    width: '90%',
  },
  heading: {
    fontSize: '36px',
    fontWeight: 'bold',
    margin: '20px 0',
  },
  message: {
    fontSize: '28px',
    margin: '30px 0',
  },
  orderDetails: {
    margin: '30px 0',
  },
  subHeading: {
    fontSize: '28px',
    fontWeight: 'bold',
    marginBottom: '20px',
  },
  list: {
    listStyle: 'none', // Removes bullet points
    padding: 0,
    margin: 0,
    fontSize: '24px'
  },
  confirmationMessage: {
    fontSize: '18px',
    fontStyle: 'italic',
    marginBottom: '20px',
  },
  additionalInfo: {
    fontSize: '18px',
    marginBottom: '30px',
  },
  button: {
    padding: '15px 30px',
    backgroundColor: '#4CAF50',
    color: 'white',
    fontSize: '20px',
    borderRadius: '5px',
    cursor: 'pointer',
    border: 'none',
  },
};