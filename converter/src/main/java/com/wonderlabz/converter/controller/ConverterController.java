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

    @GetMapping("/ctok")
    public Double ctok(@RequestParam("celsius") Double celsius){
        return conversionService.celsiusToKelvin(celsius);
    }

    @GetMapping("/ktoc")
    public Double ktoc(@RequestParam("kelvin") Double kelvin){
        return conversionService.kelvinToCelsius(kelvin);
    }

    @GetMapping("/mtok")
    public Double mtok(@RequestParam("miles") Double miles){
        return conversionService.milesToKilometres(miles);
    }

    @GetMapping("/ktom")
    public Double ktom(@RequestParam("kilometres") Double kilometres){
        return conversionService.kilometresToMiles(kilometres);
    }

    @GetMapping("/history")
    public List<Conversion> getHistory(){
        return conversionService.getAllConversions();
    }
}
