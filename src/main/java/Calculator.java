import java.util.ArrayList;

public class Calculator {
    double countCheck;
    int per;
    ArrayList<String> spisokProdutcs = new ArrayList<>();
    Calculator(int per) {
        this.per = per;
        this.countCheck = 0.0d;
    }
    void sum (double price) {
        this.countCheck += price;
    }

    void addToSpisok (String products) {
        spisokProdutcs.add(products);
    }

    void printToCheck (int person){
        Rubls rubls = new Rubls();
        for (String name : spisokProdutcs) {
            System.out.println(name);
        }
        System.out.println(String.format("Сумма для каждого %.2f %s", countCheck / person, rubls.rusToCase(countCheck / person)));
    }
}
