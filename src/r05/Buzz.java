package r05;

public class Buzz {

    public static void baffle(String blimp) {
        System.out.println(blimp);  //5
        zippo("ping", -5);  //6
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) { //2  //7
            System.out.println(quince + " zup");  //8
        } else {
            System.out.println("ik");  //3
            baffle(quince);    //4
            System.out.println("bu-ua-ha-ha");  //9
        }
    }

    public static void main(String[] args) {
        zippo("grzechot", 13); //1
    }

}
  //ad3 grzechot

//ik grzechot ping zup bu-ua-ha-ha