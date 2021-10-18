package com.f5promotora.script.mudarData.models;


import com.opencsv.bean.CsvBindByName;
import lombok.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaxasPan {

    @CsvBindByName(column = "codigo_banco")
    private Long bancoCodigo;

    @CsvBindByName(column = "tabela_codigo")
    private Long tabelaCodigo;

    @CsvBindByName(column = "tipo_formalizacao")
    private String tipoFormalizacao;

    @CsvBindByName(column = "prazo")
    private String prazo;

    @CsvBindByName(column = "datas")
    private String datas;

    @CsvBindByName(column = "Data Inicio")
    private LocalDate dataInicio;

    @CsvBindByName(column = "Data Fim")
    private LocalDate dataFim;


    @CsvBindByName(column = "Data Ajustar")
    private LocalDate dataAjustar;

}
