package com.walmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class App 
{
    public static void main( String[] args )
    {

        try{

            final String [] animals = {"Wolf","Eagle","Horse"};

                List<String> list = new ArrayList<>();

                for(String name : animals)
                    list.add(name);

                System.out.println("Please enter the names of one of the following animals: " );

                for(int i = 0; i < list.size();i++)
                    System.out.printf("%s " + "\n", list.get(i));

                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                    String input;

                    while((input = br.readLine())!=null)
                        if (input.toLowerCase().equals("wolf")) {

                            Animal animal = new Wolf();
                            animal.sound();
                            animal.move();

                        } else if (input.toLowerCase().equals("eagle")) {

                            Animal  animal = new Eagle();
                            animal.sound();
                            animal.move();

                        } else if (input.toLowerCase().equals("horse")) {

                            Animal  animal = new Horse();
                            animal.sound();
                            animal.move();

                        }

                }catch(IOException io){
                    io.printStackTrace();

            }

        }

    }

