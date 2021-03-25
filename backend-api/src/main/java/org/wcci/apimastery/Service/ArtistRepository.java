package org.wcci.apimastery.Service;

import org.springframework.data.repository.CrudRepository;
import org.wcci.apimastery.Entities.Artist;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
}
