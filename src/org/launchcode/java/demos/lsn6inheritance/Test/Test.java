package org.launchcode.java.demos.lsn6inheritance.Test;

import org.launchcode.java.demos.technology.LapTop;

import static org.junit.Assert.assertEquals;

public class Test {

    //LapTop lapTop5 = new LapTop();

    @org.junit.Test
    public void checkIfLapTopChildOfComputer() {
        LapTop lapTop5 = new LapTop();
        assertEquals("normal", lapTop5.getSize());
    }
}
