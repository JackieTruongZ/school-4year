1. Dùng toán tử IN để đưa ra thông tin của các khách hàng sống tại các thành phố Nantes và Lyon. Viết cách khác sử dụng toán tử OR

-- Sử dụng toán tử "IN"
SELECT *
FROM customers
WHERE city IN ('Nantes', 'Lyon');

-- Sử dụng toán tử "OR"
SELECT *
FROM customers
WHERE city = 'Nantes' OR city = 'Lyon';

2. Sử dụng BETWEEN để tìm các đơn hàng đã được chuyển trong khoảng thời gian từ '10/1/2003' đến '10/3/2003'. Viết cách khác sử dụng toán tử AND

-- Sử dụng BETWEEN
SELECT *
FROM orders
WHERE shipped_date BETWEEN '2003-10-01' AND '2003-10-03';

-- Sử dụng AND
SELECT *
FROM orders
WHERE shipped_date >= '2003-10-01' AND shipped_date <= '2003-10-03';

3. Sử dụng LIKE để đưa ra thông tin về các nhóm hàng hóa có chứa từ "CARS"
SELECT *
FROM products
INNER JOIN categories ON products.category_id = categories.category_id
WHERE categories.category_name LIKE '%CARS%';


4. Truy vấn 10 sản phẩm có số lượng trong kho là lớn nhất.
SELECT p.*, i.quantity
FROM products p
INNER JOIN inventory i ON p.product_id = i.product_id
ORDER BY i.quantity DESC
LIMIT 10;

5. Đưa ra danh sách các sản phẩm và thêm thuộc tính là tiền hàng tồn của sản phẩm.

SELECT p.*, i.quantity * p.price AS total_value
FROM products p
INNER JOIN inventory i ON p.product_id = i.product_id;
