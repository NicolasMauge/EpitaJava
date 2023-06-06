package org.example.reader;

import com.opencsv.bean.CsvToBean;
import org.example.dto.ProduitDetailsDto;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FileProduitReader implements ItemReader<ProduitDetailsDto> {
    @Autowired
    CsvToBean<ProduitDetailsDto> csvToBean;

    @Override
    public ProduitDetailsDto read() throws Exception, UnexpectedInputException,
                                            ParseException, NonTransientResourceException {
        return csvToBean.iterator().next();
    }
}
