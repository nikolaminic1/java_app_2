package furniture_elements.library.elements;

import furniture_elements.library.parts.planar.PlainBoardInstance;

public class SlidingDoor {
    public double width;
    public double height;
    public int numberOfDivisions;
    public double sizeOfUpperLowerDivision;
    public double sizeOfMiddleDivision;
    public double price;
    public PlainBoardInstance[] boards;
    public Handles[] handles;
    public Brushes[] brushes;
    public MiddleAluminium[] middleAluminium;
    public Wheels wheels;
    public SlowMotion[] slowMotion;
    public Mirror mirror;
    public boolean doesHaveSlowMotion;
    public boolean doesHaveBrushes;
    public boolean doesHaveMirror;
    public double mirrorWidth;
    public double mirrorHeight;

    public SlidingDoor(
            double width,
            double height,
            double sizeOfUpperLowerDivision,
            double sizeOfMiddleDivision,
            int numberOfDivisions) {
        this.width = width;
        this.height = height;
        this.sizeOfUpperLowerDivision = sizeOfUpperLowerDivision;
        this.sizeOfMiddleDivision = sizeOfMiddleDivision;
        this.numberOfDivisions = numberOfDivisions;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getNumberOfDivisions() {
        return numberOfDivisions;
    }

    public void setNumberOfDivisions(int numberOfDivisions) {
        this.numberOfDivisions = numberOfDivisions;
    }

    public double getSizeOfUpperLowerDivision() {
        return sizeOfUpperLowerDivision;
    }

    public void setSizeOfUpperLowerDivision(double sizeOfUpperLowerDivision) {
        this.sizeOfUpperLowerDivision = sizeOfUpperLowerDivision;
    }

    public double getSizeOfMiddleDivision() {
        return sizeOfMiddleDivision;
    }

    public void setSizeOfMiddleDivision(double sizeOfMiddleDivision) {
        this.sizeOfMiddleDivision = sizeOfMiddleDivision;
    }

    public PlainBoardInstance[] getBoards() {
        return boards;
    }

    public void setBoards(PlainBoardInstance[] boards) {
        this.boards = boards;
    }

    public Handles[] getHandles() {
        return handles;
    }

    public void setHandles(Handles[] handles) {
        this.handles = handles;
    }

    public Brushes[] getBrushes() {
        return brushes;
    }

    public void setBrushes(Brushes[] brushes) {
        this.brushes = brushes;
    }

    public MiddleAluminium[] getMiddleAluminium() {
        return middleAluminium;
    }

    public void setMiddleAluminium(MiddleAluminium[] middleAluminium) {
        this.middleAluminium = middleAluminium;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public SlowMotion[] getSlowMotion() {
        return slowMotion;
    }

    public void setSlowMotion(SlowMotion[] slowMotion) {
        this.slowMotion = slowMotion;
    }

    public Mirror getMirror() {
        return mirror;
    }

    public void setMirror(Mirror mirror) {
        this.mirror = mirror;
    }

    public boolean isDoesHaveSlowMotion() {
        return doesHaveSlowMotion;
    }

    public void setDoesHaveSlowMotion(boolean doesHaveSlowMotion) {
        this.doesHaveSlowMotion = doesHaveSlowMotion;
    }

    public boolean isDoesHaveBrushes() {
        return doesHaveBrushes;
    }

    public void setDoesHaveBrushes(boolean doesHaveBrushes) {
        this.doesHaveBrushes = doesHaveBrushes;
    }

    public boolean isDoesHaveMirror() {
        return doesHaveMirror;
    }

    public void setDoesHaveMirror(boolean doesHaveMirror) {
        this.doesHaveMirror = doesHaveMirror;
    }

    public double getMirrorWidth() {
        return mirrorWidth;
    }

    public void setMirrorWidth(double mirrorWidth) {
        this.mirrorWidth = mirrorWidth;
    }

    public double getMirrorHeight() {
        return mirrorHeight;
    }

    public void setMirrorHeight(double mirrorHeight) {
        this.mirrorHeight = mirrorHeight;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
