public class Main {
    public static void main(String[] args) {
        var fighterWeight1 = 78.2;
        System.out.println("Вес первого бойца " + fighterWeight1 + " кг.");
        var fighterWeight2 = 82.7;
        System.out.println("Вес второго бойца " + fighterWeight2 + " кг.");
        var totalWeight = fighterWeight1+fighterWeight2;
        System.out.println("Общий вес бойцов " + totalWeight + " кг.");
        var weightDifference = fighterWeight1-fighterWeight2;
        System.out.println("Разница в весе бойцов " + Math.abs(weightDifference) + " кг."); //загуглил как взять модуль от числа, чтобы не было отрицательного числа
    }
}