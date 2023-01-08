package furniture_elements.library.elements;

import furniture_elements.library.materials.edgebanding.Edgeband;
import furniture_elements.library.materials.edgebanding.EdgebandMaterial;
import furniture_elements.library.parts.planar.HDF;
import furniture_elements.library.parts.planar.PlainBoardInstance;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SimpleBox<width, height, depth> {
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

    private double getBoardsPrice() {
        double topPrice = top.getTotalPrice();
        double bottomPrice = bottom.getTotalPrice();
        double leftPrice = left.getTotalPrice();
        double rightPrice = right.getTotalPrice();
        double backPrice = back.getTotalPrice();
        return topPrice + bottomPrice + leftPrice + rightPrice + backPrice;
    }

    public double getTotalPrice(){
        return getBoardsPrice();
    }

    public void setFrontEdgeband(EdgebandMaterial edgebandMaterial){
        this.top.getLength1().setEdgebandMaterial(edgebandMaterial);
        this.left.getLength1().setEdgebandMaterial(edgebandMaterial);
        this.bottom.getLength1().setEdgebandMaterial(edgebandMaterial);
        this.right.getLength1().setEdgebandMaterial(edgebandMaterial);

        this.top.getLength1().setEdgebanded(true);
        this.left.getLength1().setEdgebanded(true);
        this.bottom.getLength1().setEdgebanded(true);
        this.right.getLength1().setEdgebanded(true);
    }

    public void setBackEdgeband(boolean isEdgebanded){
        this.top.getLength2().setEdgebanded(isEdgebanded);
        this.left.getLength2().setEdgebanded(isEdgebanded);
        this.right.getLength2().setEdgebanded(isEdgebanded);
        this.bottom.getLength2().setEdgebanded(isEdgebanded);
    }

    public void setSideEdgebandMaterial(EdgebandMaterial edgebandMaterial){
        this.top.getWidth1().setEdgebandMaterial(edgebandMaterial);
        this.top.getLength2().setEdgebandMaterial(edgebandMaterial);

        this.bottom.getWidth1().setEdgebandMaterial(edgebandMaterial);
        this.bottom.getLength2().setEdgebandMaterial(edgebandMaterial);

        this.top.getWidth1().setEdgebanded(true);
        this.top.getLength2().setEdgebanded(true);

        this.bottom.getWidth1().setEdgebanded(true);
        this.bottom.getLength2().setEdgebanded(true);
    }

    public SimpleBox (int width, int height, int depth) {
        this.back.setHeight(height);
        this.back.setWidth(width);

        if(isInMiddleHorizontalAssembling){
            this.top.setLength((width - left.getThickness() - right.getThickness()));
            this.top.setWidth(depth);

            this.bottom.setLength((width - left.getThickness() - right.getThickness()));
            this.bottom.setWidth(depth);

            this.left.setLength(height);
            this.left.setWidth(depth);

            this.right.setLength(height);
            this.right.setWidth(depth);

        } else if (isInMiddleVerticalAssembling){

            this.left.setLength(height - this.top.getThickness() - bottom.getThickness());
            this.left.setWidth(depth);

            this.right.setLength(height - this.top.getThickness() - bottom.getThickness());
            this.right.setWidth(depth);

            this.top.setLength(height);
            this.top.setWidth(depth);

            this.bottom.setLength(height);
            this.bottom.setWidth(depth);
        }

        this.totalPrice = getBoardsPrice();
    }


}
