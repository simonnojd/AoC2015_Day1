package partTwo;

import java.io.BufferedReader;
import java.io.FileReader;

public class InstructionsTwo{

    String character;
    int upOrDown = 0;

    public InstructionsTwo(){
        readFile();
        filterString();
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
        for (int i = 0; i < character.length(); i++){
            String temp = character.substring(i, i+1);
            if (temp.equals("(")){
                upOrDown++;
            }
            else if (temp.equals(")")){
                upOrDown--;
            }
            if (upOrDown == -1){
                System.out.println(i+1);
                break;
            }
        }
    }

    public static void main(String[] args){
        InstructionsTwo i = new InstructionsTwo();
    }
}
