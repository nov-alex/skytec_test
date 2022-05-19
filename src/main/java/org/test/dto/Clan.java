package org.test.dto;

import java.util.concurrent.atomic.AtomicInteger;

public class Clan {
    private final long clanId;
    private volatile String name;
    private final AtomicInteger gold;

    public Clan(long clanId, String name, int gold) {
        this.clanId = clanId;
        this.name = name;
        this.gold = new AtomicInteger(gold);
    }

    public long getClanId() {
        return clanId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGold() {
        return gold.get();
    }

    public void setGold(int gold) {
        this.gold.set(gold);
    }

    public int incrementGold(int gold) {
        return this.gold.addAndGet(gold);
    }

    public int decrementGold(int gold) {
        return this.gold.addAndGet(-gold);
    }

}
