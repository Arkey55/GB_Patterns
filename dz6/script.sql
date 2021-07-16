create table products
(
    id         bigserial primary key,
    title      varchar(255),
    price      numeric(10, 2)

);

insert into products (title, price)
values
('Banana', 50),
('Bread', 40),
('Meat', 500);
