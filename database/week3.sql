

1. Đưa ra danh sách các nhân viên có trường reportsTo chưa xác định.

SELECT *
FROM employees
WHERE reportsTo IS NULL;



2. Đưa ra danh sách các CustomerNumber đã có thực hiện giao dịch.
SELECT DISTINCT customerNumber
FROM orders;

3. Đưa ra danh sách các đơn hàng có ngày yêu cầu vận chuyển là '18/1/2003'

SELECT *
FROM orders
WHERE shippedDate = '2003-01-18';


4. Đưa ra danh sách các đơn hàng có ngày đặt trong tháng 4 năm 2005 và có trạng thái là 'Shipped'.

SELECT *
FROM orders
WHERE orderDate BETWEEN '2005-04-01' AND '2005-04-30'
  AND shippedDate IS NOT NULL;

5. Đưa ra danh sách các sản phẩm thuộc nhóm 'Classic Cars'.
SELECT *
FROM products
INNER JOIN productlines ON products.productLine = productlines.productLine
WHERE productlines.textDescription = 'Classic Cars';
