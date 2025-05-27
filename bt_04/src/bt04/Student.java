package bt04;

public class Student {
    private String sName;
    private int sAge;
    private String sClass;
    private double avgScore;
    public Student(String sName,int sAge,String sClass,double avgScore){
        this.sName = sName;
        this.sAge = sAge;
        this.sClass = sClass;
        this.avgScore = avgScore;
    }
    public void setsName(String sName){
        this.sName = sName;
    }
    public String getsName(){
        return sName;
    }

    public void setsAge(int sAge){
        this.sAge = sAge;
    }
    public int getsAge(){
        return sAge;
    }

    public void setsClass(String sClass){
        this.sClass=sClass;
    }
    public String getsClass(){
        return sClass;
    }

    public void setAvgScore(double avgScore){
        this.avgScore = avgScore;
    }
    public double getAvgScore(){
        return avgScore;
    }
    void display(){
        System.out.printf("Tên: %s, Tuổi: %d, Lớp: %s, Điểm trung bình: %.1f\n",sName,sAge,sClass,avgScore);
    }

}
