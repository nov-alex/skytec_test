package org.test.controller;

import org.test.dto.Clan;
import org.test.manager.ClanManager;
import org.test.tracker.ClanTracker;

public class ClanController {
    private final ClanTracker clanTracker;

    public ClanController(ClanTracker clanTracker) {
        this.clanTracker = clanTracker;
    }

    public void incrementGold(long clanId, long userId, int gold) {
        Clan clan = ClanManager.getClan(clanId);
        clan.incrementGold(gold);
        clanTracker.trackerClanGold(clanId, userId, gold);

    }

    public void decrementGold(long clanId, long userId, int gold) {
        Clan clan = ClanManager.getClan(clanId);
        clan.decrementGold(gold);
        clanTracker.trackerClanGold(clanId, userId, gold);
    }
}
