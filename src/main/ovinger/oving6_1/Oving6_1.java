package oving6_1;

import java.util.Arrays; // importerer array
import java.util.Random; // importerer random generator

public class Oving6_1 { //std


    public static void main(String args[]) { //std

        int[] list = new int[10]; //henter inn en liste med 10 siffer
        Random rand = new Random(); //henter inn random tall

        for(int i = 0; i < 1000; i++) { //kjører en løkke som starter ved 0, kjører 1000 ganger og legger på en for hvert sted

            int randomNumber = rand.nextInt(10); //henter ut random nummer
            list[randomNumber]++; //tar nummeret inn i listen vi laget ovenfor

        }
        int listLength = 0; // listelengden er 0
        for(int i=0;i < list.length; i++){ //lager en løkke som starter ved 0, kjører til listlength og legger på en for hvert steg
            listLength+=list[i]; // henter antall i hver index i listen vår og plusser på listlength
        }

        System.out.println(Arrays.toString(list)); //print
        System.out.println(listLength); //print

    }

}