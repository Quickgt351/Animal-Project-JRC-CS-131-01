

public class Goldfinch extends Animal{

    //Instance variables
    private double wingSpan;

    public Goldfinch()
    {
            super();
            this.wingSpan=0;
    }
    /**
     * @param simID
     * @param location
     * @param wingSpan
     * @throws InvalidWingspanException 
     */
    public Goldfinch(int simID, Location location,double wingSpan) throws InvalidWingspanException {
            super(simID, location);
            setWingSpan(wingSpan);
    }
    /**
     * @return the wingSpan
     */
    public double getWingSpan() {
            return wingSpan;
    }
    /**
     * @param wingSpan the wingSpan to set
     * @throws InvalidWingspanException 
     */
    public void setWingSpan(double wingSpan) throws InvalidWingspanException {
            if(wingSpan>=5 && wingSpan<=11)
                    this.wingSpan=wingSpan;
            else
                    throw new InvalidWingspanException("Error! Invalid WingSpan!");
    }


}