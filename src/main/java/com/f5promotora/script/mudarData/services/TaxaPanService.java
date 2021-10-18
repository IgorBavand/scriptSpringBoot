package com.f5promotora.script.mudarData.services;


import com.f5promotora.script.mudarData.models.TaxasPan;
import org.springframework.stereotype.Service;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
@Service
public class TaxaPanService {

    public void ler(){
        String fileName = "src/main/resources/TAXASPAN2.csv";

        try{
            List<TaxasPan> beans = new CsvToBeanBuilder(new FileReader(fileName))
                    .withType(TaxasPan.class)

                    .build()
                    .parse();

            beans.forEach(System.out::println);
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }

}
