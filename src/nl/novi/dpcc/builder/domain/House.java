package nl.novi.dpcc.builder.domain;

public class House {
    private String streetName;
    private int housenumber;
    private String houseNumberAddition;
    private String postalCode;

    //Niet verplicht
    private String province;
    private boolean hasGarden;

    public House(String streetName, int housenumber, String houseNumberAddition, String postalCode, String province, boolean hasGarden) {
        this.streetName = streetName;
        this.housenumber = housenumber;
        this.houseNumberAddition = houseNumberAddition;
        this.postalCode = postalCode;
        this.province = province;
        this.hasGarden = hasGarden;
    }
}
