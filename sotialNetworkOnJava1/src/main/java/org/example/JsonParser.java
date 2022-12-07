package org.example;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

public class JsonParser<T> {
    public T parse(Class<T> clazz) {
        Gson jsonParser = new Gson();
        try(FileReader reader = new FileReader("/Users/wherear3y0/IdeaProjects/sotialNetworkOnJava/sotialNetworkOnJava1/json.json")) {

            T Root = jsonParser.fromJson(reader, clazz);
            return Root;
        } catch (IOException e ){
            throw new RuntimeException(e);
        }
    }

}
