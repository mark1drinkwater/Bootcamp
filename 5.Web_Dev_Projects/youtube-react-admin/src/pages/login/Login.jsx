import { useDispatch } from 'react-redux';
import React, { useState } from 'react'
import { login } from '../../redux/apiCalls';

const Login = () => {

    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const dispatch = useDispatch();

    const handleClick = (e) => {
        e.preventDefault();
        login(dispatch, {username, password});
    };

  return (
    <div style={{display: 'flex', height:"100vh", flexDirection:"column", alignItems: 'center', justifyContent: 'center'}}>
        <input style={{padding:'10px',marginBottom:'20px'}} type="text" placeholder='Enter your username' onChange={e=>setUsername(e.target.value)}/>
        <input style={{padding:'10px',marginBottom:'20px'}} type="password" placeholder='Enter your username' onChange={e=>setPassword(e.target.value)} />
        <button style={{padding:'10px',marginBottom:'20px', width:'130px'}} onClick={handleClick}>Login</button>
    </div>
  )
}

export default Login