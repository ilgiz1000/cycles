public class Main {
    public static void main(String[] args) {
        for (int i =1;i<10;i=i+1) {
            System.out.println( i);
        }

        for (int l = 10; l>0;l--) {
            System.out.println(l);
        }
        for (int i = 0; i < 17; i=i+2){
            System.out.println(i);
        }
        for(int b=10; b>-10; b--){
            System.out.println(b);
        }
        for(int year=1904; year<2096; year=year+4){
            System.out.println(year + "год является високосным");
        }
        for(int u=7; u<99; u=u+7){
            System.out.println(u);
        }
        for (int e=1; e<513; e=e*2){
            System.out.println(e);
        }


        int accumulation=29000;
        int total = 0;
        for(int i=1;i<13;i++){
            total= total+accumulation;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + total + "рублей");
        }

        int monetaryAccumulation=29000;
        int totalA = 0;
        for(int i=0;i<13;i++) {
            total = totalA + totalA/100;
            totalA= totalA+monetaryAccumulation;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + total + "рублей");
        }
        int c= 2;
        for(int a=1; a<10; a=a+1) {
            System.out.println(c + "*" + a + "=" + a*c);
        }
    }
}

