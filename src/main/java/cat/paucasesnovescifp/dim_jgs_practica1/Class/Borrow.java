/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.paucasesnovescifp.dim_jgs_practica1.Class;

import cat.paucasesnovescifp.dim_jgs_practica1.Enum.PLATFORM;
import cat.paucasesnovescifp.dim_jgs_practica1.Enum.GENRE;
import java.time.LocalDateTime;

/**
 *
 * @author Alumne
 */
public class Borrow {
    private static int idAssigner = 1;
    private int id;
    private Game game;
    private User user;
    private PLATFORM platform;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private boolean returned;
    private GENRE genre;

    public Borrow(Game game, User user, PLATFORM platform, LocalDateTime startDate, LocalDateTime endDate, boolean returned, GENRE genre) {
        this.id = idAssigner;
        idAssigner += 1;
        this.game = game;
        this.user = user;
        this.platform = platform;
        this.startDate = startDate;
        this.endDate = endDate;
        this.returned = returned;
        this.genre = genre;
    }
    
    public static int getIdAssigner(){
        return idAssigner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PLATFORM getPlatform() {
        return platform;
    }

    public void setPlatform(PLATFORM platform) {
        this.platform = platform;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public GENRE getGenre() {
        return genre;
    }

    public void setGenre(GENRE genre) {
        this.genre = genre;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }
    
    public Object[] castToRow(){
        Object[] arr = new Object[8];
        arr[0] = this.id;
        arr[1] = this.game.getName();
        arr[2] = (this.user.getName() + " " + this.user.getSurname1() + " " + this.user.getSurname2());
        arr[3] = this.platform;
        arr[4] = this.startDate;
        arr[5] = this.endDate;
        arr[6] = this.returned;
        arr[7] = this.genre;
        
        return arr;
    }
    
}
