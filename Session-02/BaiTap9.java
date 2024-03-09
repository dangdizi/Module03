package Session_02;

import java.util.Scanner;

public class BaiTap9 {
    public static void main(String[] args) {
        // Bài 9: Nhập vào 3 số từ bàn phím, In ra 3 số theo thứ tự có giá trị giảm dần.

        // nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên thứ nhất > ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số nguyên thứ hai > ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số nguyên thứ ba > ");
        int num3 = Integer.parseInt(sc.nextLine());

        int cache;

        // sắp xếp
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

        if (num2 < num3) {
            cache = num3;
            num3 = num2;
            num2 = cache;
        }

        System.out.printf("Số lớn thứ nhất là: %d\n", num1);
        System.out.printf("Số lớn thứ hai là: %d\n", num2);
        System.out.printf("Số lớn thứ ba là: %d\n", num3);
    }
}
