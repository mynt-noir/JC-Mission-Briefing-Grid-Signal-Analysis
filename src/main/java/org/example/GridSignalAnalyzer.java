package org.example;

public class GridSignalAnalyzer {
    // Mission Data: The Scrambled Communications Grid
    char[][] scrambledGrid;

    public GridSignalAnalyzer() {
        this.scrambledGrid = new char[][]{
                {'C', 'H', 'A', 'R', 'L', 'I', 'E'},
                {'A', 'L', 'P', 'H', 'A'},
                {'T', 'A', 'N', 'G', 'O', '7'},
                {'B', 'R', 'A', 'V', 'O'}
        };
    }

    void analyzeWithForLoop() {
        for (int i = 0; i < scrambledGrid.length; i++) {
            for (int j = 0; j < scrambledGrid[i].length; j++) {
                System.out.print(scrambledGrid[i][j] + " ");
            }
            System.out.println();
        }
    }

    void analyzeWithForEachLoop() {
        for (char[] eachRow : scrambledGrid) {
            System.out.println("Processing Row with Hash: " + eachRow);
            for (char eachChar : eachRow) {
                System.out.println("-> " + eachChar);
            }
        }
    }

    void analyzeWithHybridLoop() {
        for (char[] eachRow : scrambledGrid) {
            for (int i = 0; i < eachRow.length; i++) {
                System.out.print(eachRow[i] + " ");
            }
            System.out.println();
        }
    }
}
