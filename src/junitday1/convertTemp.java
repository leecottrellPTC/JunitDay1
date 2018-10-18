/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitday1;

/**
 *
 * @author lee_c
 */
public class convertTemp {
    private double celsius = 0;
    private double fahrenheit = 0;
    private double kelvin = 0;

    
    public convertTemp() {
    }
   
    
    public convertTemp(double temp, char scale){
        //scale = scale.toUpperCase();
        switch(scale){
            case 'c':
            case 'C':
                celsius = temp;
                break;
            case 'f':
            case 'F':
                fahrenheit = temp;
            default:
                celsius = temp;
        }
        
        
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }
    
    public double celsToFah(){
        fahrenheit = 9.0/5.0 * celsius + 32;
        return fahrenheit;
    }
    
    public double fahToCels(){
        celsius = 5/9 * (fahrenheit - 32);
        return celsius;
    }
    
}
