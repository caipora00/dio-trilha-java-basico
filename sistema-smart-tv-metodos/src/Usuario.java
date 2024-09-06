public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();

        smartTv.ligar();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.mudarCanal(33);
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.aumentarCanal();

        System.out.println("TV Ligada -> " + smartTv.ligada);
        System.out.println("Canal atual -> " + smartTv.canal);
        System.out.println("Volume atual -> " + smartTv.volume);
    }
}
