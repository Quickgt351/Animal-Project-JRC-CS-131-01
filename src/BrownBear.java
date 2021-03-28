

public class BrownBear extends Animal {
    enum Species {
        Alaskan,
        Asiatic,
        European,
        Grizzly,
        Kodiak,
        Siberian
    }


    private Species subSpecies;
    

    public BrownBear() {
        super();
        subSpecies = Species.Alaskan;
    }

    public BrownBear(String subSpecies, int simID, Location location) throws InvalidSubspeciesException {
    	super(simID, location);
    	try {
            this.subSpecies = Species.valueOf(subSpecies);
        } catch (Exception ex) {
            throw new InvalidSubspeciesException(subSpecies);
        }
       
        
        
    }

    public Species getSubSpecies() {
        return subSpecies;
    }

    public void setSubSpecies(Species subSpecies) {
        this.subSpecies = subSpecies;
    }


}