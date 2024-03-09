package Session_02;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        // Bài 1: Nhập vào một số nguyên từ bàn phím, kiểm tra số đó là số chẵn hay số lẻ, in kết quả ra màn hình console
        // nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên > ");
        int a = Integer.parseInt(sc.nextLine());

        System.out.printf("số nguyên %d là một số %s", a, a % 2 == 0 ? "Chẵn" : "lẽ");
    }
}
