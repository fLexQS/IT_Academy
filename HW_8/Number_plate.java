package IT_Academy.HW_8;

public class Number_plate {
    private String series;
    private String number;
    private String region;
    private String owner;

    public Number_plate(String number, String series, String region, String owner) {
        this.series = series;
        this.number = number;
        this.region = region;
        this.owner = owner;
    }
    public String getSeries() {return series;}

    public String getNumber() {return number;}

    public String getRegion() {return region;}

    public String getOwner() {return owner;}
}
