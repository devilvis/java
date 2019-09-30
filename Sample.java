import java.applet.*;
import java.awt.*;

/* <applet code="Sample" width=300 height=100> </applet> */
  

  public class Sample extends Applet{
       String msg;

                public void init(){
                      setBackground(Color.cyan);
                          setForeground(Color.red);
                                       msg="INSIDE init()";         
                                    }
                              
                                                             public void start(){
                                       
                                                                      msg+="INSIDE start()";}
                                  
  
           public void paint(Graphics g){
    msg+="INSIDE paint()";
      g.drawString(msg,10,30);  
        }

}