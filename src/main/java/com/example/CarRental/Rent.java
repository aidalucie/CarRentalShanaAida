package com.example.CarRental;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Rent {


    public Rent(int rentID, String clientName, Date beginDate, Date endDate, String carPlateNumber) {
        RentID = rentID;
        ClientName = clientName;
        this.beginDate = beginDate;
        this.endDate = endDate;
        CarPlateNumber = carPlateNumber;
    }

    private int RentID;
    private String ClientName;
    private Date beginDate;
    private Date endDate;
    private String CarPlateNumber ;

    public int getRentID() {
        return RentID;
    }

    public void setRentID(int rentID) {
        RentID = rentID;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String clientName) {
        ClientName = clientName;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCarPlateNumber() {
        return CarPlateNumber;
    }

    public void setCarPlateNumber(String carPlateNumber) {
        CarPlateNumber = carPlateNumber;
    }

    @Override
    public String toString() {

        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yy");

        return "Rent{" +
                "beginDate=" + formater.format(beginDate) +
                ", endDate=" + formater.format(endDate) +
                '}';
    }
}
