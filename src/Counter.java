public class Counter {
    int value;
    public void increment(){
        value++;
        System.out.println(value);
    }
    public void decrement(){
        value--;
        System.out.println(value);
    }
}
//        Counter counter = new Counter();
//        System.out.println("Текущее значение:"+counter.value);
//        System.out.println("\n"+"Znachenie posle incrementa:");
//        counter.increment();
//        System.out.println("\n"+"Znachenie posle decrementa:");
//        counter.decrement();