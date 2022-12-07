package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        JsonParser<Root> jsonParser = new JsonParser<>();
        Root root = jsonParser.parse(Root.class);
        System.out.println(root.toString());
    }


}