package Jukebox;

import java.io.*;
import java.util.*;

public class JukeBox8 {
    ArrayList<Song> songList = new ArrayList<Song>();
    int val;

    public static void main(String[] args) {
        new JukeBox8().go();    
    }

    public void go(){
        getSongs();
        System.out.println("lista Original: \n"+songList);
        Collections.sort(songList);
        System.out.println("Lista ordenada pelo metodo sort, ordenada pelo titulo: \n"+ songList);

        TreeSet<Song> songSet = new TreeSet<Song>();
        songSet.addAll(songList);
        System.out.println("Lista ordenada pelo TreeSet: \n"+songSet);

    }


    public void getSongs(){
        try{
            File file = new File("Learning/Jukebox/SongListMore.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;

            while((line = bufferedReader.readLine()) != null){
                addSong(line);
            }
            bufferedReader.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

    public void addSong(String line){
        String[] tokens = line.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }
}
