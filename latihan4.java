import java.util.Scanner;
public class latihan4{

	public static void main(String[] args) { 
        Scanner input=new Scanner (System.in);
        System.out.print(" masukkan jumlah data: ");
        	int n= input.nextInt();
        	int []a= new int [n];
        
        for(int i=0;i<n;i++){ 
        a[i]=input.nextInt();}
        
        int iMaximum = a[0];
        for(int i=1;i<n;i++){
            if(iMaximum < a[i]){
                iMaximum=a[i];}}
        int iMinimum=a[0];
        for(int i=1;i<n;i++){
            if(iMinimum>a[i]){
                iMinimum=a[i];}}
        System.out.println("Nilai Maks\t: "+iMaximum+" ");
        System.out.println("Nilai Min\t: "+iMinimum+" ");
        
    }

}