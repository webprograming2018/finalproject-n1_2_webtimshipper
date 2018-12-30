1. Phân công công việc nhóm : 
    Nguyễn Đức Thuận : Triết xuất ra Excel, PDF, Chức năng nhận đơn hàng phía shipper.
    Nguyễn Trí Hoàng : Hiển thị danh sách các đơn hàng gần vị trí của shipper, sửa danh sách đơn hàng của shop. 
    Nguyễn Bá Trung :   Đăng ký, đăng nhập, vẽ map.
2. Quá trình thực hiện : 

*) Yêu Cầu :
  - Yêu cầu 1 : Hoàn thiện chức năng cho phép người dùng theo dõi đơn hàng kèm vị trí.
  - Yêu cầu 2 : Chỉ hiện thị đơn hàng với những shipper đăng nhập và ở gần vị trí đơn hàng.
  - Yêu cầu 3 : Triết xuất ra Excel và PDF.
*) Thực Hiện : 
  - Yêu cầu 1 : Shop nhập mã đơn hàng, hệ thống lấy đơn hàng từ cơ sở dữ liệu theo mã đơn hàng, hệ thống vẽ google map theo vị trí của đơn hàng sử dụng google api
  - Yêu cầu 2 : Hệ thống lấy vị trí shipper đăng ký khi tạo tài khoản, hệ thống tính toán và hiện danh sách đơn hàng ở gần vị trí của shipper.
  - Yêu cầu 3 : Hệ thống cho phép shop triết xuất thông tin đơn hàng ra file PDF, Excel.
  
3. Mô tả các chức năng chính : 
  - Đăng ký và đăng nhập theo role shop và shipper;
  - Cho phép Shop đăng đơn hàng,sửa đơn hàng;
  - Cho phép Shop theo dõi vị trí đơn hàng trong quá trình di chuyển;
  - Cho phép Shop xuất danh sách đơn ra PDF và Excel;
  - Cho shipper xem danh sách đơn hàng ở gần vị trí cửa mình và nhận đơn hàng;
 4. Kỹ thuật sử dụng : 
 
  - Jsp/Servlet,Filter/Session;
  - HTML/CSS/Javascript/JQuery/Bootstrap;
  - Google Map API;
  - CSDL : MySQL
  - Mô hình MVC, maven
  - Thư viện sử dụng : jstl, mysql-connector-java, poi, lowagie, gson.
