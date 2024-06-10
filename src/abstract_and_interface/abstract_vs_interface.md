| abstract class                                                            | interface                                                                                                            |
|---------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| Một lớp chỉ có thể extends một abstract                                   | Một lớp có thể implement nhiều interface                                                                             |
| Có thể chứa phương thức trừ tượng và phương thức cụ thể                   | chỉ có thể chứa abstract methods, với java 8 trở đi có thể chứa default methods, java 9 trở đi có thể private method |
| Chứa các biến instance với bất kì kiểu dữ liệu nào                        | chỉ có thể chứa biến static và final                                                                                 |
| Có thể có constructor, được gọi khi một thể hiện của lớp con được tạo ra  | no constructor                                                                                                       |
| các biến thực thể và các phương thức có thể có bất kì mức độ truy cập nào | only public                                                                                                          |
| A extends B ( A is B)                                                     | A implement B ( A has B )                                                                                            |

<h3>Khi nào nên dùng interface</h3>
- Đa kế thừa<br>
  + khi một lớp cần triển khai nhiều hành vi khác nhau<br>
- no extends<br>
  + khi các lớp không có mối quan hệ thừa kế trực tiếp
- Tương thích ngược và mở rộng<br>
  + default method cho phép mở rộng thêm mà không phá vỡ mã hiện có

<h3>Khi nào nên dùng abstract class</h3>
- Mã chung
  - khi các lớp con các đoạn mã chung, phương thức chung, thuộc tính chung => dễ bảo trì
- Kế thừa các đặc điểm chung
  - có thể dùng các biến thực thể, hành vi chung
- Constructor
- Các lớp con có mỗi quan hệ chặt chẽ 
