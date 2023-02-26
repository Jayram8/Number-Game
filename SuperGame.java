package com.company;
import java.util.Random;
import java.util.Scanner;

class Game
{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses()
    {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses)
    {
        this.noOfGuesses = noOfGuesses;
    }

    Game()
    {
        Random rand = new Random();
        this.number =rand.nextInt(100);
    }
    void takeuserinput()
    {
        System.out.println("Guess the Number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean iscorrectnumber()
    {
        noOfGuesses++;
        if(inputNumber==number)
        {
            System.out.format("Yes, You guessed right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber < number)
        {
            System.out.println("Too Low...");
        }
        else if(inputNumber > number)
        {
            System.out.println("Too High...");
        }
        return false;
    }
}

public class SuperGame
{
    public static void main(String[] args)
    {
        Game g = new Game();
        boolean b = false;
        while(!b)
        {
            g.takeuserinput();
            b = g.iscorrectnumber();
        }
    }
}