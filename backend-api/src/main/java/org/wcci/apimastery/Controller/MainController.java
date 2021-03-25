package org.wcci.apimastery.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wcci.apimastery.Entities.Album;
import org.wcci.apimastery.Service.AlbumStorage;

@RestController
public class MainController {
    private AlbumStorage albumStorage;


    public AlbumController(AlbumStorage albumStorage){
        this.albumStorage = albumStorage;

        @GetMapping("/api/albums")
        public Iterable<Album> retrieveAllAlbum(){
              return albumStorage.retrieveAllAlbum();
        }

    }
}
