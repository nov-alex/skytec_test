package org.test.storage;

public class TrackerDto {
    private final long clanId;
    private final long userId;
    private final int gold;

    public TrackerDto(long clanId, long userId, int gold) {
        this.clanId = clanId;
        this.userId = userId;
        this.gold = gold;
    }

    public long getClanId() {
        return clanId;
    }

    public long getUserId() {
        return userId;
    }

    public int getGold() {
        return gold;
    }
}
