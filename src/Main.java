import furniture_elements.library.elements.SimpleBox;
import furniture_elements.library.materials.edgebanding.Edgeband;
import furniture_elements.simple_elements.Wardrobes.SlidingDoorWardrobe;

public class Main {
    public static void main(String[] args){
        // price should update when edgeband is changed
        SlidingDoorWardrobe slidingDoorWardrobe = new SlidingDoorWardrobe(1000, 1000, 1000, 2, 2);
        System.out.println(slidingDoorWardrobe.getDivisions());
    }
}
