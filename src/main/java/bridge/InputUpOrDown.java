package bridge;

import java.util.*;

public enum
InputUpOrDown {
    Up("U", 1),
    Down("D", 0);

    private String upOrDown;
    private int zeroOrOne;

    private InputUpOrDown(String upOrDown, int zeroOrOne) {
        this.upOrDown = upOrDown;
        this.zeroOrOne = zeroOrOne;
    }

    public static int getZeroOrOne(String upOrDown) {
        return Arrays.stream(InputUpOrDown.values()).filter(inputUpOrDown -> inputUpOrDown.upOrDown.equals(upOrDown)).map(inputUpOrDown -> inputUpOrDown.zeroOrOne).findAny().orElseThrow(() -> new IllegalArgumentException());
    }
}
