import java.io.FileInputStream;
import java.io.FileNotFoundException;


class PositiveNumberException extends Exception {
    public PositiveNumberException(String msg) {
        super(msg);
    }
}

public class NegativeFromFile {
    //        public static void main(String[] args) throws FileNotFoundException {
//        try {
//            FileInputStream file = new FileInputStream("Java/negative");
//            int i = 0, count = 0;
//            String value = "";
//            while ((i = file.read()) != -1) {
//                value += (char) i;
//                if (!String.valueOf((char) i).equals(" ")) {
//                    if ((int) value.charAt(0) >= 48) {
//                        count=0;
//                        throw new PositiveNumberException("There is a Positive Number, Number : " + value);
//                    } else {
//                        count=1;
//                    }
//                } else {
//                    value = "";
//                }
//            }
//
//            if (count == 1) {
//                System.out.println("No Positive Numbers");
//            }
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//
//    }
    public static void main(String[] args) throws FileNotFoundException {
        try (FileInputStream file = new FileInputStream("Java/negative")) {
            int i, count = 0;
            StringBuilder value = new StringBuilder();
            while ((i = file.read()) != -1) {
                value.append((char) i);
            }
            String[] val = value.toString().split(" ");
            int[] intVal = new int[val.length];
            int index = 0;
            for (String s : val) {
                if (Integer.parseInt(s) >= 0) {
                    count = 0;
                    intVal[index] = Integer.parseInt(s);
                } else {
                    count = 1;
                }
                index++;
            }
            StringBuilder resultNum = new StringBuilder();
            for (int s : intVal) {
                if (s != 0)
                    resultNum.append(s).append(", ");
            }
            if (count == 1) {
                System.out.println("No Positive Numbers");
            } else {
                throw new PositiveNumberException("There is Positive Numbers, Numbers : " + resultNum.substring(0, resultNum.length() - 2));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
