# Write your MySQL query statement below
select e.name , b.bonus from 
Employee as e
LEFT JOIN Bonus as b
on e.empId = b.empId
where b.bonus < 1000 or b.bonus is NULL

order by e.name asc;