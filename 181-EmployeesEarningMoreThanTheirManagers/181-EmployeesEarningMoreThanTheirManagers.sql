-- Last updated: 11/08/2026, 16:13:33
# Write your MySQL query statement below
SELECT e.name AS Employee
FROM Employee e inner join Employee m
WHERE e.managerId = m.id AND e.salary > m.salary;