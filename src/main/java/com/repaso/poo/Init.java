package com.repaso.poo;

public class Init {
    public static void main(String[] args) {
        // creo una instancia de la clase zapato
        Zapatos miZapato = new Zapatos();
        miZapato.setTalla(34);
        miZapato.setColor("Gris");
        miZapato.setMarca("Arturo Calle");

        Zapatos miZapatoDos = new Zapatos();
        miZapatoDos.setTalla(34);
        miZapatoDos.setColor("Negro");
        miZapatoDos.setMarca("Aquiles");

        //CREO OBJETOS DE TIPO ESTUDIANTES
        Estudiante nuevoEstudiante = new Estudiante("Pepito", "Perez");

        //CREO OBJETO CLASE PERSONA
        Persona nuevaPersona = new Persona();


        System.out.println(nuevoEstudiante.NombresCompletos());
        System.out.println(miZapatoDos.getMarca());
        System.out.println(miZapato.getMarca());

    }
}
