select visited_on, amount,average_amount from
(
    select visited_on,sum(sum(amount)) over w as amount ,
    round (sum(sum(amount)) over w/7,2) as  average_amount,
    dense_rank() over(order by visited_on) as day_num
    from customer group by visited_on window w as 
    (order by visited_on range between interval 6 day preceding and current row)

)t 
where day_num>=7;

