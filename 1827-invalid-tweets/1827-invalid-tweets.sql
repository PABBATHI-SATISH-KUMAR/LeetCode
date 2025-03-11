# Write your MySQL query statement below
-- select tweet_id from Tweets where length(content) > 15 order by tweet_id ASC;

SELECT tweet_id
FROM Tweets
WHERE CHAR_LENGTH(content)>15;