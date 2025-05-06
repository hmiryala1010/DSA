package graphs;
import java.util.*;

public class WaterJugProblem {
    public static void main(String[] args) {
        int m = 5;
        int n = 3;
        int d = 4;

        int minSteps = returnMinSteps(m, n, d);
        System.out.println(minSteps);
    }

    private static int returnMinSteps(int jug1_MaxCap, int jug2_MaxCap, int d) {
        Set<Pair> visited = new HashSet<>();
        Queue<State> queue = new LinkedList<>();

        queue.add(new State(0, 0, 0));
        visited.add(new Pair(0, 0));

        while (!queue.isEmpty()) {
            State current = queue.poll();
            int jug1 = current.jug1;
            int jug2 = current.jug2;
            int count = current.count;

            if (jug1 == d || jug2 == d) {
                return count;
            }

            // Empty jug1
            if (visited.add(new Pair(0, jug2))) {
                queue.add(new State(0, jug2, count + 1));
            }

            // Empty jug2
            if (visited.add(new Pair(jug1, 0))) {
                queue.add(new State(jug1, 0, count + 1));
            }

            // Fill jug1
            if (visited.add(new Pair(jug1_MaxCap, jug2))) {
                queue.add(new State(jug1_MaxCap, jug2, count + 1));
            }

            // Fill jug2
            if (visited.add(new Pair(jug1, jug2_MaxCap))) {
                queue.add(new State(jug1, jug2_MaxCap, count + 1));
            }

            // Pour jug1 → jug2
            int pour = Math.min(jug1, jug2_MaxCap - jug2);
            if (visited.add(new Pair(jug1 - pour, jug2 + pour))) {
                queue.add(new State(jug1 - pour, jug2 + pour, count + 1));
            }

            // Pour jug2 → jug1
            pour = Math.min(jug2, jug1_MaxCap - jug1);
            if (visited.add(new Pair(jug1 + pour, jug2 - pour))) {
                queue.add(new State(jug1 + pour, jug2 - pour, count + 1));
            }
        }

        return -1;
    }

    // Helper class to store state (jug1, jug2, steps)
    static class State {
        int jug1, jug2, count;
        State(int jug1, int jug2, int count) {
            this.jug1 = jug1;
            this.jug2 = jug2;
            this.count = count;
        }
    }

    // Helper class for visited set (overrides equals and hashCode)
    static class Pair {
        int jug1, jug2;
        Pair(int jug1, int jug2) {
            this.jug1 = jug1;
            this.jug2 = jug2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pair)) return false;
            Pair p = (Pair) o;
            return jug1 == p.jug1 && jug2 == p.jug2;
        }

        @Override
        public int hashCode() {
            return Objects.hash(jug1, jug2);
        }
    }
}

