# Write your MySQL query statement belo
select  round (sum(tiv_2016),2)as tiv_2016
from (
    select tiv_2016,count(*) over(partition by tiv_2015)as tiv_count,
    count(*) over(partition by lat,lon)as location_count
    from Insurance 
)t
where tiv_count>1 and location_count=1;