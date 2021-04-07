package org.wcci.apimastery.Service;

import org.springframework.stereotype.Service;
import org.wcci.apimastery.Entities.Song;

@Service
public class SongStorage {
    SongRepository songRepository;

    public SongStorage(SongRepository songRepository) {
        this.songRepository = songRepository;
    }
    public Iterable<Song> retrieveAllSong() {
        return songRepository.findAll();
    }
    public void saveSong(Song songToSave) {
        songRepository.save(songToSave);
    }



}
