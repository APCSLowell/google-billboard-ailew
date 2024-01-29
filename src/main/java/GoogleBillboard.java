public class Main {
    public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435"; 
  static int a = 2;
  static int b = 12;

    public static void main(String[] args) {
      for (int i = 0; i<=99; i=i+1){
        a++;
        b++;
        String digits = e.substring(a,b);
        double output = Double.parseDouble(digits);
        if (isPrime(output)==true){
          System.out.println(output);
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
