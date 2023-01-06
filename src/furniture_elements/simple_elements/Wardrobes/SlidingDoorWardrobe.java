package furniture_elements.simple_elements.Wardrobes;

import furniture_elements.library.actions.Carrying;
import furniture_elements.library.actions.Mounting;
import furniture_elements.library.actions.Transport;
import furniture_elements.library.elements.*;
import furniture_elements.library.elements.WardrobeDivisions.DivisionFactory;
import furniture_elements.library.elements.WardrobeDivisions.Lower_Shelves;
import furniture_elements.library.elements.WardrobeDivisions._Divisions;
import furniture_elements.library.elements.WardrobeDoor.SlidingDoor;
import furniture_elements.library.elements.WardrobeElements.Leg;
import furniture_elements.library.elements.WardrobeElements.Rail;
import furniture_elements.library.parts.planar.PlainBoardInstance;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SlidingDoorWardrobe  {
    // dimension
    private int width;
    private int height;
    private int depth;
    private int numberOfDivisionsX;
    private int numberOfDivisionsY;

    // elements
    //box
    private SimpleBox MainBox;

    // inside boards
    private PlainBoardInstance[] HorizontalBoards;
    private PlainBoardInstance[] VerticalBoards;

    private List<_Divisions> divisions;
    private List<SlidingDoor> doors;
    private List<Leg> Legs;
    private Rail upperRail;
    private Rail lowerRail;

    // actions
    private Mounting mounting;
    private Transport transport;
    private Carrying carrying;

    public SlidingDoorWardrobe(int width,
                               int height,
                               int depth,
                               int numberOfDivisionsX,
                               int numberOfDivisionsY) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.numberOfDivisionsX = numberOfDivisionsX;
        this.numberOfDivisionsY = numberOfDivisionsY;

    }

    // create and edit division factory to return and add divisions to list of divisions
    public void addDivision(String division){
        DivisionFactory divisionFactory = new DivisionFactory();
        _Divisions lower_shelves = DivisionFactory.createDivision("lower_shelves");
    }

}
