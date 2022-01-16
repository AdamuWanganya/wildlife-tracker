import org.sql2o.Connection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Rangers {

    private int id;
    private String name;
    private String badge_number;
    private String phone_number;

    public Rangers(String name, String badge_number, String phone_number) {
        this.name = name;
        this.badge_number = badge_number;
        this.phone_number = phone_number;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBadge_number() {
        return badge_number;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public static List<Rangers> all(){
        try (Connection con=DB.sql2o.open()){
            String sql="SELECT * FROM rangers";
            return con.createQuery(sql)
                    .throwOnMappingFailure(false)
                    .executeAndFetch(Rangers.class);

        }

    }
}