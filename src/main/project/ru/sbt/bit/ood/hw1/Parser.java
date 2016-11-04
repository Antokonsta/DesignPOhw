package ru.sbt.bit.ood.hw1;

import org.apache.commons.csv.CSVRecord;

import java.util.List;

public interface Parser {
    List<Trade> parse(String filename);
}
