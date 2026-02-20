# TÀI LIỆU THIẾT KẾ REST API - ỨNG DỤNG QUẢN LÝ NHÂN SỰ

------------------------------------------------------------------------

## PHẦN 1: LÝ THUYẾT

Tôi lựa chọn kiến trúc REST thay vì SOAP cho ứng dụng Quản lý nhân sự vì
REST có tính linh hoạt cao, dễ triển khai và phù hợp với các ứng dụng
Web hiện đại.

Thứ nhất, REST sử dụng định dạng JSON để truyền dữ liệu, giúp dữ liệu
nhẹ hơn và dễ đọc hơn so với XML của SOAP. JSON cũng được hỗ trợ tốt bởi
Frontend (React, Angular, Vue) và Mobile App, giúp tích hợp nhanh chóng.

Thứ hai, REST hoạt động dựa trên HTTP protocol tiêu chuẩn và tận dụng
các HTTP Method như GET, POST, PUT, DELETE. Điều này giúp API rõ ràng,
dễ hiểu và tuân thủ nguyên tắc thiết kế tài nguyên.

Thứ ba, về hiệu năng, REST thường nhanh hơn SOAP vì không cần cấu trúc
XML phức tạp và không có envelope nặng như SOAP. Điều này đặc biệt quan
trọng với hệ thống quản lý nhân sự có nhiều request đồng thời.

Cuối cùng, REST dễ mở rộng, dễ bảo trì và phù hợp với kiến trúc
Microservices hiện đại.

------------------------------------------------------------------------

## PHẦN 2: THIẾT KẾ REST API (RESOURCE: EMPLOYEE)

Base URL: /api/employees

### 1. Lấy danh sách tất cả nhân viên

-   Method: GET
-   URL: /api/employees

### 2. Lấy thông tin một nhân viên theo ID

-   Method: GET
-   URL: /api/employees/{id}

### 3. Tạo mới một nhân viên

-   Method: POST
-   URL: /api/employees

### 4. Cập nhật thông tin nhân viên

-   Method: PUT
-   URL: /api/employees/{id}

### 5. Xóa một nhân viên

-   Method: DELETE
-   URL: /api/employees/{id}

------------------------------------------------------------------------

Nguyên tắc thiết kế được áp dụng: - Sử dụng danh từ (employees) thay vì
động từ. - Sử dụng số nhiều cho resource. - Không đặt hành động trong
URL. - Sử dụng đúng HTTP Method để thể hiện hành vi.
