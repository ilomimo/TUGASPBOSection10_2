// Membuat 1 project yang menerapkan:
// enum
// generic class(single atau multi)
//   generic method

// generic class
class MyArray<T> {
    private T[] array;

    public MyArray(int size) {
        this.array = (T[]) new Object[size];
    }

    public void set(int index, T value) {
        this.array[index] = value;
    }

    public T get(int index) {
        return this.array[index];
    }

    // generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

// enum class for days
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

// driver class
public class App {

    public static void main(String[] args) {
        // generic class
        MyArray<Day> myArray = new MyArray<>(5);
        myArray.set(0, Day.SUNDAY);
        myArray.set(1, Day.MONDAY);
        myArray.set(2, Day.TUESDAY);
        System.out.println(myArray.get(0));
        System.out.println(myArray.get(1));
        System.out.println(myArray.get(2));

        // another generic class
        MyArray<String> myArray2 = new MyArray<>(5);
        myArray2.set(0, "satu");
        myArray2.set(1, "dua");
        myArray2.set(2, "tiga");
        System.out.println(myArray2.get(0));
        System.out.println(myArray2.get(1));
        System.out.println(myArray2.get(2));

        // generic method
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        MyArray.printArray(intArray);
    }
}