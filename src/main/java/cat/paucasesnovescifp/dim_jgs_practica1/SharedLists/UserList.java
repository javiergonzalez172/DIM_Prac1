/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.paucasesnovescifp.dim_jgs_practica1.SharedLists;

import cat.paucasesnovescifp.dim_jgs_practica1.Class.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumne
 */
public class UserList {
    private static List<User> list = new ArrayList<>();

    public static List<User> getList() {
        return list;
    }

    public static void setList(List<User> list) {
        UserList.list = list;
    }
    
    public static void add(User user){
        list.add(user);
    }
}
