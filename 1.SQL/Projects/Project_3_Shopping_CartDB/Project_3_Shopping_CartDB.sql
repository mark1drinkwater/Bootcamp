DROP TABLE IF EXISTS cart;
DROP TABLE IF EXISTS order_details;
DROP TABLE IF EXISTS order_header;
DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS users;

----------------- Create & Insert tables -------------------
CREATE TABLE products (
	id bigserial PRIMARY KEY,
	name varchar(50) NOT NULL,
	price money NOT NULL
);

INSERT INTO products (name, price)
VALUES
('Coke', 10),
('Chips', 5);

CREATE TABLE users (
	id bigserial PRIMARY KEY,
	name varchar(30) NOT NULL
);

INSERT INTO users (name)
VALUES
('Arnold'),
('Sheryl');

CREATE TABLE cart (
	product_id bigint PRIMARY KEY,
	qty bigint
);

CREATE TABLE order_header (
	order_id bigserial PRIMARY KEY,
	user_id bigint REFERENCES users(id) ON DELETE CASCADE,
	order_date timestamp NOT NULL
);

CREATE TABLE order_details (
	order_header bigint REFERENCES order_header(order_id) ON DELETE CASCADE,
	prod_id bigint REFERENCES products(id),
	qty bigint
);

-------------- Add to cart function ----------------
CREATE OR REPLACE FUNCTION addProductToCart(prod_id bigint)
RETURNS void AS $$
BEGIN
	IF EXISTS (SELECT * FROM cart  WHERE product_id = prod_id)
		THEN
			UPDATE cart SET qty = qty + 1  WHERE product_id = prod_id;
		ELSE
			INSERT INTO cart (product_id,qty) VALUES (prod_id,1);
		END IF;
END;
$$ LANGUAGE plpgsql;

-- Add coke to the cart
SELECT addProductToCart(1);
-- Add coke to the cart
SELECT addProductToCart(1);
-- Add chips to the cart
SELECT addProductToCart(2);

SELECT * FROM cart;

-------------------- Checkout -----------------------
INSERT INTO order_header (user_id, order_date)
VALUES
(2, '2023-04-15 15:30:00');

INSERT INTO order_details (order_header, prod_id, qty)
VALUES
(1, 1, 2),
(1, 2, 1);

SELECT * FROM order_details;

---------------- Add multiple products to the products table ------------------
INSERT INTO products (name, price)
VALUES
('flour', 43.99),
('jellytots', 19.99),
('oreo', 16.99),
('milk', 31.99);

---------------- Add multiple products to the cart ---------------------------
SELECT * FROM cart;
SELECT addProductToCart(4);
SELECT * FROM cart;
SELECT addProductToCart(3);
SELECT * FROM cart;
SELECT addProductToCart(5);
SELECT * FROM cart;
SELECT addProductToCart(5);
SELECT * FROM cart;
SELECT addProductToCart(3);
SELECT * FROM cart;
SELECT addProductToCart(5);
SELECT * FROM cart;

---------------------- Deleting products from the cart -----------------------
SELECT * FROM cart;
DELETE FROM cart WHERE product_id = 1;
SELECT * FROM cart;
DELETE FROM cart WHERE product_id = 3;
SELECT * FROM cart;

-------------------------- Customer #1 Checkout -------------------------------
INSERT INTO order_header (user_id, order_date)
VALUES
(1, '2023-04-15 15:30:00');

INSERT INTO order_details (order_header, prod_id, qty)
VALUES
(2, 2, 1),
(2, 4, 5),
(2, 4, 3);

--- Done shoppping, so delete from cart ---
DELETE FROM cart;

------------------------ Customer #2 Add to cart -----------------------------
SELECT addProductToCart(1);
SELECT addProductToCart(2);
SELECT addProductToCart(3);
SELECT addProductToCart(5);

-- TODO:
-- SELECT createOrder();
-- Takes all the orders for the cart adds to the order details
-- Clears cart

INSERT INTO order_header (user_id, order_date)
VALUES
(2, '2023-04-23 09:45:50');

INSERT INTO order_details (order_header, prod_id, qty)
VALUES
(3, 1, 1),
(3, 2, 3),
(3, 3, 2),
(3, 5, 6);

DELETE FROM cart;

----------- Print the orders with select statements with inner joins --------
----------- Print a single order --------------------------------------------
-- Show the user, and their order names, price, sum of all orders
SELECT * 
FROM order_header
INNER JOIN order_details
ON order_header.order_id = order_details.order_header
WHERE order_id = 3;

---------- Printing all orders for a days shopping -------------------------
SELECT *
FROM order_header
INNER JOIN order_details
ON order_header.order_id = order_details.order_header
WHERE date_part('day', order_date) = '15';
