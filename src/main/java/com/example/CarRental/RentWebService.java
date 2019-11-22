package com.example.CarRental;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@RestController
public class RentWebService {



//    SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");


    private List<Rent> rents = new ArrayList<Rent>();

    public RentWebService ()
    {
        try
        {

            SimpleDateFormat simpledate = new SimpleDateFormat("dd/MM/yyyy");

            Date begindate = simpledate.parse("15/02/2018");
            Date enddate = simpledate.parse("15/04/2019");

            Date begindate2 = simpledate.parse("14/07/2017");
            Date enddate2 = simpledate.parse("15/08/2017");


            rents.add( new Rent (1,"Quelquun",begindate,enddate,"33BB44"));
            rents.add( new Rent (2,"Quelquun",begindate2,enddate2,"33AA44"));
        }
        catch (Exception e)
        {

        }


    }

    @RequestMapping(value = "/rents/{plateNumber}", method = RequestMethod.GET)
    public Rent showArent(@PathVariable("plateNumber") String plateNumber//,
                    // @RequestParam(value="rent", required = true)boolean rent,
                     //@RequestBody Date begindate
                     //@RequestBody Date enddate
    )
    {
        Rent loc = null ;

        for ( Rent r : rents)
        {
            if (r.getCarPlateNumber().equals(plateNumber)) loc = r;
        }

        System.out.println(loc);
         return loc;
    }

    @RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void rent(@PathVariable("plateNumber") String plateNumber) throws Exception{
    }

    
}
