package furniture_elements.library.elements.WardrobeDivisions;

import furniture_elements.library.elements.WardrobeElements.Shelves;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Upper_Shelves extends _Divisions {
    private int numberOfShelves;
    private List<Shelves> shelves;
}
