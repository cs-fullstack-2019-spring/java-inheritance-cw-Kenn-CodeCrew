package ex2;

public class Resident extends Building{
    private int howManyFloors = 2;
    private Boolean hasParkingLot = false;
    private Boolean hasInspection = false;
    private double taxRate = 7;

    @Override
    public String toString()
    {
        return "This residential building has " + howManyFloors + " floors and a tax rate of " + taxRate;
    }
}
