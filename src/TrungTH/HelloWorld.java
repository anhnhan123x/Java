package TrungTH;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.print("hello World with Trung"); // print thông thường không có dòng
		System.out.println("hello World with Trung"); // print line
		System.out.printf("hello World with Trung"); // print với format
		System.out.printf("số nguyên: %d", 50000); // %d + thêm biến double bên cạnh
		System.out.printf("số thực: %f", 50000.000); // %f + thêm biến float bên cạnh
		System.out.printf("số thực: %.1f", 50000.000); // %.xf + x là số lượng số 0 muốn lấy ( đổi x thành 0 để làm tròn
														// lên)
		System.out.printf("Chuỗi: %s"); // Chịu, Google đi
	}
}
