package maps.dungeon_knight;

import maps.common.CommonMap;
import rooms.common.CommonRoom;
import rooms.dungeon_knight.StartRoom;

/**
 * Realize all map functions for dungeon_knight
 */
public class DungeonKnightMap extends CommonMap {

    public DungeonKnightMap(int size) {
        super(size);
        this.setMap(initializeMap(size));
    }

    @Override
    public void showMap() {
        System.out.println("-------------------------------------");
        CommonRoom[] map = this.getMap();
        for (int i = 0; i < getSize(); i++){
            if (i == 8) System.out.println();
            if (getPositionOfPlayer() == i) System.out.print("-"+ map[i].getSymbol() + "*"+ " " + " ");
            else System.out.print("-"+ map[i].getSymbol() + " "+ " " + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------");
    }

    @Override
    public CommonRoom[] initializeMap(int size) {
        CommonRoom[] result = new CommonRoom[size * 2];
        for (int i = 0; i<result.length; i++){
            result[i] = new StartRoom();
        }
//TODO: fill array with rooms
        return result;
    }
}
