package com.cybertek.Day17_Ddt_Dataprovider_Pom2;

import com.cybertek.Base.VytrackTestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

public class CreateCalendarEventTests extends VytrackTestBase {

    @Test
    public void allDayEventCheckBoxTest(){
        loginPage.login(ConfigurationReader.getProperty("driver_username"),
                ConfigurationReader.getProperty("driver_password"));
        driver.get("https://qa3.vytrack.com/calendar/event/create");
        assertFalse(createCalendarEventsPage.allDayEventCheckbox.isSelected());

    }

    @Test
    public void repeatCheckBoxTest(){
        loginPage.login(ConfigurationReader.getProperty("driver_username"),
                ConfigurationReader.getProperty("driver_password"));
        driver.get("https://qa3.vytrack.com/calendar/event/create");
        assertFalse(createCalendarEventsPage.repeatCheckbox.isSelected());
    }
}
