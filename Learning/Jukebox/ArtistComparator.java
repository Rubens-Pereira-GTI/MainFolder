package Jukebox;

import java.util.Comparator;

import Jukebox.Song;

public class ArtistComparator implements Comparator<Song> {    
   
    @Override
    public int compare(Song one, Song two) {
        
        return one.getArtist().compareTo(two.getArtist());
    }
    
}
