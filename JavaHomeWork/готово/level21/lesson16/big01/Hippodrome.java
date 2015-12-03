package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by Владислав on 08.05.2015.
 */
public class Hippodrome
{
    private static ArrayList<Horse> horses = new ArrayList<Horse>();
    public static Hippodrome game;
    public ArrayList<Horse> getHorses(){
        return horses;
    }

    public void run() throws InterruptedException{
        for(int i = 0; i < 100; i++){
            move();
            print();
            Thread.sleep(10);
        }
    }
    public void move(){
        for(int i = 0; i < getHorses().size(); i ++){
            getHorses().get(i).move();
        }
    }

    public void print(){
        for(int i = 0; i < getHorses().size(); i++){
            getHorses().get(i).print();

            System.out.println();
            System.out.println();
            System.out.println();
        }
    }

    public Horse getWinner(){
        double maxDistance = 0;
        Horse winner = null;
        for(Horse h : getHorses()){
            if(maxDistance<h.getDistance()){
                maxDistance = h.getDistance();
                winner = h;
            }
        }
        return winner;
    }

    public void printWinner(){
        System.out.println(String.format("Winner is %s!", getWinner().getName()));
    }

    public static void main(String[] args) throws InterruptedException
    {
        game = new Hippodrome();
        game.getHorses().add(new Horse("Zina",3,0));
        game.getHorses().add(new Horse("Jozel",3,0));
        game.getHorses().add(new Horse("Tormoz",3,0));
        game.run();
        game.printWinner();
    }
}
