package com.wonderlabz.converter.model;

public class Converter {

    private Double celsius;
    private Double kelvin;
    private Double miles;
    private Double kilometres;

    public Converter(Double celsius, Double kelvin, Double miles, Double kilometres){
        this.celsius = celsius;
        this.kelvin = kelvin;
        this.miles = miles;
        this.kilometres = kilometres;
    }

    public Double getCelsius(){
        return celsius;
    }

    public Double getKelvin() {
        return kelvin;
    }

    public Double getMiles() {
        return miles;
    }

    public Double getKilometres() {
        return kilometres;
    }
}
