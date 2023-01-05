package furniture_elements.library.elements.WardrobeElements;

import furniture_elements.library.parts.planar.PlainBoardInstance;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Shelves {
    private PlainBoardInstance shelf;
    private int shelfPins = 4;
    private double price;
}
