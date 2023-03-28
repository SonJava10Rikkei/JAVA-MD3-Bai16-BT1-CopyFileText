import java.util.List;

public class Main {
//    public static List<Integer> coppyFile(List<Integer> number) {
//        for (int i = 0; i < number.size(); i++) {
//            System.out.println(number.get(i));
//        }
//        return number;
//    }

    public static void main(String[] args) {
        ReadWriterAndCoppyFile readWriterAndCoppyFile = new ReadWriterAndCoppyFile();
        String PATH_ELEMENT = "src/source";
        String PATH_COPPY = "src/target";
        List<Integer> element = readWriterAndCoppyFile.readFile(PATH_ELEMENT);
        List<Integer> coppyElement = element;
        readWriterAndCoppyFile.writeFile(PATH_COPPY, coppyElement);
    }
}