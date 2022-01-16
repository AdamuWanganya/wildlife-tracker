public class Animals implements DatabaseManagement {

    public int id;
    public String name;
    public String type;
    private String health;
    private String age;
    public static final String ANIMAL_TYPE="normal";


    public Animals(String name,String type) {
        this.name = name;
        this.type=ANIMAL_TYPE;
        this.health="";
        this.age="";
    }

    public String getHealth() {
        return health;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

}
