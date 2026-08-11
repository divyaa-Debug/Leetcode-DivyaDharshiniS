-- Last updated: 11/08/2026, 16:13:29
# Write your MySQL query statement below
select email as Email from person group by email having COUNT(email) >1