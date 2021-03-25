package org.wcci.apimastery.Service;

import org.springframework.stereotype.Service;
import org.wcci.apimastery.Entities.Song;

@Service
public class SongStorage {
    SongRepository songRepo;

    public SongStorage (SongRepository songRepo) {
        this.songRepo = songRepo;
    }
}
