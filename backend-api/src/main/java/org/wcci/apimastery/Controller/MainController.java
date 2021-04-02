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


    public MainController(AlbumStorage albumStorage) {

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
    @PatchMapping("/api/album/{id}/name")
    public Album changeAlbumName(@RequestBody String newName, @PathVariable Long id) {
        Album albumToChange = albumStorage.retrieveAlbumById(id);
        albumToChange.changeName(newName);
        albumStorage.saveAlbum(albumToChange);
        return albumToChange;
    }

}