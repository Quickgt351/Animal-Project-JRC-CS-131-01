
public class Application {


    public static void main(String[] args){
        System.out.println("<<<<<Testing>>>>");
        Location loc = new Location(new int[] {10,13}); //seting up a location object with x = 10, y = 13
        Animal obj1 = new Animal(1,loc); //creatae a animal object with paramater
        Animal obj2 = new Animal(); // create a animal object without paramater
        System.out.println(obj1.getLocation().getX());
        System.out.println(obj1.getLocation().getY());
        obj1.setSimID(0); // triggers the InvalidSimIDException
        obj2.setSimID(10);
        System.out.println(obj2.sleep());
        System.out.println(obj1.eat());
    }
}


