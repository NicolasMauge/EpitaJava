package reader;

import com.opencsv.CSVReader;
import org.example.dto.ProduitDetailsDto;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.math.BigDecimal;

@Component
public class FileProduitReader implements ItemReader<String[]> {
    @Autowired
    CSVReader csvReader;

    @Override
    public String[] read() throws Exception, UnexpectedInputException,
                                            ParseException, NonTransientResourceException {
        return csvReader.readNext();
    }
}
