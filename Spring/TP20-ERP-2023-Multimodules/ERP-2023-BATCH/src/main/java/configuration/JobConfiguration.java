package configuration;

import com.opencsv.CSVReader;
import org.example.domaine.Produit;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;


@Configuration
@EnableBatchProcessing
public class JobConfiguration {

    @Bean
    public CSVReader csvReader() throws FileNotFoundException {
        return new CSVReader(new FileReader(""));
    }

    @Autowired
    StepBuilderFactory stepBuilderFactory;

    @Autowired
    JobBuilderFactory jobBuilderFactory;

    @Autowired
    ItemReader<String[]> itemReader;

    @Autowired
    ItemProcessor<String[], Produit> itemProcessor;

    public Step stepCreateProduct() {
        return stepBuilderFactory
                .get("stepCreateProduct")
                .<String[], Produit>chunk(10)
                .reader(itemReader)
                .processor(itemProcessor)
                .build();
    }
}
