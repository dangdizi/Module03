import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        // Bài 2: Nhập chiều dài và chiều rộng của hình chữ nhật từ bàn phím.
        // tính chu vi, diện tích hình chữ nhật và in kết quả ra màn hình console

        // nhập dữ liệu
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều dài hình chữ nhật > ");
        int chieuDai = sc.nextInt();

        System.out.print("Nhập chiều rộng hình chữ nhật > ");
        int chieuRong = sc.nextInt();

        // tính toán
        int V = (chieuDai + chieuRong) * 2;
        int S = chieuDai * chieuRong;

        // in ra màn hình
        System.out.printf("Chu vi hình chữ nhật là %d và diện tích là %d", V, S);
    }
}
