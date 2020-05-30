/*Name:NG KE RONG*/
/*No.Matric: 271063*/

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

class MyFrame extends JFrame implements ActionListener { 

   private Container c; 
   private JLabel title; 
   private JLabel name; 
   private JTextField tname; 
   private JLabel mno; 
   private JTextField tmno;  
   private JLabel add; 
   private JTextArea tadd; 
   private JLabel type;
   private JCheckBox term; 
   private JRadioButton no1;
   private JRadioButton no2;
   private JRadioButton no3;
   private JRadioButton no4;
   private ButtonGroup gengp;
   private JButton sub; 
   private JButton reset;
   private JButton ok; 
   private JTextArea tout; 
   private JLabel res; 
   private JLabel CR;
 
   public MyFrame(){ 
      setTitle("Internet System (Ng Ke Rong 271063)"); 
      setBounds(300, 90, 900, 777); 
      setDefaultCloseOperation(EXIT_ON_CLOSE); 
      setResizable(false); 

      c = getContentPane(); 
      c.setLayout(null); 

      title = new JLabel("Welcome to Internet Serving System"); 
      title.setFont(new Font("Constantia", Font.BOLD, 25)); 
      title.setSize(480, 33); 
      title.setLocation(235, 30); 
      c.add(title); 

      name = new JLabel("Name"); 
      name.setFont(new Font("Constantia", Font.BOLD, 20)); 
      name.setSize(100, 25); 
      name.setLocation(70, 100); 
      c.add(name); 

      tname = new JTextField(); 
      tname.setFont(new Font("Arial", Font.PLAIN, 20)); 
      tname.setSize(250, 25); 
      tname.setLocation(150, 93); 
      c.add(tname); 

      mno = new JLabel("Tel.No"); 
      mno.setFont(new Font("Constantia", Font.BOLD, 20)); 
      mno.setSize(100, 25); 
      mno.setLocation(70, 150); 
      c.add(mno); 

      tmno = new JTextField(); 
      tmno.setFont(new Font("Arial", Font.PLAIN, 20)); 
      tmno.setSize(250, 25); 
      tmno.setLocation(150, 144); 
      c.add(tmno);

      add = new JLabel("Address"); 
      add.setFont(new Font("Constantia", Font.BOLD, 20)); 
      add.setSize(100, 25); 
      add.setLocation(70, 200); 
      c.add(add); 

      tadd = new JTextArea(); 
      tadd.setFont(new Font("Arial", Font.PLAIN, 20)); 
      tadd.setSize(250, 80); 
      tadd.setLocation(150, 190); 
      tadd.setLineWrap(true); 
      c.add(tadd); 
      
      type = new JLabel("Select the type of internet you want:"); 
      type.setFont(new Font("Constantia", Font.BOLD, 20)); 
      type.setSize(480, 25); 
      type.setLocation(480, 90); 
      c.add(type); 
      
      no1 = new JRadioButton("TM Streamyx"); 
      no1.setFont(new Font("Arial", Font.PLAIN, 20)); 
      no1.setSelected(true);
      no1.setSize(170, 25); 
      no1.setLocation(555, 120);  
      c.add(no1); 
      
      no2 = new JRadioButton("TM Unifi"); 
      no2.setFont(new Font("Arial", Font.PLAIN, 20)); 
      no2.setSelected(true);
      no2.setSize(170, 25); 
      no2.setLocation(555, 159); 
      no2.addActionListener(this); 
      c.add(no2); 
      
      no3 = new JRadioButton("Time"); 
      no3.setFont(new Font("Arial", Font.PLAIN, 20)); 
      no3.setSelected(true);
      no3.setSize(170, 25); 
      no3.setLocation(555, 198); 
      no3.addActionListener(this); 
      c.add(no3); 
      
      no4 = new JRadioButton("Celcom"); 
      no4.setFont(new Font("Arial", Font.PLAIN, 20)); 
      no4.setSelected(true); 
      no4.setSize(170, 25); 
      no4.setLocation(555, 237); 
      no4.addActionListener(this); 
      c.add(no4); 
      
      gengp = new ButtonGroup(); 
      gengp.add(no1); 
      gengp.add(no2); 
      gengp.add(no3); 
      gengp.add(no4); 

      term = new JCheckBox("Please Accept Terms And Conditions."); 
      term.setFont(new Font("Constantia", Font.BOLD, 20)); 
      term.setSize(480, 33); 
      term.setLocation(260, 280); 
      c.add(term); 
      

      sub = new JButton("Submit"); 
      sub.setFont(new Font("Arial", Font.PLAIN, 20)); 
      sub.setSize(170, 20); 
      sub.setLocation(555, 450); 
      sub.addActionListener(this); 
      c.add(sub); 
      
      reset = new JButton("Reset"); 
      reset.setFont(new Font("Arial", Font.PLAIN, 20)); 
      reset.setSize(170, 20); 
      reset.setLocation(555, 500); 
      reset.addActionListener(this); 
      c.add(reset); 
      
      ok = new JButton("Ok"); 
      ok.setFont(new Font("Arial", Font.PLAIN, 20)); 
      ok.setSize(170, 20); 
      ok.setLocation(555, 550); 
      ok.addActionListener(this); 
      c.add(ok); 
      
      tout = new JTextArea(); 
      tout.setFont(new Font("Arial", Font.PLAIN, 15)); 
      tout.setSize(300, 300); 
      tout.setLocation(77, 333); 
      tout.setLineWrap(true); 
      tout.setEditable(false); 
      c.add(tout); 

      res = new JLabel(""); 
      res.setFont(new Font("Constantia", Font.BOLD, 20)); 
      res.setSize(480, 25); 
      res.setLocation(500, 390); 
      c.add(res); 
      
      CR = new JLabel("All copyright © reserved by Ng Ke Rong"); 
      CR.setFont(new Font("Constantia", Font.BOLD, 25)); 
      CR.setSize(480, 33); 
      CR.setLocation(230, 700); 
      c.add(CR); 
      
      setVisible(true); 
   } 


   public void actionPerformed(ActionEvent e) 
   { 
      tmStreamyx wifi1 = new tmStreamyx();
      tmUnifi wifi2 = new tmUnifi();
      Time wifi3 = new Time();
      Celcom wifi4 = new Celcom();
      String data1 = "Name :" + tname.getText() + "\n" + 
                     "Tel.No :" + tmno.getText() + "\n" +
                     "Address :"+ tadd.getText() + "\n";            
      
      if (e.getSource() == sub) { 
         if (term.isSelected()) { 
            if(no1.isSelected()){
               tout.setText(data1 + wifi1.display() +  wifi1.special("Wired"));
               tout.setEditable(false);
               res.setText("Are you want to choose it?"); 
            }
            else if(no2.isSelected()){
                    tout.setText(data1 + wifi2.display() + wifi2.special("Wired"));
                    tout.setEditable(false);
                    res.setText("Are you want to choose it?");
                  }
                  else if(no3.isSelected()){
                          tout.setText(data1 + wifi3.display() + wifi3.special("Wireless"));
                          tout.setEditable(false);
                          res.setText("Are you want to choose it?");
                        }
                        else if(no4.isSelected()){
                                tout.setText(data1 + wifi4.display() + wifi4.special("Wireless"));
                                tout.setEditable(false);
                                res.setText("Are you want to choose it?");
                              }
                              else{
                                 tout.setText("Sorry, please select your category");
                                 tout.setEditable(false);
                              } 
         }else { 
            tout.setText(""); 
            res.setText("Please accept the terms & conditions.."); 
         } 
         
      }else if (e.getSource() == ok){
            res.setText("Thank you, have a good day.");
      
            }else if (e.getSource() == reset) { 
                  String def = ""; 
                  tname.setText(def); 
                  tadd.setText(def); 
                  tmno.setText(def); 
                  res.setText(def); 
                  tout.setText(def); 
                  term.setSelected(false);  
            } 
      } 
} 

class Internet{ 

   public static void main(String[] args) throws Exception{ 
      MyFrame f = new MyFrame(); 
   } 
}