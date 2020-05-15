package com.codegym.task.task24.task2406;

import java.math.BigDecimal;

/* 
Inheriting an inner class

*/
public class Solution {
    public static class Building {
        public static class Hall {
            private BigDecimal area;

            public Hall(BigDecimal area) {
                this.area = area;
            }
        }

        public static class Apartment {
        }

    }

    public class ThreeBedroomApt extends Building.Apartment{}
    public class BigHall extends Building.Hall {

        public BigHall(BigDecimal area) {
            super(area);
        }
    }
    public static void main(String[] args) {

    }
}
