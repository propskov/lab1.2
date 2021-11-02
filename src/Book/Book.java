package Book;

import java.util.Arrays;

public class Book {
    private String Namebook;
    private Izd izd;
    private String[] Authors;
    private int Year;


    public Book(String Namebook, int Year, Izd izd, String[] Authors) {
        setNamebook(Namebook);
        setYear(Year);
        setizd(izd);
        setAuthors(Authors);
    }

    public Book(String namebook, Izd izd, String[] Authors, int Year) {
        this(namebook, Year, izd, Authors);


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


    public String[] getAuthors() {
        return Authors;
    }

    public void setAuthors(String[] Authors) {
        this.Authors = Authors;
    }


    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        if (Year <= 0)
            throw new IllegalArgumentException("Поле год должно быть больше нуля");
        this.Year = Year;
    }


    public String getAuthorsindex(int index) {
        if (getAuthors().length == 0) {
            return "";
        }
        if ((index < 0) || (index >= Authors.length)) {
            throw new IllegalArgumentException("Длина индекса должена быть больше нуля и не должна превышать длину массива ");
        }
        return Authors[index];
    }

    public void print() {

        if (getAuthors() != null && getAuthors().length > 0)
            System.out.println("Книга - " + getNamebook() + " Город издательства:" + getIzd().getCity() + ";" + " Издательство:" + getIzd().getNameizd() + ";" + " Автор(ы)-" + Arrays.toString(getAuthors())
                    + ";" + "Год издания:" + getYear());
               else
            System.out.println("Книга-" + getNamebook() + " Город издательства:" + getIzd().getCity() + "; " + "Издательство:" + getIzd().getNameizd() + ";" + " Год издания " + getYear());

    }

    public static void printAll(Book[] book) {
        for (Book c : book)
            c.print();
    }

}