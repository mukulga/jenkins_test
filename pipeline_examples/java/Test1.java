public class Test1 {

    public static void main(String[] args) {
       int noOfTimes = Integer.valueOf(args[0]);
       for (int idx = 0; idx < noOfTimes; idx++) {
	      System.out.println(idx + 1 + ". Hello");
	   }
    }
}