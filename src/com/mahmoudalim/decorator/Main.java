package com.mahmoudalim.decorator;

public class Main {
    public static void main(String[] args) {
        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));

        new EncryptedCloudStream(new CloudStream()).write("3172-8797-3921-0312");
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("3172-8797-3921-0312");
    }
}
