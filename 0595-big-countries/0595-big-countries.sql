# Write your MySQL query statement below
SELECT name ,population,area
From
World
WHERE (area >= 3000000 or population>= 25000000)


/*select area,population,name
from world
where area>=3000000
union
select area,population,name
from world
where population>=25000000
*/