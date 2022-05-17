package org.test.storage;

import org.test.dto.Clan;

import java.util.HashMap;
import java.util.Map;

public class ClanStorage {

    private final Map<Long, Clan> storage;

    public ClanStorage() {
        this.storage = new HashMap<>();
    }

    public void addClan(Clan clan){
        storage.put(clan.getClanId(), clan);
    }
    public Clan getClan(long id){
        return storage.get(id);
    }
}
