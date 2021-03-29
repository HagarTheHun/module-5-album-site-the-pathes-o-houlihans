package org.wcci.apimastery.Controller;

import org.springframework.web.bind.annotation.*;
import org.wcci.apimastery.Entities.Album;
import org.wcci.apimastery.Service.AlbumStorage;

@RestController
public class MainController {
    private AlbumStorage albumStorage;


    public MainController(AlbumStorage albumStorage) {

        this.albumStorage = albumStorage;
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
    public void deleteAlbumsById(@PathVariable Long id) {

        albumStorage.deleteAlbumById(id);
    }

    @PostMapping("/api/albums")
    public Iterable<Album> editAlbum(@RequestBody Album albumToEdit) {
        if (albumToEdit.getId()!= null) {
            albumStorage.saveAlbum(albumToEdit);
        }
        return albumStorage.retrieveAllAlbums();
    }
}








