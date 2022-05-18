package org.test.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.test.dto.Clan;
import org.test.manager.ClanManager;
import org.test.tracker.ClanTracker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class ClanControllerTest {

    private ClanController clanController;

    @Mock
    private ClanManager clanManager;

    @Mock
    private ClanTracker clanTracker;

    @Mock
    private Clan clan;

    @BeforeEach
    public void setUp() {
        clanController = new ClanController(clanManager, clanTracker);
        clan = new Clan(1, "Test", -1);
    }

    @Test
    void givenValidClan_whenIncrementGoldAndCreateTracker_thenReturnValid() {
        long clanId = 1L;
        long userId = 1L;
        int gold = 1;
        Mockito.when(clanManager.getClan(anyLong())).thenReturn(clan);
        clanController.incrementGold(clanId, userId, gold);
        Mockito.verify(clanTracker).trackerClanGold(clanId, userId, gold);
        assertEquals(0, clan.getGold());
    }

    @Test
    void givenValidClan_whenDecrementGoldAndCreateTracker_thenReturnValid() {
        long clanId = 1L;
        long userId = 1L;
        int gold = -1;
        Mockito.when(clanManager.getClan(anyLong())).thenReturn(clan);
        clanController.decrementGold(clanId, userId, gold);
        Mockito.verify(clanTracker).trackerClanGold(clanId, userId, gold);
        assertEquals(0, clan.getGold());
    }
}
