-- Last updated: 11/08/2026, 16:13:50
# Write your MySQL query statement below
select max(salary) as secondhighestsalary from employee where salary <(select max(salary) from employee) 