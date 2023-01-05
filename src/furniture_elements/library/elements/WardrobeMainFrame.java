package furniture_elements.library.elements;

import furniture_elements.library.parts.planar.HDF;
import furniture_elements.library.parts.planar.PlainBoardInstance;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WardrobeMainFrame {
    private double width;
    private double depth;
    private double height;
    private double priceOfAssembling;
    private PlainBoardInstance top = new PlainBoardInstance(false, false, false, false);
    private PlainBoardInstance bottom = new PlainBoardInstance(false, false, false, false);
    private PlainBoardInstance left = new PlainBoardInstance(false, false, false, false);
    private PlainBoardInstance right = new PlainBoardInstance(false, false, false, false);
    private HDF back = new HDF();
    private boolean isInMiddleHorizontalAssembling;
    private boolean isInMiddleVerticalAssembling;
    private double totalPrice;
}
