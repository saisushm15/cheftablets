/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chef.n.tablet;

import java.util.Scanner;

/**
 *
 * @author konda babu
 */
public class ChefNTablet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t>0)
        {
            int n=input.nextInt();
            int b=input.nextInt();
            int max=0;
            for(int i=1;i<=n;i++)
            {
              int w=input.nextInt();
              int h=input.nextInt();
              int price=input.nextInt();
              int area=w*h;
              if(area>max&&price<=b)
              {
                  max=area;
              }
            }
            if(max==0)
            {
                System.out.println("no tablet");
            }
            else
            {
              System.out.println(max);
            }
        }
        t--;
    }
    
}
