package Storage;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {

    private ArtistStorage artistStorage;
    private SongRepository songRepository;

    public Populator(ArtistStorage artistStorage, SongRepository songRepository) {
        this.artistStorage = artistStorage;
        this.songRepository = songRepository;
    }
}
