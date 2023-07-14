import React from 'react'
import { useLocation } from 'react-router-dom/cjs/react-router-dom.min';

const Success = () => {
  const location = useLocation();
  console.log(location);

  return (
    <div>
      <h1>Thank you for shopping! Payment was Successful. 😃</h1>
    </div>
  )
}

export default Success;