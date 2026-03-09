package model;


@lombok.Data
public class Usuario {
    private long userId;
    private long id;
    private String title;
    private String body;

    public void datosMensaje(){
        System.out.println("title = " + title);

    }
}