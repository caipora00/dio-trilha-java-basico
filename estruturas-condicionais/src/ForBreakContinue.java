public class ForBreakContinue {
    public static void main(String[] args) throws Exception {
        for ( int numero = 1; numero <=20 ; numero++){
            if(numero == 3){
                break;
            }
            System.out.println(numero);
        }
    }
}