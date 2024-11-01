package wordgame.view;

import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class LetterButtons extends JPanel {
   private JButton[] buttons;

   public LetterButtons(ActionListener listener) {
      this.buttons = new JButton[26];
      int nextButton = 0;
      this.setLayout(new GridLayout(3, 10));
      for (char letter = 'a'; letter <= 'z'; letter++) {
         // create a button and attach the listener to it
         // the listener was provided to us as an argument
         this.buttons[nextButton] = new JButton(String.valueOf(letter));

         // TODO: attach the action listener passed to the constructor to each button

         this.add(this.buttons[nextButton]);
         nextButton++;
      }
   }

   public void add(char letter) {
      char lowerCaseLetter = Character.toLowerCase(letter);
      this.buttons[lowerCaseLetter - 'a'].setEnabled(false);
   }

}