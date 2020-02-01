import java.util.Arrays;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blake046
 */
public class TikTac {
    
    public static int bs=3;
    public static int x=0;
 static char[][] board= new char[bs][bs];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
for(int i=0;i<bs;i++)
{
    for(int w=0;w<bs;w++)
    {
 board[i][w]=' ';
    }
}

        // TODO code application logic here
while(x!=9)
{
    printboard();
Player1();
x++;
printboard();
if(x==9)
{
    System.out.println("Draw, you suck");
    return;
}
    Player2();
    x++;
    
}
    }
    public static void printboard()
    {
       System.out.println(" _________________");
        System.out.println("|  "+ board[0][0]+"  |  "+board[0][1]+"  |  "+board[0][2]+"  |");
        System.out.println("|_____|_____|_____|");
        System.out.println("|  "+ board[1][0]+"  |  "+board[1][1]+"  |  "+board[1][2]+"  |");
        System.out.println("|_____|_____|_____|");
        System.out.println("|  "+ board[2][0]+"  |  "+board[2][1]+"  |  "+board[2][2]+"  |");
     System.out.println("|_____|_____|_____|");
    }
    public static void Player1()
    {
        System.out.println("enter the numbers 1-9 to select a row and column from left to right from top to bottom");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        switch(num)
        {
            case 1:
                if(board[0][0]==' ')
                {
                board[0][0]='X';
                break;
                return;
                }
            else
                    Player1();
                return;
            case 2:
                if(board[0][1]==' ')
                {
                board[0][1]='X';
                break;
                return;
                }
            else
                    Player1();
                return;
            case 3:
                if(board[0][2]==' ')
                {
                board[0][2]='X';
                break;
                return;
                }
            else
                    Player1();
                return;
            case 4:
                if(board[1][0]==' ')
                {
                board[1][0]='X';
                break;
                return;
                }
            else
                    Player1();
                return;
            case 5:
                if(board[1][1]==' ')
                {
                board[1][1]='X';
                break;
                return;
                }
            else
                    Player1();
                return;
            case 6:
                if(board[1][2]==' ')
                {
                board[1][2]='X';
                break;
                return;
                }
            else
                    Player1();
                return;
            case 7: 
                if(board[2][0]==' ')
                {
                board[2][0]='X';
                break;
                return;
                }
            else
                    Player1();
                return;
            case 8:
                if(board[2][1]==' ')
                {
                board[2][1]='X';
                break;
                return;
                }
            else
                    Player1();
                return;
            case 9:
                if(board[2][2]==' ')
                {
                board[2][2]='X';
                break;
                return;
                }
            else
                    Player1();
                return;
        }
    }
    public static void Player2()
    {
        System.out.println("enter the numbers 1-9 to select a row and column from left to right from top to bottom");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        switch(num)
        {
            case 1:
                if(board[0][0]==' ')
                {
                board[0][0]='O';
                break;
                return;
                }
            else
                   Player2();
                return;
            case 2:
                if(board[0][1]==' ')
                {
                board[0][1]='O';
                break;
                return;
                }
            else
                    Player2();
                return;
            case 3:
                if(board[0][2]==' ')
                {
                board[0][2]='O';
                break;
                return;
                }
            else
                    Player2();
                return;
            case 4:
                if(board[1][0]==' ')
                {
                board[1][0]='O';
                break;
                return;
                }
            else
                    Player2();
                return;
            case 5:
                if(board[1][1]==' ')
                {
                board[1][1]='O';
                break;
                return;
                }
            else
                    Player2();
                return;
            case 6:
                if(board[1][2]==' ')
                {
                board[1][2]='O';
                break;
                return;
                }
            else
                    Player2();
                return;
            case 7: 
                if(board[2][0]==' ')
                {
                board[2][0]='O';
                break;
                return;
                }
            else
                    Player2();
                return;
            case 8:
                if(board[2][1]==' ')
                {
                board[2][1]='O';
                break;
                return;
                }
            else
                    Player2();
                return;
            case 9:
                if(board[2][2]==' ')
                {
                board[2][2]='O';
                break;
                return;
                }
            else
                    Player2();
                return;
        } 
    }
}

