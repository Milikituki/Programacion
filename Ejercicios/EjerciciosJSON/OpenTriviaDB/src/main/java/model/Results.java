package model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
@lombok.Data
public class Results {
    @JsonIgnore
    private long responseCode;
    private List<Result> results;
}

