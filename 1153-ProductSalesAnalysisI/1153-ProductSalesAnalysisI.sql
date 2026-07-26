-- Last updated: 7/26/2026, 10:54:08 PM
# Write your MySQL query statement below
select product.product_name as product_name , sales.year as year, sales.price as price from sales left join product on product.product_id=sales.product_id;