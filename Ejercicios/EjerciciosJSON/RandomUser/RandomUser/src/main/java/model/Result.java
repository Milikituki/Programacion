package model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@lombok.Data
public class Result {
    private Name name;
    private Location location;
    private String email;

    public void mostrarDatos(){
        System.out.println("Title = " + name.getTitle());
        System.out.println("Firstname = " + name.getFirst());
        System.out.println("Lastname = " + name.getLast());
        System.out.println("Country = " + location.getCountry());
        System.out.println("Email = " + email);
        System.out.println();
    }
}


@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
class Location {
    private String country;
}

@lombok.Data
class Name {
    private String title;
    private String first;
    private String last;
}



