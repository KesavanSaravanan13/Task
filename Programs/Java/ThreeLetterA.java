import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ThreeLetterA {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>(Arrays.asList(
                "Anu", "Hi there", "Boopathi", "abi", "Abdul", "Sunil"
        ));
        Stream<String> resultString = listOfStrings.stream().map(listOfString -> {
            if (listOfString.charAt(0) == 'a' && listOfString.length()==3 ) {
                return listOfString;
            } else {
                return "";
            }
        });
        resultString.filter(list->!list.equals("")).forEach(System.out::println);
    }
}
