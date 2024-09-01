class soal4{
    static short methodOne(long l){
        int i = (int) l;
        return (short)i;
    }
    public static void main(String[] args){
        double d = 10.25;
        System.out.println(d);
        float f = (float) d;
        System.out.println(f);
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
}
