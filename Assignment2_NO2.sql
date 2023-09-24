--mengambil semua film beserta bahasa---

SELECT
	f.title as film_title,
	
    l.name as language
	
FROM
    film as f
	
INNER JOIN

    language as l on f.language_id = l.language_id;
	
---mengambil banyak film untuk sebuah category---

SELECT 
	c.name AS category, 
	
COUNT(film_id) AS film_count

FROM category c

LEFT JOIN film_category fc ON c.category_id = fc.category_id

GROUP BY c.name

ORDER BY film_count DESC;

--mengambil aktor dari film tertentu--

SELECT a.actor_id,

       a.first_name,
	   
	   a.last_name
	   
FROM actor a

JOIN film_actor fa ON a.actor_id = fa.actor_id

JOIN film f ON fa.film_id = f.film_id

WHERE fa.film_id=35;

