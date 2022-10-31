public class Thingy {
    public static void main(String[] args) {
        System.out.println("Feet" + "   " + "Miles" + "   " + "Kilometers" + "   " + "|" + "   " + "Kilometers" + "   " + "Miles" + "   " + "Feet");
        for(int x = 1; x<=15; x++){
            System.out.print((x*5280) + space1(2, x) + x + space2(7, x, 10));
            System.out.printf("%.3f", (x*1.609));
            System.out.print(space2(8,x,7) + "|" + "   " + x + space2(12, x, 10));
            System.out.printf("%.3f", x * 0.6213712);
            System.out.print("   ");
            System.out.printf("%.3f",x*3280.84);
            System.out.println();

        }
    }

    public static String space1(int num, int x){
        String space = "";
        if (x == 1){
            num++;
        }
        for(int y = 0; y < num; y++){
            space += " ";
        }
        return space;
    }
    public static String space2(int num, int x, int start){
        String space = "";
        if (x >= start){
            num--;
        }
        for(int y = 0; y < num; y++){
            space += " ";
        }
        return space;
    }

}
