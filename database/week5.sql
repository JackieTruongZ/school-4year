
1. Lấy 50 ký tự đầu tiên của phần mô tả sản phẩm, đặt tên là “Title of products”
SELECT product_id, LEFT(description, 50) AS 'Title of products'
FROM products;

2. Đưa ra mô tả về các nhân viên theo định dạng 'Fullname, jobTitle.'
SELECT CONCAT(first_name, ' ', last_name) AS Fullname, job_title
FROM employees;

3. Thay thế toàn bộ tên nhóm hàng 'Cars' thành 'Automobiles'.
UPDATE categories
SET category_name = 'Automobiles'
WHERE category_name = 'Cars';

4. Tìm 5 đơn hàng được vận chuyển sớm nhất so với ngày hẹn.
SELECT *
FROM orders
ORDER BY DATEDIFF(shipped_date, order_date) ASC
LIMIT 5;

5. Đưa ra các đơn đặt hàng trong tháng 5 năm 2005 và có ngày chuyển hàng đến chưa xác định.

SELECT *
FROM orders
WHERE MONTH(order_date) = 5 AND YEAR(order_date) = 2005 AND shipped_date IS NULL;
