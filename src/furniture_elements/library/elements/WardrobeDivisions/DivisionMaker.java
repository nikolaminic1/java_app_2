package furniture_elements.library.elements.WardrobeDivisions;

import com.sun.nio.sctp.IllegalReceiveException;

public class DivisionMaker {


    public static _Divisions makeDivisionFactory(DivisionType type){
        switch (type){
            case LOWER_SHELVES:
                return new Lower_Shelves();
            case UPPER_SHELVES:
                return new Upper_Shelves();
            default:
                throw new IllegalReceiveException();
        }
    }
}
