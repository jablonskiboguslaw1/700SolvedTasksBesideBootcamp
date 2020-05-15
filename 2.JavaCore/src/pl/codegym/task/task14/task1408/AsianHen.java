package pl.codegym.task.task14.task1408;

public class AsianHen extends Hen{
    @Override
    int getMonthlyEggCount() {
        return 18;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Pochodzę z " + Continent.ASIA + ". Znoszę " + getMonthlyEggCount() + " jaj na miesiąc.";
    }
}
