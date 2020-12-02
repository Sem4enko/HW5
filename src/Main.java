public class Main {
    public static void main(String[] args) {
        MyList<Integer> intNum = new MyList<>();
        intNum.add(17);
        intNum.add(-13);
        int min = intNum.getSmallest();
        int max = intNum.getLargest();
        System.out.println("Smallest number:"+min);
        System.out.println("Largest number:"+max);

        MyList<Double> doubleNum = new MyList<>();
        doubleNum.add(13.55);
        doubleNum.add(5.9);
        double minDouble = doubleNum.getSmallest();
        double maxDouble = doubleNum.getLargest();
        System.out.println("\nSmallest number:"+minDouble);
        System.out.println("Largest number:"+maxDouble);
    }
}
