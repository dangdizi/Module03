import java.util.Scanner;

public class BaiTap7 {
    public static void main(String[] args) {

        // nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên có 4 chữ số > ");
        int num = sc.nextInt(); // nhập vào là số nguyên

        String numStr = String.format("%d", num);

        // ở đây không dùng vòng lặp - logic là phân tích ra thành các ký 1234tự
        int num1 = Integer.parseInt(String.valueOf(numStr.charAt(0)));
        int num2 = Integer.parseInt(String.valueOf(numStr.charAt(1)));
        int num3 = Integer.parseInt(String.valueOf(numStr.charAt(2)));
        int num4 = Integer.parseInt(String.valueOf(numStr.charAt(3)));

        // tổng
        int tong = num1 + num2 + num3 + num4;

        // in ra màn hình
        System.out.printf("Tổng của số nguyên %d là %d\n", num, tong);
        System.out.printf("số nghịch đảo của số nguyên %d là %s%s%s%s\n", num, num4, num3, num2, num1);
    }
}
