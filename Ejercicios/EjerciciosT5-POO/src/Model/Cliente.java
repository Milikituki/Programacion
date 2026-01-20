package Model;

public class Cliente {
    private String nombre, email;
    private Direccion direccion;
    public Cliente(String nombre, String email, Direccion direccion) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Email: " + this.email);
        System.out.println("Direccion: " + direccion.getCalle()+", "+direccion.getCiudad()+", "+direccion.getcPostal());
    }
}
