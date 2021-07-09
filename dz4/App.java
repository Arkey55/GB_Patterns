package ru.romankuznetsov.dz_4;

public class App {
    public static void main(String[] args) {
        String string = "Hello world";
        byte[] bytes = string.getBytes();

        StringDataProvider sdp = new StringDataProvider(string);
        ByteDataProvider bdp = new ByteDataProvider(bytes);
        ByteDataAdapter adapter = new ByteDataAdapter(bdp);

        StringDataConsumer sdc = new StringDataConsumer();
        sdc.doSomethingWithString(sdp.getStringData());
        sdc.doSomethingWithString(adapter.getStringData());
    }
}
