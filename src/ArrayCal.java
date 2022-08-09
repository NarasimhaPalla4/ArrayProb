import java.util.*;
public class ArrayCal {
    public static void main(String[] args) {
        int i,j,sum=0,mode=0,n,c,max=0;
        double mean,median;
        int[] a;
        a= new int[100];
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
            sum+=a[i];
        }
        mean=(double)sum/n;
        if(n%2!=0){
            median=a[n/2];
        }
        else{
            median=((double)(a[n/2]+a[n/2-1]))/2;
        }
        for(i=0;i<n;i++){
            c=0;
            for(j=0;j<n;j++){
                if(a[i]==a[j]){
                    c+=1;
                }
            }
            if(c>max){
                max=c;
                mode=a[i];
            }
        }
        System.out.println("Mean= "+mean);
        System.out.println("Median= "+median);
        System.out.println("Mode= "+mode);
    }
}
