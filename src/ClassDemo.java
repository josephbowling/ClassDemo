import java.util.Scanner;

public class ClassDemo {

    public static float metricConverter(String sourceMetric, String targetMetric, float sourceNum) {
        float targetNum = 0;
        switch (sourceMetric) {
            case "km": 
                switch (targetMetric) {
                    case "m":
                      targetNum = sourceNum * (float) 1000;
                      break;
                    case "feet":
                      targetNum = sourceNum * (float) 3280.84;
                      break;
                    case "miles":
                      targetNum = sourceNum / (float) 1.6;
                      break;
                    case "yards":
                      targetNum = sourceNum * (float) 1093.61;
                      break;
                    case "in":
                      targetNum = sourceNum * (float) 39370.1;
                      break;
                    case "nauticalmiles":
                      targetNum = sourceNum / (float) 2.205;
                      break;
                    default:
                      System.out.println("Your input is not handled. Please try again.");
                      return targetNum;
                }
        }
        System.out.printf("%.2f %s = %.2f %s%n", sourceNum, sourceMetric, targetNum, targetMetric);
        return targetNum;
    }
    
        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            String str;
            String[] strArray;
            float sourceNum;
            String sourceMetric;
            String targetMetric;
            while (true) {
                System.out.println("Welcome! To begin, please input your metric to be converted, for example, 1 km = 1 m. To exit this program, simply type exit.");
                str = scanner.nextLine();
                if (str.equals("exit")) {
                    System.out.println("Thank you, goodbye!");
                    scanner.close();
                    break;
                }
                strArray = str.split(" ");
                if(strArray.length != 4) {
                    System.out.println("Your input is not valid. Please try again");
                    continue;
                } else {
                    sourceNum = Float.parseFloat(strArray[0]);
                    sourceMetric = strArray[1];
                    targetMetric = strArray[3];
                    metricConverter(sourceMetric, targetMetric, sourceNum);
                }
            }
            scanner.close();
        }
    }
