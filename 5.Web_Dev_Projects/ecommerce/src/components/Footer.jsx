import { Facebook, Instagram, MailOutline, Phone, Pinterest, Room, Twitter } from '@material-ui/icons';
import React from 'react'
import styled from 'styled-components'
import { mobile } from "../responsive"
import { Link as RouterLink } from 'react-router-dom';
import { Link as MaterialLink } from "@material-ui/core"

const Container = styled.div`
    display: flex;
    ${mobile({ flexDirection: "column" })};
`;

const Left = styled.div`
    flex: 1;
    display: flex;
    flex-direction: column;
    padding: 20px;
`;

const Logo = styled.h1`

`;

const Desc = styled.p`
  margin: 20px 0px;
`;

const SocialContainer = styled.div`
  display: flex;
`;

const SocialIcon = styled.div`
  width: 40px;
  height: 40px;
  border-radius: 50%;
  color: white;
  background-color: #${props => props.bg};
  display: flex;
  align-items: center;
  justify-content: center;
  margin-right: 20px;
`;

const Center = styled.div`
    flex: 1; 
    padding: 20px;
    ${mobile({ display: "none" })};
`;

const Right = styled.div`
    flex: 1;  
    flex: 1; 
    padding: 20px;  
    ${mobile({ backgroundColor: "#fff8f8" })};
`;

const Title = styled.h3`
  margin-bottom: 30px;
`;

const List = styled.ul`
  margin: 0;
  padding: 0;
  list-style: none;
  display: flex;
  flex-wrap: wrap;
`;

const ListItem = styled.li`
  width: 50%;
  margin-bottom: 10px;
`;

const ContactItem = styled.div`
  margin-bottom: 20px;
  display: flex;
  align-items: center;
`;

const Payment = styled.img`
  width: 60%;
`;

const Footer = () => {
  return (
    <Container>
      <Left>
        <Logo>MARK.</Logo>
        <Desc>
          Discover a world of convenience and quality at your fingertips, with our wide range of products and reliable customer support.
        </Desc>
        <SocialContainer>
          <SocialIcon bg="3B5999">
            <Facebook />
          </SocialIcon>
          <SocialIcon bg="E4405F">
            <Twitter />
          </SocialIcon>
          <SocialIcon bg="55ACEE">
            <Instagram />
          </SocialIcon>
          <SocialIcon bg="E60023">
            <Pinterest />
          </SocialIcon>
        </SocialContainer>
      </Left>
      <Center>
        <Title>Useful Links</Title>
        <List>
          <ListItem>Home</ListItem>
          <ListItem>Cart</ListItem>
          <ListItem>Men Fashion</ListItem>
          <ListItem>Women Fashion</ListItem>
          <ListItem>Accessories</ListItem>
          <ListItem>My Account</ListItem>
          <ListItem>Order Tracking</ListItem>
          <ListItem>Wishlist</ListItem>
          <ListItem>Wishlist</ListItem>
          <ListItem>Terms</ListItem>
        </List>
      </Center>
      <Right>
        <Title>Contact</Title>
        <ContactItem>
          <Room style={{ marginRight: "10px" }} /> 11 Karoo Drive, Eastern Cape
        </ContactItem>
        <ContactItem>
          <Phone style={{ marginRight: "10px" }} /> +1 234 56 78
        </ContactItem>
        <ContactItem>
          <MailOutline style={{ marginRight: "10px"}} /> mark1drinkwater@gmail.com
        </ContactItem>
        <Payment src="https://i.ibb.co/Qfvn4z6/payment.png" />
      </Right>
    </Container>
  )
}

export default Footer