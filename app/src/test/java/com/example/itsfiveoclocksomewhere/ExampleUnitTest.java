package com.example.itsfiveoclocksomewhere;

import org.junit.Test;
import com.example.itsfiveoclocksomewhere.ui.login.*;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void LoggedInUserViewTest() {

        LoggedInUserView view = new LoggedInUserView("display");

        String dn = view.getDisplayName();

        assertEquals("display", dn);

    }
}