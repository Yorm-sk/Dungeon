package rooms.common;

/**
 * class contain information about what all rooms will have
 */
public abstract class CommonRoom implements RoomFunctions {
    private final char symbol; //to describe it on the map
    private boolean wasHere; //for describing on the map ("?" if player was not in this room)

    public CommonRoom(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public boolean isWasHere() {
        return wasHere;
    }

    public void setWasHere(boolean wasHere) {
        this.wasHere = wasHere;
    }

}
