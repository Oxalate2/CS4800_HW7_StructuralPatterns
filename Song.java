public class Song {
    private int songId;
    private String songName;
    private String artist;
    private String album;
    private int duration;
    public Song(int songId, String songName, String artist, String album, int duration) {
        this.songId = songId;
        this.songName = songName;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public int getSongId() {
        return songId;
    }

    public String getArtist() {
        return album;
    }

    public String getAlbum() {
        return album;
    }

    public String getSongName() {
        return songName;
    }

    public int getDuration() {
        return duration;
    }

}
