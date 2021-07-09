package ru.romankuznetsov.dz_5;

import java.io.File;

public class SevenZCompressStrategy implements CompressStrategy {

    @Override
    public void compress(File file) {
        System.out.println("7z compression");
    }
}
