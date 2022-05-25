package com.example.demo;

import org.springframework.boot.CommandLineRunner;

public class AppStartUp2 implements CommandLineRunner {

    @Override
    public void run(String...args) throws Exception{

        // los parametros los pasaremos directamente desde el terminal cuando ejecutemos el .jar creo jeje
        System.out.println("Hello from the third class");
        for (int i = 0; i < args.length;++i) {
            System.out.println(args[i]);
        }
    }
}
