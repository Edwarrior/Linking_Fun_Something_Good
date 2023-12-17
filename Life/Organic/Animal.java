package Life.Organic;
public abstract class Animal extends Organism {

    private char gender;
    
    public Animal(char gender) {
        super();
        this.gender = gender;
    }

    public Animal(String name, char gender) {
        super(name);
        this.gender = gender;

    }



    public void setGender(char gender) {
        this.gender = gender;
    }
    public char getGender() {
        return gender;
    }


}
