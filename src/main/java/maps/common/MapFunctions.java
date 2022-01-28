package maps.common;

import rooms.common.CommonRoom;
/**
 * Describe methods that all maps will have
 * **/

public interface MapFunctions {
    /**
     *  Show map to player
     * **/
    void showMap();

    /**
     * Return next object 'Room' in arrays of Rooms
     */
    CommonRoom nextRoom();

    /**
     * Create array with rooms inside
     * @param size of an array to initialize
     * @return initialized array
     */
    CommonRoom [] initializeMap(int size);

    /**
     * @return previous object "Room" in arrays of Rooms
     */
    CommonRoom previousRoom();

    /**
     * @return special room that almost every common room will lead to
     */
    CommonRoom goToHiddenRoom();

}
