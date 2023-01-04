package furniture_elements.simple_elements;

import furniture_elements.library.actions.Carrying;
import furniture_elements.library.actions.Mounting;
import furniture_elements.library.actions.Transport;
import furniture_elements.library.elements.*;
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
    public int width;
    public int height;
    public int depth;
    public int numberOfDivisions;
    public SimpleBox MainBox;
    public SlidingDoor[] Doors;
    public PlainBoardInstance[] HorizontalBoards;
    public PlainBoardInstance[] VerticalBoards;
    public furniture_elements.library.elements.WardrobeDivisions.Divisions[] Divisions;
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
