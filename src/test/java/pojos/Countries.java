package pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Countries {

    private Integer id;
    private String name;
    private Object states;

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

    public Object getStates() {
        return states;
    }

    public void setStates(Object states) {
        this.states = states;
    }

    public Countries() {
    }

    public Countries(String name, Object states) {
        this.name = name;
        this.states = states;
    }
    public Countries(String name) {
        this.name = name;

    }

    public Countries(Integer id, String name, Object states) {
        this.id = id;
        this.name = name;
        this.states = states;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("states", states).toString();
    }

}