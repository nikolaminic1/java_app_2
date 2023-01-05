import furniture_elements.library.elements.SimpleBox;
import furniture_elements.library.materials.edgebanding.Edgeband;

public class Main {
    public static void main(String[] args){
        SimpleBox simpleBox = new SimpleBox(600, 600, 600);
        simpleBox.getTop().getLength1().setEdgebanded(false);
        // price should update when edgeband is changed
        System.out.println(simpleBox.getTop().getLength1().isEdgebanded());
        System.out.println(simpleBox.getTotalPrice());
    }
}
