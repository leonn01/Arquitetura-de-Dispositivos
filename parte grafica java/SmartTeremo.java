package pt.uma.tpsi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class SmartTeremo extends JFrame {
    //panels
    private JPanel mainPanel;
    private JPanel statusPanel;
    private JPanel tempPanel;
    private JPanel humdPanel;
    private JScrollPane mainlogScrollPanel;
    private JPanel actualTempPanel;
    private JPanel desiredTempPanel;
    private JPanel changeTempFormatPanel;

    //text fields
    private JTextField actualTempTextField;
    private JTextField desiredTempTextField;
    private JTextField actualHumidTextField;
    private JTextField desiredHumdTextField;
    //labels
    private JLabel actualTempLabel;
    private JLabel desiredTempLabel;

    //buttons
    private JButton increaseTempButton;
    private JButton desiredTempButton;
    private JButton changeTempFormatButton;
    private JButton increaseHumButton;
    private JButton DecreaseHumdButton;
    private JButton onAndOffButton;
    private JPanel desiredHumid;
    private JPanel atualHumid;
    private JLabel actualHumidLabel;
    private JLabel desiredHumdLabel;
    private JTextField dateTextField1;
    private JTextArea scrollTextArea;
    private JPanel scrollpanel;

    //attributes
    private float actualTemp;
    private float desiredTemp;
    private int tempFormat;
    private float actualHum;
    private float desiredHUM;
    private Date date;
    private String loggedMessages;
    private  Timer timer;


    //constructors
    public SmartTeremo(String title) {
        //create panel
        super(title);
        this.setContentPane(mainPanel);
        this.pack();
        //closing operation
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                logEvents("App Closed");
                System.exit(0);
            }
        });
        //initializations
        actualTemp = 22; //represents in C
        desiredTemp = 22; //represents in C
        tempFormat = 0; //0 -> C, 1 -> F
        actualHum = 22;
        desiredHUM = 22;
        loggedMessages="";
        updateTextFields();
        logEvents("the app started");

        //timer Task
        TimerTask tt=new TimerTask() {
            @Override
            public void run() {
                Random randomNumber=new Random();
                if (actualTemp<desiredTemp && randomNumber.nextDouble()<=0.8)
                    actualTemp+=0.5;
                else if (randomNumber.nextDouble()>=0.7)
                    actualTemp -=0.5;
                updateTextFields();
            }
        };

        TimerTask tt2=new TimerTask() {
            @Override
            public void run() {
                Random randomNumber=new Random();
                if (actualHum<desiredHUM && randomNumber.nextDouble()<=0.8)
                    actualHum+=0.5;
                else if (randomNumber.nextDouble()>=0.7)
                    actualHum -=0.5;
                updateTextFields();
            }
        };



        timer=new Timer("timer for simulation");
        timer.schedule(tt, 1000, 1000);


        //button actions
        changeTempFormatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tempFormat == 0){
                    tempFormat = 1;//F
                    logEvents("temperature changed format to F");
                }
                else {
                    tempFormat = 0;//c
                    logEvents("temperature changed format to C");
                }
                updateTextFields();


            }
        });
        desiredTempButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualTemp -= 0.5;
                desiredTemp -= 0.5;
                updateTextFields();
                logEvents("temperature decrease to"+ actualTemp+" ºC");
            }
        });
        increaseTempButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualTemp += 0.5;
                desiredTemp += 0.5;
                updateTextFields();
                logEvents("temperature increase to"+ actualTemp+" ºC");
            }
        });
        //humid
        onAndOffButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tempFormat == 0)
                    tempFormat = 1;
                else
                    tempFormat = 0;
                updateTextFields();
            }
        });

        increaseHumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualHum += 5;
                desiredHUM += 5;
                updateTextFields();
                logEvents("Humidity increase to"+ actualHum);
            }
        });

        DecreaseHumdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualHum -= 5;
                desiredHUM -= 5;
                updateTextFields();
                logEvents("Humidity decrease to"+ actualHum);
            }
        });


    }




    //methods------------------------------------------------------------------------------
    private void updateTextFields(){
        if(tempFormat == 0){
            actualTempTextField.setText(String.valueOf(actualTemp)+" ºC");
            desiredTempTextField.setText(String.valueOf(desiredTemp)+" ºC");
        }
        else{
            actualTempTextField.setText(String.valueOf(actualTemp * 9 / 5 + 32)+" ºF");
            desiredTempTextField.setText(String.valueOf(desiredTemp * 9 / 5 + 32)+" ºF");
        }
        //humidity
        actualHumidTextField.setText(String.valueOf(actualHum +" º%"));
        desiredHumdTextField.setText(String.valueOf(desiredHUM +" %"));

        //date
        date =new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateTextField1.setText(simpleDateFormat.format(date));


        //heating indicator
        if(actualTemp<desiredTemp)
            onAndOffButton.setText("On");
        else
            onAndOffButton.setText("Off");
    }
    private  void logEvents(String informationToLog){
        date = new Date();
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        loggedMessages +=simpleDateFormat.format(date)+ ": " + informationToLog + '\n';
        scrollTextArea.setText(loggedMessages);



    }
    //----------------------------------------------------------------------------------------



    //main
    public static void main(String[] args) {
        JFrame smartTermo = new SmartTeremo("TPSI");
        smartTermo.setVisible(true);
    }


}
