package configuration;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import dto.ProduitDetailsDto;
import org.example.domaine.Produit;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;


@Configuration
@EnableBatchProcessing
public class JobConfiguration {

    /*@Bean
    public CSVReader csvReader() throws FileNotFoundException {
        return new CSVReader(new FileReader(""));
    }*/

    @Bean
    public CsvToBean<ProduitDetailsDto> csvToBean() throws FileNotFoundException {
        return new CsvToBeanBuilder(new FileReader(""))
                .withType(ProduitDetailsDto.class)
                .build();
    }

    @Autowired
    StepBuilderFactory stepBuilderFactory;

    @Autowired
    JobBuilderFactory jobBuilderFactory;

    @Autowired
    ItemReader<ProduitDetailsDto> itemReader;

    @Autowired
    ItemProcessor<ProduitDetailsDto, Produit> itemProcessor;

    public Step stepCreateProduct() {
        return stepBuilderFactory
                .get("stepCreateProduct")
                .<ProduitDetailsDto, Produit>chunk(10)
                .reader(itemReader)
                .processor(itemProcessor)
                .build();
    }

    public Job createJobProduct() {
        return jobBuilderFactory
                .get("jobCreateProduct")
                .start(stepCreateProduct())
                .build();
    }
}
