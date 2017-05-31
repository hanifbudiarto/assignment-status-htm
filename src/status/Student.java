/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 *
 * @author Hanif
 */
public class Student implements Status {
    private String name;
    private int[] scores;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScores() {
        String s = "";
        for (int i=0; i<scores.length; i++){
            s += scores[i];
            if (i+1 <scores.length) s += ",";
        }
        return s;
    }

    public void setScores(int[] scores) {                
        this.scores = scores;
    }

    @Override
    public String getStatus() {
        return getClass().getSimpleName() +"\n"
            +"name="+getName()+", "
            +"scores="+getScores()+"\n";
    }

    @Override
    public void displayStatus() {
        System.out.println(getStatus());
    }
    
    
}
