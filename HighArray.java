public class HighArray {
    private long[] a;
    private int nElems;

    public HighArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++)
            if (a[j] == searchKey)
                break;
        if (j == nElems)
            return false;
        else
            return true;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++)
            if (value == a[j])
                break;
        if (j == nElems)
            return false;
        else {
            for (int k = j; k < nElems; k++)
                a[k] = a[k + 1];
            nElems--;
            return true;
        }
    }

    public void display() {
        for (int j = 0; j < nElems; j++)
            System.out.println(a[j] + " ");
        System.out.println("");
    }

    public long getmax() {
        long m = 0;
        for (int j = 0; j < nElems; j++) {
            if (a[j] > m) {
                m = a[j];
            }
        }
        return m;
    }

    public void removeMax() {
        long MMax = getmax();
        int j;
        for (j = 0; j < nElems; j++)
            if (MMax == a[j])
                break;
        for (int k = j; k < nElems; k++)
            a[k] = a[k + 1];
        nElems--;
    }
}
