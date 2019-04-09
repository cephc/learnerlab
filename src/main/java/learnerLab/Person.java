package learnerLab;

public class Person {
    private final long id;
    private String name;
    //constructor
    public Person(String name, long id){
        this.name = name;
        this.id = id;
    }
    public Person(long id){
        this.id = id;
    }
    //getters and setter
    public long getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
