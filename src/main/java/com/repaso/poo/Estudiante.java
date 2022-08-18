package com.repaso.poo;
// HERENCIA - CLASE HIJA - CLASE PADE PERSONA
public class Estudiante extends Persona {
    //contructor sirve para inicializar objetos
    //por defecto el tiene un constuctor vacio

    //CONTRUCTOR QUE RECIBE PARAMETROS.
    public Estudiante(String nombre, String apellido){
        setNombre(nombre);
        setApellido(apellido);

    }

    public String NombresCompletos(){
        return getNombre()+" "+getApellido();
    }
}
