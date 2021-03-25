package Storage;

public class SongStorage  {
    SongRepository songRepo;

    public SongStorage (SongRepository songRepo) {
        this.songRepo = songRepo;
    }
}
