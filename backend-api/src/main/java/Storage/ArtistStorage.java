package Storage;

import Entities.Artist;

public interface ArtistStorage {
     Iterable<Artist> retrieveAllArtist();
     Artist retrieveArtistById(Long Id);
}
