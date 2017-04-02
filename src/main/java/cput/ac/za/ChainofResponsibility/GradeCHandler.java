package cput.ac.za.ChainofResponsibility;

/**
 * Created by Mandisi on 4/2/2017.
 */
public class GradeCHandler extends GradeHandler {
    @Override
    public String handleRequest(int request) {
        if(request > 65 & request < 70){
            return "C";
        }else{
            return successor.handleRequest(request);
        }
    }
}
