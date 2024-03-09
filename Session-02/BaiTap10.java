package Session_02;

import java.util.Scanner;

public class BaiTap10 {
    public static void main(String[] args) {
        // Bài 10: Viết chương trình nhập vào lương cơ bản và ngày công thực tế của nhân viên. In ra màn hình lương nhân viên biết:
        //•	Số ngày công trong tháng là 26 ngày
        //•	Lương được tính theo công thức:
        //•	lương cơ bản * (ngày công thực tế / số ngày công)
        //•	Nếu ngày công lớn hơn ngày công thực tế thì các ngày dư ra sẽ được tính 150% so với ngày công bình thường

        // nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập lương cơ bản > ");
        int basePay = Integer.parseInt(sc.nextLine());

        System.out.print("Ngày công thực tế > ");
        int workDay = Integer.parseInt(sc.nextLine());

        // tính tiền lương
        int money;
        money = basePay * ((workDay <= 26) ? workDay : 26);

        money += workDay > 26 ? (int) (((workDay - 26) * basePay) * 1.5) : 0;

        System.out.printf("Tiền lương phải cho %d ngày với mức lương cơ bản %d là: %d VND", workDay, basePay, money);
    }
}
