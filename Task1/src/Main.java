import java.time.LocalDate;
import java.time.Period;


public class Main {
    public static void main(String[] args) {
        //todo создайте класс Wine. Протестируйте его работу в этом методе.
        Wine wine = new Wine("Margo", "Morgenstern", "Russia", LocalDate.of(2020, 2, 7), "Tasty");
        Period period = wine.wineExtract(LocalDate.now());
        System.out.println("Выдержка вина: " + period.getYears() + " лет " + period.getMonths() + " месяцев " + period.getDays() + " дней");

        Wine shato = new Wine("Ogurec", "Amado","Belarus",LocalDate.of(2010,5,13), "kruto");
        shato.setDescription("Ploho");
        Period period1 = shato.wineExtract(LocalDate.of(2000,1,1));
        System.out.println(period1);



    }
}