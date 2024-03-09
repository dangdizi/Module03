package Session_02;

import java.util.Scanner;

public class BaiTap5 {
    public static void main(String[] args) {
        // Bài 5: Nhập vào 3 cạnh của tam giác, kiểm tra 3 cạnh đó có phải là tam giác không, nếu là tam giác thì là tam giác gì (thường, cân, vuông, vuông cân, đều)

        // nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào cạnh tam giác thứ nhất > ");
        int c1 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập vào cạnh tam giác thứ hai > ");
        int c2 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập vào cạnh tam giác thứ ba > ");
        int c3 = Integer.parseInt(sc.nextLine());

        // kiểm tra tam giác
        if (c1 + c2 > 3 && c2 + c3 > c1 && c3 + c1 > 2) {
            System.out.println("Đây là một tam giác");
        } else {
            System.out.println("Đây không phải là một tam giác");
            return;
        }

        // kiểm tra tam giác
        String type;
        if (c1 == c2 && c2 == c3) {
            type = "Đều";
        } else if (c1 == c2 || c2 == c3 || c3 == c1) {
            type = "Cân";
            if (c1*c1 == c2*c2 + c3*c3 || c2*c2 == c1*c1 + c3*c3 || c3*c3 == c2*c2 + c1*c1) {
                type = "Vuông cân";
            }
        } else if (c1*c1 == c2*c2 + c3*c3 || c2*c2 == c1*c1 + c3*c3 || c3*c3 == c2*c2 + c1*c1) {
            type = "Vuông";
            if (c1 == c2 || c2 == c3 || c3 == c1) {
                type = "Vuông cân";
            }
        } else {
            type = "Thường";
        }

        System.out.printf("Tam giác với 3 cạnh: %d %d %d là tam giác %s", c1, c2, c3, type);
    }
}
