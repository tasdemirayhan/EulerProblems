package Euler;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println(squareOfTheSum() + "-" +sumSquareDifference()+"=" + (squareOfTheSum()-sumSquareDifference()));
    }
    public static int sumSquareDifference(){
        int sum=0;
        for(int i=1;i<=100;i++){
            sum+=Math.pow(i, 2);

        }
        return sum;
    }
    public static int squareOfTheSum(){
        int sum=0;
        for(int i=1;i<=100;i++){
            sum+=i;
        }
        return (int)Math.pow(sum, 2);
    }
}
