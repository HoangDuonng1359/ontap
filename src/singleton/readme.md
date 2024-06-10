
1. **_Phân loại_**
+ Creational Pattern
2. **_Ý nghĩa_** 
  + Đảm bảo chỉ có một thể hiện của một lớp được tạo ra
  + giới hạn số lượng thể hiện của một lớp
  + quản lý việc truy cập tốt hơn 
3. **_Ứng dụng_**
   - Quản lý cấu hình ứng dụng 
     * => một ứng dụng cần một lớp quản lý cấu hình toàn cục. Singleton đảm bảo rằng chỉ có một đối tượng được tạo ra tránh sự không đồng bộ
   - Quản lý kết nối database
     * => đảm bảo rằng chỉ có một số kết nối được tạo ra, tránh việc kết nối không cần thiết gây tốn tài nguyên