package P05Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {

        StringBuilder sb = new StringBuilder();
        for (String url : urls) {
            sb.append("Browsing: ").append(url).append("!").append(System.lineSeparator());
        }



        return String.valueOf(sb);
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        for (String number : numbers) {
            sb.append("Calling... ").append(number).append(System.lineSeparator());
        }


        return String.valueOf(sb);
    }
}
