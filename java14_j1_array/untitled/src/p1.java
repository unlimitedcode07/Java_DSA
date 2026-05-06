import java.util.Arrays;

class ArrList<T> {
    int size;
    int capacity;
    Object[] arr;

    ArrList(){
        capacity = 1;
        arr = new Object[capacity];
    }

    void add(T val){
        if(size == arr.length){
            resize();
        }
        arr[size++] = val;
    }

    void resize(){
        capacity = capacity * 2 + 1;
        Object[] newArr = new Object[capacity];

        for(int i = 0; i < size; i++){
            newArr[i] = arr[i];
        }

        arr = newArr;
    }

    // ✅ return instead of print
    T get(int index){
        if(index >= size) throw new IndexOutOfBoundsException();
        return (T) arr[index];
    }

    // ✅ safe remove (last)
    void remove(){
        if(size == 0) return;
        arr[size - 1] = null;
        size--;
    }

    // ✅ insert at front (shift right)
    void shift(T val){
        if(size == arr.length){
            resize();
        }

        for(int i = size; i > 0; i--){
            arr[i] = arr[i - 1];
        }

        arr[0] = val;
        size++;
    }

    // ✅ remove from front
    void unshift(){
        if(size == 0) return;

        for(int i = 0; i < size - 1; i++){
            arr[i] = arr[i + 1];
        }

        arr[size - 1] = null;
        size--;
    }

    void print(){
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
public class p1 {
    public static void main(String[] args) {
     ArrList<Integer> arr = new ArrList<>();
        arr.add(3);
        arr.add(36);
        arr.add(8);
        arr.add(39);
        arr.add(78);
        arr.print();
        arr.remove();
        arr.print();
        arr.shift(45);
        arr.print();
        arr.unshift();
        arr.print();
    }
}
