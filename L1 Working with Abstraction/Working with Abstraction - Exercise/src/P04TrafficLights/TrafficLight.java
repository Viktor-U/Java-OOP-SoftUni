package P04TrafficLights;

public class TrafficLight {

    private Signals signals;


    public TrafficLight(Signals signals) {
        this.signals = signals;
    }

    public void changeSignal(){

            if (signals.equals(Signals.RED)){
                signals = Signals.GREEN;
                System.out.print(Signals.GREEN);
            }else if (signals.equals(Signals.GREEN)){
                signals = Signals.YELLOW;
                System.out.print(Signals.YELLOW);
            }else if (signals.equals(Signals.YELLOW)) {
                signals = Signals.RED;
                System.out.print(Signals.RED);
            }

    }
}
