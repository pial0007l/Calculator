package com.hr.pial.calculator;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private static final String FILE_NAME="history.txt";

    float number1,number2,result=-1;
    String operator=null;
    int tempvalue=0;
    float tempvalue2=0;

    Button b0;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b00;
    Button b_add;
    Button b_sub;
    Button b_multi;
    Button b_devide;
    Button b_equal;
    Button b_point;
    Button b_clearAll;
    Button b_history;
    Button b_delete;


    TextView txt1;
    TextView txt2;
    TextView madd;
    TextView msub;
    TextView mclear;
    TextView mrecall;
    String filename = "history.txt";
    final Calendar c = Calendar.getInstance();

    String Year = String.valueOf(c.get(Calendar.YEAR));
    String Month =String.valueOf(c.get(Calendar.MONTH));
    String Day = String.valueOf(c.get(Calendar.DAY_OF_MONTH));

    Date d = new Date();

    String hour = String.valueOf(d.getHours());
    String munites = String.valueOf(d.getMinutes());

    public void saveFile(String file,String text){
        try {
            FileOutputStream fos = openFileOutput(file, Context.MODE_PRIVATE);
            fos.write(text.getBytes());
            fos.close();
            //Toast.makeText(MainActivity.this,"", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            e.printStackTrace();
            //Toast.makeText(MainActivity.this,"", Toast.LENGTH_SHORT).show();
        }
    }

    public  String readFile(String file){
        String text ="";
        try {
            FileInputStream fis = openFileInput(file);
            int size = fis.available();
            byte[] buffer = new byte[size];
            fis.read(buffer);
            fis.close();
            text = new String(buffer);

        }catch (Exception e){
            e.printStackTrace();
            //Toast.makeText(MainActivity.this,"Error reading File", Toast.LENGTH_SHORT).show();
        }
        return text;
    }

    private void saveMemory(String data){
        SharedPreferences prefs = getSharedPreferences("memory",MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("memory",data);
        editor.commit();
    }

    private String getMemory(){
        SharedPreferences prefs = getSharedPreferences("memory",MODE_PRIVATE);
        String memory = prefs.getString("memory","no saved memory");
        return memory;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveMemory("0");

        this.txt1 = (TextView) findViewById(R.id.textView1);
        this.txt2 = (TextView) findViewById(R.id.textView2);
        this.b0 = (Button) findViewById(R.id.button_0);
        this.b1 = (Button) findViewById(R.id.button_1);
        this.b2 = (Button) findViewById(R.id.button_2);
        this.b3 = (Button) findViewById(R.id.button_3);
        this.b4 = (Button) findViewById(R.id.button_4);
        this.b5 = (Button) findViewById(R.id.button_5);
        this.b6 = (Button) findViewById(R.id.button_6);
        this.b7 = (Button) findViewById(R.id.button_7);
        this.b8 = (Button) findViewById(R.id.button_8);
        this.b9 = (Button) findViewById(R.id.button_9);
        this.b00 = (Button) findViewById(R.id.button_00);
        this.b_clearAll = (Button) findViewById(R.id.clearAll);
        this.b_delete = (Button) findViewById(R.id.delete);
        this.b_point = (Button) findViewById(R.id.button_point);
        this.b_add = (Button) findViewById(R.id.button_add);
        this.b_sub = (Button) findViewById(R.id.button_sub);
        this.b_multi=(Button) findViewById(R.id.button_multi);
        this.b_devide=(Button) findViewById(R.id.button_devide);
        this.b_equal= (Button) findViewById(R.id.button_equal);
        this.b_history= (Button)findViewById(R.id.history);
        this.madd = (TextView)findViewById(R.id.madd);
        this.msub = (TextView)findViewById(R.id.msub);
        this.mclear = (TextView)findViewById(R.id.mclear);
        this.mrecall = (TextView)findViewById(R.id.mrecall);









////////////////////////////////Numbers/////////////////////////////////


        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tempvalue==1){
                    txt2.setText("");
                    tempvalue=0;
                    tempvalue2=0;
                    txt2.setText(txt2.getText().toString()+"0");
                }else{
                    tempvalue2=0;
                    txt2.setText(txt2.getText().toString()+"0");
                }

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(tempvalue==1){
                    txt2.setText("");
                    tempvalue=0;
                    tempvalue2=0;
                    txt2.setText(txt2.getText().toString()+"1");
                }else{
                    tempvalue2=0;
                    txt2.setText(txt2.getText().toString() + "1");
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tempvalue==1){
                    txt2.setText("");
                    tempvalue=0;
                    tempvalue2=0;
                    txt2.setText(txt2.getText().toString()+"2");
                }else{
                    tempvalue2=0;
                    txt2.setText(txt2.getText().toString() + "2");
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tempvalue==1){
                    txt2.setText("");
                    tempvalue=0;
                    tempvalue2=0;
                    txt2.setText(txt2.getText().toString()+"3");
                }else{
                    tempvalue2=0;
                    txt2.setText(txt2.getText().toString() + "3");
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tempvalue==1){
                    txt2.setText("");
                    tempvalue=0;
                    tempvalue2=0;
                    txt2.setText(txt2.getText().toString()+"4");
                }else{
                    tempvalue2=0;
                    txt2.setText(txt2.getText().toString() + "4");
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tempvalue==1){
                    txt2.setText("");
                    tempvalue=0;
                    tempvalue2=0;
                    txt2.setText(txt2.getText().toString()+"5");
                }else{
                    tempvalue2=0;
                    txt2.setText(txt2.getText().toString() + "5");
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tempvalue==1){
                    txt2.setText("");
                    tempvalue=0;
                    tempvalue2=0;
                    txt2.setText(txt2.getText().toString()+"6");
                }else{
                    tempvalue2=0;
                    txt2.setText(txt2.getText().toString() + "6");
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tempvalue==1){
                    txt2.setText("");
                    tempvalue=0;
                    tempvalue2=0;
                    txt2.setText(txt2.getText().toString()+"7");
                }else{
                    tempvalue2=0;
                    txt2.setText(txt2.getText().toString() + "7");
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tempvalue==1){
                    txt2.setText("");
                    tempvalue=0;
                    tempvalue2=0;
                    txt2.setText(txt2.getText().toString()+"8");
                }else{
                    tempvalue2=0;
                    txt2.setText(txt2.getText().toString() + "8");
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tempvalue==1){
                    txt2.setText("");
                    tempvalue=0;
                    tempvalue2=0;
                    txt2.setText(txt2.getText().toString()+"9");
                }else{
                    tempvalue2=0;
                    txt2.setText(txt2.getText().toString() + "9");
                }
            }
        });
        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tempvalue==1){
                    txt2.setText("");
                    tempvalue=0;
                    tempvalue2=0;
                    txt2.setText(txt2.getText().toString()+"00");
                }else{
                    tempvalue2=0;
                    txt2.setText(txt2.getText().toString() + "00");
                }
            }
        });
        b_clearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt2.setText("");
                txt1.setText("");
                number1=0;
                number2=0;
                operator=null;
                result=-1;
            }
        });

        ////////////////////////Numbers End//////////////////////////////

        b_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt2.getText().toString().length()>0){
                    txt2.setText(txt2.getText().toString().substring(0, txt2.getText().toString().length() - 1));

                }else {
                    txt2.setText("");
                }
            }
        });

        b_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt2.getText().toString().length()>0){
                    if(txt2.getText().toString().indexOf('.')!=-1){
                        txt2.setText(txt2.getText().toString());
                    }else{
                        txt2.setText(txt2.getText().toString()+".");
                    }
                }else{
                    txt2.setText("");
                }

            }
        });

////////////////////////////////operations Start//////////////////////////////

        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt2.getText().toString().length()>0){
                    if(result==-1&&operator==null){
                        number1=  Float.valueOf(txt2.getText().toString());
                        result=number1;
                        operator="+";
                        txt1.setText(txt2.getText().toString()+"+");
                        txt2.setText("");
                    }else if(result!=-1&&operator!="+"){
                        if(Float.valueOf(txt2.getText().toString())==tempvalue2){
                            tempvalue=1;
                            operator="+";
                            txt1.setText(txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1)+"+");
                        }else {
                            if (operator == "-") {
                                number2 = Float.valueOf(txt2.getText().toString());
                                result = result - number2;
                                tempvalue2=result;
                                txt2.setText(String.valueOf(result));
                                tempvalue = 1;
                                operator = "+";
                                txt1.setText(txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1) + "-" + number2 + "+");
                            } else if (operator == "*") {
                                number2 = Float.valueOf(txt2.getText().toString());
                                result = result * number2;
                                tempvalue2=result;
                                txt2.setText(String.valueOf(result));
                                tempvalue = 1;
                                operator = "+";
                                txt1.setText(txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1) + "*" + number2 + "+");
                            }else if (operator == "/") {
                                number2 = Float.valueOf(txt2.getText().toString());
                                result = result / number2;
                                tempvalue2=result;
                                txt2.setText(String.valueOf(result));
                                tempvalue = 1;
                                operator = "+";
                                txt1.setText(txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1) + "/" + number2 + "+");
                            }
                        }

                    } else{
                        if(operator=="+" || operator=="-" || operator=="*" || operator=="/" || operator=="="){
                            if(Float.valueOf(txt2.getText().toString())==tempvalue2){
                                    txt1.setText(txt1.getText().toString());
                                    txt2.setText(txt2.getText().toString());

                            }else{
                                number2=  Float.valueOf(txt2.getText().toString());
                                txt2.setText("");
                                tempvalue=1;
                                operator="+";
                                txt1.setText(txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1)+"+"+String.valueOf(number2)+"+");
                                number1=result;
                                result=number1+number2;
                                tempvalue2=result;
                                txt2.setText(String.valueOf(result));
                            }

                        }
                    }
                }else {
                    txt2.setText("");
                }

            }
        });

        b_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt2.getText().toString().length()>0){
                    if(result==-1&&operator==null){
                        number1=  Float.valueOf(txt2.getText().toString());
                        result=number1;
                        operator="-";
                        txt1.setText(txt2.getText().toString()+"-");
                        txt2.setText("");
                    }else if(result!=-1&&operator!="-"){
                        if(Float.valueOf(txt2.getText().toString())==tempvalue2){
                            tempvalue=1;
                            operator="-";
                            txt1.setText(txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1)+"-");
                        }else{
                            if(operator=="+"){
                                number2=  Float.valueOf(txt2.getText().toString());
                                result=result+number2;
                                tempvalue2=result;
                                txt2.setText(String.valueOf(result));
                                tempvalue=1;
                                operator="-";
                                txt1.setText(txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1)+"+"+number2+"-");
                            }else if(operator=="*"){
                                number2=  Float.valueOf(txt2.getText().toString());
                                result=result*number2;
                                tempvalue2=result;
                                txt2.setText(String.valueOf(result));
                                tempvalue=1;
                                operator="-";
                                txt1.setText(txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1)+"*"+number2+"-");
                            }else if(operator=="/"){
                                number2=  Float.valueOf(txt2.getText().toString());
                                result=result/number2;
                                tempvalue2=result;
                                txt2.setText(String.valueOf(result));
                                tempvalue=1;
                                operator="-";
                                txt1.setText(txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1)+"/"+number2+"-");
                            }
                        }



                    } else{
                        if(Float.valueOf(txt2.getText().toString())==tempvalue2){
                            txt1.setText(txt1.getText().toString());
                            txt2.setText(txt2.getText().toString());

                        }else {
                            if (operator == "+" || operator == "-" || operator == "*" || operator == "/" || operator=="=") {
                                number2 = Float.valueOf(txt2.getText().toString());
                                txt2.setText("");
                                tempvalue = 1;
                                operator = "-";
                                txt1.setText(txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1) + "-" + String.valueOf(number2) + "-");
                                number1 = result;
                                result = number1 - number2;
                                tempvalue2=result;
                                txt2.setText(String.valueOf(result));
                            }
                        }
                    }
                }else {
                    txt2.setText("");
                }

            }
        });

        b_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt2.getText().toString().length()>0){
                    if(result==-1&&operator==null){
                        number1=  Float.valueOf(txt2.getText().toString());
                        result=number1;
                        operator="*";
                        txt1.setText(txt2.getText().toString()+"*");
                        txt2.setText("");
                    }else if(result!=-1&&operator!="*"){
                        if(Float.valueOf(txt2.getText().toString())==tempvalue2){
                            tempvalue=1;
                            operator="*";
                            txt1.setText(txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1)+"*");
                        }else {
                            if (operator == "+") {
                                number2 = Float.valueOf(txt2.getText().toString());
                                result = result + number2;
                                tempvalue2=result;
                                txt2.setText(String.valueOf(result));
                                tempvalue = 1;
                                operator = "*";
                                txt1.setText(txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1) + "+" + number2 + "*");
                            } else if (operator == "-") {
                                number2 = Float.valueOf(txt2.getText().toString());
                                result = result - number2;
                                tempvalue2=result;
                                txt2.setText(String.valueOf(result));
                                tempvalue = 1;
                                operator = "*";
                                txt1.setText(txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1) + "-" + number2 + "*");
                            } else if (operator == "/") {
                                number2 = Float.valueOf(txt2.getText().toString());
                                result = result / number2;
                                tempvalue2=result;
                                txt2.setText(String.valueOf(result));
                                tempvalue = 1;
                                operator = "*";
                                txt1.setText(txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1) + "/" + number2 + "*");
                            }
                        }

                    } else{
                        if(Float.valueOf(txt2.getText().toString())==tempvalue2){
                            txt1.setText(txt1.getText().toString());
                            txt2.setText(txt2.getText().toString());

                        }else {
                            if (operator == "+" || operator == "-" || operator == "*" || operator == "/" || operator=="=") {
                                number2 = Float.valueOf(txt2.getText().toString());
                                txt2.setText("");
                                tempvalue = 1;
                                operator = "*";
                                txt1.setText(txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1) + "*" + String.valueOf(number2) + "*");
                                number1 = result;
                                result = number1 * number2;
                                tempvalue2=result;
                                txt2.setText(String.valueOf(result));
                            }
                        }
                    }
                }else {
                    txt2.setText("");
                }

            }
        });

        ///////////////////Devide////////////////////////////////
        b_devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt2.getText().toString().length()>0){
                    if(result==-1&&operator==null){
                        number1=  Float.valueOf(txt2.getText().toString());
                        result=number1;
                        operator="/";
                        txt1.setText(txt2.getText().toString()+"/");
                        txt2.setText("");
                    }else if(result!=-1&&operator!="/"){
                        if(Float.valueOf(txt2.getText().toString())==tempvalue2){
                            tempvalue=1;
                            operator="/";
                            txt1.setText(txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1)+"/");
                        }else {
                            if (operator == "+") {
                                number2 = Float.valueOf(txt2.getText().toString());
                                result = result + number2;
                                tempvalue2=result;
                                txt2.setText(String.valueOf(result));
                                tempvalue = 1;
                                operator = "*";
                                txt1.setText(txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1) + "+" + number2 + "/");
                            } else if (operator == "-") {
                                number2 = Float.valueOf(txt2.getText().toString());
                                result = result - number2;
                                tempvalue2=result;
                                txt2.setText(String.valueOf(result));
                                tempvalue = 1;
                                operator = "*";
                                txt1.setText(txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1) + "-" + number2 + "/");
                            }
                            else if (operator == "*") {
                                number2 = Float.valueOf(txt2.getText().toString());
                                result = result * number2;
                                tempvalue2=result;
                                txt2.setText(String.valueOf(result));
                                tempvalue = 1;
                                operator = "/";
                                txt1.setText(txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1) + "*" + number2 + "/");
                            }
                        }

                    } else{
                        if(Float.valueOf(txt2.getText().toString())==tempvalue2){
                            txt1.setText(txt1.getText().toString());
                            txt2.setText(txt2.getText().toString());

                        }else {
                            if (operator == "+" || operator == "-" || operator == "*" || operator == "/" || operator=="=") {
                                number2 = Float.valueOf(txt2.getText().toString());
                                txt2.setText("");
                                tempvalue = 1;
                                operator = "/";
                                txt1.setText(txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1) + "/" + String.valueOf(number2) + "/");
                                number1 = result;
                                result = number1 / number2;
                                tempvalue2=result;
                                txt2.setText(String.valueOf(result));
                            }
                        }
                    }
                }else {

                    txt2.setText("");
                }

            }
        });

        ///////////////////////Equal/////////////////////////////////////
        b_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operator=="+" && txt2.getText().toString()!=""){
                    if(Float.valueOf(txt2.getText().toString())==tempvalue2){
                        txt1.setText(txt1.getText().toString());
                        txt2.setText(txt2.getText().toString());

                    }else {
                        number2 = Float.valueOf(txt2.getText().toString());
                        tempvalue = 1;
                        number1 = result;
                        result = number1 + number2;
                        tempvalue2 = result;
                        operator="=";
                        String result1 = txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1) + "+" + String.valueOf(number2);
                        String result2 = String.valueOf(result);
                        String final_result = "---------------------------"+Day+"/"+Month+"/"+Year+"("+hour+":"+munites+")"+"----------------------------\n"+result1+"\n"+"="+result2;
                        String history_result = readFile(filename)+"\n"+final_result;
                        saveFile(filename,history_result);
                        txt1.setText(result1);
                        txt2.setText(result2);
                    }
                }else if(operator=="-" && txt2.getText().toString()!=""){
                    if(Float.valueOf(txt2.getText().toString())==tempvalue2){
                        txt1.setText(txt1.getText().toString());
                        txt2.setText(txt2.getText().toString());

                    }else {
                        number2 = Float.valueOf(txt2.getText().toString());
                        tempvalue = 1;
                        number1 = result;
                        result = number1 - number2;
                        tempvalue2 = result;
                        operator="=";
                        String result1=txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1) + "-" + String.valueOf(number2);
                        String result2= String.valueOf(result);
                        String final_result = "---------------------------"+Day+"/"+Month+"/"+Year+"("+hour+":"+munites+")"+"----------------------------\n"+result1+"\n"+"="+result2;
                        String history_result = readFile(filename)+"\n"+final_result;
                        saveFile(filename,history_result);
                        txt1.setText(result1);
                        txt2.setText(result2);
                    }
                }else if (operator=="*" && txt2.getText().toString()!=""){
                    if(Float.valueOf(txt2.getText().toString())==tempvalue2){
                        txt1.setText(txt1.getText().toString());
                        txt2.setText(txt2.getText().toString());

                    }else {
                        number2 = Float.valueOf(txt2.getText().toString());
                        tempvalue = 1;
                        number1 = result;
                        result = number1 * number2;
                        tempvalue2 = result;
                        operator="=";
                        String result1=txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1) + "*" + String.valueOf(number2);
                        String result2= String.valueOf(result);
                        String final_result ="---------------------------"+Day+"/"+Month+"/"+Year+"("+hour+":"+munites+")"+"----------------------------\n"+result1+"\n"+"="+result2;
                        String history_result = readFile(filename)+"\n"+final_result;
                        saveFile(filename,history_result);
                        txt1.setText(result1);
                        txt2.setText(result2);
                    }
                }else if(operator=="/" && txt2.getText().toString()!="Math Error" && txt2.getText().toString()!=""){
                    number2 = Float.valueOf(txt2.getText().toString());
                    if(number2==0){
                        String result1=txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1) + "/" + String.valueOf(number2);
                        String result2= "Math Error";
                        String final_result = "---------------------------"+Day+"/"+Month+"/"+Year+"("+hour+":"+munites+")"+"----------------------------\n"+result1+"\n"+"="+result2;
                        String history_result = readFile(filename)+"\n"+final_result;
                        saveFile(filename,history_result);
                        txt1.setText(result1);
                        txt2.setText(result2);


                        txt1.setText(result1);
                        txt2.setText(result2);
                    }else {
                        if(Float.valueOf(txt2.getText().toString())==tempvalue2 || txt2.getText().toString()=="Math Error"){
                            txt1.setText(txt1.getText().toString());
                            txt2.setText(txt2.getText().toString());

                        }else {
                            number2 = Float.valueOf(txt2.getText().toString());
                            tempvalue = 1;
                            number1 = result;
                            result = number1 / number2;
                            tempvalue2 = result;
                            operator="=";
                            String result1=txt1.getText().toString().substring(0, txt1.getText().toString().length() - 1) + "/" + String.valueOf(number2);
                            String result2= String.valueOf(result);
                            String final_result = "---------------------------"+Day+"/"+Month+"/"+Year+"("+hour+":"+munites+")"+"----------------------------\n"+result1+"\n"+"="+result2;
                            String history_result = readFile(filename)+"\n"+final_result;
                            saveFile(filename,history_result);
                            txt1.setText(result1);
                            txt2.setText(result2);
                        }
                    }
                }else {
                    txt2.setText(txt2.getText().toString());
                    txt1.setText(txt1.getText().toString());
                    number1=0;
                    number2=0;
                    operator=null;
                    result=-1;
                    tempvalue2=0;
                    tempvalue=0;
                }
            }
        });

        b_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HistoryActivity.class);
                intent.putExtra("historyfile",filename);
                startActivity(intent);

            }
        });

        madd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operator=="=" && txt2.getText().toString()!=null){
                    float num1=Float.valueOf(getMemory());
                    float num2=Float.valueOf(result);
                    float res = num1+num2;
                    String memory = String.valueOf(res);
                    saveMemory(memory);
                }
            }
        });
        msub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operator=="=" && txt2.getText().toString()!=null){
                    float num1=Float.valueOf(getMemory());
                    float num2=Float.valueOf(result);
                    float res = num1-num2;
                    String memory = String.valueOf(res);
                    saveMemory(memory);
                }
            }
        });
        mrecall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("");
                txt2.setText(getMemory());
            }
        });
        mclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveMemory("0");
            }
        });
    }
}
