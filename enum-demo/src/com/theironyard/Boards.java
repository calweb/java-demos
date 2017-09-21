package com.theironyard;

/**
 * Created by calvinwebster on 9/21/17.
 */
public enum Boards {

    SURFBOARD (true), SKATEBOARD (false), WAKEBOARD (true), SNOWBOARD (true);

    private boolean isOnWater;
    Boards(boolean isOnWater) {

        this.isOnWater = isOnWater;
    }

    public boolean isOnWater() {
        return isOnWater;
    }
}
