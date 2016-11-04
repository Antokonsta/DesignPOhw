package ru.sbt.bit.ood.hw1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anton on 04.11.16.
 */
public class FakeParser implements Parser {
    @Override
    public List<Trade> parse(String filename) {
        System.out.println("File parsed successfully");
        List<Trade> tr = new ArrayList<>();
        return tr;
    }
}
