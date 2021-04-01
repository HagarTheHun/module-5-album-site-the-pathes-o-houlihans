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
        Album album2 = new Album("album2", "Luke");
        albumStorage.saveAlbum(album2);
        Album album3 = new Album("album3", "Keshav");
        albumStorage.saveAlbum(album3);
        Album album4 = new Album("album4", "Cow");
        albumStorage.saveAlbum(album4);
        Album album5 = new Album("album5", "John");
        albumStorage.saveAlbum(album5);
        Album album6 = new Album("album6", "Billy");
        albumStorage.saveAlbum(album6);


        Song song1 = new Song("song1", album1);
        songRepository.save(song1);
        Song song2 = new Song("song2", album1);
        songRepository.save(song2);
        Song song3 = new Song("song3",album3);
        songRepository.save(song3);
        Song song4 = new Song("song4",album4);
        songRepository.save(song4);
        Song song5 = new Song("song5",album3);
        songRepository.save(song5);
        Song song6 = new Song("song6",album6);
        songRepository.save(song6);



    }
}


