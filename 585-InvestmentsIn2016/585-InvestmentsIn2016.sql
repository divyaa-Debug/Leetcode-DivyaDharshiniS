-- Last updated: 11/08/2026, 16:11:11
# Write your MySQL query statement below
SELECT 
    ROUND(SUM(i.tiv_2016), 2) AS tiv_2016
FROM Insurance i
JOIN (
    SELECT tiv_2015
    FROM Insurance
    GROUP BY tiv_2015
    HAVING COUNT(*) > 1
) same_tiv ON i.tiv_2015 = same_tiv.tiv_2015
JOIN (
    SELECT lat, lon
    FROM Insurance
    GROUP BY lat, lon
    HAVING COUNT(*) = 1
) unique_loc ON i.lat = unique_loc.lat AND i.lon = unique_loc.lon;