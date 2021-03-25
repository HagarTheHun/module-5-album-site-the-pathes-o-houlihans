package org.wcci.apimastery.Service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.wcci.apimastery.Entities.Song;

public interface SongRepository extends CrudRepository<Song, Long> {
}
