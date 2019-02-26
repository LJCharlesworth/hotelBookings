package hotelbookings;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;  
import java.awt.*;  
import java.awt.event.*;  

public class HotelBookings {

    private static Object selfCateringSingle;

     JFrame f;
     
     public int bookingID;
    
     HotelBookings(){
         
        f = new JFrame();
        
        DefaultMutableTreeNode roomOptions = new DefaultMutableTreeNode("Room Options");  
        DefaultMutableTreeNode roomType = new DefaultMutableTreeNode("Room Type");  
        
        roomOptions.add(roomType);
        
        DefaultMutableTreeNode single = new DefaultMutableTreeNode("Single (1) [£50]");
        DefaultMutableTreeNode twin = new DefaultMutableTreeNode("Double (2) [£75]");
        DefaultMutableTreeNode family = new DefaultMutableTreeNode("Family (4) [£105]");
        
        roomType.add(single); roomType.add(twin); roomType.add(family);
        
        DefaultMutableTreeNode selfCateringSingle = new DefaultMutableTreeNode("Self-Catering [£0]");
        DefaultMutableTreeNode halfBoardSingle = new DefaultMutableTreeNode("Half-Board [£10]");
        DefaultMutableTreeNode fullBoardSingle = new DefaultMutableTreeNode("Full Board [£20]");
        
        DefaultMutableTreeNode selfCateringTwin = new DefaultMutableTreeNode("Self-Catering [£0]");
        DefaultMutableTreeNode halfBoardTwin = new DefaultMutableTreeNode("Half-Board [£10]");
        DefaultMutableTreeNode fullBoardTwin = new DefaultMutableTreeNode("Full Board [£20]");
        
        DefaultMutableTreeNode selfCateringFamily = new DefaultMutableTreeNode("Self-Catering [£0]");
        DefaultMutableTreeNode halfBoardFamily = new DefaultMutableTreeNode("Half-Board [£10]");
        DefaultMutableTreeNode fullBoardFamily = new DefaultMutableTreeNode("Full Board [£20]");
        
        single.add(selfCateringSingle); single.add(halfBoardSingle); single.add(fullBoardSingle);
        twin.add(selfCateringTwin); twin.add(halfBoardTwin); twin.add(fullBoardTwin);
        family.add(selfCateringFamily); family.add(halfBoardFamily); family.add(fullBoardFamily);
        

        
        JTree jt=new JTree(roomOptions);  
        f.add(jt);  
        f.setSize(200,400);  
        f.setVisible(true);
        
    }

    public static void main(String[] args) {
        new HotelBookings();
        
        System.out.println("Hello world");
        
        selfCateringSingle.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                bookingID = 1;
            }
        });
        
        
        
    }
    
}
