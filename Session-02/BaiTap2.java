package Session_02;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        // Bài 2: Nhập vào 3 điểm html, css, javascript của sinh viên, tính điểm trung bình và in ra xếp loại của sinh viên:
        //Điểm trung bình	Xếp loại
        //0 <= avgMark < 5	Yếu
        //5 <= avgMark < 7	Trung bình
        //7 <= avgMark < 8	Khá
        //8 <= avgMark < 9	Giỏi
        //9 <= avgMark < 10	Xuất sắc

        // nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào điểm css > ");
        int css = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập vào điểm html > ");
        int html = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập vào điểm javascript > ");
        int javascript = Integer.parseInt(sc.nextLine());

        // tính điểm trung bình
        float trungbinh;
        trungbinh = (css + html + javascript) / 3;

        // kiểm tra xếp loại
        if (trungbinh >= 0 && trungbinh < 5) {
            System.out.printf("điểm trung bình là %.1f, Xếp loại yếu", trungbinh);
        } else if (trungbinh < 7) {
            System.out.printf("điểm trung bình là %.1f, Xếp loại trung bình", trungbinh);
        } else if (trungbinh < 8) {
            System.out.printf("điểm trung bình là %.1f, Xếp loại khá", trungbinh);
        } else if (trungbinh < 9) {
            System.out.printf("điểm trung bình là %.1f, Xếp loại tốt", trungbinh);
        } else {
            System.out.printf("điểm trung bình là %.1f, Xếp loại giỏi", trungbinh);
        }
    }
}
