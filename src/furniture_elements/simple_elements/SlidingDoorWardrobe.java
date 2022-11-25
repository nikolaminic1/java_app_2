package furniture_elements.simple_elements;

import furniture_elements.library.actions.Carrying;
import furniture_elements.library.actions.Mounting;
import furniture_elements.library.actions.Transport;
import furniture_elements.library.elements.*;
import furniture_elements.library.parts.planar.PlainBoardInstance;

public class SlidingDoorWardrobe  {
    public SimpleBox MainBox;
    public SlidingDoor[] Doors;
    public PlainBoardInstance[] HorizontalBoards;
    public PlainBoardInstance[] VerticalBoards;
    public Shelves[] Shelves;
    public Hangers[] Hangers;
    public DrawerBox[] DrawerBox;
    public Leg[] Legs;
    public Mounting mounting;
    public Transport transport;
    public Carrying carrying;
}
