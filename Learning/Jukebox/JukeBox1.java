package Jukebox;

import java.util.*;
import java.io.*;
import java.text.CollationElementIterator;

public class JukeBox1 {
    //Variáveis locais da classe    
    ArrayList<String> songList = new ArrayList<String>();
    //ArrayList<List> teste = new ArrayList<List>();
    //teste de classe onde será executado o método go
    public static void main(String[] args) {
        JukeBox1 jBox1 = new JukeBox1();
        jBox1.go();
    }

    //metodos da classe
    /* metodo go responsavel por executar os outros métodos da classe
    1º ele chama o método getSongs
    2º imprime a lista de musicas 
    3º ordena a lista das musicas 
    4º imprime a lista de musicas
    */
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
            File file = new File("Learning/Jukebox/SongList.txt");
            BufferedReader bufferedR = new BufferedReader(new FileReader(file)); 
            String line; 
            while ((line = bufferedR.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    //ler a 1ª linha passada em seguida separa tudo que estiver depois da / 
    // 2º adiciona o nome da musica ao ArrayList da classe, com isso podemos classificar a musica por ordem se quisermos  
    public void addSong(String line){
        String[] tokens = line.split("/");
        songList.add(tokens[0]);

    }

   
}
