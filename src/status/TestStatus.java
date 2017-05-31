/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hanif
 */
public class TestStatus {
    
    public static Rectangle createRectangle(String line) {
        String[] props = line.split(" ");
        
        Rectangle rect = new Rectangle();
        rect.setLength(Integer.parseInt(props[0]));
        rect.setWidth(Integer.parseInt(props[1]));
        return rect;
    }
    
    public static Sibling createSibling(String line) {
        String[] props = line.split(" ");
        
        Sibling sibling = new Sibling();
        sibling.setName(props[0]);
        sibling.setAge(Integer.parseInt(props[1]));
        sibling.setWeight(Integer.parseInt(props[2]));
        
        return sibling;
    }
    
    public static Student createStudent(String line) {
        String[] props = line.split(",");
        Student student = new Student();
        student.setName(props[1]);
        
        int[] scores = new int[Integer.parseInt(props[2])];
        int index = 0;
        for (int i=3; i<props.length; i++) {
            scores[index] = Integer.parseInt(props[i]);
            index++;
        }
        student.setScores(scores);
        return student;
    }
    
    
    public static void main(String[] args) {
        
        
        try {
            FileInputStream fis = new FileInputStream("./input.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

            int maxLines = 6;
            int currLines = 1;
            
            Status[] status = new Status[maxLines];
            String line = "";
            while(line != null){
                if (currLines > maxLines) break;

                line = reader.readLine();
                if (currLines <=3) status[currLines-1] = createRectangle(line);
                else if (currLines <= 5) status[currLines-1] = createSibling(line);
                else status[currLines-1] = createStudent(line);

                currLines++;
            }      
            
            for (int index=0; index<status.length; index++) {
                status[index].displayStatus();
            }
            
            String out = "";
            for (int index=0; index<status.length; index++) {
                out = out + status[index].getStatus();
            }

            JOptionPane.showMessageDialog (null, out);


        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestStatus.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestStatus.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
}
