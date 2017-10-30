package board;

import rooms.Room;

public class Board {


    private Room[][] Map;



    public Board(Room[][] Map)
    {
        this.Map = Map;
    }

    public void printMap()
    {
        for(Room[] row : Map)
        {
            for (Room column : row)
            {
                column.print();
            }
            System.out.println();
        }
    }
    public Room[][] getSchoolMap() {
        return Map;
    }

    public void setSchoolMap(Room[][] Map) {
        this.Map = Map;
    }


}
