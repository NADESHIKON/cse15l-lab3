

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n / 2; i++) {
      int t = arr[i];
      arr[i] = arr[n - i - 1];
      arr[n - i - 1] = t;
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    int j = 0;
    for (int i = arr.length - 1; i >= 0; i--) {
      newArray[j] = arr[i];
      j++;
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }
    int lowestCount = 0;
    double sum = 0;
    for(double num: arr) {
      if(num != lowest) { sum += num; }
      else lowestCount++;
    }
    return sum / (arr.length - lowestCount);
  }


}

