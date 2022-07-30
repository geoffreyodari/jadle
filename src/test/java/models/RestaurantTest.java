package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaurantTest {
    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void getNameReturnsCorrectName() throws Exception {
        Restaurant testRestaurant = setupRestaurant();
        assertEquals("Fish Witch", testRestaurant.getName());
    }

    @Test
    public void getAddressReturnsCorrectAddress() throws Exception {
        Restaurant testRestaurant = setupRestaurant();
        assertEquals("214 NE Broadway", testRestaurant.getAddress());
    }

    @Test
    public void getZipReturnsCorrectZip() throws Exception {
        Restaurant testRestaurant = setupRestaurant();
        assertEquals("97232", testRestaurant.getZipcode());
    }
    @Test
    public void getPhoneReturnsCorrectPhone() throws Exception {
        Restaurant testRestaurant = setupRestaurant();
        assertEquals("503-402-9874", testRestaurant.getPhone());
    }

    @Test
    public void getWebsiteReturnsCorrectWebsite() throws Exception {
        Restaurant testRestaurant = setupAltRestaurant();
        assertEquals("no website listed", testRestaurant.getWebsite());
    }

    @Test
    public void getEmailReturnsCorrectEmail() throws Exception {
        Restaurant testRestaurant = setupAltRestaurant();
        assertEquals("no email available", testRestaurant.getEmail());
    }


    public Restaurant setupRestaurant (){
        return new Restaurant("Fish Witch", "214 NE Broadway", "97232", "503-402-9874", "http://fishwitch.com", "hellofishy@fishwitch.com");
    }
    public Restaurant setupAltRestaurant (){
        return new Restaurant("Fish Witch", "214 NE Broadway", "97232", "503-402-9874");
    }
}
