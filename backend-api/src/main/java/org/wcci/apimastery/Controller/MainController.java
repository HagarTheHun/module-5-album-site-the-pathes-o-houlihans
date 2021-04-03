package org.wcci.apimastery.Controller;

import org.springframework.web.bind.annotation.*;
import org.wcci.apimastery.Entities.Album;
import org.wcci.apimastery.Entities.Song;
import org.wcci.apimastery.Service.AlbumStorage;
import org.wcci.apimastery.Service.SongRepository;

@RestController
public class MainController {
    private AlbumStorage albumStorage;
    private SongRepository songRepository;


    public MainController(AlbumStorage albumStorage, SongRepository songRepository) {

        this.albumStorage = albumStorage;
        this.songRepository = songRepository;
    }

    @GetMapping("/api/albums")
    public Iterable<Album> retrieveAllAlbum() {

        return albumStorage.retrieveAllAlbums();
    }

    @GetMapping("/api/albums/{id}")
    public Album retrieveAlbumById(@PathVariable Long id) {

        return albumStorage.retrieveAlbumById(id);
    }
    @DeleteMapping("/api/albums/{id}")
    public Iterable<Album> deleteAlbumsById(@PathVariable Long id){
        albumStorage.deleteAlbumById(id);
        return albumStorage.retrieveAllAlbums();

//    @DeleteMapping("/api/albums/{id}")
//    public void deleteAlbumsById(@PathVariable Long id) {
//
//        albumStorage.deleteAlbumById(id);
    }

    @PostMapping("/api/albums")
    public Iterable<Album> addAlbum(@RequestBody Album albumToAdd) {
        albumStorage.saveAlbum(albumToAdd);
        return albumStorage.retrieveAllAlbums();
    }

    @PutMapping("/api/albums")
    public Iterable<Album> editAlbum(@RequestBody Album albumToEdit) {
        if (albumToEdit.getId() != null) {
            albumStorage.saveAlbum(albumToEdit);
        }
        return albumStorage.retrieveAllAlbums();
    }
    @PatchMapping("api/albums/{albumId}/songs")
    public Album addSongToAlbum(@RequestBody Song songToAdd, @PathVariable Long albumId){
        Album album = albumStorage.retrieveAlbumById(albumId);
        Song song = new Song(songToAdd.getTitle() ,album, songToAdd.getLyrics());
        songRepository.save(song);
        return albumStorage.retrieveAlbumById(albumId);
    }
//    @PatchMapping("/api/albums/{albumId}/songs")
//    public Album addSongToAlbum(@RequestBody Song songToAdd, @PathVariable Long albumId) {
//        Album album = albumStorage.retrieveAlbumById(albumId);
//        Song song = new Song( songToAdd.getTitle(), album, songToAdd.getLyrics());
//        songRepository.save(song);
//        album.addSong(song);
//        albumStorage.saveAlbum(album);
//        return albumStorage.retrieveAlbumById(albumId);
//    }


}






