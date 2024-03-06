import java.util.Scanner;

public class BaiTap8 {
    public static void main(String[] args) {
        // Bài 8: Nhập vào năm sinh sinh của bạn
        // tính tuổi và kiểm tra tuổi là chẵn hay lẻ. In kết quả ra màn hình console

        // nhập tuổi
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập năm sinh của bạn > ");
        int year = sc.nextInt();

        // tính tuổi
        int old = 2024 - year;
        System.out.printf("Tuổi của bạn là: %d\n", old);

        // kiểm tra chẵn lẽ
        if (old % 2 == 0) {
            System.out.println("Tuổi của bạn là số chẵn");
        } else {
            System.out.println("Tuổi của bạn là số lẽ");
        }
    }
}
