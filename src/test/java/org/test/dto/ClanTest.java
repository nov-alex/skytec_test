package org.test.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClanTest {

    @Test
    void testIncAndDecWorkProperly() {
        Clan clan = new Clan(1, "Test", 1);
        assertEquals(0, clan.decrementGold(1));
        assertEquals(0, clan.getGold());
        assertEquals(2, clan.incrementGold(2));
        assertEquals(2, clan.getGold());
        clan.setGold(-10);
        assertEquals(-10, clan.decrementGold(0));
    }
}