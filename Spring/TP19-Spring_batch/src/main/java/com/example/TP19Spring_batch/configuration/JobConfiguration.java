package com.example.TP19Spring_batch.configuration;

import com.example.TP19Spring_batch.dto.ProduitInDto;
import com.example.TP19Spring_batch.dto.ProduitOutDto;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableBatchProcessing
public class JobConfiguration {
    StepBuilderFactory stepBuilderFactory;
    Tasklet tasklet;
    ItemReader reader;
    ItemWriter writer;
    ItemProcessor processor;

    public JobConfiguration(StepBuilderFactory stepBuilderFactory, Tasklet tasklet, ItemReader reader, ItemWriter writer, ItemProcessor processor) {
        this.stepBuilderFactory = stepBuilderFactory;
        this.tasklet = tasklet;
        this.reader = reader;
        this.writer = writer;
        this.processor = processor;
    }

    public Step stepExecuteTasklet() {
        return stepBuilderFactory
                .get("execute tasklet")
                //.tasklet(tasklet)
                .<ProduitInDto, ProduitOutDto>chunk(10)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();
    }

    @Bean
    public Job jobCompteur(JobBuilderFactory jobBuilderFactory) {
        return jobBuilderFactory
                .get("jobCompteur")
                .start(stepExecuteTasklet())
                .next(stepExecuteTasklet())
                .build();
    }
}
