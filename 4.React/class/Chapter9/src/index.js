import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';

import firebase from 'firebase/compat/app';
import 'firebase/compat/auth';
import 'firebase/compat/firestore';


// Your web app's Firebase configuration

const firebaseConfig = {
  apiKey: "AIzaSyAl3ViCCSime2BGiyDLFrb0NIPgpn5W16c",
  authDomain: "crudproject-49082.firebaseapp.com",
  databaseURL: "https://crudproject-49082-default-rtdb.firebaseio.com",
  projectId: "crudproject-49082",
  storageBucket: "crudproject-49082.appspot.com",
  messagingSenderId: "928599977094",
  appId: "1:928599977094:web:623d8c0cfcb15612e07507"
};

// Initialize Firebase
firebase.initializeApp(firebaseConfig);

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
// reportWebVitals();
