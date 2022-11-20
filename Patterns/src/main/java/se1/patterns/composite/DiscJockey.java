package se1.patterns.composite;

public class DiscJockey {

    SongComponent songList;

    public DiscJockey(SongComponent newSongList) {
        songList = newSongList;
    }

    public void getSongList() {
        songList.displaySongInfo();
    }
}
