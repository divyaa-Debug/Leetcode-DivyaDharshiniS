-- Last updated: 11/08/2026, 16:11:19
# Write your MySQL query statement below
select e.name,b.bonus from employee e left join bonus b on e.empid=b.empid where b.bonus <1000 or b.bonus is null; 