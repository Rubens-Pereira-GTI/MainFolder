package Jukebox;

import java.util.*;
import java.io.*;


public class JukeBox3 {
    ArrayList<String> songList = new ArrayList<String>();

    public static void main(String[] args) {
        new JukeBox3().go();
    }

    public void go(){
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }

    /* Responsável por ler a lista de musicas que está no arquivo
     * 
     */
    public void getSongs(){
        
        try {
            //encadeameno de Classes para leitura do TXT
            File file = new File("Learning/Jukebox/SongList.txt");
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

    //ler a 1ª linha passada em seguida separa tudo que estiver depois da / 
    // 2º adiciona o nome da musica ao ArrayList da classe, com isso podemos classificar a musica por ordem se quisermos  
    public void addSong(String lineToParse){
        
        String[] tokens = lineToParse.split("/");
        songList.add(tokens[0]);
        //Song nextS ong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);        
        //songList.add(nextSong);
    }
}
