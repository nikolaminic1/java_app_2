package furniture_elements.library.elements;

import furniture_elements.library.parts.planar.PlainBoardInstance;

public class SimpleBox<width, height, depth> {
    private int width;
    private int depth;
    private int height;
    private double priceOfAssembling;
    private PlainBoardInstance top = new PlainBoardInstance(true, true, true, true);
    private PlainBoardInstance bottom = new PlainBoardInstance(true, true, true, true);
    private PlainBoardInstance left = new PlainBoardInstance(false, true, true, true);
    private PlainBoardInstance right = new PlainBoardInstance(true, true, true, true);
    private PlainBoardInstance back = new PlainBoardInstance(true, true, true, true);
    private boolean isInMiddleHorizontalAssembling = true;
    private boolean isInMiddleVerticalAssembling = false;
    private double totalPrice;

    //    private PlainBoardInstance[] middleHorizontal;
    //    private PlainBoardInstance[] middleVertical;

//    public void setInMiddleHorizontalAssembling(boolean inMiddleHorizontalAssembling) {
//        isInMiddleHorizontalAssembling = inMiddleHorizontalAssembling;
//    }
//
//    public void setInMiddleVerticalAssembling(boolean inMiddleVerticalAssembling) {
//        isInMiddleVerticalAssembling = inMiddleVerticalAssembling;
//    }

    public boolean isInMiddleVerticalAssembling() {
        return isInMiddleVerticalAssembling;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    private double getBoardsPrice() {
        double topPrice = this.top.getTotalPrice();
        double bottomPrice = this.bottom.getTotalPrice();
        double leftPrice = this.left.getTotalPrice();
        double rightPrice = this.right.getTotalPrice();
        double backPrice = this.back.getTotalPrice();
        double totalPrice = topPrice + bottomPrice + leftPrice + rightPrice + backPrice;
        return totalPrice;
    }

    public SimpleBox(double width, double height, double depth) {

        if(isInMiddleHorizontalAssembling){
            assert false;
            this.top.setLength((width - left.getThickness() - right.getThickness()));
            this.top.setWidth(depth);

            this.bottom.setLength((width - left.getThickness() - right.getThickness()));
            this.bottom.setWidth(depth);

            this.left.setLength(height);
            this.left.setWidth(depth);

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

    public void setPriceOfAssembling(double priceOfAssembling) {
        this.priceOfAssembling = priceOfAssembling;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice() {

    }

}
