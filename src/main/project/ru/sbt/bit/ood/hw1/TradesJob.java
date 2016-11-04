package ru.sbt.bit.ood.hw1;

import java.util.List;

public class TradesJob {

    private final TradesDAO tradesDAO;
    private final DownloaderTradesFile loader;
    private final Parser parser;

    public TradesJob(TradesDAO tradesDAO, DownloaderTradesFile loader, Parser parser) {
        this.tradesDAO = tradesDAO;
        this.loader = loader;
        this.parser = parser;
    }


    public void run() {
        String filename = loader.downloadTradesFile();
        List<Trade> listoftrades = parser.parse(filename);
        tradesDAO.updateTrades(listoftrades);

    }




}
