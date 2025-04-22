import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter size of arr");
        int n=sc.nextInt();
        System.out.println("Enter arr values");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }


        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j]);


        }
        
        

        
    }
    
    
}
