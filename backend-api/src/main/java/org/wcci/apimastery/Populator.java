package org.wcci.apimastery;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.apimastery.Service.AlbumStorage;
import org.wcci.apimastery.Service.ArtistStorage;
import org.wcci.apimastery.Service.SongStorage;

@Component
    public class Populator implements CommandLineRunner {

    private ArtistStorage artistStorage;
    private SongStorage songStorage;
    private AlbumStorage albumStorage;

    public Populator(ArtistStorage artistStorage, SongStorage songStorage, AlbumStorage albumStorage) {
        this.artistStorage = artistStorage;
        this.songStorage = songStorage;
        this.albumStorage = albumStorage;
    }

    @Override
    public void run(String... args) throws Exception {


    }
}


