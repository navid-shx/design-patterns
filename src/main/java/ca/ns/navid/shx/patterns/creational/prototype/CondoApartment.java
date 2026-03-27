package ca.ns.navid.shx.patterns.creational.prototype;

public class CondoApartment implements Cloneable {

    private int unitNumber;
    private int buildingNumber;
    private String street;

    public CondoApartment(int unitNumber, int buildingNumber, String street) {
        this.unitNumber = unitNumber;
        this.buildingNumber = buildingNumber;
        this.street = street;
    }

    public int getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public CondoApartment clone() {
        return new CondoApartment(this.unitNumber, this.buildingNumber, this.street);
    }
}
