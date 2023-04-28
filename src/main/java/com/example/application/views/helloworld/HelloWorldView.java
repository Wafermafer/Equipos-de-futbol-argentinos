package com.example.application.views.helloworld;

import java.sql.*;  
import com.mysql.jdbc.Driver;

import com.example.application.Equipo;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Ingresar nuevo Equipo")
@Route(value = "home", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)



public class HelloWorldView extends HorizontalLayout {

    private TextField nombre;
    private TextField titulares;
    private TextField suplentes;
    private TextField directorTecnico;
    private TextField puntos;
    private TextField partidosJugados;
  
    private Button ingreso;
 
    public Equipo Nequipo;

 
    public HelloWorldView() {
        nombre= new TextField("Ingresa Nombre Equipo:");
        titulares = new TextField("Cantidad de Titulares:");
        suplentes = new TextField("Cantidad de Suplentes:");
        directorTecnico = new TextField("Nombre Director Tecnico:");
        puntos = new TextField("Cantidad de Puntos:");
        partidosJugados = new TextField("Partidos Jugados:");
 
      ingreso = new Button("Ingresar");
        ingreso.addClickListener(e -> {
            
          //  Nequipo = new Equipo(nombre.toString(), Integer.parseInt(titulares.toString()), Integer.parseInt(suplentes.toString()), directorTecnico.toString(), Integer.parseInt(puntos.toString()), Integer.parseInt(partidosJugados.toString()));
           
      
     //     Nequipo = new Equipo(n1,titu,sup,direc, pun,partidos);
  
          Nequipo = new Equipo(nombre.getValue().toString(),Integer.parseInt(titulares.getValue()),Integer.parseInt(suplentes.getValue()),directorTecnico.getValue(), Integer.parseInt(puntos.getValue()), Integer.parseInt(suplentes.getValue()));
     

          //  Notification.show("Ingresado " + nombre.getValue());
            Notification.show("Ingresado " + Nequipo.getNombre());
            Notification.show("Ingresado " + Nequipo.getTitulares());
            Notification.show("Ingresado " + Nequipo.getSuplentes());
            Notification.show("Ingresado " + Nequipo.getDirectorTecnico());
            Notification.show("Ingresado " + Nequipo.getPuntos());
            Notification.show("Ingresado " + Nequipo.getPartidosJugados());
            

 
        });



        ingreso.addClickShortcut(Key.ENTER);

        setMargin(true);
        setVerticalComponentAlignment(Alignment.END, nombre, ingreso);

        add(nombre, titulares, suplentes, directorTecnico, puntos, partidosJugados,ingreso);
        
        
     

 

    }

}
