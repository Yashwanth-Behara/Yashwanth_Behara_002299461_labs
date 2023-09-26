/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author yash
 */
public class VitalSigns {
    private double temperature;
    private double bloodPressure;
    private int pulse;
    private String date;

    // Constructor
//    public VitalSigns(double temperature, double bloodPressure, int pulse, String date) {
//        this.temperature = temperature;
//        this.bloodPressure = bloodPressure;
//        this.pulse = pulse;
//        this.date = date;
//    }

    // Getter for temperature
    public double getTemperature() {
        return temperature;
    }

    // Setter for temperature
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    // Getter for bloodPressure
    public double getBloodPressure() {
        return bloodPressure;
    }

    // Setter for bloodPressure
    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    // Getter for pulse
    public int getPulse() {
        return pulse;
    }

    // Setter for pulse
    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    // Getter for date
    public String getDate() {
        return date;
    }

    // Setter for date
    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "VitalSigns{" +
                "temperature=" + temperature +
                ", bloodPressure=" + bloodPressure +
                ", pulse=" + pulse +
                ", date='" + date + '\'' +
                '}';
    }

    // You can add more methods and functionality as needed.

  
}
