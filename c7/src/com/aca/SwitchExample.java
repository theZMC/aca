package com.aca;

public class SwitchExample {
    public static void main(String[] args) {
        System.out.println(lastNameWinner("smith"));
        System.out.println(lastNameWinner("jones"));
        System.out.println(lastNameWinner("lazenby"));
        System.out.println(lastNameWinner("callahan"));

        System.out.println(dayOfWeekMap(2));
        System.out.println(dayOfWeekMap(7));
        System.out.println(dayOfWeekMap(100));
        System.out.println(dayOfWeekMap(4));
    }
    
    private static String lastNameWinner(String name) {
        name = name.toLowerCase();
        String out;
        
        if(name.equals("smith") || name.equals("jones")){
            out = "congratulations, grand winner";
        }
        else
        if(name.equals("lazenby")){
            out = "sorry, please try again";
        }
        else {
            out = "close, but no cigar";
        }
        
        return out;
    }

    private static String dayOfWeekMap(int day) {
        String out;

        switch(day){
            case 1:
            case 7:
                out = "weekend";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                out = "weekday";
                break;
            case 4:
                out = "hump day";
                break;
            default:
                out = "invalid - " + day;
        }
        
        return out;
    }

    // private static String lastNameWinner(String name) {
    //     name = name.toLowerCase();
    //     String out;

    //     switch(name){
    //         case "smith":
    //         case "jones":
    //             out = "congratulations, grand winner";
    //             break;
    //         case "lazenby":
    //             out = "sorry, please try again";
    //             break;
    //         default:
    //             out = "close, but no cigar";
    //     }
    // }
}
