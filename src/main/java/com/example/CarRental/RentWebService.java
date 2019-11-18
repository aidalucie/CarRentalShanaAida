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

        Date begindate = new Date (2019, 02, 15);
        Date enddate = new Date (2019, 04, 15);

        System.out.println(begindate);

        Date begindate2 = new Date (2018, 02, 15);
        Date enddate2 = new Date (2018, 04, 15);

        rents.add( new Rent (1,"Quelquun",begindate,enddate,"33BB44"));
        rents.add( new Rent (2,"Quelquun",begindate2,enddate2,"33AA44"));
    }

    @RequestMapping(value = "/rents/{plateNumber}", method = RequestMethod.GET)
    public Rent rent(@PathVariable("plateNumber") String plateNumber//,
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



    
}
