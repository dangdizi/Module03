package Session_02;

import java.util.Scanner;

public class BaiTap4 {
    public static void main(String[] args) {
        // Bài 4: Nhập từ bàn phím một số nguyên, kiểm tra và in kết quả số đó có chia hết cho cả 3 và 5 không

        // nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên > ");
        int a = sc.nextInt();

        System.out.printf("Số %d là số %s cho 3 và 5", a, a % 3 == 0 && a % 5 == 0 ? "Chia hết" : "Không chia hết");
    }
}
