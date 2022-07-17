package Principal;

public sealed class SealedClass permits Filho1, Filho2, Filho3{
    protected int a, b;
    private final int c, d;
    public int e, f;
    public SealedClass(){
        a=1;
        b=2;
        c=3;
        d=4;
        e=5;
        f=6;
    }
}
