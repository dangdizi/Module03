package baitap;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // khai báo danh sách nhân viên
       String[][] listEmployee = new String[0][7];
        // String[][] listEmployee = {
        //         {"NV001", "Nguyễn Văn A", "21/04/2003", "Hà Nam, Hà Nội", "0789424036", "7000000", "3.2"},
        //         {"NV002", "Nguyễn Văn B", "21/04/2003", "Hà Nam, Hà Nội", "0789424036", "7000000", "3.2"},
        //         {"NV003", "Nguyễn Văn C", "21/04/2003", "Hà Nam, Hà Nội", "0789424036", "7000000", "3.2"},
        //         {"NV004", "Nguyễn Văn F", "21/04/2003", "Hà Nam, Hà Nội", "0789424036", "7000000", "3.2"},
        //         {"NV005", "Nguyễn Văn D", "21/04/2003", "Hà Nam, Hà Nội", "0789424036", "7000000", "3.2"},
        //         {"NV006", "Nguyễn Văn O", "21/04/2003", "Hà Nam, Hà Nội", "0789424036", "7000000", "3.2"}
        // };
        String[] listTitle = {"Mã NV", "Tên NV", "Ngày sinh", "Địa chỉ", "SĐT", "Lương cơ bản", "HS năng suất"};
        String Id;
        Scanner sc = new Scanner(System.in);
        while (true) {
            // hiển thị menu
            System.out.println("*********************MENU********************** \n" +
                "1.\tThêm mới 1 nhân viên \n" +
                "2.\tHiển thị danh sách thông tin nhân viên \n" +
                "3.\tXem thông tin nhân viên theo mã nhân viên\n" +
                "4.\tCập nhật thông tin nhân viên\n" +
                "5.\tXóa nhân viên\n" +
                "6.\tTìm kiếm nhân viên theo tên (tương đối)\n" +
                "7.\tSắp xếp và hiển thị danh sách nhân viên theo tên từ a - z\n" +
                "8.\tThoát\n");

            System.out.print("Lựa chọn >> ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    // thêm 1 nhân viên
                    String[] employee = new String[7];
                    for (int i = 0; i < employee.length; i++) {
                        System.out.printf("Nhập \033[1;33m%s \033[0m> ", listTitle[i]);
                        employee[i] = sc.nextLine();
                    }
                    String[][] cache = Arrays.copyOf(listEmployee, listEmployee.length + 1);
                    cache[listEmployee.length] = employee;

                    // gán ngược lại cho listEmployee
                    listEmployee = cache;
                    break;

                case 2:
                    // duyệt mảng hiển thị thông tin nhân viên
                    System.out.println("                                                 DANH SÁCH NHÂN VIÊN                                        ");
                    System.out.println("-".repeat(108));
                    System.out.println("| Mã NV  | Tên NV           | Ngày sinh   | Địa chỉ         | SĐT            | Lương cơ bản | HS năng suất |");
                    System.out.println("-".repeat(108));
                    for (int i = 0; i < listEmployee.length; i++) {
                        System.out.printf("| %-5s  | %-16s | %-11s | %-15s | %-14s | %-12s | %-12s |\n",
                                listEmployee[i][0],
                                listEmployee[i][1],
                                listEmployee[i][2],
                                listEmployee[i][3],
                                listEmployee[i][4],
                                listEmployee[i][5] + " Đ",
                                listEmployee[i][6]
                        );
                        System.out.println("-".repeat(108));
                    }
                    System.out.println();
                    break;

                case 3:
                    // hiển thị nhân viên theo mã nhân viên
                    System.out.print("Nhập mã NV hiển thị > ");
                    Id = sc.nextLine();

                    for (int i = 0; i < listEmployee.length; i++) {
                        if (listEmployee[i][0].equals(Id)) {
                            System.out.println("                                               THÔNG TIN NHÂN VIÊN                                        ");
                            System.out.println("-".repeat(108));
                            System.out.printf("| %-5s  | %-16s | %-11s | %-15s | %-14s | %-12s | %-12s |\n",
                                    listEmployee[i][0],
                                    listEmployee[i][1],
                                    listEmployee[i][2],
                                    listEmployee[i][3],
                                    listEmployee[i][4],
                                    listEmployee[i][5] + " Đ",
                                    listEmployee[i][6]
                            );
                            System.out.println("-".repeat(108));
                            break;
                        }
                    }
                    break;

                case 4:
                    // Nhập nhật thông tin nhân viên
                    System.out.print("Nhập mã NV cần thay thế > ");
                    Id = sc.nextLine();
                    for (int i = 0; i < listEmployee.length; i++) {
                        if (listEmployee[i][0].equals(Id)) {
                            for (int j = 1; j < listEmployee[i].length; j++) {
                                System.out.printf("giá trị cũ: %s\n", listEmployee[i][j]);
                                System.out.printf("Nhập \033[1;33m%s \033[0m> ", listTitle[j]);
                                listEmployee[i][j] = sc.nextLine();
                            }
                            break;
                        }
                    }
                    break;
                case 5:
                    // xóa user theo Id
                    System.out.print("Nhập mã NV cần Xóa > ");
                    Id = sc.nextLine();
                    int index = 0;
                    String[][] clone = new String[listEmployee.length - 1][];
                    for (int i = 0; i < listEmployee.length; i++) {
                        if (!listEmployee[i][0].equals(Id)) {
                            clone[index] = listEmployee[i];
                            index++;
                        }
                    }
                    listEmployee = clone;
                    System.out.printf("Đã xóa user %d\n", Id);
                    break;
                case 6:
                    System.out.print("Nhập mã tên nhân viên > ");
                    String name = sc.nextLine();
                    System.out.println("                                             KẾT QUẢ TÌM KIẾM                                          ");
                    System.out.println("-".repeat(108));
                    for (int i = 0; i < listEmployee.length; i++) {
                        if (listEmployee[i][1].contains(name)) {

                            System.out.printf("| %-5s  | %-16s | %-11s | %-15s | %-14s | %-12s | %-12s |\n",
                                    listEmployee[i][0],
                                    listEmployee[i][1],
                                    listEmployee[i][2],
                                    listEmployee[i][3],
                                    listEmployee[i][4],
                                    listEmployee[i][5] + " Đ",
                                    listEmployee[i][6]
                            );
                            System.out.println("-".repeat(108));
                        }
                    }
                    break;
                case 7:
                    // sắp xếp theo tên
                    String[][] sortAZ = Arrays.copyOf(listEmployee, listEmployee.length);
                    String[] cache1 = {};
                    for (int i = 0; i < sortAZ.length; i++) {
                        String name1 = String.valueOf(sortAZ[i][1].charAt(sortAZ[i][1].lastIndexOf(" ") + 1));
                        System.out.println(name1);
                        for (int j = i + 1; j < sortAZ.length; j++) {
                            String name2 = String.valueOf(sortAZ[j][1].charAt(sortAZ[j][1].lastIndexOf(" ") + 1));
                            if (name1.compareTo(name2) > 0) {
                                cache1 = sortAZ[j];
                                sortAZ[j] = sortAZ[i];
                                sortAZ[i] = cache1;
                            }
                        }
                    }

                    for (int i = 0; i < sortAZ.length; i++) {
                        System.out.println(sortAZ[i][1]);
                    }

                    break;
                case 8:
                    System.out.println("Đã thoát chương trình");
                    return;
                default:
                    System.err.println("Lựa chọn không hợp lệ");
            }
        }
    }
}
