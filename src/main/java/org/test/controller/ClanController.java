package org.test.controller;

import org.test.dto.Clan;
import org.test.manager.ClanManager;
import org.test.tracker.ClanTracker;

public class ClanController {
    private final ClanManager clanManager;
    private final ClanTracker clanTracker;

    public ClanController(ClanManager clanManager, ClanTracker clanTracker) {
        this.clanManager = clanManager;
        this.clanTracker = clanTracker;
    }

    public void incrementGold(long clanId, long userId, int gold) {
        Clan clan = clanManager.getClan(clanId);
        if (clan != null) {
            clan.incrementGold(gold);
            clanTracker.trackerClanGold(clanId, userId, gold);
        }
    }

    public void decrementGold(long clanId, long userId, int gold) {
        Clan clan = clanManager.getClan(clanId);
        if (clan != null) {
            clan.decrementGold(gold);
            clanTracker.trackerClanGold(clanId, userId, gold);
        }
    }
}
