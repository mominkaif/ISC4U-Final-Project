/*
 * VictoryFrame class, asks user for their username, sends their score to be sorted
 * via quickSort, then writes new arrayList of savedData into textfile. Displays results
 * in a text field with buttons to search for a username or go back home
 * 
 */
package isc4u.pkgfinal.project_kaif.david.dieter;
//import class var from drawBoard (instance of Intro class)
import java.awt.Color;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class VictoryFrame extends JFrame implements ActionListener, Serializable{
    //encapsulate variables
    private ArrayList <SavedData> saves = new ArrayList <>(); //for savedData
    private int score; //score of user
    private JButton homeBtn, searchBtn; //buttons
    private TextArea textA; //textArea to display results
    private Intro intro; //Intro jframe window
    
    private FileOutputStream out; //output for writing to file
    /**
     * Primary constructor
     * @param i - Intro jframe 
     * @param saves - arraylist of data of previous scores and names
     * @param numDeaths - new score (numDeaths)
     * @throws IOException - in/out error
     */
    public VictoryFrame(Intro i, ArrayList<SavedData> saves, int numDeaths) throws IOException{
        this.saves = saves;
        this.score = numDeaths;
        initUI();
        intro = i;
        
    }
    /**
     * initUI method, makes buttons and textAreas, calls quicksort to sort arrayList
     * writes newly sorted arrayList into text file
     * @throws IOException - in/out error
     */
    private void initUI() throws IOException {
        //for the home btn
        Image homeButton = new ImageIcon(this.getClass().getResource("/isc4u/pkgfinal/project_kaif/david/dieter/Tiles/homeButton.png")).getImage();
        Image newHomeBtn = homeButton.getScaledInstance(250, 250, Image.SCALE_FAST); //scale it to same width and height and do it fast
        ImageIcon iconHomeBtn = new ImageIcon(newHomeBtn); //create image icon
        homeBtn = new JButton(iconHomeBtn); //param is icon
        homeBtn.addActionListener(this); //add action listener
        homeBtn.setBounds(800, 320, 250, 250); //set x and w pos, same width and height
        
        //for the search btn, same as above
        Image searchButton = new ImageIcon(this.getClass().getResource("/isc4u/pkgfinal/project_kaif/david/dieter/Tiles/searchButton.png")).getImage();
        Image newSearchButton = homeButton.getScaledInstance(250, 250, Image.SCALE_FAST); 
        ImageIcon iconSearchBtn = new ImageIcon(newHomeBtn); 
        searchBtn = new JButton(iconSearchBtn); 
        searchBtn.addActionListener(this); 
        searchBtn.setBounds(60, 320, 250, 250); 
        
        //for the textArea
        textA = new TextArea();
        textA.setEnabled(false);
        textA.setBounds(100, 50, 760, 400);
        
        //must add components to JFrame
        add(textA);
        add(homeBtn);
        add(searchBtn);
        
        //JOption pane to ask for username
        String name = JOptionPane.showInputDialog("Enter your Username: ");
        saves.add(new SavedData(score, name));
      
        int lowIndex = 0; //left Index is always 0
        int highIndex = saves.size() - 1; //rightmost index
        descendingQuickSort(saves, lowIndex, highIndex); //call quickSort method
        
        writeToFile(saves); //write sorted array to save file
        
        String highScores = "Highscores: "; //start of string
        //loop through array ten times to get ten best scores
        for (int i = 0; i < 10; i++) {
            if(saves.size()-1 > i){ //only add best scores until the tenth one 
                highScores+= "\n#" + (i + 1) + "Name: " + saves.get(i).getName() + "\tScore: " + saves.get(i).getScore();
            }
        }
        textA.setText(highScores); //set textArea to the highScores String
        
        //setting up JFrame 
        pack(); //helps to size contents to pref sizes
        setTitle("Leaderboard");
        setBackground(Color.WHITE);
        setSize(960, 640); //same dimensions
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null); //center jframe with other windows
        //file for sounds
        File s = new File("src/isc4u/pkgfinal/project_kaif/david/dieter/Sounds/migos-gang-gang.wav");
        //instantiate Sound object
        Sound menuSound = new Sound(s, true);
        
    }
    @Override
    /**
     * actionPerformed method
     * param - e - user does something
     */
    public  void actionPerformed(ActionEvent e) {
        //if user wants to go to intro jframe
        if(e.getSource() == homeBtn){
            intro.setVisible(true); //set jframe to true
            //remove and dispose this window
            remove(this);
            this.dispose();
        }
        //if user wants to use search btn
        if(e.getSource() == searchBtn){
            //assign target index to linearSearch method
            int targetIndex = linearSearchNames(saves);
            //if that method returned -1, nothing was found
            if (targetIndex == -1){
                textA.setText("Username not found!");
            //otherwise it was found, set textA to message
            } else {
                textA.setText(saves.get(targetIndex).getName() + "best score yet is: " + saves.get(targetIndex).getScore());
            }
        }
    }
    /**
     * writeToFile method, writes arrayList of saved scores to file
     * @param arrayList - arrayList of saved scores
     * @throws FileNotFoundException - if file was not found
     * @throws IOException - in/out operation fails
     */
    private void writeToFile(ArrayList <SavedData> arrayList) throws FileNotFoundException, IOException{
        try{
            //file in folder "saves" is to be written to
            out = new FileOutputStream(System.getProperty("user.dir") + "/save/saves.txt");
            String string = ""; //string that is written to file
            //adds all contents of arrayList to string
            for (int i = 0; i < arrayList.size(); i++) {
                if(i != 0){
                    string+="\n";
                }
                string += arrayList.get(i).getScore() + "\n" + arrayList.get(i).getName();
            }

            out.write(string.getBytes()); //write string to external files
            out.close(); //close writer 
        } catch(IOException e){
            System.out.println("Error!" + e);
        }
    }
    /**
     * linear search algorithm, ask the user for what username to find 
     * and searches for said username in arrayList
     * @param arrayList - arrayList of scores and corresponding names
     * @return - 1 if found, -1 if not found
     */
    private int linearSearchNames(ArrayList <SavedData> arrayList) {
        //ask for the userName
        String userName = JOptionPane.showInputDialog("Enter the username you are looking for: ");
        //loop through lenght of array, searching for the name
        for (int i = 0; i < saves.size() - 1; i++) {
            //if the userName is found 
            if(saves.get(i).getName().equalsIgnoreCase(userName)){
                return 1; 
            }
        }
        return -1; //if the userName was not found
        
    }
    /**
     * quickSort descending recursive method
     * will exit if the lowIndex is larger than or equal to the highIndex
     * since that means no more of the subarray is left to sort
     * pivot is chosen to be the middle element of the array
     * will continuously loop until the leftPointer is larger than rightPointer
     * leftPointer will keep on moving right while the element is greater than the pivot
     * rightPointer will keep on moving left while the element is less than pivot
     * once the 2 above while conditions are not met, swap the two elements 
     * repeat this until all numbers less than the pivot are on the RHS
     * and all numbers larger than pivot are on the LHS of it
     * recursive call to sort each the LHS and RHS part of pivot
     * @param randomNumbers - array
     * @param lowIndex - lowest index to sort from
     * @param highIndex - highest index to sort from
     */
    private void descendingQuickSort(ArrayList <SavedData> arrayList, int lowIndex, int highIndex) { 
        //base case,  if the left index is larger than or equal to right
        //no more array left to sort
        int temp;
        if (lowIndex >= highIndex) {
            return;
        }
        //assign pointers
        int leftPointer = lowIndex;
        int rightPointer = highIndex;
        //assign the pivot to around middle of array
        int pivot = arrayList.get((highIndex + lowIndex) / 2).getScore();
        //while rightPointer is larger than the leftPointer, the array has not
        //been sorted, because we will switch the values at the end around the pivot
        while (leftPointer < rightPointer) {
            //while the array at the leftPointer is greater than the pivot increase
            //the leftPointer
            while (arrayList.get(leftPointer).getScore() > pivot) {
                leftPointer++;
            }
            //while the array at the rightPointer is less than the pivot
            //decrease the rightPointer
            while (arrayList.get(rightPointer).getScore() < pivot) {
                rightPointer--;
            }
            //now that the array at rightPointer is less than pivot and array at leftPointer is 
            //more than the pivot, swap the pointers
            if (leftPointer <= rightPointer) {
                temp = arrayList.get(leftPointer).getScore();;
                arrayList.get(leftPointer).setScore(arrayList.get(rightPointer).getScore());
                arrayList.get(rightPointer).setScore(temp);
                //increase and decrease pointers so they can move onto the next
                //element to swap in the while loop
                leftPointer++;
                rightPointer--;
            }
        }
        //recursive calls for the subarray below the rightPointer(below old pivot)
        descendingQuickSort(arrayList, lowIndex, rightPointer);
        //recursive calls for the subarray above the leftPointer(above old pivot)
        descendingQuickSort(arrayList, leftPointer, highIndex);
    }

}

    
    

