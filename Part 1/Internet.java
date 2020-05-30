/*Name:Ng Ke Rong*/
/*No.Matrik:271063*/

import java.util.*;

public class Internet{

   public static void main(String[] args){
   
        Scanner input = new Scanner(System.in);
        tmStreamyx wifi1 = new tmStreamyx();
        tmUnifi wifi2 = new tmUnifi();
        Time wifi3 = new Time();
        Celcom wifi4 = new Celcom();
        
        String name, telNo, address;
        int category, respond;
        
        System.out.println("\t\t\t\tWelcome to Internet Serving System\n");
        
        System.out.printf("Name :");
        name = input.nextLine();
        
        System.out.printf("Tel.No :");
        telNo = input.nextLine();
        
        System.out.printf("Address :");
        address = input.nextLine();

        do{    
            
            System.out.println("\n1.\tTM Streamyx");
            System.out.println("2.\tTM Unifi");
            System.out.println("3.\tTime");
            System.out.println("4.\tCelcom");
            
            
            do{
                System.out.printf("Select the type of internet you want:");
                category = input.nextInt();
            }while( category != 1 & category != 2 & category != 3 & category != 4);
        
            System.out.println("Name :" + name); 
            System.out.println("Tel.No :" + telNo);
            System.out.println("Address :"+ address);
            
            switch (category) {
                case 1:
                    
                    System.out.println(wifi1.display() + wifi1.special("Wired"));
                    
                    break;
                case 2:
                    
                    System.out.println(wifi1.display() + wifi1.special("Wired"));
                    
                    break;
                case 3:
                
                    System.out.println(wifi1.display() + wifi1.special("Wireless"));
                    
                    break;
                default:
                    
                    System.out.println(wifi1.display() + wifi1.special("Wireless"));
                    
                    break;
            }
            
            
            do{
                System.out.println("\nIs this correct? 1.Yes  2.No\t: ");
                respond = input.nextInt();
            }while(respond != 1 & respond != 2);
        
        }while(respond == 2);    
        
        System.out.println("Thank you, have a good day.");
    }   
    
}
