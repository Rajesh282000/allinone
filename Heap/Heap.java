package Heap;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    ArrayList<T> list;
    
    public Heap() {
        list = new ArrayList<>();
    }
    
    public void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    public int parent(int index) {
        return (index - 1) / 2;
    }

    public int left(int index) {
        return 2 * index + 1;
    }

    public int right(int index) {
        return 2 * index + 2;
    }

    public void insert(T value) {
        list.add(value);
        //calling upHeap
        upHeap(list.size() - 1);
    }

    private void upHeap(int index) {
        if(index==0) return;
        int parent = parent(index);
        if(list.get(index).compareTo(list.get(parent)) < 0) {
            swap(index, parent);
            upHeap(parent);
        }
    }


    public T remove() throws Exception {
        if(list.isEmpty()) throw new Exception("Heap is empty");

        T root = list.get(0);
        T last = list.remove(list.size() - 1);
        if(!list.isEmpty()){
            list.set(0, last);
            downHeap(0);
        }

        return root;
    }

    private void downHeap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }
        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }
        if(min != index) {
            swap(min, index);
            downHeap(min);
        }

    }


    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();

        while(!list.isEmpty()) {
            data.add(this.remove());

        }
        return data;
    }


}
