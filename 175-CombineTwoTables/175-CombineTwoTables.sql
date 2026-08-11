-- Last updated: 11/08/2026, 16:13:54
# Write your MySQL query statement below
select p.firstName, p.lastName, a.city, a.state from person p left outer join address a on p.personid=a.personid;