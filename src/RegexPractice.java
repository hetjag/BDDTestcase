public class RegexPractice {

    //Method call from down
    public static void main(String[] args){
        removeAllCharacterSFromString();
        findLengthOfString();
        removeSpacesFromString();
        extractSpecialCharactersFromString();
        extractNumberFromString();
        convertIntToString();
        convertStringToInteger();
        convertDoubleNumberToString();
        convertStringToDouble();
        findOutAnswerInDecimal();
        replaceSymbolFromString();
    }







   //Remove s character from string
    public static void removeAllCharacterSFromString() {
        String oldString = "This is very easy programme";
        String newString = oldString.replaceAll("s", "");
        System.out.println("After removing character s = " + newString);
    }
     // find length of string
        public static void findLengthOfString(){
            String oldString = "This is very easy programme";
            int length =  oldString.length();
            System.out.println(" Length of String = "+length);


        }
     // Remove spaces from string
        public static void removeSpacesFromString() {
            String oldString = "This is very easy programme";
            String newString = oldString.replaceAll("\\s+", "");
            System.out.println("After removing spaces =" + newString);
        }
      //Extract special characters from string
            public static void extractSpecialCharactersFromString() {
                String oldString = "This $300 is equivalent of £200 but not for @100";
                String newString = oldString.replaceAll("[$£@]", "");
                System.out.println("Extra special character =" + newString);

            }
      //Extract number from string
         public static void extractNumberFromString(){
            String oldString = "The cost of iPhone is £1,250";
            String newString = oldString.replaceAll("[1250]","");
            System.out.println("Extract number from string ="+newString);

         }
      //Convert integer to string
        public static void convertIntToString() {
            int old = 450;
            String newString = Integer.toString(old);
            System.out.println("Convert int to string =" + (old));

        }

       //Convert string to integer
        public static void convertStringToInteger(){
             String old = "125";
             int result = Integer.parseInt(old);
             System.out.println("Convert string to int ="+ (result));

    }

        //Convert double number to string
        public static void convertDoubleNumberToString(){
              double old = 123.45;
              String result = Double.toString(old);
              System.out.println("Convert double to string ="+(result));


        }
        //Convert string to double
        public static void convertStringToDouble(){
               String old = "560.25";
               Double result = Double.parseDouble(old);
               System.out.println("Convert string to double ="+(old));



        }
        //Find out answer in decimal
        public static void findOutAnswerInDecimal() {

            float old = 1 / 3;
            Double result = Double.parseDouble(String.valueOf(old));
            System.out.println("Find out answer in decimal =" + (old));

        }

        //Replace symbol from string
        public static void replaceSymbolFromString(){
                String old = "$250.00";
                String result = old.replaceAll("\\$+","£");
                System.out.println("Replace symbol from string ="+result);


        }






            }
