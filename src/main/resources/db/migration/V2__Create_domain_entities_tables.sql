DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS order_cards;
DROP TABLE IF EXISTS order_items;
DROP TABLE IF EXISTS products;

CREATE TABLE orders (
  id INT NOT NULL AUTO_INCREMENT,
  id_ordercard INT NOT NULL,
  order_date DATETIME NOT NULL,
  total DECIMAL NOT NULL,
  status INT NOT NULL,
  created_at TIMESTAMP NOT NULL,
  updated_at TIMESTAMP NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE order_cards (
  id INT NOT NULL AUTO_INCREMENT,
  barcode INT NOT NULL AUTO_INCREMENT UNIQUE,
  PRIMARY KEY (id)
);

CREATE TABLE order_items (
  id INT NOT NULL AUTO_INCREMENT,
  id_order INT NOT NULL,
  id_product INT NOT NULL,
  amount INT NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE products (
  id INT NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  description varchar(255) NOT NULL,
  price DECIMAL NOT NULL,
  created_at TIMESTAMP NOT NULL,
  updated_at TIMESTAMP NOT NULL,
  PRIMARY KEY (id)
);

ALTER TABLE orders ADD CONSTRAINT orders_fk0 FOREIGN KEY (id_ordercard) REFERENCES order_cards(id);
ALTER TABLE order_items ADD CONSTRAINT OrderItem_fk0 FOREIGN KEY (id_order) REFERENCES orders(id);
ALTER TABLE order_items ADD CONSTRAINT OrderItem_fk1 FOREIGN KEY (id_product) REFERENCES products (id);