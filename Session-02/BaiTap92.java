package Session_02;

import java.util.Scanner;

public class BaiTap92 {
    public static void main(String[] args) {
        // Phát triển bài toán: Nhập vào 4 số từ bàn phím, in ra dãy số giảm dần

        // nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên thứ nhất > ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số nguyên thứ hai > ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số nguyên thứ ba > ");
        int num3 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số nguyên thứ ba > ");
        int num4 = Integer.parseInt(sc.nextLine());

        int cache;

        if (num1 < num2) {
            cache = num2;
            num2 = num1;
            num1 = cache;
        }

        if (num1 < num3) {
            cache = num3;
            num3 = num1;
            num1 = cache;
        }

        if (num1 < num4) {
            cache = num4;
            num4 = num1;
            num1 = cache;
        }

        if (num2 < num3) {
            cache = num3;
            num3 = num2;
            num2 = cache;
        }

        if (num2 < num4) {
            cache = num4;
            num4 = num2;
            num2 = cache;
        }

        if (num3 < num4) {
            cache = num4;
            num4 = num3;
            num3 = cache;
        }

        System.out.printf("theo thứ tự giảm dần là: %d %d %d %d", num1, num2, num3, num4);
    }
}
