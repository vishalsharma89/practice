# Write your MySQL query statement below
SELECT name AS Customers FROM Customers
WHERE id not in (SELECT customerid from orders);