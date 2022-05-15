package com.company.dyanamicArray;

public class DynamicArray {
    public int capacity;
    public int len;
    private int[] arr;

    //   Constructors

    DynamicArray() {
        capacity = 10;
        arr = new int[capacity];
        len = getLen();
    }

    DynamicArray(int num) {
        capacity = num;
        arr = new int[capacity];
        len = getLen();
    }
    DynamicArray(DynamicArray obj) {
        capacity = obj.capacity;
        arr = new int[capacity];
        len = obj.len;
    }
    DynamicArray(int[] arr) {
        this.capacity = arr.length ;
        this.arr = arr;
        len = getLen(arr);
    }


    // Methods

    private int getLen() {
        len = 0;
        for (int i = 0; i < capacity; i++) {
            if (arr[i] != 0)
                len += 1;
        }
        return len;
    }
    private int getLen(int[] e) {
        int l = 0;
        for (int i = 0; i < e.length; i++) {
            if (e[i] != 0)
                l += 1;
        }
        return l;
    }
    public int getCapacity() {
        return capacity;
    }

    public int[] getArr() {
        return arr;
    }

    protected int getArr(int num) {
        return arr[num];
    }

    private void swap(int a, int b) {
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }
    private int[] switchToAnotherArray(){
        int[] a = new int[capacity];
        for (int i = 0; i < len; i++) {
            a[i] = arr[i];
        }
        return a;
    }
    public void show(){
        for (int i = 0; i < capacity; i++) {
            System.out.println(arr[i]);
        }
    }

    public DynamicArray add(int value) {
        if (capacity == len) {
            capacity += 10;
            int[] a = switchToAnotherArray();
            arr = a;
        }
        arr[len++] = value;
        return this;
    }


    public DynamicArray add(int index, int value) {
        if (capacity == len) {
            capacity += 10;
            int[] a = switchToAnotherArray();
            for (int i = index; i < len; i++) {
                if (i >= index) {
                    a[i + 1] = arr[i];
                    a[index] = value;
                }
            }
            arr = a;
        } else {
            for (int j = len ,i = len+1; i > index; i--, j--) {
                    swap(j,i);
            }
            arr[index] = value;
        }
        len++;
        return this;
    }

    public DynamicArray add(DynamicArray value) {
        if (capacity - len < value.len) {
            capacity += value.capacity;
            int[] a = switchToAnotherArray();
            for (int j = 0, i = len; j < value.len; j++) {
                a[i] = value.getArr(j);
                i++;
            }
            len += value.len;
            arr = a;
        }else {
            for (int j = 0, i = len; j < value.len; j++) {
                arr[i] = value.getArr(j);
                i++;
            }
            len += value.len;
        }
        return this;
    }

    public DynamicArray add(int index, DynamicArray e) {
        if(index < 0 || index > len)
            index  = len;

        if ( capacity - len < e.len )
            capacity += e.capacity;
        len += e.len;
            int[] a = new int[capacity];
            for (int i = 0, j = 0; i < len; i++) {
                if (i == index) {
                    for (; j < e.len; j++, i++) {
                        a[i] = e.arr[j];
                    }
                    i--;
                } else if (i == (index + e.len)) {
                    a[i] = arr[index++];
                } else
                    a[i] = arr[i];
            }
        arr = a;
        return this;
    }

    public DynamicArray add(int[] e) {
        int leng = getLen(e);
        if (capacity - len < leng) {
            this.capacity += e.length;
            int[] a = switchToAnotherArray();
            for (int j = 0, i = len; j < leng; j++) {
                a[i++] = e[j];
            }
            arr = a;
        } else {
            for (int j = 0; j < leng; j++) {
                arr[len++] = e[j];
            }
        }
        len = getLen();
        return this;
    }
    public DynamicArray add(int index, int[] e) {
        int leng = getLen(e);

        if ( capacity - len < leng )
            capacity += e.length;

        if(index < 0 || index > len)
            add(e);
        else{
            len += leng;
            int[] a = new int[capacity];
            for (int i = 0, j = 0; i < len; i++) {
                if (i == index) {
                    for (; j < leng; j++, i++) {
                        a[i] = e[j];
                    }
                    i--;
                } else if (i == (index + leng)) {
                    a[i] = arr[index++];
                } else
                    a[i] = arr[i];
            }
            arr = a;
        }
        return this;
    }

    public DynamicArray removeByIndex(int index) {
        if(index < 0 || index > len)
            arr[len - 1] = 0;
        else {
            for (int i = 0; i < len; i++) {
                if (i >= index) {
                    arr[i] = arr[i + 1];
                }
            }
        }
        len--;
        return this;
    }

    public DynamicArray removeByValue(int value) {
        removeByIndex(indexOf(value));
        return this;
    }
    public int valueOf(int index) throws ArrayIndexOutOfBoundsException{
        if(index >= len)
            throw new ArrayIndexOutOfBoundsException("Index is bigger than length");
        if (index < 0)
            throw new ArrayIndexOutOfBoundsException("Index is less than 0");
        return arr[index];
    }

    public int indexOf(int value)  {
        int inx = -1;
        for (int i = 0; i < len; i++) {
            if (arr[i] == value)
                inx = i;
        }
        return inx;
    }

    public int lastIndexOf(int value) {
        int inx = indexOf(value);
        return len - (inx + 1);
    }

    public int[] sort() {
        int z = arr[0];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (arr[j] > z) {
                    swap(i, j);
                    z = arr[j];
                }
            }
            z = arr[len - 1];
        }
        return arr;
    }

    public int[] sort(int n) {
        int z;
        for (int i = 0; i < len; i++) {
            z = arr[i];
            for (int j = 0; j < len; j++) {
                if (arr[j] < z) {
                    z = arr[j];
                    swap(j, i);
                }
            }
        }
        return arr;
    }

    public boolean contains(int e) {
        boolean a = false;
        for (int i = 0; i < len; i ++){
            if(arr[i] == e)
                a = true;
        }
        return  a;
    }
    public boolean contains(DynamicArray e){
        int count = 0;
        for(int i = 0, j = 0; i < len; j++, i++){
            if(this.arr[i] == e.getArr(j)){
                count++;
            }
            if(j == e.len  - 1){
                j = 0;
            }
        }
        if (count == e.len)
            return true;
        return false;
    }
    public boolean contains(DynamicArray e,int  at, int to){
        int count = 0;
        for(int i = at, j = 0; i < to+1; j++, i++) {
            if (this.arr[i] == e.getArr(j)) {
                count++;
            }
            if (j == e.len - 1) {
                j = 0;
            }
            if (count == (to - at + 1))
                return true;
        }
        return false;
    }

    public boolean contains(int[] arr){
        int count = 0;
        for(int i = 0, j = 0; i < len; j++, i++){
            if(this.arr[i] == arr[j]){
                count++;
            }
            if(j == arr.length  - 1){
                j = 0;
            }
        }
        if (count == arr.length)
            return true;
        return false;
    }

    public static void main(String[] args) {

    }



}
