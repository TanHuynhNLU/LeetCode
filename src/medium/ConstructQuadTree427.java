package medium;

public class ConstructQuadTree427 {
    public Node construct(int[][] grid) {
        return construct(grid, new int[]{0, 0}, grid.length);
    }

    public Node construct(int[][] grid, int[] position, int l) {
        boolean isLeaf = isLeaf(grid, position, l);
        Node node = null;
        if (isLeaf) {
            node = new Node(grid[position[0]][position[1]] == 1, true);
        } else {
            Node topLeft = construct(grid, position, l / 2);
            Node topRight = construct(grid, new int[]{position[0], position[1] + l / 2}, l / 2);
            Node bottomLeft = construct(grid, new int[]{position[0] + l / 2, position[1]}, l / 2);
            Node bottomRight = construct(grid, new int[]{position[0] + l / 2, position[1] + l / 2}, l / 2);
            node = new Node(true, false, topLeft, topRight, bottomLeft, bottomRight);
        }
        return node;
    }

    public boolean isLeaf(int[][] matrix, int[] position, int l) {
        int target = matrix[position[0]][position[1]];
        for (int i = position[0]; i < position[0] + l; i++) {
            for (int j = position[1]; j < position[1] + l; j++) {
                if (matrix[i][j] != target) return false;
            }
        }
        return true;
    }

    class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;


        public Node() {
            this.val = false;
            this.isLeaf = false;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }
    }
}
