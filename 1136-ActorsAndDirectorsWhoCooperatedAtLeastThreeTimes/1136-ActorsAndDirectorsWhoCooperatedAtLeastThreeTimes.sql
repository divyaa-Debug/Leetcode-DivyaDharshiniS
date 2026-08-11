-- Last updated: 11/08/2026, 16:09:37
# Write your MySQL query statement below
select actor_id, director_id from actordirector  group by  actor_id, director_id having count(*)>=3