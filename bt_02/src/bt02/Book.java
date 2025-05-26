package bt02;

public class Book {
    private String bookName;
    private  String bookAuthor;
    private double bookPrice;

//    public void setBookName(String bookName){
//        this.bookName = bookName;
//    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        if(bookPrice > 0){
            this.bookPrice = bookPrice;
        }
        else{
            System.out.println("Giá cả phải là số dương");
        }
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void display(){
        System.out.println("Tiêu đề: "+ getBookName());
        System.out.println("Tác giả: "+ getBookAuthor());
        System.out.printf("Giá thành: %,.0f\n",getBookPrice());
        System.out.println("");
    }
}
