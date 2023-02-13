package grpa1;

class ComplexNum <T extends Number> {
    private T r;
    private T i;

    public ComplexNum (T r2, T i2){
        this.r = r2;
        this.i = i2;
    }

    public ComplexNum <Double> add (ComplexNum<Double> c){
        return new ComplexNum <Double> (
                r.doubleValue () + c.r,
                i.doubleValue () + c.i
        );
    }

    public String toString (){
        return r.doubleValue() + " + " + i.doubleValue() + "i";
    }
}