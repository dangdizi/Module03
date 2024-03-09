package Session_02;

import java.util.Scanner;

public class BaiTap8 {
    public static void main(String[] args) {
        // Bài 8: Nhập vào ngày, tháng, năm. Kiểm tra ngày tháng năm vừa nhập có hợp lệ không
        // nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày > ");
        int day = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tháng > ");
        int mo = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập năm > ");
        int year = Integer.parseInt(sc.nextLine());

        boolean err = false;

        //kiểm tra ngày tháng
        switch (mo) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
                if (day < 1 || day > 30) {
                    System.out.println("Ngày trong tháng không hợp lệ");
                } else {
                    System.out.println("Ngày trong tháng hợp lệ");
                }
                System.out.println("Tháng trong năm hợp lệ");
                break;
            case 2:
                int leap = (year / 10 % 10 * 10 + year % 10) % 4;
                if (leap != 0 && day > 28) {
                    System.out.println("Ngày trong tháng không hợp lệ");
                } else {
                    System.out.println("Ngày trong tháng hợp lệ");
                }
                System.out.println("Tháng trong năm hợp lệ");
                break;
            case 1:
            case 3:
            case 5:
            case 8:
            case 10:
            case 12:
                if (day < 1 || day > 31) {
                    System.out.println("Ngày trong tháng không hợp lệ");
                } else {
                    System.out.println("Ngày trong tháng hợp lệ");
                }
                System.out.println("Tháng trong năm hợp lệ");
                break;
            default:
                System.out.println("Tháng trong năm không hợp lệ");
        }

        // kiểm tra năm
        if (year <= 0) {
            System.out.println("Năm không hợp lệ");
        } else {
            System.out.println("năm hợp lệ");
        }
    }
}
