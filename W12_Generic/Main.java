package W12_Generic;

interface MinMax<T extends Comparable<T>> {
    T max(); /* w w w .java2 s . co m*/
}
class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;
    MyClass(T[] o) {
        vals = o;
    }
    @Override
    public T max() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }
        return v;
    }
}
public class Main {
    public static void main(String args[]) {
        Integer inums[] = { 3, 6, 2, 8, 6 };
        Character chs[] = { 'b', 'r', 'p', 'w' };
        MyClass<Integer> a = new MyClass<>(inums);
        MyClass<Character> b = new MyClass<>(chs);
        System.out.println(a.max());
        System.out.println(b.max());
    }
}
    
