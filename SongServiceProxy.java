import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SongServiceProxy implements SongService {
    private SongService realSongService;
    private HashMap<Integer, Song> songCache;

    public SongServiceProxy(SongService realSongService) {
        this.realSongService = realSongService;
        this.songCache = new HashMap<>();
    }

    @Override
    public Song searchById(Integer songID) {
        if (songCache.containsKey(songID)) {
            System.out.println("Retrieved song from cache.");
            return songCache.get(songID);
        } else {
            System.out.println("Retrieved song from server.");
            Song song = realSongService.searchById(songID);
            songCache.put(songID, song);
            return song;
        }
    }

    @Override
    public List<Song> searchByTitle(String title) {
        List<Song> matchingSongs = new CopyOnWriteArrayList<>();
        for (Song song : songCache.values()) {
            if (song.getSongName().equals(title)) {
                matchingSongs.add(song);
            }
        }
        if (matchingSongs.isEmpty()) {
            System.out.println("Retrieved songs from server.");
            matchingSongs = realSongService.searchByTitle(title);
            for (Song song: matchingSongs) {
                songCache.put(song.getSongId(), song);
            }
        }
        return matchingSongs;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        List<Song> matchingSongs = new CopyOnWriteArrayList<>();
        for (Song song : songCache.values()) {
            if (song.getAlbum().equals(album)) {
                matchingSongs.add(song);
            }
        }
        return matchingSongs;
    }
}
