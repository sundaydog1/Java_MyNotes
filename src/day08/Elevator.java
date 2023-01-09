package day08;

public class Elevator {
    public static void main(String[] args) {
        int floorNumber = 10;
        if (floorNumber >= 1 && floorNumber <= 3) {
            if (floorNumber == 1) {
                System.out.println("Floor 1 selected. Companies : Lobby,Verizon,Starbucks");
            } else if (floorNumber == 2) {
                System.out.println("Floor 2 selected. Companies: Cydeo, NASA");

            } else {
                System.out.println("Floor 3 selected. Companies: Lyft, T-Mobile");
            }


        } else {
            System.out.println("invalid floor number");
        }


        System.out.println("----------------------------");

        String result = "Invalid Floor Number";
        if (floorNumber >=1 && floorNumber<=3){
            result = "Floor "+floorNumber+ " is selected. Companies : ";

            if(floorNumber==1){
                result +="Lobby, Verizon,Starbucks";
            }else if(floorNumber==2){
                result +="Cydeo, NASA";
            }else{
                result +="Lyft,T-mobile";
            }
        }
        System.out.println(result);

    }

}
