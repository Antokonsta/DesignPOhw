package ru.sbt.bit.ood.hw1;

/**
 * Created by Anton on 04.11.16.
 */
public class FakeDownloaderTradesFile implements DownloaderTradesFile {
    @Override
    public String downloadTradesFile() {
        System.out.println("File downloaded successfully");
        return null;
    }
}
