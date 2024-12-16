package Rough;
import java.util.ArrayList;
import java.util.List;




    public class PowerOfTwoMaxHeap {
        private List<Integer> heap;
        private int power;

        public PowerOfTwoMaxHeap(int power) {
            this.heap = new ArrayList<>();
            this.power = power;
        }

        public void insert(int value) {
            heap.add(value);
            int index = heap.size() - 1;
            int parentIndex = (index - 1) / power;

            while (index > 0 && heap.get(index) > heap.get(parentIndex)) {
                int temp = heap.get(index);
                heap.set(index, heap.get(parentIndex));
                heap.set(parentIndex, temp);

                index = parentIndex;
                parentIndex = (index - 1) / power;
            }
        }
        public int popMax() {
            if (heap.isEmpty()) {
                throw new IllegalStateException("Heap is empty");
            }

            int max = heap.get(0);
            int lastElement = heap.remove(heap.size() - 1);

            if (!heap.isEmpty()) {
                heap.set(0, lastElement);
                heapify(0);
            }

            return max;
        }

        private void heapify(int index) {
            int largest = index;

            for (int i = 1; i <= power; i++) {
                int childIndex = power * index + i;

                if (childIndex < heap.size() && heap.get(childIndex) > heap.get(largest)) {
                    largest = childIndex;
                }
            }

            if (largest != index) {
                int temp = heap.get(index);
                heap.set(index, heap.get(largest));
                heap.set(largest, temp);
                heapify(largest);
            }
        }

    }

