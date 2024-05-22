package P03ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }
    public void buyProduct (Product product){
        if (product.getCost() <= money) {
            products.add(product);
            System.out.printf("%s bought %s%n",name, product.getName());
            money -= product.getCost();
        }else {
            throw new IllegalArgumentException(String.format("%s can't afford %s%n",name, product.getName()));
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" - ");

        if (!products.isEmpty()) {
            for (int i = 0; i < products.size(); i++) {
                sb.append(products.get(i).getName());
                if (i != products.size() - 1) {
                    sb.append(", ");
                }

            }
        }else {
            sb.append("Nothing bought");
        }
        return sb.toString();
    }
}
