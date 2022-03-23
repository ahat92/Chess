package com.company;

import java.util.ArrayList;

public class Pawn extends Piece{

    public Pawn(Board board, char color) {
        super(board, color, 'p');
    }

    public ArrayList<Move> getMoves() {
        return null;
    }

    public boolean isLegal(Move move) {
        return false;
    }
}
