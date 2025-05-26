package bt02;

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.setBookName("Mina no Nihongo");
        myBook.setBookAuthor("Mikasa");


        myBook.setBookPrice(1000);

        myBook.display();


        myBook.setBookPrice(2000);
        System.out.printf("Giá mới: %,.0f\n",myBook.getBookPrice());


        myBook.setBookPrice(-5000);

    }
}
