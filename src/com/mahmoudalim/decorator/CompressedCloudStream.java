package com.mahmoudalim.decorator;

public record CompressedCloudStream(Stream stream) implements Stream {

    @Override
    public void write(String data) {
        String compressedData = compress(data);
        stream.write(compressedData);
    }

    private String compress(String data) {
        return data.substring(0, 5);
    }
}
