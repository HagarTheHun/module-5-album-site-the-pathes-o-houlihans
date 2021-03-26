package org.wcci.apimastery.Service;

import org.springframework.stereotype.Service;
import org.wcci.apimastery.Entities.Album;

import java.util.Collection;

@Service
public class AlbumStorage {
    private AlbumRepository albumRepository;

    public AlbumStorage(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }
    public Iterable<Album> retrieveAllAlbum(){
        return albumRepository.findAll();
    }


   public void saveAlbum(Album albumToSave){
        albumRepository.save(albumToSave);
   }
}
