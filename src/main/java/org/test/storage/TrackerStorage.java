package org.test.storage;

import java.util.ArrayList;
import java.util.List;

public class TrackerStorage {
    private final List<TrackerDto> tracker;

    public TrackerStorage(List<TrackerDto> clanStorage) {
        this.tracker = new ArrayList<>();
    }

    public void addTracker(TrackerDto trackerDto){
        tracker.add(trackerDto);
    }
}
