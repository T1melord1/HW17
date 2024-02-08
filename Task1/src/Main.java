import java.time.LocalDate;



public class Main {
    public static void main(String[] args) {
        //todo создайте класс Wine. Протестируйте его работу в этом методе.
        Wine wine = new Wine("Margo", "Morgenstern", "Russia", LocalDate.of(2020, 2, 7), "Tasty");
        wine.wineExtract(LocalDate.of(2016,12,1));




    }
}