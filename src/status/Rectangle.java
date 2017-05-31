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
public class Rectangle implements Status {

    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    @Override
    public String getStatus() {
        return getClass().getSimpleName() + "\n" 
                + "length="+getLength() + ", "
                + "width="+getWidth()+"\n" ;
    }

    @Override
    public void displayStatus() {
        System.out.println(getStatus());
    }
}
