package com.example.CarRental;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import org.springframework.web.bind.annotation.*;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;

@RestController
public class CarWebService {

    private List<Car> cars = new ArrayList<Car>();

    public CarWebService() {
        cars.add(new Car("11AA22", "Ferrari", 1000, 5));
        cars.add(new Car("33BB44", "Porshe", 2222, 4));
    }


    @RequestMapping(value="/cars", method=RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Car> getListOfCars(){
        return cars;
    }


    @RequestMapping(value = "/cars", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void addCar(@RequestBody Car car) throws Exception{
        System.out.println(car);
        cars.add(car);
    }

    Car car = new Car("33AA44", "Porshe", 3333, 4);

    @RequestMapping(value="/cars/{plateNumber}", method=RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Car aCar(@PathVariable("plateNumber") String plateNumber) throws Exception
    {
        Car car = null ;

        for ( Car c : cars)
        {
            if (c.getPlateNumber().equals(plateNumber)) car = c;
            System.out.println("OK");
        }

        return car;
    }
    /*

    @RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.PUT)
    public void rent(@PathVariable("plateNumber") String plateNumber, @RequestParam(value="rent",
            required = true)boolean rent, @RequestBody Dates dates){
    }*/

     /*
    @RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.DELETE)
@ResponseStatus(HttpStatus.OK)
public void getBack(@PathVariable("plateNumber") String plateNumber) throws Exception{
}
@RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.PUT)
@ResponseStatus(HttpStatus.OK)
public void rent(@PathVariable("plateNumber") String plateNumber) throws Exception{
}
@RequestMapping(value = "/voiture/{plateNumber}", method = RequestMethod.PUT)
@ResponseStatus(HttpStatus.OK) public void
rentAndGetBack(@PathVariable("plateNumber") String plateNumber,
@RequestParam(value="rent", required = true)boolean rent) throws Exception{
}
@RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.PUT)
public void rent(@PathVariable("plateNumber") String plateNumber, @RequestParam(value="rent",
required = true)boolean rent, @RequestBody Dates dates){
}
     */

}