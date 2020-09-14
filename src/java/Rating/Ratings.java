/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating;

/**
 *
 * @author Lenovo
 */
public class Ratings {
    int Rid;
    int Pid;
    int Uid;
    int rate;
    String comment;

    public Ratings() {
    }

    public int getRid() {
        return Rid;
    }

    public void setRid(int Rid) {
        this.Rid = Rid;
    }

    public int getPid() {
        return Pid;
    }

    public void setPid(int Pid) {
        this.Pid = Pid;
    }

    public int getUid() {
        return Uid;
    }

    public void setUid(int Uid) {
        this.Uid = Uid;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
