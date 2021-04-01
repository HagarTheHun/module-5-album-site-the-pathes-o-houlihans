package org.wcci.apimastery.Service;

import org.springframework.stereotype.Service;
import org.wcci.apimastery.Entities.Album;

import java.util.Collection;

@Service
public class AlbumStorage {
    private AlbumRepository albumRepository;

    public AlbumStorage(AlbumRepository albumRepo) {
        this.albumRepository = albumRepo;
    }
    public Iterable<Album> retrieveAllAlbums(){
        return albumRepository.findAll();
    }


   public void saveAlbum(Album albumToSave){
        albumRepository.save(albumToSave);
   }

    public Album retrieveAlbumById(Long id) { return albumRepository.findById(id).get();}


    public void deleteAlbumById(Long id) { albumRepository.deleteById(id);}


}


