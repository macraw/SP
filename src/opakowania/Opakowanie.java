package opakowania;

public class Opakowanie {

    private int wym1, wym2, wym3;

    public Opakowanie(int w1, int w2, int w3) {
        wym1 = w1;
        wym2 = w2;
        wym3 = w3;
    }

    private static int powMin(int p1, int p2) {
        int pMin;
        if (p1 < p2) {
            pMin = p1;
        } else {
            pMin = p2;
        }
        return pMin;
    }

    public int powOpak() {
        int pow1 = wym1 * wym2;
        int pow2 = wym2 * wym3;
        int pow3 = wym1 * wym3;
        return 2 * (pow1 + pow2 + pow3) + powMin(powMin(pow1, pow2), pow3);
    }
}
