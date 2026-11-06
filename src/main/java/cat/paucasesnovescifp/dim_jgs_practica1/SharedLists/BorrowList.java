/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.paucasesnovescifp.dim_jgs_practica1.SharedLists;

import cat.paucasesnovescifp.dim_jgs_practica1.Class.Borrow;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Alumne
 */
public class BorrowList {
    private static List<Borrow> list = new ArrayList<>();

    public static List<Borrow> getList() {
        return list;
    }

    public static void setList(List<Borrow> list) {
        BorrowList.list = list;
    }
    
    public static void add(Borrow borrow){
        list.add(borrow);
    }
}
