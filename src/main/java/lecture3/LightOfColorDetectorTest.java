package lecture3;

public class LightOfColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetector detector = new LightColorDetector();
        System.out.println(detector.detect(390));
        System.out.println(detector.detect(460));
        System.out.println(detector.detect(500));
        System.out.println(detector.detect(580));
        System.out.println(detector.detect(600));
        System.out.println(detector.detect(650));
    }

}
