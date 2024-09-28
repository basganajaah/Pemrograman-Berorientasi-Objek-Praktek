package Exercise3;

interface Sortable {
    int compare(Sortable b);

    static void shell_sort(Sortable[] a) {
        int n = a.length;
        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i++) {
                Sortable temp = a[i];
                int j;
                for (j = i; j >= interval && a[j - interval].compare(temp) > 0; j -= interval) {
                    a[j] = a[j - interval];
                }
                a[j] = temp;
            }
        }
    }
}