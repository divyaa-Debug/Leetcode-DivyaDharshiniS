-- Last updated: 11/08/2026, 16:11:22
# Write your MySQL query statement below
 SELECT name 
FROM Employee 
WHERE id IN (
    SELECT managerId 
    FROM Employee 
    GROUP BY managerId 
    HAVING COUNT(*) >= 5
);