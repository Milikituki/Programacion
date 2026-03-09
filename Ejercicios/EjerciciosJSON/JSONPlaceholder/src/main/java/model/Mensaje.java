package model;

@lombok.Data
public class Mensaje {
    private long id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;
    
    public void mostrarDatos(){
        System.out.println("username = " + username);
        System.out.println("address = " + address.city);
}

@lombok.Data
static
class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;
}

@lombok.Data
static
class Geo {
    private String lat;
    private String lng;
}

@lombok.Data
static
class Company {
    private String name;
    private String catchPhrase;
    private String bs;
}}