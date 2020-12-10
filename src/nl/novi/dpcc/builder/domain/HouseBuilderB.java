package nl.novi.dpcc.builder.domain;

public class HouseBuilderB {
    private final String streetName;
    private final int housenumber;
    private final String houseNumberAddition;
    private final String postalCode;

    //Niet verplicht
    private String province;
    private boolean hasGarden = false;

    public HouseBuilderB(String streetName, int housenumber, String houseNumberAddition, String postalCode) {
        this.streetName = streetName;
        this.housenumber = housenumber;
        this.houseNumberAddition = houseNumberAddition;
        this.postalCode = postalCode;
    }

    public HouseBuilderB withProvince(String province){
        this.province = province;
        return this;
    }

    public HouseBuilderB withGarden(){
        this.hasGarden = true;
        return this;
    }

    public House build(){
        return new House(streetName, housenumber, houseNumberAddition, postalCode, province, hasGarden);
    }

}
