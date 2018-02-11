package practice.practice;
import java.util.ArrayList;
import javax.swing.JOptionPane;
// add event listener, create method instead of loop.

class list {
    //ArrayList roster = new ArrayList();
    String name;
    int age;
    public void setName (String name){
        this.name = name;
        }
    public String getName () {
        return name;
        }
    public void setAge ( int age){
        this.age = age;
        }
    public int getAge () {
        return age;
        }

    //list(String name,int age){
    //    roster.add(name + age);
    //    JOptionPane.showMessageDialog(null, "The roster now holds " + roster);
    //    }
}

public class Roster {

    public String askName() {
        String inputName = JOptionPane.showInputDialog(null, "Enter a name ");
        String name = inputName;
        if (inputName == null){
            System.exit(0);
        }
        return name;
    }

    public int askAge() {
        String inputAge = JOptionPane.showInputDialog(null, "Enter the age ");
        if (inputAge == null){
            System.exit(0);
        }
        int age = Integer.parseInt(inputAge);
        return age;
    }
//---------------------Main------------------------------------//
    public static void main(String[] args) {
        Roster newRoster = new Roster();
        ArrayList roster = new ArrayList();

        boolean noOpt = true;
        while (noOpt = true) {

            String name = newRoster.askName();
            int age = newRoster.askAge();
            int submit = JOptionPane.showConfirmDialog(null, "Would you like to submit " + name + " age " + age +
                    " to the roster?", "Submit", JOptionPane.YES_NO_CANCEL_OPTION);

            if (submit == JOptionPane.YES_OPTION) {
               // new list(name, age);
                roster.add(name + age);
                JOptionPane.showMessageDialog(null, "The roster now holds " + roster);

            }
            else if (submit == JOptionPane.CANCEL_OPTION) {
                System.exit(0);
            }
        }
    }
}
