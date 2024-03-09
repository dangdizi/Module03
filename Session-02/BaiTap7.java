package Session_02;

import java.util.Scanner;

public class BaiTap7 {
    public static void main(String[] args) {
        // Bài 7: Nhập vào năm và tháng, in ra màn hình số ngày trong tháng đó

        // nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập năm > ");
        int year = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tháng > ");
        int mo = Integer.parseInt(sc.nextLine());


        // tính năm nhuận
        int leap = (year / 10 % 10 * 10 + year % 10) % 4;

        switch (mo) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
                System.out.printf("Tháng %d năm %d có 30 ngày", mo, year);
                break;
            case 2:
                System.out.printf("Tháng 2 năm %d có %d ngày", year, leap == 0 ? 29 : 28);
                break;
            default:
                System.out.printf("tháng %d năm %d có 31 ngày", mo, year);
        }
    }
}
