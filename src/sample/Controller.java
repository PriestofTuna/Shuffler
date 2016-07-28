package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.util.ArrayList;

public class Controller {
    ArrayList<String> stList = new ArrayList<>();
    ArrayList<Integer> inList = new ArrayList<>();
    //Initializes the lists
    @FXML   TextArea output;
    @FXML
    public void getList(ActionEvent actionEvent) {
        String first ="first", second = "second", third = "Third", fourth = "fourth", fifth = "fifth", sixth = "sixth";
        stList.add(first);
        stList.add(second);
        stList.add(third);
        stList.add(fourth);
        stList.add(fifth);
        stList.add(sixth);
        //creates dummy values
        String send ="";
        shuffle(stList);
        //calls shuffle
        for(int i = 0; i < stList.size(); i++) {
            send += stList.get(i);
            //makes a String hold the values, whether they be objects or values
        }
        output.setText(send);
        //outputs the text
    }

    public static <E> void shuffle(ArrayList<E> list) {
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
