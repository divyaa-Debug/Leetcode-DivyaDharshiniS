-- Last updated: 11/08/2026, 16:09:12
# Write your MySQL query statement below
SELECT 
    ROUND(AVG(order_date = customer_pref_delivery_date) * 100, 2) As immediate_percentage
FROM Delivery
WHERE (customer_id, order_date) IN (SELECT customer_id, MIN(order_date) FROM Delivery GROUP BY customer_id)