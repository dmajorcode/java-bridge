package bridge;

import java.util.ArrayList;

import static bridge.Application.bridgeLength;

public class UpperBridge extends GeneralBridge{
    static ArrayList<String> upperStatus;
    UpperBridge(String checker){
        this.setChecker(checker);
        upperStatus = new ArrayList<>(bridgeLength);
    }
    void manageInput(String userUpDown, String checkedStatus){

        if(this.checker.equals(userUpDown)){
            upperStatus.add(checkedStatus);
            return;
        };
        upperStatus.add(" ");
        return;
    }
    void printBridge(){
        final String joinUpperBridge = String.join(" | ",upperStatus);
        System.out.printf("[ %s ]\n",joinUpperBridge);
    }
}
