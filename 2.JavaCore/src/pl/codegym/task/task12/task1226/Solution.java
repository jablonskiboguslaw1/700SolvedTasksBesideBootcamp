package pl.codegym.task.task12.task1226;

/* 
Wspinaj się, lataj i biegaj
*/

public class Solution {

    public static void main(String[] args) {

    }

    public class Cat implements CanClimb,CanRun{
        @Override
        public void run() {

        }

        @Override
        public void climb() {

        }
    }

    public class Dog implements CanRun{
        @Override
        public void run() {

        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanRun,CanFly{
        @Override
        public void run() {

        }

        @Override
        public void fly() {

        }
    }

    public interface CanRun{
        public void run();

    }
    public interface CanFly{
        public void fly();
    }
    public interface CanClimb{
        public void climb();
    }
}
