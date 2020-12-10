package nl.novi.dpcc.builder.domain;

public class HouseBuilder {
    private String streetName;
    private int housenumber;
    private String houseNumberAddition;
    private String postalCode;

    //Niet verplicht
    private String province;
    private boolean hasGarden = false;

    public HouseBuilder(){
    }

    public HouseBuilder withStreetname(String streetName){
        this.streetName = streetName;
        return this;
    }

    public HouseBuilder withHousenumber(int housenumber){
        this.housenumber = housenumber;
        return this;
    }

    public HouseBuilder withHouseNumberAddition(String houseNumberAddition){
        this.houseNumberAddition = houseNumberAddition;
        return this;
    }

    public HouseBuilder withPostalCode(String postalCode){
        this.postalCode = postalCode;
        return this;
    }

    public HouseBuilder withProvince(String province){
        this.province = province;
        return this;
    }

    public HouseBuilder withGarden(){
        this.hasGarden = true;
        return this;
    }

    public House Build(){
        return new House(streetName, housenumber, houseNumberAddition, postalCode, province, hasGarden);
    }

}
