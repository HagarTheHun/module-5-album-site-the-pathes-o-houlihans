package org.wcci.apimastery.Controller;

import org.springframework.web.bind.annotation.*;
import org.wcci.apimastery.Entities.Album;
import org.wcci.apimastery.Service.AlbumStorage;
import org.wcci.apimastery.Service.SongRepository;

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
//    @PatchMapping("/api/albums/{albumsId}/Song")
//    public Albums addArtistToAlbums(@RequestBody Song SongToAdd, @PathVariable Long albumsID){
//    Album album = albumStorage.retrieveAlbumById(AlbumsId);
//    Song song = new Song(Albums,SongToAdd.getTitle(), songToAdd.getSummary(), songToAdd.getSummary(), True);
//    SongRepo.save(Song);
//    return albumStorage.retrieveAlbumByID(albumsId);
//}

}






