//Indentation

//Acceptable indentation
import java.util.*;
package mypackage;
public class DosDonts {
    //this is indented once
    public static void main(String args[]) {
        int x = 0;
    }
}


//indented too far
import java.util.*;
package mypackage;
public class DosDonts {

        //main is indented two times
        public static void main(String args[]) {
            int x =0; //this line is indented correctly
        }
}

//==================================
//==================================
//Good
public boolean numberGreaterThanSix(int number){
    return number > 6;
}
//Redundant . Don't do this
public boolean numberGreaterThanSix(int number){
    if (number > 6){
      return true;
    } else {
      return false;
    }
}

//more examples
//Good
public void hashMapThingy(String key, HashMap<String,String> map){
    if (map.contains(key)){
        // do stuff
     } else {
        //do other stuff
    }
}
//redundant, do not do this
public void hashMapThingy(String key, HashMap<String,String> map){
    if (map.contains(key)==true){
        // do stuff
     } else {
        //do other stuff
    }
}
