package Book;

public class Args {
    public static void main(String[] args) {
        Izd izd1 = new Izd("Проспект", "Москва");
        Izd izd2 = new Izd("Питер", "Санкт-Петербург");
        Izd izd3 = new Izd("БХВ", "Санкт-Петербург");
        Izd izd4 = new Izd("Диалектика", "Киев");


        Book[] book = new Book[]{
                new Book("Computer Sciуnce:основы программирования на Java, ООП,Алгоритмы и структуры данных;", izd2, new String[]{"Седжвик Робертс", "Уейн Кевин"}, 2018),
                new Book("Разработка требований к програмному обеспечению, 3 издание, дополненное;", izd3, new String[]{"Вигерс Карл"}, 2019),
                new Book("Java.Полное руководство, 10-е издание;", izd4, new String[]{"Шилд Герберт"}, 2018),
                new Book("C/C++.Процедурное программирование;", izd3, new String[]{"Полубенцева М.И."}, 2017),
                new Book("Конституция РФ", 2020, izd1,null)
        };

        Book.printAll(book);
        if (izd3.getCity().equals("Санкт-Петербург")) {
            izd3.setCity("Москва");
            System.out.println("Ошибка в городе издательства БХВ");
        }
        Book.printAll(book);
    }
}
