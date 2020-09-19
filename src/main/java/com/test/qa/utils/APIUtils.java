package com.test.qa.utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class APIUtils {

    public static String readBody(String path) {
        String body = "";
        try {
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            body = new String(encoded, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return body;
    }

    public static void printResults(){
        //Print Response
    }

    public static String extractResponse() {
        //Extract Key From Response
        return "";
    }
}
