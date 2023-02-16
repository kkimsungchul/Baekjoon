-- 코드를 입력하세요
SELECT floor(sum(daily_fee)/count(*)) FROM 
CAR_RENTAL_COMPANY_CAR 
WHERE CAR_TYPE = "SUV"