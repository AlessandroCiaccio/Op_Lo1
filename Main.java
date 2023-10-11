public class Main {
    public static void main(String[] args){
        int x=5, y=7, c=9;
        boolean result=(x<c && y>c) || (x>c && y<c);
        System.out.println("The number "+c+" is between "+x+" and "+y+"? "+result);
    }
}