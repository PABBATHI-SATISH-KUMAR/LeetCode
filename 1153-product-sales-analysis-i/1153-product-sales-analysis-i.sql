# Write your MySQL query statement below
select  Product.product_name , Sales.year , Sales.price 
From Product 
RIGHT JOIN Sales
On Sales.product_id = Product.product_id;
