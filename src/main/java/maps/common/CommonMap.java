package maps.common;

import rooms.common.CommonRoom;
/**
 * Class contain main information about map
 */
public abstract class CommonMap implements MapFunctions {
    private CommonRoom[] map; // here rooms will be dislocated
    private int size; // set a basic size of a map without specials rooms
    private int positionOfPlayer;


    public CommonMap(int size) {
        this.size = size;
        this.positionOfPlayer = 0;
    }

    /**
     * move to the next index of an array and change position of player
     * @return room in it
     */
    @Override
    public CommonRoom nextRoom(){
        ++positionOfPlayer;
        if (!map[positionOfPlayer].isWasHere()) map[positionOfPlayer].setWasHere(true);
        return map[positionOfPlayer];
    }

    /**
     * move to the previous index of an array and change position of player
     * @return room in it
     */
    @Override
    public CommonRoom previousRoom() {
        return map[--positionOfPlayer];
    }

    /**
     * almost each room have a special room, that located on basic map size + room position index of array
     * method change position of player
     * @return room in this position
     */
    @Override
    public CommonRoom goToHiddenRoom() {
        positionOfPlayer += size;
        if (!map[positionOfPlayer].isWasHere()) map[positionOfPlayer].setWasHere(true);
        return map[positionOfPlayer];
    }

    public CommonRoom[] getMap() {
        return map;
    }

    public void setMap(CommonRoom[] map) {
        this.map = map;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPositionOfPlayer() {
        return positionOfPlayer;
    }

    public void setPositionOfPlayer(int positionOfPlayer) {
        this.positionOfPlayer = positionOfPlayer;
    }
}
