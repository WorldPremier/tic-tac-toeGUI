package com.tts;
import java.util.*;


public class TicTacToeClass
{
    // Instance Variables
    private char[][] board;
    private int turns;



    // Constructors
    public TicTacToeClass()
    {
        board = new char[3][3];
        turns = 0;

        for ( int r=0; r<3; r++ )
            for ( int c=0; c<3; c++ )
                board[r][c] = ' ';
    }

    public boolean isWinner( char p )
    {
        //rows
        if(board[0][0] == p && board[0][1] == p && board[0][2] == p) {
            return true;
        }
        else if(board[1][0] == p && board[1][1] == p && board[1][2] == p) {
            return true;
        }
        else if(board[2][0] == p && board[2][1] == p && board[2][2] == p) {
            return true;
        }
        //columns
        else if(board[0][0] == p && board[1][0] == p && board[2][0] == p) {
            return true;
        }
        else if(board[0][1] == p && board[1][1] == p && board[2][1] == p) {
            return true;
        }
        else if(board[0][2] == p && board[1][2] == p && board[2][2] == p) {
            return true;
        }
        //diagonals
        else if(board[0][0] == p && board[1][1] == p && board[2][2] == p) {
            return true;
        }
        else if(board[0][2] == p && board[1][1] == p && board[2][0] == p) {
            return true;
        }
        return false;
    }


    public boolean isFull(){
        int k = 0;
        for(int i = 0; i <= 2; i++){
            for(int j = 0; j <= 2; j++){
                if(board[i][j] != ' '){
                    k++;
                }
            }
        }
        return k == 9; //if the board is full and they are all filled. It will return 9 which is true.
    }



//    public boolean isFull()
//    {
//        return false;
//    }

    public boolean isCat()
    {
        if(isWinner('X') || isWinner('O')) {
            return false;
        }
        else if(isFull()) {
            return !isWinner('X') || !isWinner('O');
        }
        return false;
    }

    public boolean isValid( int r, int c )
    {
        if ( 0 <= r && r <= 2 && 0 <= c && c <= 2 )
            return true;
        else
            return false;
    }

    public int numTurns()
    {
        return turns;
    }

    public char playerAt( int r, int c )
    {
        if ( isValid(r,c) )
            return board[r][c];
        else
            return '@';
    }

    public void displayBoard()
    {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    // Modifiers
    public void playMove( char p, int r, int c )
    {
        if(r == 0 && c == 0){
            board[0][0] = p;
        }else if(r == 0 && c == 1){
            board[0][1] = p;
        }else if(r == 0 && c == 2){
            board [0][2] = p;
        }else if (r == 1 && c == 0){
            board[1][1] = p;
        }else if(r == 1 && c == 1){
            board[2][0] = p;
        }else if (r == 1 && c == 2){
            board[1][2] = p;
        }else if(r == 2 && c == 0){
            board[2][1] = p;
        }else if(r == 2 && c == 1){
            board[2][1] = p;
        }else if(r == 2 && c == 2){
            board[2][2] = p;
        }

    }

}