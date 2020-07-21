import Utils.Operations;

public class Mastermind {

    private final int secretNumber;

    public Mastermind() {
        this.secretNumber = Operations.extractNumber(Operations.shuffle(), Game.NUMBER_LENGTH);
    }

    Mastermind(int secretNumber){
        this.secretNumber = secretNumber;
    }

    public int getPicas(int intent){
        String intentA = Integer.toString(intent);
        String secretNumber = toString();
        int picas = 0;
        for (int times = 0; times < Game.NUMBER_LENGTH; times++) {
            for (int index = 0; index < Game.NUMBER_LENGTH; index++) {
                if (times != index && (secretNumber.charAt(times)==(intentA.charAt(index)))){
                    picas ++;
                }
            }
        }
        return picas;
    }

    public int getFijas(int intent) {
        String intentA = Integer.toString(intent);
        String secretNumber = toString();
        int fijas = 0;
        for (int index = 0; index < Game.NUMBER_LENGTH; index++) {
            if (secretNumber.charAt(index) == intentA.charAt(index)){
                fijas ++;
            }
        }
        return fijas;
    }

    @Override
    public String toString() {
        return String.format("%0"+Game.NUMBER_LENGTH+"d", secretNumber);
    }
}
