/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.paucasesnovescifp.dim_jgs_practica1.SharedLists;

import cat.paucasesnovescifp.dim_jgs_practica1.Class.Game;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumne
 */
public class GameList {
    private static List<Game> list = new ArrayList<>();

    public static List<Game> getList() {
        return list;
    }

    public static void setList(List<Game> list) {
        GameList.list = list;
    }
    
    public static void add(Game game){
        list.add(game);
    }
}
