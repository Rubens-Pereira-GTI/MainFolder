package Jukebox;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class JukeBox6 {
    
    // -------------Atributos------------------
    ArrayList<Song> songList = new ArrayList<Song>();
// ---------------metodos--------------- 
   
    public void go(){
        getSongs();
        System.out.println("Lista original:");
        System.out.println(songList);
        
        Collections.sort(songList);
        System.out.println("Lista ordenada por compareTo da classe Song ");
        System.out.println(songList);

        HashSet<Song> songSet = new HashSet<Song>();
        songSet.addAll(songList);
        System.out.println("Lista ordenada por HashSet");
        System.out.println(songSet);
    }

    public void getSongs(){
         try {
            //encadeameno de Classes para leitura do TXT
            File file = new File("Learning/Jukebox/SongListMore.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            
            //loop acontece até não termos mais musicas
            //em cada ciclo uma linha/musica é adicionada
            String line =null;
            while ((line = bufferedReader.readLine()) != null) {
                addSong(line);
            }

            bufferedReader.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public void addSong(String lineToParse){
        
        String[] tokens = lineToParse.split("/");
        //System.out.println(tokens[1]);
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);        
        songList.add(nextSong);
    }


    public static void main(String[] args) {
        new JukeBox6().go(); 
    }

    // ---------------------------
    // classes internas

    public class ArtistCompare implements Comparator<Song>{
        public int compare(Song one, Song two){
            return one.getArtist().compareTo(two.getArtist());
        }
    }
}
