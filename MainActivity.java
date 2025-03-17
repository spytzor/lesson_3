package com.example.mylesson;


import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
  private int  userAnswer;
 private int[] grade = new int[9];
 boolean isDone;
 private int counter=0;
    private static   int right_checkbox1	=R.id.right_checkbox1;
    private static   int right_checkbox2	        =R.id.right_checkbox2;
    private static   int right_checkbox3	        =R.id.right_checkbox3;
    private static   int right_checkbox4	        =R.id.right_checkbox4;
    private static   int right_checkbox7	        =R.id.right_checkbox7;
    private static   int right_checkbox8	        =R.id.right_checkbox8;
    private static   int right_checkbox5	        =R.id.right_checkbox5;
    private static   int right_checkbox9	        =R.id.right_checkbox9;
    private static   int wrong2_checkbox1	        =R.id.wrong2_checkbox1;
    private static   int wrong1_checkbox1	        =R.id.wrong1_checkbox1;
    private static   int wrong3_checkbox1	        =R.id.wrong3_checkbox1;
    //*********************************************/	        //*********************************************/
    private static   int wrong1_checkbox2	        =R.id.wrong1_checkbox2;
    private static   int wrong4_checkbox2	        =R.id.wrong4_checkbox2;
    private static   int wrong3_checkbox2	        =R.id.wrong3_checkbox2;
    //*********************************************/	        //*********************************************/
    private static   int wrong1_checkbox3	        =R.id.wrong1_checkbox3;
    private static   int wrong4_checkbox3	        =R.id.wrong4_checkbox3;
    private static   int wrong3_checkbox3	        =R.id.wrong3_checkbox3;
    //********************************************/	        //********************************************/
    private static   int wrong1_checkbox4	        =R.id.wrong1_checkbox4;
    private static   int wrong2_checkbox4	        =R.id.wrong2_checkbox4;
    private static   int wrong3_checkbox4	        =R.id.wrong3_checkbox4;
    //*********************************************/	        //*********************************************/
    private static   int wrong1_checkbox5	        =R.id.wrong1_checkbox5;


    //*********************************************/	        //*********************************************/
    private static   int wrong1_checkbox7	        =R.id.wrong1_checkbox7;

    private static   int wrong2_checkbox7	        =R.id.wrong2_checkbox7;

    private static   int wrong3_checkbox7	        =R.id.wrong3_checkbox7;
    //*****************************************/	        //*****************************************/

    private static   int wrong1_checkbox8	        =R.id.wrong1_checkbox8;


    ///////////////////	        ///////////////////
    ;	        ;
    private static   int wrong1_checkbox9	        =R.id.wrong1_checkbox9;

    private static   int wrong2_checkbox9	        =R.id.wrong2_checkbox9;

    private static   int wrong3_checkbox9	        =R.id.wrong3_checkbox9;



    private static   int wrong4_checkbox7	        =R.id.wrong4_checkbox7;

/*
    private static  Map<Integer, Integer> rMap= new HashMap<>();
    static{
        rMap.put(R.id.right_checkbox1,1);
        rMap.put(R.id.right_checkbox2,1);
        rMap.put(R.id.right_checkbox3,1);
        rMap.put(R.id.right_checkbox4,1);
        rMap.put(R.id.right_checkbox7,1);
        rMap.put(R.id.right_checkbox8,1);
        rMap.put(R.id.right_checkbox5,1);
        rMap.put(R.id.right_checkbox9,1);
        rMap.put(R.id.wrong2_checkbox1,0);
        rMap.put(R.id.wrong1_checkbox1,0);
        rMap.put(R.id.wrong3_checkbox1,0);

        rMap.put(R.id.wrong1_checkbox2,0);
        rMap.put(R.id.wrong4_checkbox2,0);
        rMap.put(R.id.wrong3_checkbox2,0);

        rMap.put(R.id.wrong1_checkbox3,0);
        rMap.put(R.id.wrong4_checkbox3,0);
        rMap.put(R.id.wrong3_checkbox3,0);

        rMap.put(R.id.wrong1_checkbox4,0);
        rMap.put(R.id.wrong2_checkbox4,0);
        rMap.put(R.id.wrong3_checkbox4,0);

        rMap.put(R.id.wrong1_checkbox5,0);
        rMap.put(R.id.wrong1_checkbox5,0);
        rMap.put(R.id.wrong1_checkbox5,0);

        rMap.put(R.id.wrong1_checkbox7,0);

        rMap.put(R.id.wrong2_checkbox7,0);

        rMap.put(R.id.wrong3_checkbox7,0);


        rMap.put(R.id.wrong1_checkbox8,0);




        rMap.put(R.id.wrong1_checkbox9,0);

        rMap.put(R.id.wrong2_checkbox9,0);

        rMap.put(R.id.wrong3_checkbox9,0);



        rMap.put(R.id.wrong4_checkbox7,0);


    }

*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.activity_main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    @SuppressLint("NonConstantResourceId")
    public void onRadioButtonClicked(View view) {
       

        RadioButton r1 = (RadioButton) findViewById(R.id.right_checkbox1);
        RadioButton r2 = (RadioButton) findViewById(R.id.wrong1_checkbox1);
        RadioButton r3 = (RadioButton) findViewById(R.id.wrong2_checkbox1);
        RadioButton r4 = (RadioButton) findViewById(R.id.wrong3_checkbox1);
//*************************************//

        RadioButton r5 = (RadioButton) findViewById(R.id.right_checkbox2);
        RadioButton r6 = (RadioButton) findViewById(R.id.wrong1_checkbox2);
        RadioButton r7 = (RadioButton) findViewById(R.id.wrong4_checkbox2);
        RadioButton r8 = (RadioButton) findViewById(R.id.wrong3_checkbox2);

        //******************************************/
        RadioButton r9 = (RadioButton) findViewById(R.id.right_checkbox3);
        RadioButton r10 = (RadioButton) findViewById(R.id.wrong1_checkbox3);
        RadioButton r11 = (RadioButton) findViewById(R.id.wrong4_checkbox3);
        RadioButton r12 = (RadioButton) findViewById(R.id.wrong3_checkbox3);
        //******************************************/


        RadioButton r13 = (RadioButton) findViewById(R.id.right_checkbox4);

        RadioButton r14 = (RadioButton) findViewById(R.id.wrong1_checkbox4);
        RadioButton r15 = (RadioButton) findViewById(R.id.wrong2_checkbox4);
        RadioButton r16 = (RadioButton) findViewById(R.id.wrong3_checkbox4);


        RadioButton r17 = (RadioButton) findViewById(R.id.right_checkbox5);
        RadioButton r18 = (RadioButton) findViewById(R.id.wrong1_checkbox5);
//****************************/
        RadioButton r19 = (RadioButton) findViewById(R.id.right_checkbox7);
        RadioButton r20 = (RadioButton) findViewById(R.id.wrong3_checkbox7);
        RadioButton r21 = (RadioButton) findViewById(R.id.wrong1_checkbox7);
        RadioButton r22 = (RadioButton) findViewById(R.id.wrong2_checkbox7);
  //**********************************/
        RadioButton r23 = (RadioButton) findViewById(R.id.right_checkbox8);
        RadioButton r24 = (RadioButton) findViewById(R.id.wrong1_checkbox8);

//*************/
        RadioButton r25 = (RadioButton) findViewById(R.id.right_checkbox9);
        RadioButton r26 = (RadioButton) findViewById(R.id.wrong3_checkbox9);
        RadioButton r27 = (RadioButton) findViewById(R.id.wrong1_checkbox9);
        RadioButton r28 = (RadioButton) findViewById(R.id.wrong2_checkbox9);

        List<Integer> gradeList = new ArrayList<>();
        RadioButton radioGroup = (RadioButton) findViewById(view.getId());

        
        int id = radioGroup.getId();
        System.out.println(id);
       // boolean checked = ((RadioButton) view).isChecked();
        /*
        gradeList = rMap.entrySet().stream()
                .filter(e -> e.getKey().equals(id)).map(Map.Entry::getValue).collect(Collectors.toList());

   int localGrade =gradeList.get(0);
   */
        int localGrade=0;
        if (id==right_checkbox1|| id== right_checkbox2
                || id== right_checkbox3
                || id== right_checkbox4
                || id== right_checkbox7
                || id== right_checkbox8
                || id== right_checkbox5
                || id== right_checkbox9){
            localGrade=1;
        }
        else if(

                id== wrong2_checkbox1
                || id== wrong1_checkbox1
                || id== wrong3_checkbox1
                //*********************************************/
                || id== wrong1_checkbox2
                || id== wrong4_checkbox2
                || id== wrong3_checkbox2
                //*********************************************/
                || id== wrong1_checkbox3
                || id== wrong4_checkbox3
                || id== wrong3_checkbox3
                //********************************************/
                || id== wrong1_checkbox4
                || id== wrong2_checkbox4
                || id== wrong3_checkbox4
                //*********************************************/
                || id== wrong1_checkbox5
                || id== wrong1_checkbox5
                || id== wrong1_checkbox5
                //*********************************************/
                || id== wrong1_checkbox7

                || id== wrong2_checkbox7

                || id== wrong3_checkbox7
                //*****************************************/

                || id== wrong1_checkbox8
                || id== wrong1_checkbox9

                || id== wrong2_checkbox9

                || id== wrong3_checkbox9



                || id== wrong4_checkbox7 )
        {

                localGrade=0;


        }



// replace with switch
        if (r1.isChecked()  ||r2.isChecked() ||r3.isChecked() ||r4.isChecked()  ){
            if(r1.getId()== view.getId()||r2.getId()== view.getId()||r3.getId()== view.getId()||r4.getId()== view.getId()) {

                grade[0] = localGrade;
            }
        }

        if (r5.isChecked()  ||r6.isChecked() ||r7.isChecked() ||r8.isChecked()  ) {
            if (r5.getId() == view.getId() || r6.getId() == view.getId() || r7.getId() == view.getId() || r8.getId() == view.getId()) {
                grade[1] = localGrade;
            }
        }

        if (r9.isChecked()  ||r10.isChecked() ||r11.isChecked() ||r12.isChecked()  ) {
            if (r11.getId() == view.getId() || r12.getId() == view.getId() || r9.getId() == view.getId() || r8.getId() == view.getId()) {
                grade[2] = localGrade;
            }
        }
        if (r13.isChecked()  ||r14.isChecked() ||r15.isChecked() ||r16.isChecked()  ) {
            if (r13.getId() == view.getId() || r14.getId() == view.getId() || r15.getId() == view.getId() || r16.getId() == view.getId()) {
                grade[3] = localGrade;
            }
        }
        if (r17.isChecked()  ||r18.isChecked()   ) {
            if (r17.getId() == view.getId() || r18.getId() == view.getId() ) {
                grade[4] = localGrade;
            }
        }
        if (r19.isChecked()  ||r20.isChecked() ||r21.isChecked() ||r22.isChecked()  ) {
            if (r19.getId() == view.getId() || r20.getId() == view.getId() || r21.getId() == view.getId() || r22.getId() == view.getId()) {
                grade[5] = localGrade;
            }
        }
        if (r23.isChecked()  ||r24.isChecked()   ) {
            if (r23.getId() == view.getId() || r24.getId() == view.getId() ) {
                grade[6] = localGrade;
            }
        }



        if (r25.isChecked()  ||r26.isChecked() ||r27.isChecked() ||r28.isChecked()  ){
            if(r25.getId()== view.getId()||r26.getId()== view.getId()||r27.getId()== view.getId()||r28.getId()== view.getId()) {

                grade[8] = localGrade;
            }
        }





    }

    public void alert(int userAnswer) {
        DialogInterface.OnClickListener dialoOnClickListener =new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which){
                    case  DialogInterface.BUTTON_POSITIVE:
                        resetValues();

                        break;

                    case  DialogInterface.BUTTON_NEGATIVE:
                        break;
                }
            }
        };


        new AlertDialog.Builder(this)
                .setTitle("Επιβεβαίωση Υποβολής")
                .setMessage("H Βαθμολογία σας ειναι:" + userAnswer + ".Να καταχωρηθεί;")

                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setNegativeButton("Ακύρωση", dialoOnClickListener)
                .setPositiveButton("Επιβεβαίωση", dialoOnClickListener).show();

    }
public void submit(View  view) {



    userAnswer = 0;

    EditText ediText = (EditText) findViewById(R.id.plain_text_input);
    String editTextString = ediText.getText().toString().trim();
    System.out.println(editTextString);

    if (editTextString != null) {


    if (editTextString.equals("edit_message")) {
        grade[7] = 1;
    } else {
        grade[7] = 0;
    }
}
else{
        grade[7] = 0;
        }


        for (int i = 0; i < grade.length; i++) {
        userAnswer=userAnswer+grade[i];
    }
        alert(userAnswer);


}
    public void resetValues()
    {
        startActivity(new Intent(MainActivity.this,MainActivity.class));
        Toast.makeText(this,"Σας ευχαριστούμε η βαθμολογία σας καταχωρηθηκε.",Toast.LENGTH_LONG);

    }


}