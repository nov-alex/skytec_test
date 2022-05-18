package org.test.tracker;

import org.test.storage.TrackerDto;
import org.test.storage.TrackerStorage;

public class ClanTracker {

    private final TrackerStorage trackerStorage;

    public ClanTracker(TrackerStorage trackerStorage) {
        this.trackerStorage = trackerStorage;
    }

    public void trackerClanGold(long clanId, long userId, int gold) {
        TrackerDto dto = new TrackerDto(clanId, userId, gold);
        trackerStorage.addTracker(dto);
    }
}
