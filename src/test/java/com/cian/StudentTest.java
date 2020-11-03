package com.cian;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

public class StudentTest {

    private Student student = new Student("Cian Mc Sweeney", new DateTime("1998-06-10T11:49:56+0000"));

    @Test
    void getStudentUsername(){
        String expectedUsername = "cianmcsweeney22";
        assertEquals(expectedUsername, student.getUsername());
    }
}
