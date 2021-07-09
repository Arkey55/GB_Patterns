package ru.romankuznetsov.dz_5;

import java.io.File;

public class ZipCompressStrategy implements CompressStrategy {

    @Override
    public void compress(File file) {
        System.out.println("zip compression");
    }
}
