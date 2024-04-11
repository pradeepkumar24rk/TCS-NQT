package ArrayBasedProblems;
public class EvenLeftSide {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 6, 4 };
        int n = arr.length;
        int initial = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                continue;
            if (arr[i] % 2 == 1) {
                int temp = arr[i];
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[n - 1] = temp;
                if (arr[i + 1] == initial)
                    break;
                i--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// public class evenvalleft {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int temp = 0;
//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int j = 0;
//         if (arr[0] % 2 == 0) {
//             j++;
//             for (int i = 1; i < n; i++) {
//                 if (arr[i] % 2 == 0) {
//                     temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                     j++;
//                 }
//             }
//         } else {
//             for (int i = 0; i < n; i++) {
//                 if (arr[i] % 2 == 0) {
//                     temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                     j++;
//                 }
//             }
//         }
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }