package task1;

public class testarInterruptor {
    private static interruptor Interruptor;

    public static void main(String[] args){
        Interruptor = Interruptor();

        Interruptor.pressionar();

        Interruptor.verificarLampada();

        Interruptor.pressionar();

        Interruptor.verificarLampada();
    }

    private static interruptor Interruptor() {
        return null;
    }


}
