import java.time.LocalDate;
import java.time.Period;

public class Wine {
    private String title;
    private String brandName;
    private String country;
    private LocalDate bottlingDate;
    private String description;

    public Wine() {
    }

    public Wine(String title, String brandName, String country, LocalDate bottlingDate, String description) {
        this.title = title;
        this.brandName = brandName;
        this.country = country;
        this.bottlingDate = bottlingDate;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getBottlingDate() {
        return bottlingDate;
    }

    public void setBottlingDate(LocalDate bottlingDate) {
        this.bottlingDate = bottlingDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void wineExtract(LocalDate currentDate){
        if (Period.between(currentDate,bottlingDate).getYears() < 5){
            System.out.println("Выдержка лет между разливом и указанной датой: " + Period.between(currentDate,bottlingDate).getYears() + " год");
        }else if (Period.between(currentDate,bottlingDate).getYears() >= 5){
            System.out.println("Выдержка лет между разливом и указанной датой: " + Period.between(currentDate,bottlingDate).getYears() + " лет");
        }

    }

}
