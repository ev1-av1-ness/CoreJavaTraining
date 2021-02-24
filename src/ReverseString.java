public class ReverseString {

  public static void main(String[] args) {
    int[] a = {4, 5, 5, 5, 4, 6, 6, 9, 4};
    //Print unique numbers from the list
    //Print the string in reverse - palindrome or not

    String s = "madam";
    String t = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      //проиграть в обратном порядке

      t = t + s.charAt(i);

    }
    if (s.equals(t)) {

      System.out.println("it's a palindrome");

    }
    //Strings are immutable in Java
  }

}
