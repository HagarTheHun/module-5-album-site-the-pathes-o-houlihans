package org.wcci.apimastery;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.apimastery.Entities.Album;
import org.wcci.apimastery.Entities.Song;
import org.wcci.apimastery.Service.AlbumStorage;
import org.wcci.apimastery.Service.CommentRepository;
import org.wcci.apimastery.Service.SongRepository;
import org.wcci.apimastery.Service.SongStorage;

@Component
    public class Populator implements CommandLineRunner {

    private SongRepository songRepository;
    private AlbumStorage albumStorage;
    private CommentRepository commentRepository;

    public Populator(SongRepository songRepository, AlbumStorage albumStorage, CommentRepository commentRepository) {

        this.songRepository = songRepository;
        this.albumStorage = albumStorage;
        this.commentRepository= commentRepository;

    }

    @Override
    public void run(String... args) throws Exception {
        Album album1 = new Album("album1","Mike", 5,"https://image.lyricspond.com/image/s/artist-sesame-street/album-sesame-street-platinum-too/cd-cover.jpg");
        albumStorage.saveAlbum(album1);
        Album album2 = new Album("album2","Luke", 4,"https://ia802901.us.archive.org/21/items/mbid-8f9e6779-bf18-4add-b0ad-8b711896899b/mbid-8f9e6779-bf18-4add-b0ad-8b711896899b-4174696972.jpg");
        albumStorage.saveAlbum(album2);
        Album album3 = new Album("album3","Keshav", 5,"https://ia902708.us.archive.org/28/items/mbid-7171b160-40b1-493d-9843-69a110c7b0c3/mbid-7171b160-40b1-493d-9843-69a110c7b0c3-3270075660_thumb250.jpg");
        albumStorage.saveAlbum(album3);
        Album album4 = new Album("album4","Bob", 3,"https://ia803005.us.archive.org/0/items/mbid-7e78f498-5801-4220-9a38-a5b17e6502d4/mbid-7e78f498-5801-4220-9a38-a5b17e6502d4-23779888441.jpg");
        albumStorage.saveAlbum(album4);
        Album album5 = new Album("album4","Jon", 4,"https://ia801406.us.archive.org/29/items/mbid-13db318c-7f74-4b8a-8388-d365e6683889/mbid-13db318c-7f74-4b8a-8388-d365e6683889-28977043163.jpg");
        albumStorage.saveAlbum(album5);
        Album album6 = new Album("album4","Billy", 2,"https://ia803200.us.archive.org/30/items/mbid-a72a0b42-e668-4d55-9b17-579655d97ebd/mbid-a72a0b42-e668-4d55-9b17-579655d97ebd-27044134913.jpg");
        albumStorage.saveAlbum(album6);


        Song song1 = new Song("sesame-street","kids abc song", "3:50 minutes", 5, album1 );
        songRepository.save(song1);
        Song song2 = new Song("Il Mare Calmo Della Sera","Mare Della", "3:50 minutes", 4, album1 );
        songRepository.save(song2);
        Song song3 = new Song("Sigur cos valtari","Sigur cos valtari cos", "3:50 minutes", 4, album3 );
        songRepository.save(song3);
        Song song4 = new Song("liminal sleep","Sleeping beauty", "4:50 minutes", 3, album4 );
        songRepository.save(song4);
        Song song5 = new Song("anything","counting numbers", "4:50 minutes", 5, album5 );
        songRepository.save(song5);
        Song song6 = new Song("foundation","alphabet song", "5:50 minutes", 5, album6 );
        songRepository.save(song6);






    }
}


