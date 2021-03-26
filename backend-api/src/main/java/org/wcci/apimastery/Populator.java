package org.wcci.apimastery;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.apimastery.Entities.Album;
import org.wcci.apimastery.Entities.Song;
import org.wcci.apimastery.Service.AlbumStorage;
import org.wcci.apimastery.Service.SongRepository;
import org.wcci.apimastery.Service.SongStorage;

@Component
    public class Populator implements CommandLineRunner {

    private SongRepository songRepository;
    private AlbumStorage albumStorage;

    public Populator(SongRepository songRepository, AlbumStorage albumStorage) {

        this.songRepository = songRepository;
        this.albumStorage = albumStorage;
    }

    @Override
    public void run(String... args) throws Exception {
        Album album1 = new Album("album1" , "Mike");
        albumStorage.saveAlbum(album1);

        Song song1 = new Song("song1");
        songRepository.save(song1);

    }
}


