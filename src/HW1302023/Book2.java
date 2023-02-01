package HW1302023;

public class Book2 {

    String favbook;

    String favChar;

    String favQoute;

    int year;

    Book2(String bookName, String charName) {
        favbook = bookName;
        favChar = charName;
    }
    Book2(String bookName, String charName, String qoute, int bookYear){
        favbook=bookName;
        favChar=charName;
        favQoute=qoute;
        year=bookYear;

    }

    public static void main(String[] args) {
        Book2 hp=new Book2("Harry Potter","Snape","Always",1998);
        Book2 hp1=new Book2("Harry Potter","Sirius Black");
        
    }
}
