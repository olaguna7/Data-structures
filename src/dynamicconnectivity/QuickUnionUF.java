package dynamicconnectivity;

public class QuickUnionUF {
    private int id[];

    /* Set id of each object to itself (N array access) */
    public QuickUnionUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    /* Chase parent pointers until reach root (depth of i array accesses) */
    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }

        return i;
    }

    /* Check if p and q have same root (depth of p and q array accesses) */
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    /* Change root of p to point to root of q (depth of p and q array accesses) */
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }


}
