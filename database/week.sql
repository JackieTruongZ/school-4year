
Bài 1a: Tìm mã quốc gia

SELECT SUBSTRING(phone, 1, LOCATE('-', phone) - 1) AS country_code
FROM customers;

Bài 1b: Đếm số lượng khách hàng theo quốc gia

SELECT 
    SUBSTRING(phone, 1, LOCATE('-', phone) - 1) AS country_code,
    COUNT(*) AS number_of_customers
FROM customers
GROUP BY country_code;

Bài 2: Phân loại đơn hàng theo tổng tiền

SELECT 
    orderNumber,
    orderTotal,
    CASE 
        WHEN orderTotal > 10000 THEN 'High value'
        WHEN orderTotal BETWEEN 5000 AND 10000 THEN 'Medium value'
        ELSE 'Small value'
    END AS order_classification
FROM orders
ORDER BY orderTotal DESC
LIMIT 10;
