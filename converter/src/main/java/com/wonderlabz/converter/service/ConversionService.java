package com.wonderlabz.converter.service;

import com.wonderlabz.converter.model.Conversion;
import com.wonderlabz.converter.repository.ConversionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConversionService {

    private ConversionRepository conversionRepository;

    @Autowired
    public ConversionService(ConversionRepository conversionRepository){
        this.conversionRepository = conversionRepository;
    }

    /*A method which calculates a Celsius to Kelvin conversion*/
    public Double celsiusToKelvin(Double celsius){
        Double kelvin = celsius + 273.15;
        Double roundVal = Math.round(kelvin * 100.0)/100.0;
        Conversion cnv = new Conversion();
        cnv.setConversionType("Celsius To Kelvin");
        cnv.setInputType("Celsius");
        cnv.setInputValue(celsius);
        cnv.setOutputType("Kelvin");
        cnv.setOutputValue(roundVal);
        conversionRepository.save(cnv);
        return cnv.getOutputValue();
    }

    /*A method which calculates a Kelvin to Celsius conversion*/
    public Double kelvinToCelsius(Double kelvin){
        Double celsius = kelvin - 273.15;
        Double roundVal = Math.round(celsius * 100.0)/100.0;
        Conversion cnv = new Conversion();
        cnv.setConversionType("Kelvin To Celsius");
        cnv.setInputType("Kelvin");
        cnv.setInputValue(kelvin);
        cnv.setOutputType("Celsius");
        cnv.setOutputValue(roundVal);
        conversionRepository.save(cnv);
        return cnv.getOutputValue();
    }

    /*A method which calculates a Miles to Kilometre conversion*/
    public Double milesToKilometres(Double miles){
        Double kilometres = miles/0.6214;
        Double roundVal = Math.round(kilometres * 100.0)/100.0;
        Conversion cnv = new Conversion();
        cnv.setConversionType("Miles To Kilometres");
        cnv.setInputType("Miles");
        cnv.setInputValue(miles);
        cnv.setOutputType("Kilometres");
        cnv.setOutputValue(roundVal);
        conversionRepository.save(cnv);
        return cnv.getOutputValue();
    }

    /*A method which calculates a Kilometres to Miles conversion*/
    public Double kilometresToMiles(Double kilometres){
        Double miles = kilometres * 0.6214;
        Double roundVal = Math.round(miles * 100.0)/100.0;
        Conversion cnv = new Conversion();
        cnv.setConversionType("Kilometres To Miles");
        cnv.setInputType("Kilometres");
        cnv.setInputValue(kilometres);
        cnv.setOutputType("Miles");
        cnv.setOutputValue(roundVal);
        conversionRepository.save(cnv);
        return cnv.getOutputValue();
    }

    /*A method which gets a full list of all conversions calculated*/
    public List<Conversion> getAllConversions(){
        return conversionRepository.findAll();
    }
}
