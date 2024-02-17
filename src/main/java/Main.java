import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int person;
        Scanner input = new Scanner(System.in);
        System.out.println("Добро пожаловать!\nНа сколько человек необходимо разделить Ваш счёт?...");

        while (true){
            System.out.println("Введите число от 2...");
            if (input.hasNextInt()){
                person = input.nextInt();
                if (person < 2) {
                    String sp = input.nextLine();
                    System.out.println("Неправильное значение!");
                } else {
                    break;
                }
            } else {
                String sp = input.nextLine();
                System.out.println("Неправильное значение!");
            }
        }

        Calculator summator = new Calculator(person);
        String nameProduct = "";
        double priceProduct = 0.0d;

        ADD:
        while (true) {
            System.out.println("Введите название товара:");
            nameProduct = input.next();
            Products products =new Products(nameProduct);

            while (true){
                double sp = 0.0d;
                System.out.println("Введите стоимость товара:");
                if (input.hasNextDouble()){
                    sp = input.nextDouble();
                    if (sp > 0){
                        products.priceProducts = sp;
                        summator.addToSpisok(products.nameProducts);
                        summator.sum(products.priceProducts);
                        System.out.println("Товар добавлен.\nХотите добавить еще товар?\n\"Добавить\" или \"Завершить\"");
                        String answer = input.next().trim().toLowerCase();
                        if (answer.equals("добавить")) {
                            continue ADD;
                        } else if (answer.equals("завершить")){
                            break ADD;
                        } else {
                            System.out.println("Неправильное значение!");
                            continue ADD;
                        }

                    } else {
                        System.out.println("Неправильное значение!");
                        continue;
                    }
                } else {
                    System.out.println("Неправильное значение!");
                    String tp = input.nextLine();
                    continue;
                }
            }
        }

        System.out.println("Добавленные товары:");
        summator.printToCheck(person); // Печатаем чек
        input.close();
    }
}