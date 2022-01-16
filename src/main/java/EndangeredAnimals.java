public class EndangeredAnimals extends Animals implements DatabaseManagement{

    private String health;
    private String age;
    public static final String HEALTH_HEALTHY="healthy";
    public static final String HEALTH_ILL="ill";
    public static final String HEALTH_OKAY="okay";

    public static final String AGE_NEWBORN="newborn";
    public static final String AGE_YOUNG="young";
    public static final String AGE_ADULT="adult";

    public static final String ANIMAL_TYPE="endangered";
    public EndangeredAnimals(String name,String type,String health,String age) {
        super(name,type);
        this.type=type;
        this.health=health;
        this.age=age;

    }
}
