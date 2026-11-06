/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.paucasesnovescifp.dim_jgs_practica1.Class;

import cat.paucasesnovescifp.dim_jgs_practica1.Enum.GENRE;
import cat.paucasesnovescifp.dim_jgs_practica1.Enum.PLATFORM;
import java.util.List;

/**
 *
 * @author Alumne
 */
public class Game {
    private String name;
    private GENRE genre;
    private List<PLATFORM> platforms; //La posicion X en la lista de plataformas corresponde a la posicion X de la lista de cantidades
    private List<Integer> counts;

    public Game(String name, GENRE genre, List<PLATFORM> platforms, List<Integer> counts) {
        this.name = name;
        this.genre = genre;
        this.platforms = platforms;
        this.counts = counts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GENRE getGenre() {
        return genre;
    }

    public void setGenre(GENRE genre) {
        this.genre = genre;
    }

    public List<PLATFORM> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<PLATFORM> platforms) {
        this.platforms = platforms;
    }

    public List<Integer> getCounts() {
        return counts;
    }

    public void setCounts(List<Integer> counts) {
        this.counts = counts;
    }
    
    public Integer getCountSpecific(PLATFORM platform){
        for(int i = 0; i < platforms.size(); i++){
            if(platforms.get(i) == platform){
                return counts.get(i);
            }
        }
        return 0;
    }
    
    public void setCountSpecific(PLATFORM platform, Integer amount){
        for(int i = 0; i < platforms.size(); i++){
            if(platforms.get(i) == platform){
                counts.set(i, amount);
                return;
            }
        }
        platforms.add(platform);
        counts.add(amount);
    }

    @Override
    public String toString() {
        return "Game{" + "name=" + name + ", genre=" + genre + ", platforms=" + platforms + ", counts=" + counts + '}';
    }
}
