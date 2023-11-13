package com.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {
        Person person = new Person("Egor", "Sivenko", 17);
        String json = getPersonJson(person);
        System.out.println(json);
    }

    public static String getPersonJson(Person person) {
        return gson.toJson(person);
    }
}
