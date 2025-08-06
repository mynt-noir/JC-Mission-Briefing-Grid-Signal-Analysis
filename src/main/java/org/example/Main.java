package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GridSignalAnalyzer analyzer = new GridSignalAnalyzer();

        System.out.println("--- PHASE 2: STANDARD FOR-LOOP MANEUVER ---");
        analyzer.analyzeWithForLoop();

        System.out.println("\n--- PHASE 3: ADVANCED FOR-EACH SWEEP ---");
        analyzer.analyzeWithForEachLoop();

        System.out.println("\n--- PHASE 4: HYBRID LOOP APPROACH ---");
        analyzer.analyzeWithHybridLoop();
    }
}