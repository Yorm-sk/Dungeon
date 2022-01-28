package maps.common;

import maps.dungeon_knight.DungeonKnightMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rooms.common.CommonRoom;

import static org.junit.jupiter.api.Assertions.*;

class CommonMapTest {
    DungeonKnightMap map = new DungeonKnightMap(16);


    @Test
    void goToHiddenRoom(){
        map.nextRoom();
        CommonRoom result = map.goToHiddenRoom();
        assertEquals(17, map.getPositionOfPlayer());
        assertTrue(result.isWasHere());
    }
}