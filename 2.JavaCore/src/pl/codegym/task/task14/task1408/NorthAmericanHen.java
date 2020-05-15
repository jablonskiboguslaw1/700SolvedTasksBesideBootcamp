package pl.codegym.task.task14.task1408;

public class NorthAmericanHen extends Hen{
    @Override
    int getMonthlyEggCount() {
        return 28;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Pochodzę z " + Continent.NORTHAMERICA + ". Znoszę " + getMonthlyEggCount() + " jaj na miesiąc.";
    }
}
