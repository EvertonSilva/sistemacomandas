CREATE TABLE orders (
  id BIGINT NOT NULL AUTO_INCREMENT,
  total DOUBLE,
  dateOrdered DATETIME,
  createdAt DATETIME,
  updatedAt DATETIME,
  PRIMARY KEY (id)
);