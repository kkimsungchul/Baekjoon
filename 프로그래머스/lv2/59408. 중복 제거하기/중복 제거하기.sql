-- 코드를 입력하세요
SELECT count(*) FROM (
    SELECT name
    FROM ANIMAL_INS
    WHERE name IS NOT NUlL
    group by name
) as b
