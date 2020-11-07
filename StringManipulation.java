
public class StringManipulation {

    private String str;

    public StringManipulation(String str) {
        this.str = str;
    }

    public void findSubstring(String find) {

        for(int i=0; i<str.length(); i++){

            boolean isExists = true;

            for(int j=0; j<find.length(); j++) {

                /** Provided this if condition to avoid error. If the 'i' variable is on the last index, and if I don't provide this
                 *  if-block then it will go ahead and will check the str.charAt(i+j) in the next if-block and it might throw an
                 *  error when the j is greater than and equal to 1; i.e. it is actually checking for the character in the index
                 *  which is out of bound. Also changed the 'isExist' to false, else it will print the message that we found,
                 *  as we are assigning the 'isExist' to true in every iteration of 'i' */
                if(i+j == str.length()) {
                    isExists = false;
                    break;
                }
                if(str.charAt(j+i) != find.charAt(j)) {
                    isExists = false;
                    break;
                }
            }
            if(isExists) {
                System.out.println("String exists from index of : " + i);
                return;
            }
        }
        System.out.println("String not found ! ");
    }

    public void countOccurences(String find) {

        int occurences = 0;

        for(int i=0; i<str.length(); i++){

            boolean isExists = true;

            for(int j=0; j<find.length(); j++) {

                /** Provided this if condition to avoid error. If the 'i' variable is on the last index, and if I don't provide this
                 *  if-block then it will go ahead and will check the str.charAt(i+j) in the next if-block and it might throw an
                 *  error when the j is greater than and equal to 1; i.e. it is actually checking for the character in the index
                 *  which is out of bound. Also changed the 'isExist' to false, else it will increment the 'occurences',
                 *  as we are assigning the 'isExist' to true in every iteration of 'i' */
                if(i+j == str.length()) {
                    isExists = false;
                    break;
                }
                if(str.charAt(i+j) != find.charAt(j)) {
                    isExists = false;
                    break;
                }
            }
            if(isExists) {
                occurences++;
            }
        }
        System.out.println("String Occucrences : " + occurences);
    }

}
