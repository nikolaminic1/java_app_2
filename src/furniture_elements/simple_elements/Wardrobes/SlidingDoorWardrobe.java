package furniture_elements.simple_elements.Wardrobes;

import furniture_elements.library.actions.Carrying;
import furniture_elements.library.actions.Mounting;
import furniture_elements.library.actions.Transport;
import furniture_elements.library.elements.*;
import furniture_elements.library.elements.WardrobeDivisions._Divisions;
import furniture_elements.library.elements.WardrobeDoor.SlidingDoor;
import furniture_elements.library.elements.WardrobeElements.Leg;
import furniture_elements.library.elements.WardrobeElements.Rail;
import furniture_elements.library.parts.planar.PlainBoardInstance;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SlidingDoorWardrobe  {
    // dimension
    private int width;
    private int height;
    private int depth;
    private int numberOfDivisions;

    // elements
    //box
    private SimpleBox MainBox;

    // inside boards
    private PlainBoardInstance[] HorizontalBoards;
    private PlainBoardInstance[] VerticalBoards;

    private _Divisions[] _Divisions;
    private SlidingDoor[] Doors;
    private Leg[] Legs;
    private Rail rail;

    // actions
    private Mounting mounting;
    private Transport transport;
    private Carrying carrying;

    public SlidingDoorWardrobe(int width, int height, int depth, int numberOfDivisions) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.numberOfDivisions = numberOfDivisions;
    }
}
