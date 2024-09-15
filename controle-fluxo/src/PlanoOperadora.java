public class PlanoOperadora {
    public static void main(String[] args) {
        
        String plano = "T";

        /*if(plano == "B"){
            System.out.println("100 minutos de ligação.");
        }else if(plano == "M") {
            System.out.println("100 minutos de ligação.");
            System.out.println("Whats e Instagran Gratis.");
        }else if (plano == "T") {
            System.out.println("100 minutos de ligação.");
            System.out.println("Whats e Instagran Gratis.");
            System.out.println("5Gb Youtube");
        }*/
        switch (plano) {
            case "T":  {
                System.out.println("100 minutos de ligação.");
            }
            case "M":  {
                System.out.println("Whats e Instagran Gratis.");
            }
            case "B": {
                System.out.println("5Gb Youtube");
            }
        }
    }
}
