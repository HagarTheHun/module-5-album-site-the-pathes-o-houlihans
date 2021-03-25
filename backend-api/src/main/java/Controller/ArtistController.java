package Controller;

import Entities.Artist;
import Storage.ArtistStorage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistController {
    private ArtistStorage artistStorage;

    public ArtistController(ArtistStorage artistStorage){
        this.artistStorage= artistStorage;

    }
    @GetMapping("/api/artist")
    public Iterable<Artist> retrieveAllArtist(){
        return artistStorage.retrieveAllArtist();
    }


}
