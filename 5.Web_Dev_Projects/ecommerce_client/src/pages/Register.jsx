import { useDispatch } from 'react-redux';
import { useState } from "react";
import styled from "styled-components";
import { addUser } from "../redux/apiCalls"; 

const Container = styled.div`
  width: 100vw;
  height: 100vh;
  background: linear-gradient(
      rgba(255, 255, 255, 0.5),
      rgba(255, 255, 255, 0.5)
    ),
    url("https://images.pexels.com/photos/6984661/pexels-photo-6984661.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940")
      center;
  background-size: cover;
  display: flex;
  align-items: center;
  justify-content: center;
`;

const Wrapper = styled.div`
  width: 40%;
  padding: 20px;
  background-color: white;
`;

const Title = styled.h1`
  font-size: 24px;
  font-weight: 300;
`;

const Form = styled.form`
  display: flex;
  flex-wrap: wrap;
`;

const Input = styled.input`
  flex: 1;
  min-width: 40%;
  margin: 20px 10px 0px 0px;
  padding: 10px;
`;

const Agreement = styled.span`
  font-size: 12px;
  margin: 20px 0px;
`;

const Button = styled.button`
  width: 40%;
  border: none;
  padding: 15px 20px;
  background-color: teal;
  color: white;
  cursor: pointer;
  font-size: 18px;
  font-weight: 400;
`;

const Status = styled.div`
    font-size: 24px;
    font-weight: 700;
`;

const Register = () => {
  const [inputs, setInputs] = useState({});
  const [signUpStatus, setSignUpStatus] = useState({});
  const dispatch = useDispatch();

  const handleChange = (e) => {
    setInputs(prev => {
      return { ...inputs, [e.target.name]: e.target.value }
    });
  }


  const handleClick = async (e) => {
    e.preventDefault();
    const user = { ...inputs };
    await addUser(dispatch, user);
    window.location.href = '/login';
  }

  return (
    <Container>
      <Wrapper>
        <Title>CREATE AN ACCOUNT</Title>
        <Form>
          <Input name="firstName" placeholder="First Name" onChange={handleChange} />
          <Input name="lastName" placeholder="Last Name" onChange={handleChange} />
          <Input name="username" placeholder="username" onChange={handleChange} />
          <Input name="email" placeholder="email" onChange={handleChange} />
          <Input type="password" name="password" placeholder="Password" onChange={handleChange} />
          <Input type="password" name="confirmPassword" placeholder="confirm password" onChange={handleChange} />

          <Status>
            {signUpStatus && signUpStatus}
          </Status>

          <Agreement>
            By creating an account, I consent to the processing of my personal
            data in accordance with the <b>PRIVACY POLICY</b>
          </Agreement>
          <Button onClick={handleClick}>CREATE</Button>
        </Form>
      </Wrapper>
    </Container>
  );
};

export default Register;