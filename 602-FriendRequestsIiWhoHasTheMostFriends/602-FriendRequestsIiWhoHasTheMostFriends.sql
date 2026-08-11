-- Last updated: 11/08/2026, 16:10:58
# Write your MySQL query statement below
WITH AllFriends AS (
     SELECT requester_id AS id 
    FROM RequestAccepted
    
    UNION ALL
    
     SELECT accepter_id AS id 
    FROM RequestAccepted
)
SELECT 
    id, 
    COUNT(*) AS num
FROM AllFriends
GROUP BY id
ORDER BY num DESC
LIMIT 1;