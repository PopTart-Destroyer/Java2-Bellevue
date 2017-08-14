/* 
 * The source code for this assignment started with
 * a sample from "Thinking in Java" 3rd ed. page 825
 *  by Bruce Eckel.  I have finished adding the rest of the action logic.
 *
 * Try to implement one new action listener at a time
 *  do not try to do all of them and then compile
 *
 * Modified by: T. J. Flesher
 * Assignment 8.1 / Bellevue University
 * Modify the following 'MessageBoxes' application so it uses a single action listener for each button. 
 * This will require you to separate the single action listener logic into multiple listeners, one for each button. 
 * Then modify the code to provide additional options to two or more buttons.
 * 
 */
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MessageBoxes
  {
    final int WIDTH = 450;
    final int HEIGHT = 250;
    
    JButton alert = new JButton("Alert");
    JButton yesno = new JButton("Yes/No");
    JButton color = new JButton("Color");
    JButton input = new JButton("Input");
    JButton vals = new JButton("4 Vals");
    private JButton[] b =
      {
        alert, yesno, color, input, vals
      };
    private JTextField txt = new JTextField(15);
    private JFrame frame;

    public MessageBoxes()
      {
        class ButtonListener implements ActionListener
          {

            @Override
            public void actionPerformed(ActionEvent e)
              {
                String id = ((JButton) e.getSource()).getText();
                if (id.equals("Alert"))
                  {
                    JOptionPane.showMessageDialog(null,
                            "There's a bug on you!", "Hey!",
                            JOptionPane.ERROR_MESSAGE);
                  } else if (id.equals("Yes/No"))
                  {
                    int val = JOptionPane.showConfirmDialog(null,
                            "or no", "Choose yes",
                            JOptionPane.YES_NO_CANCEL_OPTION);
                    if (val != JOptionPane.CLOSED_OPTION)
                      {
                        if (val == 0)
                          {
                            txt.setText("Yes");
                          } else if (val == 1)
                          {
                            txt.setText("No");
                          } else 
                            {
                              txt.setText("Cancel");
                            }
                      }
                  } else if (id.equals("Color"))
                  {
                    Object[] options =
                      {
                        "Red", "Green", "Blue", "White"
                      };
                    int sel = JOptionPane.showOptionDialog(null,
                            "Choose a Color!", "Warning",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.WARNING_MESSAGE, null,
                            options, options[0]);
                    if (sel != JOptionPane.CLOSED_OPTION)
                      {
                        txt.setText("Color Selected: " + options[sel]);
                      }
                  } else if (id.equals("Input"))
                  {
                    String val = JOptionPane.showInputDialog("How mant fingers do you see?");
                    txt.setText(val + " fingers seen!");
                  } else if (id.equals("4 Vals"))
                  {
                    Object[] selections =
                      {
                        "First", "Second", "Third", "Fourth"
                      };
                    Object val = JOptionPane.showInputDialog(null,
                            "Choose one", "Input",
                            JOptionPane.INFORMATION_MESSAGE,
                            null, selections, selections[0]);
                    if (val != null)
                      {
                        txt.setText(val.toString());
                      }
                  }
              }
          };
        ButtonListener bListener = new ButtonListener();
        alert.addActionListener(bListener);
        yesno.addActionListener(bListener);
        color.addActionListener(bListener);
        input.addActionListener(bListener);
        vals.addActionListener(bListener);
      };
  
  public void launchJFrame()
      {
        frame = new JFrame("MessageBoxes Galore!");
        frame.setSize(WIDTH, HEIGHT);
        frame.getContentPane().setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for (int i = 0; i < b.length; i++)
          {
            frame.getContentPane().add(b[i]);
          }
        frame.getContentPane().add(txt);
        frame.setVisible(true);
      }

    public static void main(String[] args)
      {
        MessageBoxes mb = new MessageBoxes();
        mb.launchJFrame();
      }
  }
