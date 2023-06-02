package com.example.TP19Spring_batch.processor;

import com.example.TP19Spring_batch.dto.ProduitInDto;
import com.example.TP19Spring_batch.dto.ProduitOutDto;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;



@Component
public class FileItemProcessor implements ItemProcessor<ProduitInDto, ProduitOutDto> {
    @Override
    public ProduitOutDto process(ProduitInDto produitInDto) throws Exception {
        return new ProduitOutDto(produitInDto.getNom(), produitInDto.getDescription());
    }
}
