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


//indented too far and inconsistent
import java.util.*;
package mypackage;
public class DosDonts {

        //main is indented two times
        public static void main(String args[]) {
            int x = 0; //this line is indented once
        }
}

//too much indentation
import java.util.*;
package mypackage;
public class DosDonts {
       //main is indented twice
        public static void main(String args[]) {
                int x = 0; //this is also indented twice
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

//=========================
//Spacing around brackets
//good
myArray[i];

//avoid
myArray[ i ];