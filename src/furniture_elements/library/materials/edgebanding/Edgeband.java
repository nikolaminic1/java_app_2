package furniture_elements.library.materials.edgebanding;

public class Edgeband {
    private double thickness;
    private EdgebandMaterial edgebandMaterial;
    private double price;
    private boolean isEdgebanded;

    public Edgeband(double thickness, EdgebandMaterial edgebandMaterial) {
        this.thickness = thickness;
        this.edgebandMaterial = edgebandMaterial;
    }

    public Edgeband(boolean isEdgebanded) {
        this.isEdgebanded = isEdgebanded;
        this.price = getPrice();
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public EdgebandMaterial getEdgebandMaterial() {
        return edgebandMaterial;
    }

    public void setEdgebandMaterial(EdgebandMaterial edgebandMaterial) {
        this.edgebandMaterial = edgebandMaterial;
    }

    public void setIsEdgebanded(boolean edgebanded) {
        this.isEdgebanded = edgebanded;
    }

    public boolean isEdgebanded() {
        return isEdgebanded;
    }

    public double getPrice() {
        if(isEdgebanded){
            return price;
        }
        return 0;
    }
}
