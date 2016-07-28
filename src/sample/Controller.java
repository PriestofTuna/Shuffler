package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.util.ArrayList;

public class Controller {
    private ArrayList<String> stList = new ArrayList<>();
    private ArrayList<Integer> inList = new ArrayList<>();
    //Initializes the lists
    @FXML   TextArea output;
    @FXML
    public void getList(ActionEvent actionEvent) {
        output.deleteText(0, output.getLength());
        String first ="first", second = "second", third = "Third", fourth = "fourth", fifth = "fifth", sixth = "sixth";
        stList.add(first);
        stList.add(second);
        stList.add(third);
        stList.add(fourth);
        stList.add(fifth);
        stList.add(sixth);
        //creates dummy values
        String send ="";
        String sendInt="";
        int firstI=1, secondI=2, thirdI=3, fourthI=4, fifthI=5, sixthI =6;
        inList.add(firstI);
        inList.add(secondI);
        inList.add(thirdI);
        inList.add(fourthI);
        inList.add(fifthI);
        inList.add(sixthI);
        //dummy values
        shuffle(stList);
        shuffle(inList);
        //calls shuffle

        for(int i = 0; i < stList.size(); i++) {
            send += stList.get(i) + " ";
            //makes a String hold the values, whether they be objects or values
        }
        for(int i = 0; i < inList.size(); i++) {
            sendInt += "\t" +inList.get(i);
        }
        output.setText("\n" +send+ "\n" + sendInt);
        //outputs the text
    }

    private static <E> void shuffle(ArrayList<E> list) {
        int rando;
        ArrayList<E> nyah = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            rando = (int)(Math.random() * (list.size()));
            //creates random int index
            nyah.add(0, list.get(rando));
            nyah.add(1, list.get(i));
            list.set(rando, nyah.get(1));
            list.set(i, nyah.get(0));
            //shuffles values
        }
    }
}
