package Jukebox;

public class Song {
    private String title;
    private String artist;
    private String rating;
    private String bpm;

    Song(String t, String a, String r, String b){
        title = t;
        artist = a; 
        rating = r; 
        bpm = b;
    }

    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist; 
    }
    public String getRating(){
        return rating;
    }
    public String getBpm(){
        return bpm;
    }

    public String toString(){
        return title;
    }

}
