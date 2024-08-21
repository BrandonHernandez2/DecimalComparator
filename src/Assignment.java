public class Assignment {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.1756));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));


        //num1Check = -3
        //num1 -= numCheck = -3.1756 - (-3) = -0.1756
        //num1 *= 10 + -1.756
    }

    private static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        if(num1 < 0 && num2 >= 0){
            return false;
        }

        if(num1 >= 0 && num2 < 0){
            return false;
        }

        long num1Check = Math.round(num1);
        long num2Check = Math.round(num2);
        if(num1Check != num2Check){
            return false;
        }

        num1 -= num1Check;
        num1 *= 10;
        num2 -= num2Check;
        num2 *= 10;

        num1Check = Math.round(num1);
        num2Check = Math.round(num2);

        if(num1Check != num2Check){
            return false;
        }
        //repeat lines 30 to 40 2 more times

            num1 -= num1Check;
            num1 *= 10;
            num2 -= num2Check;
            num2 *= 10;

            num1Check = Math.round(num1);
            num2Check = Math.round(num2);

            if(num1Check != num2Check){
                return false;
            }

            num1 -= num1Check;
            num1 *= 10;
            num2 -= num2Check;
            num2 *= 10;

            num1Check = Math.round(num1);
            num2Check = Math.round(num2);

            if(num1Check != num2Check){
                return false;
            } else {
                    return true;
                }

    }
}
