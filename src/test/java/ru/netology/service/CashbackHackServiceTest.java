package ru.netology.service;

//import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

//import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {

    @Test
    void calculateCashback() {


        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = 100;
        int expected = service.remain(amount);


        assertEquals(actual, expected);
    }

    @Test
    void calculateCashback800() {

        CashbackHackService service = new CashbackHackService();
        int amount = 700;
        int actual = 300;
        int expected = service.remain(amount);


        assertEquals(actual, expected);
    }

    @Test
    void calculateCashback1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = 0;
        int expected = service.remain(amount);


        assertEquals(actual, expected);
    }
}
