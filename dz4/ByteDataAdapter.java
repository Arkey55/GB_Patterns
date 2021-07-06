package ru.romankuznetsov.dz_4;

import java.nio.charset.StandardCharsets;

public class ByteDataAdapter extends StringDataProvider{
    private ByteDataProvider bdp;

    public ByteDataAdapter(ByteDataProvider bdp) {
        this.bdp = bdp;
    }

    @Override
    public String getStringData() {
        return new String(bdp.getByteData(), StandardCharsets.UTF_8);
    }
}
