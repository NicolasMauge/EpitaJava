package com.lafabrique.ERP.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DevisMinDto {
    private Long id;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;
    private ClientDetailDto clientDetailDto;
    private BigDecimal totalPriceVAT;

    public DevisMinDto(Long id, LocalDate date, ClientDetailDto clientDetailDto, BigDecimal totalPriceVAT) {
        this.id = id;
        this.date = date;
        this.clientDetailDto = clientDetailDto;
        this.totalPriceVAT = totalPriceVAT;
    }

    public DevisMinDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public ClientDetailDto getClientDetailDto() {
        return clientDetailDto;
    }

    public void setClientDetailDto(ClientDetailDto clientDetailDto) {
        this.clientDetailDto = clientDetailDto;
    }

    public BigDecimal getTotalPriceVAT() {
        return totalPriceVAT;
    }

    public void setTotalPriceVAT(BigDecimal totalPriceVAT) {
        this.totalPriceVAT = totalPriceVAT;
    }
}
