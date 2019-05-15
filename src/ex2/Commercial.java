package ex2;

public class Commercial extends Building{
    private int howManyFloors = 4;
    private Boolean hasParkingLot = true;
    private Boolean hasInspection = true;
    private double taxRate = 15;

    @Override
    public String toString()
    {
        return "This commerical building has " + howManyFloors + " floors and a tax rate of " + taxRate;
    }
}
