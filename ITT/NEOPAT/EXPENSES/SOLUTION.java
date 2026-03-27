import java.util.*;

class Main {
    public static void main(String[] args) {
        double branding, travel, food, logistics, sum = 0.00;
        Scanner sc = new Scanner(System.in);

        branding = sc.nextDouble();
        travel = sc.nextDouble();
        food = sc.nextDouble();
        logistics = sc.nextDouble();

        sum = branding + travel + food + logistics;

        System.out.printf("Total expenses: Rs.%.2f\n", sum);
        System.out.printf("Branding expenses percentage: %.2f%%\n", (branding / sum) * 100);
        System.out.printf("Travel expenses percentage: %.2f%%\n", (travel / sum) * 100);
        System.out.printf("Food expenses percentage: %.2f%%\n", (food / sum) * 100);
        System.out.printf("Logistics expenses percentage: %.2f%%\n", (logistics / sum) * 100);

        sc.close();
    }
}
