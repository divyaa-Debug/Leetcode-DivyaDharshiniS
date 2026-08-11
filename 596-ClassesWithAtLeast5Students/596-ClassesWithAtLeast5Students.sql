-- Last updated: 11/08/2026, 16:11:04
# Write your MySQL query statement below
select class from courses group by class having count(student)>=5