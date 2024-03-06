import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        //Bài 3: Nhập từ bàn phím bán kính hình tròn (r).
        // Tính chu vi và diện tích hình tròn và in kết quả gồm 2 số thập phân (VD: 567.34)

        // nhập dữ liêu
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào bán kính hình tròn > ");
        int R = sc.nextInt();

        // tính toán
        float S = (float)(R * R * 3.14); // diện tích
        float C = (float) (2 * R * 3.14); // chu vi

        // hiển thị ra màn hình
        System.out.printf("Chu vi hình tròn là %.2f , diện tích là %.2f", C, S);
    }
}
