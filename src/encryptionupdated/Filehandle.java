/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptionupdated;

/**
 *
 * @author Sumanth Saligram
 */
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Filehandle {
    String filenamepath;
 
 //Declare Variable
 JFileChooser fileChooser = new JFileChooser();
 StringBuilder sb = new StringBuilder();
 
 public void PickMe() throws Exception{
  
  if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
   
   //get the file
   java.io.File file = fileChooser.getSelectedFile();
   
   //create a scanner for the file
   Scanner input = new Scanner(file);
 filenamepath = file.getAbsolutePath();
   //read text from file
   while(input.hasNext()){
    sb.append(input.nextLine());
    sb.append("\n");;
   }
   
   input.close();
  }
  else{
   sb.append("");
  }
 }
 


}
