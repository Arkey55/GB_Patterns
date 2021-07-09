package ru.romankuznetsov.dz_5;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        CompressStrategy compressStrategy = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File("...");

        System.out.println("1 - zip \n2 - 7z");
        String strategy = reader.readLine();

        if (strategy.equals("1")) compressStrategy = new ZipCompressStrategy();
        else if (strategy.equals("2")) compressStrategy = new SevenZCompressStrategy();
        else System.out.println("sww");

        if (compressStrategy != null) compressStrategy.compress(file);
    }
}