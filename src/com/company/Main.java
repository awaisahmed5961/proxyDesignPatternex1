package com.company;

public class Main {

    public static void main(String[] args) {

        Image image = new RealImage("Myfile_10mb.jpg");
        image.display();


        image = new RealImage("Myfile_10mb.jpg");
        image.display();

//        using proxy pattern
        Image proxyImage = new ProxyImage("Myfile_10mb.jpg");

        proxyImage.display();
        System.out.println(" ");
        proxyImage.display();
    }
}
