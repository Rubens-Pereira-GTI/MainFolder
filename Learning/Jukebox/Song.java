package Jukebox;

public class Song implements Comparable<Song>{
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

    
    public int compareTo(Song song) {
        return title.compareTo(song.getTitle());        
    }

    //complete a sobreposição do método equals, faça com que ele compare os titulos 
    // private String title;
    public boolean equals(Object s){
        Song song = (Song) s;
        return getArtist().equals(song.getArtist());
    }

    //complete a sobreposição do método hashCode, faça com que ele compare os titulos 
    // private String title;
    // getTitle()
    public int hashCode(){
        return getArtist().hashCode();
    }

}
