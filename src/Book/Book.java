package Book;
import java.util.Arrays;

public class Book {
    private String Namebook;
    private Izd izd;
    private String author;
    private String[] Authors;
    private int Year;

//
    public Book(String Namebook, Izd izd, String[] Authors, int Year) {
        setNamebook(Namebook);
        setYear(Year);
        setAuthors(Authors);
        setizd(izd);
    }

    public Book(String Namebook, Izd izd, String author, int Year) {
        this.Namebook = Namebook;
        this.izd = izd;
        this.Year = Year;
        setauthor(author);
    }

    public Book(String Namebook, int Year, Izd izd) {
        this.Namebook = Namebook;
        this.izd = izd;
        this.Year = Year;
    }

    public String getNamebook() {
        return Namebook;
    }

    public void setNamebook(String Namebook) {
        if (Namebook != null && !Namebook.equals(""))
            this.Namebook = Namebook;
        else
            throw new IllegalArgumentException("Поле название книги не должно быть пустым");
    }

    public Izd getIzd() {
        return izd;
    }

    public void setizd(Izd izd) {
        if (izd != null)
            this.izd = izd;
        else
            throw new IllegalArgumentException("Поле издательство не должно быть пустым");
    }

    public String getAuthor() {
        return author;
    }

    public void setauthor(String author) {
        if (author != null && !author.equals(""))
            this.author = author;
        else
            throw new IllegalArgumentException("Поле автор не должно быть пустым");
    }


    public String[] getAuthors() {
        return Authors;
    }

    public void setAuthors(String[] Authors) {
        if (Authors != null)
            this.Authors = Authors;
        else
            throw new IllegalArgumentException("Поле авторы не должно быть пустым");
    }


    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        if (Year <= 0)
            throw new IllegalArgumentException("Поле год должно быть больше нуля");
        this.Year = Year;
    }

    public void print1() {

        if (this.author != null)
            System.out.println("Книга-" + getNamebook() + " Город издательства:" + getIzd().getCity() + " Издательство:" + getIzd().getNameizd() + ";" + "Год издания " + getYear());
        else if (this.Authors != null)

            System.out.println("Книга - " + getNamebook() + " Город издательства:" + getIzd().getCity() + ";" + " Издательство:" + getIzd().getNameizd() + ";" + " Авторы-" + Arrays.toString(getAuthors())
                    + ";" + "Год издания:" + getYear());

        else
            System.out.println("Книга-" + getNamebook() + " Город издательства:" + getIzd().getCity() + "Издательство:" + getIzd().getNameizd() + ";" + "Год издания " + getYear());
           }



    public static void printAllerror(Book[] book) {
        for (Book c : book)
            c.print1();
        System.out.println("Хотя погодите, головной офис БХВ в Москве ");
    }
    public void print() {


        if (getIzd().getCity().equals("Санкт-Петербург")) {
            getIzd().setCity("Москва");
        }
        if (this.author != null)
            System.out.println("Книга-" + getNamebook() + " Город издательства:" + getIzd().getCity() + " Издательство:" + getIzd().getNameizd() + ";" + "Год издания " + getYear());
        else if (this.Authors != null)

            System.out.println("Книга - " + getNamebook() + " Город издательства:" + getIzd().getCity() + ";" + " Издательство:" + getIzd().getNameizd() + ";" + " Авторы-" + Arrays.toString(getAuthors())
                    + ";" + "Год издания:" + getYear());

        else
            System.out.println("Книга-" + getNamebook() + " Город издательства:" + getIzd().getCity() + "; "+ "Издательство:" + getIzd().getNameizd() + ";" + " Год издания " + getYear());

    }

    public static void printAll(Book[] book) {
        for (Book c : book)
            c.print();
        System.out.println("Во, так лучше!)");
    }

}