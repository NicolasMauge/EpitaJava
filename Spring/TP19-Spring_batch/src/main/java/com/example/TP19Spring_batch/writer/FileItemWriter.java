package com.example.TP19Spring_batch.writer;

import com.example.TP19Spring_batch.dto.ProduitOutDto;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FileItemWriter implements ItemWriter<ProduitOutDto> {
    @Override
    public void write(List<? extends ProduitOutDto> list) throws Exception {
        System.out.println(list.size());
    }
}
