package bt03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person01 = new Person();
        System.out.print("Nhập tên người thứ nhất: ");
        Scanner scanner = new Scanner(System.in);
        String inputName01 = scanner.nextLine();
        System.out.print("Nhập tuổi người thứ nhất: ");
        int inputAge01 = scanner.nextInt();
        scanner.nextLine();
        person01.setName(inputName01);
        person01.setAge(inputAge01);

        Person person02 = new Person();
        System.out.print("Nhập tên người thứ hai: ");
        String inputName02 = scanner.nextLine();
        System.out.print("Nhập tuổi người thứ hai: ");
        int inputAge02 = scanner.nextInt();
        scanner.nextLine();
        person02.setName(inputName02);
        person02.setAge(inputAge02);

        if(person01.getAge() > person02.getAge()){
            System.out.print(person01.getName() + " lớn tuổi hơn " + person02.getName());
        }
        else if(person02.getAge() > person01.getAge()){
            System.out.print(person02.getName() + " lớn tuổi hơn " + person01.getName());
        }
        else{
            System.out.print(person01 + "bằng tuổi" + person02);
        }
        scanner.close();
    }
}
