-- Last updated: 11/08/2026, 16:09:35
# Write your MySQL query statement below
select p.product_name,s.year, s.price from product p join sales s on p.product_id=s.product_id