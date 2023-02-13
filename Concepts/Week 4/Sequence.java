package grpa2;

interface Iterator{
    public boolean has_next();
    public Object get_next();
}
public class Sequence {
    private final int maxLimit = 80;
    private SeqIterator _iter = null;
    int[] iArr;
    int size;

    //implement the parameterized constructor to initialize size
    public Sequence(int size) {
        int[] iArr = new int[size];
    }
    //implement addTo(elem) to add an int elem to the sequence
    public void addTo(int elem) {
        Iterator i = get_Iterator();
        while (i.has_next()) {
            _iter.indx++;
        }
        iArr[_iter.indx] = elem;
    }
    //implement get_Iterator() to return Iterator object
    public Iterator get_Iterator() {
        return new SeqIterator();
    }

    private class SeqIterator implements Iterator{
        int indx;
        public SeqIterator(){
            indx = -1;
        }
        //implement has_next()
        public boolean has_next(){
            return indx < iArr.length-1;
        }
        //implement get_next()
        public Object get_next() {
            indx++;
            return iArr[indx];
        }
    }
}
