/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OORestaurants;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class SuperClass_Parent {
    
    public double Burger;
    public double Pizza;
    public double Tilapia;
    public double Fries;
    
    public double Vanilla;
    public double Chocolate;
    public double Capuccino;
    public double Soda;
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;
    
    public double GetAmount()
    {
        Meals = Burger + Pizza + Tilapia + Fries;
        Drinks = Vanilla + Chocolate + Capuccino + Soda;
        TotalofMD = Meals + Drinks;
        
        AllTotalofMD = TotalofMD;
        return AllTotalofMD; 
    }
    
    private JFrame frame;
    
    public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Restaurant Management Systems",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                
            System.exit(0);
        }
    } 
    
    //===============================================Price===========================================
    
    public double pBurger = 5.00;
    public double pPizza = 12.55;
    public double pTilapia = 4.50;
    public double pFries = 1.50;
    
    public double pVanilla = 2.50;
    public double pChocolate = 2.50;
    public double pCapuccino = 9.50;
    public double pSoda = 0.70;
    
    //=============================================Tax===============================================
    
    public double mcTax = 0.90;
    
    public Double cFindTax(double cAmount)
    {
        double FindTax = cAmount - (cAmount * mcTax);
        return FindTax;
    }
        
    
}
