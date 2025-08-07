import java.util.Scanner;
public class CoolRectangleNumberpattern{
    public static void main(String [] args){
        System.out.println(
                "Enter length of the rectangle."
        );
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        System.out.println(
                "Enter width of the rectangle."
        );
        int wid=sc.nextInt();
        int count=0;
        for(int i=1; i<=wid; i++, count++) {
            System.out.print(i);
            for(int j=2; j<=len; j++){
                System.out.print(j);
            }
            System.out.println("");
            i=i-1;
            if(count==wid){
                break;
            }
        }
    }
}
