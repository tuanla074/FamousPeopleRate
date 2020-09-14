package PeopleR;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class PeopleR {
    int Id;
    String Name;
    String Ntnl;
    String Pics;
    String Pros;
    double rate;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public PeopleR() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getNtnl() {
        return Ntnl;
    }

    public void setNtnl(String ntnl) {
        this.Ntnl = ntnl;
    }

    public String getPics() {
        return Pics;
    }

    public void setPics(String pics) {
        this.Pics = pics;
    }

    public String getPros() {
        return Pros;
    }

    public void setPros(String pros) {
        this.Pros = pros;
    }
}
