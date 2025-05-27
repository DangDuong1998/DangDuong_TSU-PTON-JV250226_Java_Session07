package bt04;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student student01 = new Student("An", 21, "A1", 4.5);
        Student student02 = new Student("Bình", 22, "A1", 7.0);
        Student student03 = new Student("Chi", 20, "A1", 4.6);
        Student student04 = new Student("Dũng", 19, "A1", 7.1);
        Student student05 = new Student("Em", 21, "A1", 5.9);
        Student student06 = new Student("Phúc", 20, "A1", 9.0);
        Student student07 = new Student("Giao", 22, "A1", 6.8);
        Student student08 = new Student("Hiền", 21, "A1", 4.8);
        Student student09 = new Student("Khánh", 20, "A1", 7.5);
        Student student10 = new Student("Linh", 19, "A1", 8.0);

        Student[] studentList = new Student[10];
        studentList[0] = student01;
        studentList[1] = student02;
        studentList[2] = student03;
        studentList[3] = student04;
        studentList[4] = student05;
        studentList[5] = student06;
        studentList[6] = student07;
        studentList[7] = student08;
        studentList[8] = student09;
        studentList[9] = student10;
        System.out.print("Nhập điểm min: ");
        Scanner scanner = new Scanner(System.in);
        double min = scanner.nextDouble();
        System.out.print("Nhập điểm max: ");
        double max = scanner.nextDouble();
        Student[] studentFilter = new Student[10];
        int j =0;
        int count = 0;
        for(int i = 0; i < studentFilter.length; i++){

            for(int g = j; g<studentList.length;g++){
                if(studentList[g].getAvgScore() >= min && studentList[g].getAvgScore() <= max) {
                    studentFilter[i] = studentList[g];
                    j=g+1;
                    count++;
                    break;
                }
            }

        }
        boolean isChange = true;
        while(isChange){
            isChange = false;
            for(int i = 0; i<count-1;i++){
                    if(studentFilter[i].getAvgScore() > studentFilter[i+1].getAvgScore()){
                        Student temp= studentFilter[i];
                        studentFilter[i] = studentFilter[i+1];
                        studentFilter[i+1]=temp;
                        isChange = true;
                    }

            }
        }
        for(Student student : studentFilter){
            if(student != null){
                student.display();
            }

        }
    }
}
