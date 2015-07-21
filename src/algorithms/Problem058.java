package algorithms;

/**
 * Length of Last Word
 *
 * @author kobe
 *
 */
public class Problem058 {

  public int lengthOfLastWord(String s) {

    int length = 0;

    if (s==null || s.length()==0 ) {
      return length;
    }
    
    char[] charAry = s.toCharArray();
    
    boolean isWord = false;
    for (int i=charAry.length-1; i>=0; i--) {
      
      if (charAry[i]!=' ') {
        isWord = true;
        length++;
      } else if(isWord){
        break;
      }
      
    }

    return length;

  }

  public static void main(String args[]) {

    Problem058 p = new Problem058();

    String s = "Hello World";

    long start = System.currentTimeMillis();
    System.out.println(p.lengthOfLastWord(s));
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }

}
