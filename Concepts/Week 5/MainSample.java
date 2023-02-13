package Wildcards;


// since I am performing addition operation, I will say <T extends Number>
class PairSample<T extends Number> {
    T key;
    T value;
    public PairSample(T key, T value) {
        this.key = key;
        this.value = value;
    }

    public void addPair(PairSample<?> p) {
        System.out.println(p.key.doubleValue() + this.key.doubleValue());
        System.out.println(p.value.doubleValue() + this.value.doubleValue());
    }
}

public class MainSample {
    public static void main(String[] args) {
        PairSample<Integer> x = new PairSample<>(2, 2);
        PairSample<Double> y = new PairSample<>(0.5, 0.5);
        x.addPair(y);
    }
}

/*
if we do not declare Pair<?> wildcard type in addPair method, then we get
compile time error since in line 21, we have already declared T to be Integer type
line 22 will not compile since it is contradicting by saying T is Double
 */