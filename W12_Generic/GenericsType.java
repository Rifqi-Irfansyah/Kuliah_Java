package W12_Generic;

public class GenericsType<T> {
    private T t;
    
    public T get(){
        return this.t;
    }
    public void set(T t1){
        this.t=t1;
    }

    @SuppressWarnings("unchecked")
    public static void main(String args[]){
        GenericsType<String> type = new GenericsType<>();
        type.set("Java"); //valid
        @SuppressWarnings("rawtypes")
        GenericsType type1 = new GenericsType(); //raw type
        type1.set(10); //valid and autoboxing support
        type1.set("102"); //valid and autoboxing support

        System.out.println(type.get());
        System.out.println(type1.get());
    }
}