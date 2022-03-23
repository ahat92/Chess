package com.company;

public class Board {
    private Piece[][] board = new Piece[8][8];
    public Board(){
        for (int i = 0; i < 8; i++) {
            board[1][i]=new Pawn(this,'w');
        }
        for (int i = 0; i < 8; i++) {
            board[7][i]=new Pawn(this,'b');
        }
    }
    public void printBoardState(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Piece piece=board[i][j];
                if(piece==null){
                    System.out.print("  ");
                } else {
                    System.out.println(piece.getName());
                }
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Board board=new Board();
        board.printBoardState();
    }
}
