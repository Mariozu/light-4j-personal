
package com.networknt.miAsistente.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CardView {

    
    private String name;
    
    private Integer id;
    
    private String tag;
    

    public CardView () {
    }

    
    
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    
    
    @JsonProperty("tag")
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    
    

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CardView CardView = (CardView) o;

        return Objects.equals(name, CardView.name) &&
        Objects.equals(id, CardView.id) &&
        
        Objects.equals(tag, CardView.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id,  tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CardView {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
