| Up casting                                                                                                                                                         | Down casting                                                        |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------|
| Chuyển đối tượng lớp con thành đối tượng lớp cha                                                                                                                   | Chuyển đối tượng lớp cha thành đối tượng lớp con                    |
| Áp dụng trong đa hình => nhìn nhận con như một cha                                                                                                                 | Áp dụng khi cần dùng các phương thức, thuộc tính cụ thể của lớp con |
| Sử dụng, quản lý các đối tượng khác nhau thông qua một lớp trừu tượng chung                                                                                        |                                                                     |
| An toàn khi sử dụng vì mọi đối tượng lớp con đều là một phiên bản của lớp cha                                                                                      | Khi ép kiểu đối tượng không phải cha của một con => lỗi runtime     |
| Không thể dùng phương thức, thuộc tính riêng của lớp con<br/>Tuy nhiên khi lớp con overide một phương thức của lớp cha thì sẽ sử dụng phiên bản overide của lớp con|                                                                     |
### Lưu ý
- Có up mới có down
- Sử dụng instanceOf để đảm bảo rằng đối tượng được downCasting là một instance của lớp cha
