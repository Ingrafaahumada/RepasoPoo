package com.repaso.poo;

public class Zapatos {
    //definir contructores, atributos y propiedades
    private int talla;
    private String color;
    private String marca;

    //creacion de geters y setters
    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    // private siempre pára las propiedades,
    // se debe acceder con geters y seters.
    // para modificar u obterner los valores de las propiedades
    //encapsulamiento

}
