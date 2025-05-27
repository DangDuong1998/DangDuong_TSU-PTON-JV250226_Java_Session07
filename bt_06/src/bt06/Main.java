package bt06;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Category[] categories = new Category[100];
        int count = 0;
        while (true){
            System.out.println("Menu:");
            System.out.println("1: Thêm mới sản phẩm");
            System.out.println("2: Hiển thị danh sách sản phẩm");
            System.out.println("3: Cập nhật danh sách sản phẩm");
            System.out.println("4: Xóa sản phẩm");
            System.out.println("5: Tìm kiếm danh mục theo tên");
            System.out.println("6: Thoát");

            System.out.print("Nhập lựa chọn của bạn:");
            byte opt = scanner.nextByte();
            scanner.nextLine();

            switch (opt){
                case 1:

                    System.out.print("Nhập ID danh mục: ");
                    String inputId = scanner.nextLine();
                    System.out.print("Nhập tên danh mục: ");
                    String inputName = scanner.nextLine();
                    System.out.print("Nhập mô tả danh mục: ");
                    String inputDescription = scanner.nextLine();
                    Category category = new Category(inputId,inputName,inputDescription);
                    for(int i = 0; i < categories.length;i++){
                        if(categories[i] == null){
                            categories[i] = category;
                            count++;
                            break;
                        }
                    }

                    System.out.print("Danh mục đã được thêm.");
                    System.out.println("");
                    break;

                case 2:
                    for(int i = 0; i < count;i++){
                        categories[i].display();
                    }
                    System.out.println("");
                    break;

                case 3:
                    System.out.print("Nhập ID danh mục cần cập nhật: ");
                    String findId = scanner.nextLine();
                    int tempCase03=-1;
                    for(int i = 0; i < count; i++){
                        if(categories[i].getId().equals(findId)){
                            tempCase03 = i;
                            break;
                        }
                    }
                    if(tempCase03 != -1){
                        System.out.print("Nhập tên mới: ");
                        categories[tempCase03].setName(scanner.nextLine()) ;
                        System.out.print("Nhập mô tả mới: ");
                        categories[tempCase03].setDescription(scanner.nextLine());
                        System.out.print("Danh mục đã được thêm.");
                    }
                    else{
                        System.out.println("Dữ liệu trống!");
                    }
                    System.out.println("");
                    break;

                case 4:
                    System.out.print("Nhập ID danh mục cần xóa: ");
                    String deleteId = scanner.nextLine();
                    int tempCase04 = -1;
                    for(int i = 0; i < count; i++){
                        if(categories[i].getId().equals(deleteId)){
                            tempCase04 = i;
                            break;
                        }

                    }
                    if(tempCase04 != -1){
                        for(int i = tempCase04; i < count-1; i++){
                            categories[i] = categories[i+1];
                        }
                        categories[count - 1] = null;
                        count--;
                        System.out.print("Danh mục đã được xóa.");
                    }
                    else{
                        System.out.println("Dữ liệu trống!");
                    }
                    System.out.println("");
                    break;

                case 5:

                    System.out.print("Nhập tên danh mục cần tìm");
                    String searchCatagories = scanner.nextLine();
                    boolean isFound = false;
                    for(int i = 0; i < count; i++){
                        if(categories[i].getName().equals(searchCatagories)){
                            categories[i].display();

                            isFound = true;
                        }
                    }
                    if(isFound == false){
                        System.out.println("Dữ liệu trống!");
                    }
                    System.out.println("");
                    break;

                case 6:
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Phải chọn từ 1 đến 5!!!");
                    break;
            }
        }
    }
}
