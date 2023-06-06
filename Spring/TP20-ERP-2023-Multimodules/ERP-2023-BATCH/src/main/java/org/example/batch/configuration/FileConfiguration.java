package org.example.batch.configuration;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.example.batch.dto.ProduitDetailsDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;

@Configuration
public class FileConfiguration {
    @Bean
    public CsvToBean<ProduitDetailsDto> csvToBean() throws FileNotFoundException {
        return new CsvToBeanBuilder(new FileReader("produits.csv"))
                .withType(ProduitDetailsDto.class)
                .build();
    }
}
