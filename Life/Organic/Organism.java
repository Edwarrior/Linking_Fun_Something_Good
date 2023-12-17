package Life.Organic;
import java.util.ArrayList;

public abstract class Organism {

    private String name;
    private long commencementTime;
    private int health;

    static ArrayList<Organism> organisms = new ArrayList<Organism>();
    
    //private ArrayList<Organism> privateHistory = new ArrayList<Organism>(); //sort out later

    public Organism() {
        commence();
    }
    
    public Organism(String name) {
        this.name = name;
        commence();
    }

    private void commence() {
        this.commencementTime = 0; // not 0, needs to be current universe age.
        health = 100;

        organisms.add(this);
    }
    

    public void cycle() {
        // check age
        // check energy
        // check health


    } 

    public void die() {
        organisms.remove(this);
    }

    
















    public static void printOrganisms() {
        for (Organism organism : organisms) {
            try {
                System.out.println("Type: " + organism.getClass().toString().substring(6) + ", Name: " + organism.getName()+ ", Gender: " + ((Animal)organism).getGender());
                
            } catch (Exception e) {
                System.out.println("Type: " + organism.getClass().toString().substring(6) + ", Name: " + organism.getName());
            }

        }
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setCommencementTime(long commencementTime) {
        this.commencementTime = commencementTime;
    }
    public long getCommencementTime() {
        return commencementTime;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public int getHealth() {
        return health;
    }

}
