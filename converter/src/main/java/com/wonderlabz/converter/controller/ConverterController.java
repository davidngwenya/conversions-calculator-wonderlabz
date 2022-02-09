package com.wonderlabz.converter.controller;

import com.wonderlabz.converter.model.Conversion;
import com.wonderlabz.converter.repository.ConversionRepository;
import com.wonderlabz.converter.service.ConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conversions/")
public class ConverterController {

    @Autowired
    private ConversionService conversionService;

    /*The ctok endpoint is calling the conversion service to calculate a Celsius to Kelvin conversion*/
    @GetMapping("/ctok")
    public Double ctok(@RequestParam("celsius") Double celsius){
        return conversionService.celsiusToKelvin(celsius);
    }

    /*The ktoc endpoint is calling the conversion service to calculate a Kelvin to Celsius conversion*/
    @GetMapping("/ktoc")
    public Double ktoc(@RequestParam("kelvin") Double kelvin){
        return conversionService.kelvinToCelsius(kelvin);
    }

    /*The mtok endpoint is calling the conversion service to calculate a Miles to Kilometre conversion*/
    @GetMapping("/mtok")
    public Double mtok(@RequestParam("miles") Double miles){
        return conversionService.milesToKilometres(miles);
    }

    /*The ktom endpoint is calling the conversion service to calculate a Kilometre to Miles conversion*/
    @GetMapping("/ktom")
    public Double ktom(@RequestParam("kilometres") Double kilometres){
        return conversionService.kilometresToMiles(kilometres);
    }

    /*The history endpoint is calling the conversion service to get a history of all convesions calculated by the conversion service.*/
    @GetMapping("/history")
    public List<Conversion> getHistory(){
        return conversionService.getAllConversions();
    }
}
