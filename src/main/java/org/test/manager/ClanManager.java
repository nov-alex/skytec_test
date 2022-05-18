package org.test.manager;

import org.test.dto.Clan;
import org.test.storage.ClanStorage;

public class ClanManager {

    private final ClanStorage clanStorage;

    public ClanManager(ClanStorage clanStorage) {
        this.clanStorage = clanStorage;
    }

    public Clan getClan(long clanId) {
        return clanStorage.getClan(clanId);
    }

    public boolean saveClan(long clanId) {
        return clanStorage.saveClan(clanId);
    }

}
