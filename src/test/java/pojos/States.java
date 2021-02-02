package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class States {

    private Integer id;
    private String name;
    private Object tpcountry;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getTpcountry() {
        return tpcountry;
    }

    public void setTpcountry(Object tpcountry) {
        this.tpcountry = tpcountry;
    }

    public States() {
    }

    public States(String name, Object tpcountry) {
        this.name = name;
        this.tpcountry = tpcountry;
    }

    public States(Integer id, String name, Object tpcountry) {
        this.id = id;
        this.name = name;
        this.tpcountry = tpcountry;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("tpcountry", tpcountry).toString();
    }

}