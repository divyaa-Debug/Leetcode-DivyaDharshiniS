-- Last updated: 11/08/2026, 16:10:47
# Write your MySQL query statement below
UPDATE Salary 
SET sex = IF(sex = 'm', 'f', 'm');