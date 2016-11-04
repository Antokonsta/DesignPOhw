package ru.sbt.bit.ood.hw1;

import java.util.Collection;
import java.util.List;

public class TradesDAO {

    public Collection<Trade> findAll() {
        // read all records from database
        return null;
    }

    public void deleteAll() {
        // remove all records from database
    }

    public void save(Trade trade) {
        // save Trade in database
    }
    public void updateTrades(List<Trade> listoftrades) {
        deleteAll();
        for (Trade trade : listoftrades) {
            save(trade);
        }
    }
}
