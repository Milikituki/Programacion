package Model;

public class Direccion {
    private String calle, ciudad;
    private int cPostal;

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getcPostal() {
        return cPostal;
    }

    public void setcPostal(int cPostal) {
        this.cPostal = cPostal;
    }

    public Direccion(String calle, String ciudad, int cPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.cPostal = cPostal;
    }
}
