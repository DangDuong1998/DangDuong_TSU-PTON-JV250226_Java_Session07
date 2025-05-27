package bt05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] productList = new Product[100];
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Menu:");
            System.out.println("1: Thêm mới sản phẩm");
            System.out.println("2: Hiển thị danh sách sản phẩm");
            System.out.println("3: Cập nhật danh sách sản phẩm");
            System.out.println("4: Xóa sản phẩm");
            System.out.println("5: Thoát");

            System.out.print("Nhập lựa chọn của bạn:");
            byte opt = scanner.nextByte();
            scanner.nextLine();
            switch (opt){
                case 1:
                    System.out.print("Nhập ID sản phẩm: ");
                    String inputId = scanner.nextLine();
                    System.out.print("Nhập tên sản phẩm: ");
                    String inputName = scanner.nextLine();
                    System.out.print("Nhập giá sản phẩm: ");
                    double inputPrice = scanner.nextDouble();
                    scanner.nextLine();

                    Product product = new Product(inputId,inputName,inputPrice);
                    for(int i = 0; i < productList.length;i++){
                        if (productList[i] == null){
                            productList[i] = product;
                            count++;
                            break;
                        }
                    }
                    System.out.println("Sản phẩm đã được thêm.");
                    System.out.println("");
                    break;

                case 2:
                    if(count == 0){
                        System.out.println("Dữ liệu trống!");
                    }
                    else{
                        for(int i = 0; i < count;i++){
                            productList[i].display();
                        }
                    }

                    System.out.println("");
                    break;

                case 3:
                    System.out.print("Nhập ID sản phẩm cần cập nhật: ");
                    String checkID = scanner.nextLine();
                    int j = -1;
                    for(int i = 0; i < count; i++){
                        if(productList[i].getId().equals(checkID)){
                            j = i;
                            break;
                        }
                    }
                    if(j != -1){
                        System.out.print("Nhập tên mới: ");
                        String newInputName = scanner.nextLine();
                        productList[j].setName(newInputName);
                        System.out.print("Nhập giá mới: ");
                        double newInputPrice = scanner.nextDouble();
                        productList[j].setPrice(newInputPrice);
                        System.out.println("Sản phẩm đã được thêm.");

                    }
                    else{
                        System.out.println("Dữ liệu trống!");
                    }
                    System.out.println("");
                    break;

                case 4:
                    System.out.print("Nhập ID sản phẩm cần xóa: ");
                    String deleteId = scanner.nextLine();
                    int g = -1;
                    for(int i = 0; i < count ; i++){
                        if(productList[i].getId().equals(deleteId)){
                            g = i;
                            break;
                        }
                    }
                    if(g != -1){
                        for(int i = g; i< count-1;i++){
                            productList[i] = productList[++i];
                        }
                        count --;
                    }
                    else{
                        System.out.println("Dữ liệu trống!");
                    }
                    System.out.println("");
                    break;

                case 5:
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Phải chọn từ 1 đến 5!!!");
                    break;
            }


        }
    }
}
