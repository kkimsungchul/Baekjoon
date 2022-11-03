-- 코드를 입력하세요
SELECT a.ANIMAL_ID , a.NAME as tempname 
from ANIMAL_OUTS a 
left join ANIMAL_INS b ON a.ANIMAL_ID = b.ANIMAL_ID 
where b.name is null and a.name is not null