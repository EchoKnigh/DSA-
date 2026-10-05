# Write your MySQL query statement below
select r.contest_id ,ROUND(COUNT(r.user_id)*100.0/(SELECT COUNT(*) FROM Users), 2)
as  percentage from  register r 
group by r.contest_id 
order by percentage DESC, r.contest_id ASC ;