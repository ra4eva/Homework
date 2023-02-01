package HW1302023;

public class Book {

    String favbook;

    String favChar;

    String favQoute;

    int year;

    Book(){}

    Book(String bookName, String charName, String qoute, int bookYear){
        favbook=bookName;
        favChar=charName;
        favQoute=qoute;
        year=bookYear;
    }
    void printInfo(){
        System.out.println("My favorite book is: "+favbook+", My favorite character is: "+favChar+
                ", My fav qoute from the book is: "+favQoute+", The book was published in: "+year);
    }


    public static void main(String[] args) {
        Book hp=new Book("Harry Potter","Snape","Always",1998);
        hp.printInfo();

        Book hp1=new Book();

        System.out.println(hp1.favbook="Harry Potter");
        System.out.println(hp1.favChar="Snape");
        System.out.println(hp1.favQoute="Alywas");
        System.out.println(hp1.year=1998);

    }
}
