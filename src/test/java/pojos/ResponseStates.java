
package pojos;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class ResponseStates {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("tpcountry")
    @Expose
    private Object tpcountry;

    /**
     * No args constructor for use in serialization
     *
     */
    public ResponseStates() {
    }

    /**
     *
     * @param tpcountry
     * @param name
     * @param id
     */
    public ResponseStates(Integer id, String name, Object tpcountry) {
        super();
        this.id = id;
        this.name = name;
        this.tpcountry = tpcountry;
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResponseStates.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("tpcountry");
        sb.append('=');
        sb.append(((this.tpcountry == null)?"<null>":this.tpcountry));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}