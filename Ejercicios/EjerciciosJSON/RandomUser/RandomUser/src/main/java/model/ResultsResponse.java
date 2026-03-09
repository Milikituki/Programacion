package model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultsResponse {
    private List<Result> results;

}
