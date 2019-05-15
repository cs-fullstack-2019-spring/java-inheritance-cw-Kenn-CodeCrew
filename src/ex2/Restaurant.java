package ex2;

public class Restaurant extends Building {
    private int howManyFloors = 1;
    private Boolean hasParkingLot = true;
    private Boolean hasInspection = true;
    private double taxRate = 10;



    @Override
    public String toString()
    {
        return "This restaurant has " + howManyFloors + " floors and a tax rate of " + taxRate;
    }
}
