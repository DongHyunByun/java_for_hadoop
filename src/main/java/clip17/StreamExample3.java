package clip17;

import java.net.ProxySelector;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample3 {
    static class Sale {
        public Sale(String fruitName, int price, float discount) {
            this.fruitName = fruitName;
            this.price = price;
            this.discount = discount;
        }

        String fruitName;
        int price;
        float discount;
    }
    public static void main(String[] args) {
        List<Sale> saleList = Arrays.asList(
                new Sale("Apple", 500, 0.05f),
                new Sale("Grape", 600, 0.1f),
                new Sale("Orange", 700, 0.2f),
                new Sale("Tangerine",200,0f)
        );

        Stream<Sale> saleStream = saleList.stream();
        //saleStream.map(sale-> Pair.of(sale.fruitName, sale.price * (1 - sale.discount))).forEach(pair-> System.out.println(pair.getLeft()+"실 구매가 : "+pair.getRight()));

    }
}
