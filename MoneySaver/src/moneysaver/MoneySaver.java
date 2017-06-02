
package moneysaver;

import java.util.ArrayList;


public class MoneySaver {

   public static ArrayList<Money> moneys = new ArrayList<Money>();
    public static void main(String[] args) {
        LoginWindow login = new LoginWindow();
        login.setAlwaysOnTop(true);
        login.setVisible(true);
        
    }
    
}
