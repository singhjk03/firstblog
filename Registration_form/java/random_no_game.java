import java.util.Scanner;
//Doubt
class random_no_game{
    
    public static void main(String arg[]){
            
        int comp = (int)(Math.random()*100);
        System.out.println(comp);
        Scanner sc = new Scanner(System.in);
        int x=0;
        while(x>=0){
            x = sc.nextInt();
            if(x>comp){
                System.out.println("too high");
                break;
            }
            else if(x<comp){
                System.out.println("too low");
                break;
            }
            else{
                System.out.println("yay the number is "+ comp);
            }
            System.out.println("give another try");
        }
    }
}