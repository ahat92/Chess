package com.company;

import java.util.ArrayList;

public class King extends Piece{
    public King(Board board, char color) {
        super(board, color,'k');
    }

    public ArrayList<Move> getMoves() {
        return null;
    }

    public boolean isLegal(Move move) {
        return false;
    }
}
