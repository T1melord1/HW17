import java.time.LocalDate;

public class Wine {
    private String title;
    private String brandName;
    private String country;
    private LocalDate bottlingDate;
    private String description;

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
}
