package com.volodymyrvolynets;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Person me = new Person("Volodymyr", "Volynets");

        System.out.println(gson.toJson(me));
    }
}
