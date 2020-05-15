package pl.codegym.task.task14.task1411;

public interface Person {}
    class User implements Person {
        static void live() {
            System.out.println("Zazwyczaj po prostu żyję.");
        }
    }

    class Loser implements Person {
        static void doNothing() {
            System.out.println("Zazwyczaj nie robię nic.");
        }
    }

    class Coder implements Person {
        static void writeCode() {
            System.out.println("Zazwyczaj koduję.");
        }
    }

    class Programmer implements Person {
        static void enjoy() {
            System.out.println("Życie jest piękne!");
        }
    }


