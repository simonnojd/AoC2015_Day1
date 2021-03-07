package partOne;

import java.io.BufferedReader;
import java.io.FileReader;

public class Instructions {
    String character;
    int[] upOrDown = {0, 0};

    public Instructions(){
        readFile();
        filterString();
        calculateFloor();
    }

    public void readFile(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src\\partOne\\Database"));
            character = reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void filterString(){
        for (int i = 0; i < character.length(); i++) {
            String temp = character.substring(i, i+1);
            if (temp.equals("(")){
                upOrDown[0]++;
            }
            else {
                upOrDown[1]++;
            }
        }
    }

    public void calculateFloor(){
        int finalFloor =  upOrDown[0] - upOrDown[1];
        System.out.println("Santa has to go to floor: " + finalFloor);
    }


    public static void main(String[] args) {
        Instructions i = new Instructions();
    }
}
