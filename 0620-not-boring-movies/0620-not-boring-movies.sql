# Write your MySQL query statement below
SELECT id, movie, description, rating
FROM Cinema
WHERE id & 1 = 1
  AND description not like 'boring'  
ORDER BY rating DESC;
