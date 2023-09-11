public class oddindecendingeveninasscending {
    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int evennumbers = 0, oddnumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evennumbers++;
            } else {
                oddnumbers++;
            }
        }
        int even[] = new int[evennumbers];
        int odd[] = new int[oddnumbers];
        int j = 0, k = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && j < evennumbers) {
                even[j++] = numbers[i];
            } else {
                if (k < oddnumbers) {
                    odd[k++] = numbers[i];
                }
            }
        }
        j = 0;
        k = k - 1;
        int i = 0;
        while (i < evennumbers + oddnumbers) {
            if (j < evennumbers)
                System.out.print(even[j++] + " ");
            if (k >= 0)
                System.out.print(odd[k--] + " ");
            i++;
        }
    }
}

// int numbers[] = { 1,3,5,7,9,11,13,15,2,4,6,8,10 };
// System.out.print(numbers.length+" | "+" odd "+odd.length+" even "+
// even.length + " j "+j+" k "+k);
// numbers[i++] = odd[k--];
// numbers[i++] = even[j++];
// for (int l = 0; l < numbers.length; l++) {
// System.out.print(numbers[l]+" ");
// count2 = count2 - 1;
// }
// System.out.println(evennumbers);
// System.out.println(oddnumbers);