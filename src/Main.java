public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 6");
        var fighterWeight1 = 78.2;
        System.out.println("Вес первого бойца " + fighterWeight1 + " кг.");
        var fighterWeight2 = 82.7;
        System.out.println("Вес второго бойца " + fighterWeight2 + " кг.");
        var totalWeight = fighterWeight1+fighterWeight2;
        System.out.println("Общий вес бойцов " + totalWeight + " кг.");
        var weightDifference = fighterWeight1-fighterWeight2;
        System.out.println("Разница в весе бойцов " + Math.abs(weightDifference) + " кг."); //загуглил как взять модуль от числа, чтобы не было отрицательного числа
        System.out.println("Общий вес бойцов " + totalWeight + " кг.");
        System.out.println("------------------------------------------");
        System.out.println("Задание 7");
        weightDifference = fighterWeight2-fighterWeight1; // первый способ, вычитаем от большего веса меньший
        System.out.println("Разница в весе бойцов полученная первым способом = " + weightDifference + " кг.");
        weightDifference = fighterWeight2%fighterWeight1; // второй способ, остаток от деления
        System.out.println("Разница в весе бойцов полученная вторым способом = " + weightDifference + " кг.");
        System.out.println("------------------------------------------");
        System.out.println("Задание 8");
        System.out.println("Дано:");
        var totalHours = 640;
        System.out.println("Всего " + totalHours + " часов");
        var hoursEmployees = 8;
        System.out.println(hoursEmployees + " часов отрабаывает каждый сотрудник в день");
        System.out.println("Следовательно в комании " + totalHours + "/" + hoursEmployees + "=" + totalHours/hoursEmployees + " сотрудников");
    }
}
