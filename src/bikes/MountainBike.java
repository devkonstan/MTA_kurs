package bikes;

public class MountainBike extends Bicycle {
    private String suspension;
    public MountainBike(
            int startCadence,
            int startSpeed,
            int startGear,
            String suspensionType){
        super(startCadence,startSpeed,startGear);
        this.setSuspension(suspensionType);
    }
    public String getSuspension(){
        return this.suspension;
    }
    public void setSuspension(String suspensionType) {
        this.suspension = suspensionType;
    }
    public void printDescription() {
        super.printDescription();
        System.out.println("The " + "Bikes.MountainBike has a" +
                getSuspension() + " suspension.");
    }
}
