package Euler;

import java.util.ArrayList;

public class Ex9 {
    public static void main(String[] args) {
        System.out.println(SpecialPythagoreanTriplet());
    }
    public static int SpecialPythagoreanTriplet(){
        int a=0,b=0,c=0;
        for(int i=1;i<1000;i++){
            for(int j=i;j<1000;j++){
                for(int k=i;k<1000;k++){
                    if(i+j+k==1000 && Math.pow(i, 2)+Math.pow(j, 2)==Math.pow(k, 2)){
                        return i+j+k;
                    }
                }
            }
        }
        return 0;
        
        
        
    }
}
