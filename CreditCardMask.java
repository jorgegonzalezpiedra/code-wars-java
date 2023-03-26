public class CreditCardMask {
    // Usually when you buy something, you're asked whether your credit card number,
    // phone number or answer to your most secret question is still correct.
    // However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.

    //Your task is to write a function maskify, which changes all but the last four characters into '#'.
    public static void main(String[] args) {
        System.out.println(maskify("Nananananananananananananananana Batman!"));
    }

    //MY SOLUTION

    /**
     * Method to mask a String replacing last four characters into '#'
     * <p>
     * Examples:
     * </p>
     *
     *<pre>
     *
     * "4556364607935616" --> "############5616"
     *      "64607935616" -->      "#######5616"
     *                "1" -->                "1"
     *                 "" -->                 ""
     * "Skippy" --> "##ippy"
     *
     * "Nananananananananananananananana Batman!" -> "####################################man!"
     *
     *</pre>
     *
     * @param str {@link String} to mask
     *
     * @return String string masked
     *
     */
    public static String maskify(String str){

        StringBuilder sb = new StringBuilder();

        // null/empty control here in case its needed (exercise does not specify it)

        if(str.length() > 4){

            for(int i = 0 ; i < str.length() ; i++){

                if(i >= str.length() - 4){
                    sb.append(str.charAt(i));
                }else{
                    sb.append("#");
                }

            }

        }else{
            sb.append(str);
        }

        return sb.toString();
    }

    //SOLUTIONS FROM AROUND THE WORLD

/*    public static String maskify(String str) {
        return str.replaceAll(".(?=.{4})", "#");
    }*/

 /*   public static String maskify(String str) {
        char[] strChars = str.toCharArray();
        for( int i = 0; i < strChars.length - 4; i++ ) {
            strChars[i] = '#';
        }
        return new String(strChars);
    }*/

 /*   public static String maskify(String str) {
        return str.length()<=4 ? str : str.substring(0,str.length()-4).replaceAll(".","#") + str.substring(str.length()-4);
    }*/



}
