package org.wcci.apimastery.Controller;

import org.springframework.web.bind.annotation.*;
import org.wcci.apimastery.Entities.Album;
import org.wcci.apimastery.Entities.Song;
import org.wcci.apimastery.Service.AlbumStorage;
import org.wcci.apimastery.Service.SongRepository;
import org.wcci.apimastery.Service.SongStorage;

@RestController
public class MainController {
    private AlbumStorage albumStorage;
    private SongRepository songRepository;
    private SongStorage songStorage;

    public MainController(AlbumStorage albumStorage, SongRepository songRepository, SongStorage songStorage) {
        this.albumStorage = albumStorage;
        this.songRepository = songRepository;
        this.songStorage = songStorage;
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
    public Iterable<Album> deleteAlbumsById(@PathVariable Long id) {
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

    //    @PatchMapping("api/albums/{albumId}/songs")
//    public Album addSongToAlbum(@RequestBody Song songToAdd, @PathVariable Long AlbumId){
//        Album album = albumStorage.retrieveAlbumById(albumId);
//        Song song = new Song(album, songToAdd.getTitle();
//        songRepository.save(song);
//        return albumStorage.retrieveAlbumById(albumId);
//    }
//    @PatchMapping("api/albums/{albumId}/songs")
//    public Album addSongToAlbum(@RequestBody Song songToAdd, @PathVariable Long albumId) {
//        Album album = albumStorage.retrieveAlbumById(albumId);
//        Song song = new Song(songToAdd.getTitle(), album, songToAdd.getLyrics());
//        songRepository.save(song);
//        return albumStorage.retrieveAlbumById(albumId);
//    }
    @PatchMapping("api/albums/{albumId}/songs")
    public Album addSongToAlbum(@RequestBody Song songToAdd, @PathVariable Long albumId) {
        Album album = albumStorage.retrieveAlbumById(albumId);
        Song song = new Song(songToAdd.getTitle(), songToAdd.getLyrics(), songToAdd.getDuration(), songToAdd.getRatings(),
                album);
        songRepository.save(song);
        return albumStorage.retrieveAlbumById(albumId);
    }

    @GetMapping("/api/songs")
    public Iterable<Song> retrieveAllSongs() {
        return songStorage.retrieveAllSongs();
    }

    @GetMapping("/api/song/{id}")
    public Song retrieveSongById(@PathVariable Long id) {
        return songStorage.retrieveSongById(id);
    }

    @DeleteMapping("/api/song/{id}")
    public Iterable<Song> deleteSongById(@PathVariable Long id) {
        songStorage.deleteSongByID(id);
        return songStorage.retrieveAllSongs();
    }

    @PostMapping("/api/song")
    public Iterable<Song> addSong(@RequestBody Song songToAdd) {
        songStorage.saveSong(songToAdd);
        return songStorage.retrieveAllSongs();
    }

    @PutMapping("/api/songs")
    public Iterable<Song> editSong(@RequestBody Song songToEdit) {
        if (songToEdit.getId() != null) {
            songStorage.saveSong(songToEdit);
        }
        return songStorage.retrieveAllSongs();
    }


    @PatchMapping("/api/song/{songId}/")
    public Song updateSong(@RequestBody String titleToAdd, @RequestBody String durationToAdd,
                           @RequestBody String lyricsToAdd, @PathVariable Long songId){
        Song song = songStorage.retrieveSongById(songId);
        Song updatedSong = new Song();
        updatedSong.setTitle(titleToAdd);
        updatedSong.setDuration(durationToAdd);
        updatedSong.setLyrics(lyricsToAdd);
        if (updatedSong.getTitle() != null) {
            song.setTitle(updatedSong.getTitle());
        }
        if (updatedSong.getDuration() != null) {
            song.setDuration(updatedSong.getDuration());
        }
        if (updatedSong.getLyrics() != null) {
            song.setLyrics(updatedSong.getLyrics());
        }
        songStorage.saveSong(song);
        return songStorage.retrieveSongById(songId);

    }


}

//    @PatchMapping("api/albums/{albumId}/songs")
//    public Album addSongToAlbum(@RequestBody Song songToAdd, @PathVariable Long albumId) {
//        Album album = albumStorage.retrieveAlbumById(albumId);
//        Song song = new Song(songToAdd.getTitle(), songToAdd.getLyrics(), songToAdd.getDuration(), songToAdd.getRatings(),
//                album);
//        songRepository.save(song);
//        return albumStorage.retrieveAlbumById(albumId);


