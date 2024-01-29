public class Main {
    public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435"; 
  static int a = 2;
  static int b = 12;

    public static void main(String[] args) {
        for(int i = 10; i < ee.length(); i++){
            if(isPrime(Double.parseDouble(ee.substring(i-10, i)))){
             System.out.println(ee.substring(i-10, i));
                break;
            }
         }
    
    }
    
  public static boolean isPrime(double num) { 
    if(num <2){
        return false;
    }
    for (int i = 2; i<=Math.sqrt(num);i=i+1){
      if (num%i==0){
        return false;
      }
    }

    return true;
  } 
}
