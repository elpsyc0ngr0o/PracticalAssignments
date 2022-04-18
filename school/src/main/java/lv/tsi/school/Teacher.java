package lv.tsi.school;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
    @JsonProperty
    @Id
    Long id;
    @JsonProperty
    String name;

    @JsonProperty
    String email;

}