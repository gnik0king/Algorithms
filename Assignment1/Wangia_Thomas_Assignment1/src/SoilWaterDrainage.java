public class SoilWaterDrainage {
    private int[] parent;
    private int[] size;
    private int n;

    public SoilWaterDrainage(int n) {
        this.n = n;
        parent = new int[n * n];
        size = new int[n * n];
        initialize();
    }

    private void initialize() {
        for (int i = 0; i < n * n; i++) {
            parent[i] = i;
            size[i] = i;
        }
    }

    private int getIndex(int row, int col) {
        return row * n + col;
    }

    private int root(int i) {
        while (i != parent[i]) {
            parent[i] = parent[parent[i]]; // Path compression
            i = parent[i];
        }
        return i;
    }

    private void union(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);

        if (rootP == rootQ)
            return;

        if (size[rootP] < size[rootQ]) {
            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
        } else {
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }
    }

    boolean allowsWaterToDrain(int[][] soil) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (soil[i][j] == 0) {
                    // If cell holds water, union it with neighboring cells
                    if (i > 0 && soil[i - 1][j] == 0) {
                        union(getIndex(i, j), getIndex(i - 1, j));
                    }
                    if (i < n - 1 && soil[i + 1][j] == 0) {
                        union(getIndex(i, j), getIndex(i + 1, j));
                    }
                    if (j > 0 && soil[i][j - 1] == 0) {
                        union(getIndex(i, j), getIndex(i, j - 1));
                    }
                    if (j < n - 1 && soil[i][j + 1] == 0) {
                        union(getIndex(i, j), getIndex(i, j + 1));
                    }
                }
            }
        }

        // Check if the top and bottom rows are connected
        for (int col = 0; col < n; col++) {
            if (soil[0][col] == 0 && soil[n - 1][col] == 0 && root(getIndex(0, col)) == root(getIndex(n - 1, col))) {
                return false; // Soil doesn't allow water to drain
            }
        }
        return true; // Soil allows water to drain
    }
}