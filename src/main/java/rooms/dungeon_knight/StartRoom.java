package rooms.dungeon_knight;

import rooms.common.CommonRoom;

public class StartRoom extends CommonRoom {
    public StartRoom() {
        super('s');
        setWasHere(true);
    }

    @Override
    public void showDescription(String text) {
        //TODO: read file with text
        System.out.println(text);
    }
}
