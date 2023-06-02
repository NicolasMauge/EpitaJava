package com.example.TP19Spring_batch.reader;

import com.example.TP19Spring_batch.dto.ProduitInDto;
import org.springframework.batch.item.ItemReader;
import org.springframework.stereotype.Component;


@Component
public class FileItemReader implements ItemReader<ProduitInDto> {

    @Override
    public ProduitInDto read() throws Exception {
        return new ProduitInDto("nomProduit", "lorem ipsum");
    }
}
