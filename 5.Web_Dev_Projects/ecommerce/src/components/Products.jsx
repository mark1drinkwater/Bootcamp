import React, { useEffect, useState } from 'react'
import { popularProducts } from '../data';
import styled from 'styled-components';
import Product from './Product';
import axios from 'axios';

const Container = styled.div`
    padding: 20px;
    display: flex;
    flex-wrap: wrap;
`;

const Products = ({cat,filters,sort}) => {
  const [products, setProducts] = useState([]);
  const [filteredProducts, setFilteredProducts] = useState([]);

  useEffect(() => {
    const getProducts = async () => {
      try {
        const res = await axios.get(cat ? 
          `http://localhost:3000/api/v1/products?category=${cat}`
          : "http://localhost:3000/api/v1/products"
        );
        setProducts(res.data)
      } catch (err) {
        
      }
    };
    getProducts();
  }, [cat,filters,sort]);

  useEffect(() => {
    
  }, [sort])

  useEffect(() => {
    cat && setFilteredProducts(
      products.filter((item) => Object.entries(filters).every(([key,value]) => {
        const filterKey = key.toLowerCase();
        const filterValue = value.toLowerCase();
        const product = item[filterKey];

        console.log("Key & Value", filterKey, filterValue);
        return product.includes(filterValue)
      }
      ))
    );
  }
  , [products,cat,filters])

  useEffect(() => {
    if (sort === "new") {
      setFilteredProducts(prev => {
        // sort from newest to oldest
        return [...prev].sort((a,b) => a.createdAt - b.createdAt)
      })
    } else if (sort === "asc") {
      setFilteredProducts(prev => {
        // sort from lowest to highest
        return [...prev].sort((a,b) => a.price - b.price)
      })  
    } else {
      setFilteredProducts(prev => {
        // sort from highest to lowest
        return [...prev].sort((a,b) => b.price - a.price)
      }) 
    }
  })

  return (
    <Container>
        {cat 
          ? filteredProducts.map((item) => <Product item={item} key={item.id} />)
          : products.slice(0,8).map((item) => <Product item={item} key={item.id} />
        )}       
    </Container>
  )
}

export default Products