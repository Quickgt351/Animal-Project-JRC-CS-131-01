

public class Location{
    private int x;
    private int y;

    public Location() {
        this.x = 0;
        this.y = 0;
    }

    public Location(int[] val) {
        this.x = val[0];
        this.y = val[1];
    }

    public int getX() {
        return this.x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void update(int x, int y) {
    	setX(x);
    	setY(y);
    }
    public int[] getCoordinates() {
    	int[] coor = {getX(), getY()};
    	return coor;
    	
    }

}


