# Write your MySQL query statement below
# Write your MySQL query statement below
-- with cte as(
--     select customer_id, count(distinct product_key) as cnt
--     from Customer
--     group by customer_id
-- )
-- select cte.customer_id as customer_id
-- from cte 
-- where cte.cnt= (select count(*) from Product);

select customer_id from customer c
right join Product p 
on c.product_key=p.product_key
group by customer_id
having count(distinct c.product_key)=(
    select count(*) from Product
);