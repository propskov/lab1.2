package Book;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Izd {
    private String Nameizd;
    private String City;


    public Izd(String Nameizd, String City) {
        setCity(City);
        setNameizd(Nameizd);
    }

    // * на потом
    // Реальное время для сравнения с датой издания книги
    //public static void main(String[] args) {
    // Date date = new Date();
    //  System.out.println(date.toString());
    // }


    public String getNameizd() {
        return Nameizd;
    }

    public void setNameizd(String Nameizd) {
        if (Nameizd != null && !Nameizd.equals(""))
            this.Nameizd = Nameizd;
        else
            throw new IllegalArgumentException("Поле издательство не должно быть пустым");
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        if (City != null && !City.equals(""))
            this.City = City;
        else
            throw new IllegalArgumentException("Поле страна не должно быть пустым");
    }
}


