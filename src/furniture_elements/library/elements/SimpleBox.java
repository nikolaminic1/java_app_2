package furniture_elements.library.elements;

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
    private PlainBoardInstance back = new PlainBoardInstance(false, false, false, false);
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
        return getBoardsPrice() + priceOfAssembling;
    }


    public SimpleBox(int width, int height, int depth) {

        if(isInMiddleHorizontalAssembling){
            this.top.setLength((width - left.getThickness() - right.getThickness()));
            this.top.setWidth(depth);

            this.bottom.setLength((width - left.getThickness() - right.getThickness()));
            this.bottom.setWidth(depth);
//
            this.left.setLength(height);
            this.left.setWidth(depth);
//
            this.right.setLength(height);
            this.right.setWidth(depth);

            this.back.setWidth(width);
            this.back.setLength(height);

        } else if (isInMiddleVerticalAssembling){

            this.left.setLength(height - this.top.getThickness() - bottom.getThickness());
            this.left.setWidth(depth);

            this.right.setLength(height - this.top.getThickness() - bottom.getThickness());
            this.right.setWidth(depth);

            this.top.setLength(height);
            this.top.setWidth(depth);

            this.bottom.setLength(height);
            this.bottom.setWidth(depth);

            this.back.setWidth(width);
            this.back.setLength(height);
        }

        this.totalPrice = getBoardsPrice() + priceOfAssembling;
    }


}
