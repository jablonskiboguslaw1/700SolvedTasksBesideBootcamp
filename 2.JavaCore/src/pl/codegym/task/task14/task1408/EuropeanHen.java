package pl.codegym.task.task14.task1408;

public class EuropeanHen extends Hen{
    @Override
    int getMonthlyEggCount() {
        return 22;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Pochodzę z " + Continent.EUROPE + ". Znoszę " + getMonthlyEggCount() + " jaj na miesiąc.";
    }
}
