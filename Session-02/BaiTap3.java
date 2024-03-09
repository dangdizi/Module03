package Session_02;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        // Bài 3: Nhập vào 2 số nguyên và một phép tính toán học, in ra kết quả của các phép tính

        // nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên thứ nhất > ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập vào số nguyên thứ hai > ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập vào phép toán > ");
        String operator = sc.nextLine();

        // kiểm tra điều kiện
        int result;
        if (operator.equals("+")) {
            result = a + b;
        } else if (operator.equals("-")) {
            result = a - b;
        } else if (operator.equals("*")) {
            result = a * b;
        }  else if (operator.equals("/")) {
            result = a / b;
        }  else {
            result = a % b;
        }

        System.out.printf("%d %s %d = %d", a, operator, b, result);
    }
}
