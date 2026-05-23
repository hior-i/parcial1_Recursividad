package com.example.parcial1Recursividad;

import lombok.Setter;

import java.util.Scanner;

import lombok.Getter;
@Getter
@Setter

public class Usuario {
    private String ID;
    private String nombre;
    private String apellido;
    private String Tipo; 
    private boolean premiun;
    private Scanner tec;
       
    public Usuario(String ID, String nombre, String apellido, String Tipo) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Tipo = Tipo;
        this.premiun= false;
    }

    public void ingresar(){
        System.out.println("Ingrese nombre de usuario");
        nombre = tec.nextLine();
        System.out.println("ingrese apellido");
        apellido= tec.nextLine();
        System.out.println("ingrese ID");
        ID= tec.nextLine();
        System.out.println("ingrese tipo decuenta");
        Tipo= tec.nextLine();
        if (Tipo.equalsIgnoreCase("premium")){
            premiun= true;
        }
        
    }

}
