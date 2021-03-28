


public class Animal {
    private int simID;
    private Location location;
    private boolean full;
    private boolean rested;

    public Animal(){
        this.simID = 0;
        int[] temp ={0,0};
        this.location = new Location(temp);
        this.full = false;
        this.rested = true;
    }

    public Animal(int simID, Location location) {
        this.simID = simID;
        this.location = location;
        full = false;
        rested = true;
    }

    public int getSimID() {
        return simID;
    }

    public void setSimID(int simID) {
         try  {
           if( simID <= 0)
           {
               throw new InvalidSimIDException("ID is less than or equal to zero!");
           } else {
                this.simID = simID;
           }
        } catch (InvalidSimIDException e) {
           System.out.println(e); 
        }

    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public boolean getIsFull() {
        return full;
    }

    public void setIsFull(boolean full) {
        this.full = full;
    }

    public boolean getIsResting() {
        return rested;
    }

    public void setIsResting(boolean rested) {
        this.rested = rested;
    }

    public boolean eat() {
        double random = Math.random();

        if (random < 0.5) {
            this.full = false;
        } else {
            this.full = true;
        }

        return this.full;
    }

    public boolean sleep() {
        double random = Math.random();

        if (random < 0.5) {
            this.rested = false;
        } else {
            this.rested = true;
        }

        return this.rested;
    }
}