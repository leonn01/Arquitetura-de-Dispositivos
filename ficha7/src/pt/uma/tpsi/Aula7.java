package pt.uma.tpsi;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aula7 {
    public static void main(String[] args) {
        //------------------------------------
        System.out.println("imprimir o enum");

        for(Menu option : Menu.values())
            System.out.println(option);

        //------------------------------------



            for (Menu option : Menu.values()){
                if (option.name()== "START")
                    System.out.println("the game has started");
                else if (option.name()== "SAVEGAME")
                    System.out.println("the game has ben saved");
                else if (option.name()== "LOADGAME")
                    System.out.println("the game has ben loaded");
                else if (option.name()== "HIGHSCORES")
                    System.out.println("the scores of the  game");
                else if (option.name()== "QUIT")
                    System.out.println("the game has ben exited");

                else{
                    System.out.println("Erro pa nao sabes programar");
                }

            }
            for (Menu option : Menu.values()){
            switch (option.name()) {
                case "START":
                    System.out.println("the game has started");
                    break;

                case "SAVEGAME":
                    System.out.println("the game has ben saved");
                    break;

                case "LOADGAME":
                    System.out.println("the game has ben loaded");
                    break;

                case "HIGHSCORES":
                    System.out.println("the scores of the  game");
                    break;

                case "QUIT":
                    System.out.println("the game has ben exited");
                    break;
                default:
                    System.out.println("Erro");
            }

        }
        ///-----------------------------------

        System.out.println("imprimir o array");
            List<Rational> rationals=new ArrayList<>();
            rationals.add(new Rational(1,2));
            rationals.add(new Rational(1,4));
            rationals.add(new Rational(4,2));
            rationals.add(new Rational(5,100));

        System.out.println("imprimir o array desordenado");
            for (Rational element:rationals) {
                System.out.println("\t" + element.toString());
            }

        Collections.sort(rationals);

        System.out.println("imprimir o array ordenado");
        for (Rational element:rationals) {
            System.out.println("\t" + element.toString());
        }


    }
}

