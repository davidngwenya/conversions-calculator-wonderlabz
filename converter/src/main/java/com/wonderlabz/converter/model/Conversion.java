package com.wonderlabz.converter.model;

import javax.persistence.*;

@Entity
@Table(name = "conversions")
public class Conversion {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "conversion_type")
        private String conversionType;

        @Column(name = "input_type")
        private String inputType;

        @Column(name = "input_value")
        private Double inputValue;

        @Column(name = "output_type")
        private String outputType;

        @Column(name = "output_value")
        private Double outputValue;

        public Conversion(){}

        public  Conversion(String conversionType, String inputType, Double inputValue, String outputType, Double outputValue){
            super();
            this.conversionType = conversionType;
            this.inputType = inputType;
            this.inputValue = inputValue;
            this.outputType = outputType;
            this.outputValue = outputValue;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getConversionType() {
            return conversionType;
        }

        public void setConversionType(String conversionType) {
            this.conversionType = conversionType;
        }

        public String getInputType() {
            return inputType;
        }

        public void setInputType(String inputType) {
            this.inputType = inputType;
        }

        public Double getInputValue() {
            return inputValue;
        }

        public void setInputValue(Double inputValue) {
            this.inputValue = inputValue;
        }

        public String getOutputType() {
            return outputType;
        }

        public void setOutputType(String outputType) {
            this.outputType = outputType;
        }

        public Double getOutputValue() {
            return outputValue;
        }

        public void setOutputValue(Double outputValue) {
            this.outputValue = outputValue;
        }
}
