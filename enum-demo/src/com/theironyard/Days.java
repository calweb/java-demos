package com.theironyard;

/**
 * Created by calvinwebster on 9/21/17.
 */
public enum Days {

    SUNDAY (true, "Sunday funday"),
    MONDAY (false, "Manic Mondays"),
    TUESDAY (false, "Better than Monday"),
    WEDNESDAY (false, "Hump Day"),
    THURSDAY (false, "Almost Friday"),
    FRIDAY (false, "Its Friday!"),
    SATURDAY (true, "Its the beginning of the weekend");

    private String status;
    private boolean isWeekend;

    Days(boolean isWeekend, String status) {
        this.isWeekend = isWeekend;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public boolean daysAdjacent (Days otherDay) {
        int difference = Math.abs(this.ordinal() - otherDay.ordinal());
        if (difference <= 1) {
            return true;
        }
        return false;
    }

}
