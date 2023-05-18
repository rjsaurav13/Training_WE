use wileyclassic;

SELECT AVG(buyPrice) AS average_buy_price
FROM products;


SELECT productLine, AVG(buyPrice) AS average_buy_price
FROM products
GROUP BY productLine;


SELECT COUNT(*) AS total
FROM products;


SELECT productLine, COUNT(*) AS product_count
FROM products
GROUP BY productLine
ORDER BY productLine;

SELECT productCode, SUM(priceEach * QuantityOrdered) AS total
FROM orderDetails
GROUP BY productCode
ORDER BY total DESC;


SELECT MAX(buyPrice) AS highest_price
FROM products;


SELECT productLine, MAX(buyPrice) AS BuyPrice
FROM products
GROUP BY productLine;
select * from products;


SELECT MIN(buyPrice) AS lowest_price
FROM products;


SELECT productLine, MIN(buyPrice) AS BuyPrice
FROM products
GROUP BY productLine;
select * from products;

select firstName, lastName , group_concat(distinct customerName order by customerName) customers from employees inner join customers on customers
.salesRepEmployeeNumber = employeeNumber group by employeeNumber order by firstName , lastName;


select avg(pl_avg) 'Average Product '
from(
	select 
    avg(buyPrice) pl_avg
    from products group by productLine
    ) avgs;