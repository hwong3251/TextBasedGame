package game;

import people.Person;
import rooms.Room;

import java.util.Scanner;

import utilities.Utilities;

public class GameRunner {

    public static void main (String[] args)
    {
        Room[][] map = new Room[5][5];
        for (int j = 0; j<map.length; j++)
        {
        	Room[] row = map[j];
            for (int i = 0; i<row.length;i++)
            {
                Person[] people = {};
            }

        }
        boolean gameOn = true;
        Person player1 = Person.createPerson();
        Scanner in= new Scanner(System.in);
        while(gameOn)
        {
            System.out.println("Welcome to the Halls of Tech, " + Person.getFirstName());
            gameOn = false;
        }
		in.close();
    }

}



