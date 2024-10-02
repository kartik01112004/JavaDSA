
public class Arrays {

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            // System.out.println(marks.length);
            marks[i] = marks[i] + 1;
        }
    }

    //Linear Search
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    //largest number
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE; //+infinity

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }

        System.out.println("Least marks scored is " + smallest);
        return largest;
    }

    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void reverse(int number[]) {
        int first = 0, last = number.length - 1;
        while (first < last) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }
    }

    public static void printPairss(int number[]) {
        int tp = 0;

        for (int i = 0; i < number.length - 1; i++) {
            int curr = number[i];
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + curr + "," + number[j] + ") ");
                tp++;
            }
            System.out.println("");
        }
        System.out.println("Total Pairs = " + tp);
    }

    public static void printSubarray(int number[]) {
        int ts = 0;
        int subSum = 0;

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;

                subSum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");

                    subSum += number[k];

                }
                ts++;
                System.out.print(" = " + subSum);
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("Total subarrasy are " + ts);
    }

    public static void main(String[] args) {
        int marks[] = {97, 95, 45, 87, 89, 65, 78, 83};
        int numbers[] = {11, 26, 34, 41, 65, 78, 95};
        int key = 65;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Index is with liner search is " + index);
        }

        System.out.println("Index is with binary search is " + binarySearch(numbers, key));

        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        System.out.println("Most marks scored is " + getLargest(marks));

        reverse(numbers);
        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("");

        printPairss(numbers);

        printSubarray(numbers);
    }

}
