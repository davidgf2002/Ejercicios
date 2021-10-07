package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] main) {
        List<Punto> poligono = new ArrayList<>();

        poligono.add(new Punto(2, 0));
        poligono.add(new Punto(4, 3));
        poligono.add(new Punto(1, 4));
        poligono.add(new Punto(1, 2));
        poligono.add(new Punto(0, 1));

        double perimetro = 0;
        for(int i=0; i<= poligono.size(); i++){
            if(i>poligono.size()-1){
                perimetro += poligono.get(i).distancia(poligono.get(i+1));
            }else{
                perimetro += poligono.get(i).distancia(poligono.get(0));
            }
        }

        System.out.println("Perimetro: " + perimetro);
        System.out.println("lado medio: " + perimetro / poligono.size());

    }
}