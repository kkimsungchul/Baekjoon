-- 코드를 입력하세요
SELECT a.name , a.DATETIME from ANIMAL_INS a left join ANIMAL_OUTS b on a.ANIMAL_ID = b.ANIMAL_ID
where b.ANIMAL_ID is null
order by a.DATETIME
limit 3