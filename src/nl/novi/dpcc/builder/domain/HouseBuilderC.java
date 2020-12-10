package nl.novi.dpcc.builder.domain;

public class HouseBuilderC {
    private String streetName;
    private int housenumber;
    private String houseNumberAddition;
    private String postalCode;

    //Niet verplicht
    private String province;
    private boolean hasGarden = false;

    public HouseBuilderC(){
    }

    public HouseBuilderC withStreetname(String streetName){
        this.streetName = streetName;
        return this;
    }

    public HouseBuilderC withHousenumber(int housenumber){
        this.housenumber = housenumber;
        return this;
    }

    public HouseBuilderC withHouseNumberAddition(String houseNumberAddition){
        this.houseNumberAddition = houseNumberAddition;
        return this;
    }

    public HouseBuilderC withPostalCode(String postalCode){
        this.postalCode = postalCode;
        return this;
    }

    public HouseBuilderC withProvince(String province){
        this.province = province;
        return this;
    }

    public HouseBuilderC withGarden(){
        this.hasGarden = true;
        return this;
    }

    public House build(){
        return new House(streetName, housenumber, houseNumberAddition, postalCode, province, hasGarden);
    }

    public House buildWithEmptyCheck(){
        if (streetName == null){
            throw new RuntimeException("Streetname cannot be empty");
        }
        if (housenumber == 0){
            throw new RuntimeException("House number cannot be empty");
        }
        if (houseNumberAddition == null){
            throw new RuntimeException("House number addition cannot be empty. I know this makes no sense, but Nick told us so");
        }
        if (postalCode == null) {
            throw new RuntimeException("Postal code cannot be empty");
        }

        return build();
    }

}
