package com.example.application;

public class Equipo {
    private String nombre = "";
    private int titulares = 0;
    private int suplentes = 0;
    private String directorTecnico = "";
    private int puntos = 0;  
    private int partidosJugados=0;

    
   public Equipo(String nombre, int titulares, int suplentes, String directorTecnico, int puntos,
            int partidosJugados) {
        this.nombre = nombre;
        this.titulares = titulares;
        this.suplentes = suplentes;
        this.directorTecnico = directorTecnico;
        this.puntos = puntos;
        this.partidosJugados = partidosJugados;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTitulares() {
        return titulares;
    }
    public void setTitulares(int titulares) {
        this.titulares = titulares;
    }
    public int getSuplentes() {
        return suplentes;
    }
    public void setSuplentes(int suplentes) {
        this.suplentes = suplentes;
    }
    public String getDirectorTecnico() {
        return directorTecnico;
    }
    public void setDirectorTecnico(String directorTecnico) {
        this.directorTecnico = directorTecnico;
    }
    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    public int getPartidosJugados() {
        return partidosJugados;
    }
    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

}