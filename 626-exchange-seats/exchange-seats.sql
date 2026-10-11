# Write your MySQL query statement below
select id,
case 
    when id%2=0 then lag(student,1) over(order by id) 
    when id%2=1 then ifnull(lead(student,1) over (order by id),student)
end as student from seat;