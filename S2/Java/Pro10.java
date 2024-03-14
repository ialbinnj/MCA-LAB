class Pro10{
    static int area(int s){
        return s*s;
    }
    static int area(int l,int b){
        return l*b;
    }
    static double area(double r){
        return 3.14*r*r;
    }
    public static void main(String[] args){
        int s = 10;
        int l = 6;
        int b = 4;
        double r = 20;
        System.out.println("Area of Square :"+area(s));
        System.out.println("Area of Reactangle :"+area(l,b));
        System.out.println("Area of Circle :"+area(r));
    }
}
