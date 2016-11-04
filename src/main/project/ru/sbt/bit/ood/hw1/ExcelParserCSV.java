package ru.sbt.bit.ood.hw1;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anton on 09.10.16.
 */
public class ExcelParserCSV implements Parser {

    public List<Trade> parse(String filename) {
        try {
            Reader in = new FileReader(filename);
            Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
            List<Trade> listoftrades = new ArrayList<>();
            for (CSVRecord record: records) {
                Trade trade = new Trade(record.toMap());
                listoftrades.add(trade);
            }
            return listoftrades;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("There was an error while parsing CSV file");
        }
    }
}
