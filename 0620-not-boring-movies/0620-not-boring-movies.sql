# Write your MySQL query statement below
SELECT id, movie, description, rating
FROM Cinema
WHERE id % 2 = 1
  AND description not like 'boring'  
ORDER BY rating DESC;
