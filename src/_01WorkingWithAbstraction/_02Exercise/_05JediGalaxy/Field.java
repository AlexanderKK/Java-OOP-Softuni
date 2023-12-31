package _01WorkingWithAbstraction._02Exercise._05JediGalaxy;

public class Field {
    private long[][] starsField;

    public Field(int rows, int cols) {
        this.starsField = new long[rows][cols];
        fillInGalaxy(rows, cols, starsField);
    }

    private void fillInGalaxy(int rows, int cols, long[][] galaxy) {
        int value = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                galaxy[row][col] = value++;
            }
        }
    }

    public boolean isInBounds(int row, int col) {
        return row >= 0 && col >= 0 && row < starsField.length && col < starsField[row].length;
    }

    public long getValue(int row, int col) {
        return starsField[row][col];
    }

    public void setValue(int row, int col, int newValue) {
        starsField[row][col] = newValue;
    }

    public long getColLength() {
        return starsField[1].length;
    }
}
