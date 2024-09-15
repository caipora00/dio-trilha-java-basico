public class SistemaMedida {
    public static void main(String[] args) {
        
        String sigla = "p";

        switch (sigla) {
            case "P" -> {
                System.out.println("Pequeno");
            }
            case "M" -> {
                System.out.println("Medio");
            }
            case "G" -> {
                System.out.println("Grande");
            }
            default -> System.out.println("indefinido");
        }
    }
}
