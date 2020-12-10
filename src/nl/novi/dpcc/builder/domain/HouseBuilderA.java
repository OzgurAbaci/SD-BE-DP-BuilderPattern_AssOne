package nl.novi.dpcc.builder.domain;

public class HouseBuilderA {
    private String streetName;
    private int housenumber;
    private String houseNumberAddition;
    private String postalCode;

    //Niet verplicht
    private String province;
    private boolean hasGarden = false;

    public HouseBuilderA(){
    }

    public HouseBuilderA withStreetname(String streetName){
        this.streetName = streetName;
        return this;
    }

    public HouseBuilderA withHousenumber(int housenumber){
        this.housenumber = housenumber;
        return this;
    }

    public HouseBuilderA withHouseNumberAddition(String houseNumberAddition){
        this.houseNumberAddition = houseNumberAddition;
        return this;
    }

    public HouseBuilderA withPostalCode(String postalCode){
        this.postalCode = postalCode;
        return this;
    }

    public HouseBuilderA withProvince(String province){
        this.province = province;
        return this;
    }

    public HouseBuilderA withGarden(){
        this.hasGarden = true;
        return this;
    }

    public House build(){
        return new House(streetName, housenumber, houseNumberAddition, postalCode, province, hasGarden);
    }

}
