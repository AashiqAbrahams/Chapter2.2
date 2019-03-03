package com.walmers;

import com.walmers.Interfaces.Move;
import com.walmers.Interfaces.Sound;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class App 
{
    public static void main( String[] args )
    {

        try{

//            final String [] animals = {"Wolf","Eagle","Horse"};
//
//                List<String> list = new ArrayList<>();
//
//                for(String name : animals)
//                    list.add(name);
//
//                System.out.println("Please enter the names of one of the following animals: " );
//
//                for(int i = 0; i < list.size();i++)
//                    System.out.printf("%s, ", list.get(i));


                    System.out.println("Enter Wolf, Horse or Eagle to see their move and sound action...");
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                    String input;

                    while((input = br.readLine())!=null)
                        if (input.toLowerCase().equals("wolf")) {

                            Animal animal = new Wolf();
                            doSpeak(animal);
                            doMove(animal);


                        } else if (input.toLowerCase().equals("eagle")) {

                            Animal  animal = new Eagle();
                            doSpeak(animal);
                            doMove(animal);

                        } else if (input.toLowerCase().equals("horse")) {

                            Animal  animal = new Horse();
                            doSpeak(animal);
                            doMove(animal);

                }
                }catch(IOException io){
                    io.printStackTrace();

            }
            //removing dependency

            private static void doMove(Move mover){

                System.out.println(mover.move());
            }

            private static void doSpeak(Sound speak){

                System.out.println(speak.sound());
            }
        }

    }

