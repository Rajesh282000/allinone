package Heap;

public class Main {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<Integer>();
        heap.insert(40);
        heap.insert(77);
        heap.insert(30);
        heap.insert(100);
        heap.insert(22);
        heap.insert(60);
        heap.insert(70);
        heap.insert(80);
       // System.out.println(heap.remove());
        System.out.println(heap.heapSort());
    }
}
