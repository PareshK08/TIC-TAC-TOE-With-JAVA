import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;


public class TicTacToe {
    public static void   main(String[] args)
    {
        Game P = new Game();
        System.out.println(P);


    }
}
class  Game extends JFrame {

    public String Turn = "X";
    JButton B1;
    JButton B2;
    JButton B3;
    JButton B4;
    JButton B5;
    JButton B6;
    JButton B7;
    JButton B8;
    JButton B9;
    JButton Restart;
    JLabel l;
    int count =0;
    int count2=0;


    void reset()
    {
        B1.setText(" ");
        B2.setText(" ");
        B3.setText(" ");
        B4.setText(" ");
        B5.setText(" ");
        B6.setText(" ");
        B7.setText(" ");
        B8.setText(" ");
        B9.setText(" ");
    }

    void Restart()
    {
        B1.setEnabled(true);
        B2.setEnabled(true);
        B3.setEnabled(true);
        B4.setEnabled(true);
        B5.setEnabled(true);
        B6.setEnabled(true);
        B7.setEnabled(true);
        B8.setEnabled(true);
        B9.setEnabled(true);
    }


     Game() {

        Map<Integer, String> Board = new HashMap<>();
         for(int i=1;i<=9;i++)
             Board.put(i," ");




        setLayout(new FlowLayout());
        JFrame frame = new JFrame("Tic Tac Toe");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocation(600, 200);
        frame.setSize(450, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l = new JLabel();
        l.setBounds(10,350,300,60);
        l.setBackground(Color.blue);
        l.setForeground(Color.WHITE);
        l.setFont(new Font("Comic Sans", Font.BOLD, 30));
        frame.add(l);

        Container c = frame.getContentPane();
        c.setBackground(Color.decode("#24211c"));


        JPanel panel = new JPanel();
        panel.setBounds(10, 50, 300, 300);
        panel.setLayout(new GridLayout(3, 3, 1, 1));
        c.add(panel);




        Restart = new JButton("Restart");
        c.add(Restart);
        Restart.setBackground(Color.decode("#660808"));
        Restart.setForeground(Color.CYAN);
        Restart.setLayout(null);
        Restart.setFocusable(false);
        Restart.setFont(new Font("Comic Sans", Font.BOLD, 18));
        Restart.setBounds(325,75,100,50);
        Restart.addActionListener(new AbstractAction() {
             public void actionPerformed(ActionEvent e) {

                 for(int i=1;i<=9;i++)
                 {
                     Board.put(i," ");
                 }

                 count =0;
                 count2=0;

                 l.setText("  ");

                 Restart();
                 reset();


             }
         });


        B1 = new JButton(" ");
        B1.setBackground(Color.decode("#f2de02"));
        panel.add(B1);
        B1.setFocusable(false);
        B1.setFont(new Font("Comic Sans", Font.BOLD, 40));
        B1.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {

                if (Turn.equals("X")) {
                    B1.setText("X");
                    B1.setEnabled(false);
                    Board.put(1, "X");
                    Turn = "O";
                    count++;


                } else if (Turn.equals("O")) {
                    B1.setText("O");
                    B1.setEnabled(false);
                    Board.put(1, "O");
                    Turn = "X";
                    count++;

                }

            }
        });


        B2 = new JButton(" ");
        B2.setBackground(Color.decode("#f2de02"));
        panel.add(B2);
        B2.setFocusable(false);
        B2.setFont(new Font("Comic Sans", Font.BOLD, 40));
        B2.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {

                if (Turn.equals("X")) {
                    B2.setText("X");
                    B2.setEnabled(false);
                    Board.put(2, "X");
                    Turn = "O";
                    count++;


                } else if (Turn.equals("O")) {
                    B2.setText("O");
                    B2.setEnabled(false);
                    Board.put(2, "O");
                    Turn = "X";
                    count++;

                }

            }
        });

        B3 = new JButton(" ");
        B3.setBackground(Color.decode("#f2de02"));
        panel.add(B3);
        B3.setFocusable(false);
        B3.setFont(new Font("Comic Sans", Font.BOLD, 40));
        B3.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {

                if (Turn.equals("X")) {
                    B3.setText("X");
                    B3.setEnabled(false);
                    Board.put(3, "X");
                    Turn = "O";
                    count++;


                } else if (Turn.equals("O")) {
                    B3.setText("O");
                    B3.setEnabled(false);
                    Board.put(3, "O");
                    Turn = "X";
                    count++;

                }

            }
        });

        B4 = new JButton(" ");
        B4.setBackground(Color.decode("#f2de02"));
        panel.add(B4);
        B4.setFocusable(false);
        B4.setFont(new Font("Comic Sans", Font.BOLD, 40));
        B4.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {


                if (Turn.equals("X")) {
                    B4.setText("X");
                    B4.setEnabled(false);
                    Board.put(4, "X");
                    Turn = "O";
                    count++;


                } else if (Turn.equals("O")) {
                    B4.setText("O");
                    B4.setEnabled(false);
                    Board.put(4, "O");
                    Turn = "X";
                    count++;

                }

            }
        });


        B5 = new JButton(" ");
        B5.setBackground(Color.decode("#f2de02"));
        panel.add(B5);
        B5.setFocusable(false);
        B5.setFont(new Font("Comic Sans", Font.BOLD, 40));
        B5.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {

                if (Turn.equals("X")) {
                    B5.setText("X");
                    B5.setEnabled(false);
                    Board.put(5, "X");
                    Turn = "O";
                    count++;


                } else if (Turn.equals("O")) {
                    B5.setText("O");
                    B5.setEnabled(false);
                    Board.put(5, "O");
                    Turn = "X";
                    count++;

                }

            }
        });

        B6 = new JButton(" ");
        B6.setBackground(Color.decode("#f2de02"));
        panel.add(B6);
        B6.setFocusable(false);
        B6.setFont(new Font("Comic Sans", Font.BOLD, 40));
        B6.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {

                if (Turn.equals("X")) {
                    B6.setText("X");
                    B6.setEnabled(false);
                    Board.put(6, "X");
                    Turn = "O";
                    count++;


                } else if (Turn.equals("O")) {
                    B6.setText("O");
                    B6.setEnabled(false);
                    Board.put(6, "O");
                    Turn = "X";
                    count++;

                }

            }
        });

        B7 = new JButton(" ");
        B7.setBackground(Color.decode("#f2de02"));
        panel.add(B7);
        B7.setFocusable(false);
        B7.setFont(new Font("Comic Sans", Font.BOLD, 40));
        B7.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {

                if (Turn.equals("X")) {
                    B7.setText("X");
                    B7.setEnabled(false);
                    Board.put(7, "X");
                    Turn = "O";
                    count++;


                } else if (Turn.equals("O")) {
                    B7.setText("O");
                    B7.setEnabled(false);
                    Board.put(7, "O");
                    Turn = "X";
                    count++;

                }

            }
        });


        B8 = new JButton(" ");
        B8.setBackground(Color.decode("#f2de02"));
        panel.add(B8);
        B8.setFocusable(false);
        B8.setFont(new Font("Comic Sans", Font.BOLD, 40));
        B8.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {

                if (Turn.equals("X")) {
                    B8.setText("X");
                    B8.setEnabled(false);
                    Board.put(8, "X");
                    Turn = "O";
                    count++;


                } else if (Turn.equals("O")) {
                    B8.setText("O");
                    B8.setEnabled(false);
                    Board.put(8, "O");
                    Turn = "X";
                    count++;



                }

            }
        });


        B9 = new JButton(" ");
        B9.setBackground(Color.decode("#f2de02"));
        panel.add(B9);
        B9.setFocusable(false);
        B9.setFont(new Font("Comic Sans", Font.BOLD, 40));
        B9.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {


                if (Turn.equals("X")) {
                    B9.setText("X");
                    B9.setEnabled(false);
                    Board.put(9, "X");
                    Turn = "O";
                    count++;


                } else if (Turn.equals("O")) {
                    B9.setText("O");
                    B9.setEnabled(false);
                    Board.put(9, "O");
                    Turn = "X";
                    count++;


                }

            }
        });


         while (true) {
             if (Board.get(1).equals("X") && Board.get(2).equals("X") && Board.get(3).equals("X")) {
                 Disable();
                 l.setText(" X Win the game ");
                 count2=1;

             }
             else if (Board.get(4).equals("X") && Board.get(5).equals("X") && Board.get(6).equals("X")) {
                 Disable();
                 l.setText(" X Win the game ");
                 count2=1;

             }
             else if (Board.get(7).equals("X") && Board.get(8).equals("X") && Board.get(9).equals("X")) {
                 Disable();
                 l.setText(" X Win the game ");
                 count2=1;

             }
             else if (Board.get(1).equals("X") && Board.get(4).equals("X") && Board.get(7).equals("X")) {
                 Disable();
                 l.setText(" X Win the game ");
                 count2=1;

             }
             else if (Board.get(2).equals("X") && Board.get(5).equals("X") && Board.get(8).equals("X")) {
                 Disable();
                 l.setText(" X Win the game ");
                 count2=1;

             }
             else if (Board.get(3).equals("X") && Board.get(6).equals("X") && Board.get(9).equals("X")) {
                 Disable();
                 l.setText(" X Win the game ");
                 count2=1;

             }
             else if (Board.get(1).equals("X") && Board.get(5).equals("X") && Board.get(9).equals("X")) {
                 Disable();
                 l.setText(" X Win the game ");
                 count2=1;

             }
             else if (Board.get(3).equals("X") && Board.get(5).equals("X") && Board.get(7).equals("X")) {
                 Disable();
                 l.setText(" X Win the game ");
                 count2=1;

             }

             else if (Board.get(1).equals("O") && Board.get(2).equals("O") && Board.get(3).equals("O")) {
                 Disable();
                 l.setText(" O Win the game ");
                 count2=1;

             }
             else if (Board.get(4).equals("O") && Board.get(5).equals("O") && Board.get(6).equals("O")) {
                 Disable();
                 l.setText(" O Win the game ");
                 count2=1;


             }
             else if (Board.get(7).equals("O") && Board.get(8).equals("O") && Board.get(9).equals("O")) {
                 Disable();
                 l.setText(" O Win the game ");
                 count2=1;


             }
             else if (Board.get(1).equals("O") && Board.get(4).equals("O") && Board.get(7).equals("O")) {
                 Disable();
                 l.setText(" O Win the game ");
                 count2=1;


             }
             else if (Board.get(2).equals("O") && Board.get(5).equals("O") && Board.get(8).equals("O")) {
                 Disable();
                 l.setText(" O Win the game ");
                 count2=1;

             }
             else if (Board.get(3).equals("O") && Board.get(6).equals("O") && Board.get(9).equals("O")) {
                 Disable();
                 l.setText(" O Win the game ");
                 count2=1;
             }
             else if (Board.get(1).equals("O") && Board.get(5).equals("O") && Board.get(9).equals("O")) {
                 Disable();
                 l.setText(" O Win the game ");
                 count2=1;

             }
             else if (Board.get(3).equals("O") && Board.get(5).equals("O") && Board.get(7).equals("O")) {
                 Disable();
                 l.setText(" O Win the game ");
                 count2=1;


             }
             if(count==9 && count2==0)
             {
                 l.setText("Game Draw");
             }

         }

    }

    void Disable()
    {
        B1.setEnabled(false);
        B2.setEnabled(false);
        B3.setEnabled(false);
        B4.setEnabled(false);
        B5.setEnabled(false);
        B6.setEnabled(false);
        B7.setEnabled(false);
        B8.setEnabled(false);
        B9.setEnabled(false);
    }

}