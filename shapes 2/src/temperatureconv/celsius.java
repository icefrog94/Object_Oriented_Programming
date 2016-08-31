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
public class celsius extends degree {
    private double celsius, fahrenheit;

    public celsius(double celsius) {
        this.celsius = celsius;
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
        return fahrenheit = ((9.0/5.0) * celsius) + 32;
    }          
}


