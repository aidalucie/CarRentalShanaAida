package com.example.CarRental;

public class Car {

    private String plateNumber;
    private String brand;
    private int price;
    private boolean rent;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    private int numberOfSeats;

    public Car() {
        super();
    }

    public Car(String plateNumber, String brand, int price, int numberOfSeats) {
        super();
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
        this.rent = true;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car [plateNumber=" + plateNumber + ", numberOfSeats=" + numberOfSeats + ", price=" + price + "]";
    }

}
