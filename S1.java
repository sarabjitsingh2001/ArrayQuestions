public class S1 {

    public void zigZag(int a[], int n) {

        for (int i = 0; i < n - 1; i++) {

            if (i % 2 == 0) {

                if (a[i] > a[i + 1]) {
                    int t = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                }

            } else {

                if (a[i] < a[i + 1]) {
                    int t = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                }

            }

        }
    }
}
