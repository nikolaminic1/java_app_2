package furniture_elements.simple_elements.Wardrobes;

import furniture_elements.library.actions.Carrying;
import furniture_elements.library.actions.Mounting;
import furniture_elements.library.actions.Transport;
import furniture_elements.library.elements.*;
import furniture_elements.library.elements.WardrobeDivisions.DivisionType;
import furniture_elements.library.elements.WardrobeDivisions._Divisions;
import furniture_elements.library.elements.WardrobeDoor.SlidingDoor;
import furniture_elements.library.elements.WardrobeElements.Leg;
import furniture_elements.library.elements.WardrobeElements.Rail;
import furniture_elements.library.parts.planar.PlainBoardInstance;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

import static furniture_elements.library.elements.WardrobeDivisions.DivisionMaker.makeDivisionFactory;

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
    private int lowerDivisionsHeight;
    private int upperDivisionsHeight;

    //box
    private SimpleBox MainBox;

    // inside boards
    private List<PlainBoardInstance> HorizontalBoards;
    private List<PlainBoardInstance> VerticalBoards;

    private List<_Divisions> divisions = new ArrayList<>();
    private List<SlidingDoor> doors = new ArrayList<>();
    private int numberOfLegs;
    private Rail upperRail;
    private Rail lowerRail;

    private double getPriceOfLegs(){
        return this.getNumberOfLegs() * 35;
    }

    public SlidingDoorWardrobe(int width,
                               int height,
                               int depth,
                               int numberOfDivisionsX,
                               int lowerDivisionsHeight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.numberOfDivisionsX = numberOfDivisionsX;
        this.lowerDivisionsHeight = lowerDivisionsHeight;

        this.getMainBox().setWidth(width);
        this.getMainBox().setHeight(height);
        this.getMainBox().setDepth(depth);

        int widthOfDivision = getDivisionWidth();
        for (var i = 0; i < numberOfDivisionsX; i++){
            var lowerDivision = makeDivisionFactory(DivisionType.LOWER_SHELVES);
            var upperDivision = makeDivisionFactory(DivisionType.UPPER_SHELVES);
            lowerDivision.setXPosition(i);
            lowerDivision.setYPosition(0);
            lowerDivision.setWidth(100);
            lowerDivision.setHeight(100);
            lowerDivision.setDepth(depth - 80);
            this.divisions.add(lowerDivision);

            upperDivision.setXPosition(i);
            upperDivision.setYPosition(1);
            upperDivision.setWidth(100);
            upperDivision.setHeight(100);
            upperDivision.setDepth(depth - 80);
            this.divisions.add(upperDivision);
        }

        this.setNumberOfLegs(6 + (numberOfDivisionsX - 1) * 3 + numberOfDivisionsX);
    }

    public void addDivision(DivisionType division){
        this.divisions.add(makeDivisionFactory(division));
    }

    private int getDivisionWidth(){
        // width minus left and right minus number of divisions and their sides
//        return this.width - 36 - (numberOfDivisionsX - 1) * 36;
        int totalNetWidth = this.width - 36 - (numberOfDivisionsX - 1) * 36;
        if (totalNetWidth % numberOfDivisionsX == 0){
            return totalNetWidth / numberOfDivisionsX;
        } else {
            // return whole numbers after division
            int wholeNumber = totalNetWidth / numberOfDivisionsX;
//            int lastNumber =
            return totalNetWidth;
        }
    }

}
