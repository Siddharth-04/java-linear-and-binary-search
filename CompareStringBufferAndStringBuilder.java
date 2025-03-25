public class CompareStringBufferAndStringBuilder {
    public static void measureTime( StringBuffer stringBuffer,StringBuilder stringBuilder){
        long startTime, endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            stringBuffer.append("Hi");
        }
        endTime = System.nanoTime();
        long bufferTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            stringBuilder.append("Hi");
        }
        endTime = System.nanoTime();
        long builderTime = endTime - startTime;

        System.out.println("Time taken by StringBuffer: " + bufferTime + " ns");
        System.out.println("Time taken by StringBuilder: " + builderTime + " ns");
    }
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

        measureTime(stringBuffer,stringBuilder);

    }
}
