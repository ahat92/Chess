package com.company;

import java.util.ArrayList;

abstract class Piece {
    private final Board board;
    private final char color;
    private final char name;
    private int id;
    private static int idIncrement;

    public Piece(Board board,char color, char name){
        this.color=color;
        this.board=board;
        this.name=name;
        this.id=Piece.idIncrement;
        Piece.idIncrement++;
    }
    public abstract ArrayList<Move> getMoves();
    public abstract boolean isLegal(Move move);
    public char getName(){
        return name;
    }
}
