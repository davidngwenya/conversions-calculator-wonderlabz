package com.wonderlabz.converter.controller;

import com.wonderlabz.converter.model.Conversion;
import com.wonderlabz.converter.repository.ConversionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/conversions/")
public class ConverterController {

    @Autowired
    private ConversionRepository conversionRepository;

    @GetMapping("/ctok")
    public String ctok(@RequestParam String celsius){
        double c = (Double.valueOf(celsius)).doubleValue();
        double k = c + 273.15;
        String kelvin = String.valueOf(k);
        Conversion cnv = new Conversion();
        cnv.setConversionType("Celsius To Kelvin");
        cnv.setInputType("Celsius");
        cnv.setInputValue(c);
        cnv.setOutputType("Kelvin");
        cnv.setOutputValue(k);
        conversionRepository.save(cnv);
        return kelvin;
    }

    @GetMapping("/ktoc")
    public String ktoc(@RequestParam String kelvin){
        double k = (Double.valueOf(kelvin)).doubleValue();
        double c = k - 273.15;
        String celsius = String.valueOf(c);
        Conversion cnv = new Conversion();
        cnv.setConversionType("Kelvin To Celsius");
        cnv.setInputType("Kelvin");
        cnv.setInputValue(k);
        cnv.setOutputType("Celsius");
        cnv.setOutputValue(c);
        conversionRepository.save(cnv);
        return celsius;
    }

    @GetMapping("/mtok")
    public String mtok(@RequestParam String miles){
        double m = (Double.valueOf(miles)).doubleValue();
        double km = m/0.6214;
        String kilometres = String.valueOf(km);
        Conversion cnv = new Conversion();
        cnv.setConversionType("Miles To Kilometres");
        cnv.setInputType("Miles");
        cnv.setInputValue(m);
        cnv.setOutputType("Kilometres");
        cnv.setOutputValue(km);
        conversionRepository.save(cnv);
        return kilometres;
    }

    @GetMapping("/ktom")
    public String ktom(@RequestParam String kilometres){
        double km = (Double.valueOf(kilometres)).doubleValue();
        double m = km * 0.6214;
        String miles = String.valueOf(m);
        Conversion cnv = new Conversion();
        cnv.setConversionType("Kilometres To Miles");
        cnv.setInputType("Kilometres");
        cnv.setInputValue(km);
        cnv.setOutputType("Miles");
        cnv.setOutputValue(m);
        conversionRepository.save(cnv);
        return miles;
    }

    @GetMapping("/history")
    public List<Conversion> getHistory(){
        return conversionRepository.findAll();
    }
}
