package furniture_elements.simple_elements;

import furniture_elements.library.actions.Carrying;
import furniture_elements.library.actions.Mounting;
import furniture_elements.library.actions.Transport;
import furniture_elements.library.elements.*;
import furniture_elements.library.parts.planar.PlainBoardInstance;

public class SlidingDoorWardrobe  {
    public int width;
    public int height;
    public int depth;
    public int numberOfDivisions;
    public SimpleBox MainBox;
    public SlidingDoor[] Doors;
    public PlainBoardInstance[] HorizontalBoards;
    public PlainBoardInstance[] VerticalBoards;
    public Shelves[] Shelves;
    public Hangers[] Hangers;
    public DrawerBox[] DrawerBox;
    public Leg[] Legs;
    public Rail rail;
    public Mounting mounting;
    public Transport transport;
    public Carrying carrying;

    public SlidingDoorWardrobe(int width, int height, int depth, int numberOfDivisions) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.numberOfDivisions = numberOfDivisions;
    }
}
