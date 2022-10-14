package com.spring.hotelmngt;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.spi.MappingContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class HotelMngtApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelMngtApplication.class, args);
    }

    @Bean
    public ModelMapper getModel() {
        ModelMapper mapper = new ModelMapper();
        Converter<String, LocalDate> converter = new Converter<String, LocalDate>() {
            @Override
            public LocalDate convert(MappingContext<String, LocalDate> mappingContext) {
                DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                LocalDate date = LocalDate.parse(mappingContext.getSource(), format);
                return date;
            }
        };
        mapper.addConverter(converter);
        return mapper;
    }






}
