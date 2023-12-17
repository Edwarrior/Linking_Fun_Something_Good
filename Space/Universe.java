package Space;
public class Universe {
    
    private String name;
    private long age;
    
    public Universe(String name, long age) {
        this.name = name;
        this.age = age;
    }




    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(long age) {
        this.age = age;
    }
    public long getAge() {
        return age;
    }
}
