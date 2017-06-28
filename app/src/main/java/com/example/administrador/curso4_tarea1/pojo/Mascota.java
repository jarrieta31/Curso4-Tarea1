package com.example.administrador.curso4_tarea1.pojo;

/**
 * Created by administrador on 08/05/17.
 */

public class Mascota {

    private String id;
    private String nombre;
    private int Likes;
    private String urlFoto;
    private int colorFondo;


    //Contructor
    public Mascota (String nombre, int Likes, String urlFoto, int colorFondo){
        this.nombre = nombre;
        this.Likes = Likes;
        this.urlFoto = urlFoto;
        this.colorFondo = colorFondo;
    }

    public Mascota(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLikes() {
        return Likes;
    }

    public void setLikes(int likes) {
        Likes = likes;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public int getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(int colorFondo) {
        this.colorFondo = colorFondo;
    }
}
