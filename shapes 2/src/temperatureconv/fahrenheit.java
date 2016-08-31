/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconv;

/**
 *
 * @author waiyankaung
 */
public class fahrenheit extends degree {
 private double celsius, fahrenheit;

    public fahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
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

    @Override
    public double getDegree() {
        return celsius =   (fahrenheit - 32) / 1.8;
    }
}
    

