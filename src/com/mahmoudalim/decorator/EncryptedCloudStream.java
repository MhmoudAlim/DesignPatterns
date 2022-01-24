package com.mahmoudalim.decorator;

public record EncryptedCloudStream(Stream stream) implements Stream {

    @Override
    public void write(String data) {
        String encryptedData = encrypt(data);
        stream.write(encryptedData);
    }

    private String encrypt(String data) {
        return "************";
    }
}
