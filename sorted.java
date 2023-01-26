import java.util.*;
public class sorted {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();

        int ar[]=new int[row];
        for(int i=0;i<row;i++)
        {

            
                ar[i]=sc.nextInt();
                
            
            
        }
        boolean isascending=true;
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i]>ar[i+1])
            {
                isascending=false;
            }
        }
        if(isascending=true)
        {
            System.out.println("sorted in an ascending order");
        }
        else
        {
            System.out.println("not sorted in an ascending order");
        }


    }
}
