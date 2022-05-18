package org.test.tracker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.test.storage.TrackerDto;
import org.test.storage.TrackerStorage;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class ClanTrackerTest {


    private ClanTracker clanTracker;

    @Mock
    private TrackerStorage trackerStorage;

    @BeforeEach
    public void setUp() {
        clanTracker = new ClanTracker(trackerStorage);
    }

    @Test
    void whenTrackerCreated_thenValidSaved() {
        TrackerDto dto;
        ArgumentCaptor<TrackerDto> trackerDtoCaptor = ArgumentCaptor.forClass(TrackerDto.class);
        long clanId = 1L;
        long userId = 1L;
        int gold = 1;
        clanTracker.trackerClanGold(clanId, userId, gold);
        Mockito.verify(trackerStorage).addTracker(trackerDtoCaptor.capture());
        List<TrackerDto> dtoList = trackerDtoCaptor.getAllValues();
        assertEquals(1, dtoList.size());
        dto = dtoList.get(0);
        assertEquals(clanId, dto.getClanId());
        assertEquals(userId, dto.getUserId());
        assertEquals(gold, dto.getGold());
    }

}