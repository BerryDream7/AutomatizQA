package ru.netology.service;

import static org.junit.Assert.assertEquals

import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainWithCash() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainCash() {
        CashbackHackService service = new CashbackHackService();
        int amount = 550;
        int actual = service.remain(amount);
        int expected = 450;
        assertEquals(expected, actual);
    }


}