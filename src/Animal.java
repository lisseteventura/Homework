public class Animal {
    //Put instance variables here
    private int numLegs;
    private int topSpeed;
    private boolean isEndangered;
    private String name;

    //Put constructor here
    public Animal(int numLegs, int topSpeed, boolean isEndangered, String name) {
        this.numLegs = numLegs;
        this.topSpeed = topSpeed;
        this.isEndangered = isEndangered;
        this.name = name;
    }
    //Put getters and setters here
    public int getNumLegs() {
        return this.numLegs;
    }
    public void setNumLegs(int numLegs){
        this.numLegs = numLegs;
    }
    public int getTopSpeed() {
        return this.topSpeed;
    }
    public void setTopSpeed(int topSpeed){
        this.topSpeed = topSpeed;
    }
    public boolean getIsEndangered(){
        return this.isEndangered;
    }
    public void setIsEndangered(boolean isEndangered) {
         this.isEndangered = isEndangered;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("Hello, world");
        //Instantiate new Animal
        Animal animal = new Animal(4, 20, false, "thug");

        String name;
        int topSpeed;

        //get name and speed values using getters
        name = animal.getName();
        topSpeed = animal.getTopSpeed();

        //Print some output
        System.out.println("This animal's name is " + name );

        //Set new name, speed, and endangered properties values using setters

        animal.setName("rabbit");
        animal.setTopSpeed(100);
        animal.setIsEndangered(false);


        //get new values using getters
        name = animal.getName();
        topSpeed = animal.getTopSpeed();

        //Print some output
        System.out.println("Thug has a top speed of " + topSpeed + " mph.");
    }
}