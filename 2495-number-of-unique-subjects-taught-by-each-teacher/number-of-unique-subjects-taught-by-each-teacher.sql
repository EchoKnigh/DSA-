# Write your MySQL query statement below
select count(distinct subject_id ) as cnt ,teacher_id from teacher group by teacher_id;