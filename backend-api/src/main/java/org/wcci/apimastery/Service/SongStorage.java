package org.wcci.apimastery.Service;

import org.springframework.stereotype.Service;
import org.wcci.apimastery.Entities.Song;

@Service
public class SongStorage {

     private SongRepository songRepository;

    public SongStorage(SongRepository songRepository) {
        this.songRepository = songRepository;
    }
    public Iterable<Song> retrieveAllSongs() {
        return songRepository.findAll();
    }

    public Song retrieveSongById(Long id){
        return songRepository.findById(id).get();
    }

    public void deleteSongByID(Long id){
        songRepository.deleteById(id);
    }

    public void saveSong(Song songToSave){
        songRepository.save(songToSave);
    }

}
