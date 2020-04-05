public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.66;
        double weight = 62;
        double bmi = service.calculate(height, weight);
        System.out.println(bmi);
    }
}
