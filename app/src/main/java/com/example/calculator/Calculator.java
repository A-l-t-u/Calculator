package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class Calculator extends AppCompatActivity {

    EditText T1,T2,T4,T5,T6;
    TextView V1,V2,V3,V4,V5;
    Button B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,B26,B27,B28,B29,B30,B31,B32,B33,B34,B35,B36,B37,B38,B39;
    ImageButton IB1,IB2,IB3,IB4,IB5,IB6,IB7,IB8;
    String cal_add,cal_sub,cal_mul,cal_div,r,zeta;
    LinearLayout L1,L2,L3,L4,L5,L6,linear,linear2;
    Switch B1;
    String Formulae = "M = 1/√((1-r²)² + (2ζr)²)";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        L1 = (LinearLayout) findViewById(R.id.L1);
        L2 = (LinearLayout) findViewById(R.id.L2);
        L3 = (LinearLayout) findViewById(R.id.L3);
        L4 = (LinearLayout) findViewById(R.id.L4);
        L5 = (LinearLayout) findViewById(R.id.L5);
        L6 = (LinearLayout) findViewById(R.id.L6);
        linear = (LinearLayout) findViewById(R.id.linear);
        linear2 = (LinearLayout) findViewById(R.id.linear2);

        T1 = (EditText) findViewById(R.id.txtv1);
        T2 = (EditText) findViewById(R.id.txtv2);
        T4 = (EditText) findViewById(R.id.txtv4);
        T5 = (EditText) findViewById(R.id.txtv5);
        T6 = (EditText) findViewById(R.id.txtv6);

        V1 = (TextView) findViewById(R.id.txt1);
        V2 = (TextView) findViewById(R.id.txt2);
        V3 = (TextView) findViewById(R.id.txt3);
        V4 = (TextView) findViewById(R.id.txt4);
        V5 = (TextView) findViewById(R.id.txt5);

        IB1 = (ImageButton) findViewById(R.id.ibutton);
        IB2 = (ImageButton) findViewById(R.id.ibutton2);
        IB3 = (ImageButton) findViewById(R.id.ibutton3);
        IB4 = (ImageButton) findViewById(R.id.ibutton4);
        IB5 = (ImageButton) findViewById(R.id.ibutton5);
        IB6 = (ImageButton) findViewById(R.id.ibutton6);
        IB7 = (ImageButton) findViewById(R.id.ibutton7);
        IB8 = (ImageButton) findViewById(R.id.ibutton8);

        B1 = (Switch) findViewById(R.id.switch1);

        B2 = (Button) findViewById(R.id.button2);
        B3 = (Button) findViewById(R.id.button3);
        B4 = (Button) findViewById(R.id.button4);
        B5 = (Button) findViewById(R.id.button5);
        B6 = (Button) findViewById(R.id.button6);
        B7 = (Button) findViewById(R.id.button7);
        B8 = (Button) findViewById(R.id.button8);
        B9 = (Button) findViewById(R.id.button9);
        B10 = (Button) findViewById(R.id.button10);
        B11 = (Button) findViewById(R.id.button11);
        B12 = (Button) findViewById(R.id.button12);
        B13 = (Button) findViewById(R.id.button13);
        B14 = (Button) findViewById(R.id.button14);
        B15 = (Button) findViewById(R.id.button15);
        B16 = (Button) findViewById(R.id.button16);
        B17 = (Button) findViewById(R.id.button17);
        B18 = (Button) findViewById(R.id.button18);
        B19 = (Button) findViewById(R.id.button19);
        B20 = (Button) findViewById(R.id.button20);
        B21 = (Button) findViewById(R.id.button21);
        B22 = (Button) findViewById(R.id.button22);
        B23 = (Button) findViewById(R.id.button23);
        B24 = (Button) findViewById(R.id.button24);
        B25 = (Button) findViewById(R.id.button25);
        B26 = (Button) findViewById(R.id.button26);
        B27 = (Button) findViewById(R.id.button27);
        B28 = (Button) findViewById(R.id.button28);
        B29 = (Button) findViewById(R.id.button29);
        B30 = (Button) findViewById(R.id.button30);
        B31 = (Button) findViewById(R.id.button31);
        B32 = (Button) findViewById(R.id.button32);
        B33 = (Button) findViewById(R.id.button33);
        B34 = (Button) findViewById(R.id.button34);
        B35 = (Button) findViewById(R.id.button35);
        B36 = (Button) findViewById(R.id.button36);
        B37 = (Button) findViewById(R.id.button37);
        B38 = (Button) findViewById(R.id.button38);
        B39 = (Button) findViewById(R.id.button39);

        cal_add = "";
        cal_sub = "";
        cal_mul = "";
        cal_div = "";

        B1.setBackground(getDrawable(R.drawable.btn_edit_light));

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            L5.setVisibility(View.VISIBLE);
            L6.setVisibility(View.GONE);
        }
    }

    public void btn1(View V)
    {
        if(B1.isChecked())
        {
            if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
            {
                L1.setBackground(getDrawable(R.drawable.background_dark));
                L2.setBackground(getDrawable(R.drawable.txt_view_edit_dark));
                L3.setBackground(getDrawable(R.drawable.txt_view_edit_dark));

                T1.setBackground(getDrawable(R.drawable.background_dark));
                T2.setBackground(getDrawable(R.drawable.background_dark));

                V4.setBackground(getDrawable(R.drawable.background_dark));
                V5.setBackground(getDrawable(R.drawable.background_dark));

                B1.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B2.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B3.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B4.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B5.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B6.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B7.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B8.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B9.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B10.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B11.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B12.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B13.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B14.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B15.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B16.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B17.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B18.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B19.setBackground(getDrawable(R.drawable.btn_edit_dark));

                T1.setTextColor(Color.parseColor("#eeeeee"));
                T2.setTextColor(Color.parseColor("#eeeeee"));

                V4.setTextColor(Color.parseColor("#eeeeee"));
                V5.setTextColor(Color.parseColor("#eeeeee"));

                B1.setTextColor(Color.parseColor("#eeeeee"));
                B2.setTextColor(Color.parseColor("#eeeeee"));
                B3.setTextColor(Color.parseColor("#eeeeee"));
                B4.setTextColor(Color.parseColor("#eeeeee"));
                B5.setTextColor(Color.parseColor("#eeeeee"));
                B6.setTextColor(Color.parseColor("#eeeeee"));
                B7.setTextColor(Color.parseColor("#eeeeee"));
                B8.setTextColor(Color.parseColor("#eeeeee"));
                B9.setTextColor(Color.parseColor("#eeeeee"));
                B10.setTextColor(Color.parseColor("#eeeeee"));
                B11.setTextColor(Color.parseColor("#eeeeee"));
                B12.setTextColor(Color.parseColor("#eeeeee"));
                B13.setTextColor(Color.parseColor("#eeeeee"));
                B14.setTextColor(Color.parseColor("#eeeeee"));
                B15.setTextColor(Color.parseColor("#eeeeee"));
                B16.setTextColor(Color.parseColor("#eeeeee"));
                B17.setTextColor(Color.parseColor("#eeeeee"));
                B18.setTextColor(Color.parseColor("#eeeeee"));
                B19.setTextColor(Color.parseColor("#eeeeee"));
            }
            else
            {
                L1.setBackground(getDrawable(R.drawable.background_dark));
                L2.setBackground(getDrawable(R.drawable.txt_view_edit_dark));
                L3.setBackground(getDrawable(R.drawable.txt_view_edit_dark));
                linear.setBackground(getDrawable(R.drawable.txt_view_edit_dark));
                linear2.setBackground(getDrawable(R.drawable.txt_view_edit_dark));

                T1.setBackground(getDrawable(R.drawable.background_dark));
                T2.setBackground(getDrawable(R.drawable.background_dark));

                V4.setBackground(getDrawable(R.drawable.background_dark));
                V5.setBackground(getDrawable(R.drawable.background_dark));

                B1.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B2.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B3.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B4.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B5.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B6.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B7.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B8.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B9.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B10.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B11.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B12.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B13.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B14.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B15.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B16.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B17.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B18.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B19.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B20.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B21.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B22.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B22.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B23.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B24.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B25.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B26.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B27.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B28.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B29.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B30.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B31.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B32.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B33.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B34.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B35.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B36.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B37.setBackground(getDrawable(R.drawable.btn_edit_dark));
                B38.setBackground(getDrawable(R.drawable.btn_edit_dark));

                T1.setTextColor(Color.parseColor("#eeeeee"));
                T2.setTextColor(Color.parseColor("#eeeeee"));
                T4.setTextColor(Color.parseColor("#eeeeee"));
                T5.setTextColor(Color.parseColor("#eeeeee"));
                T6.setTextColor(Color.parseColor("#eeeeee"));

                V1.setTextColor(Color.parseColor("#eeeeee"));
                V2.setTextColor(Color.parseColor("#eeeeee"));
                V3.setTextColor(Color.parseColor("#eeeeee"));
                V4.setTextColor(Color.parseColor("#eeeeee"));
                V5.setTextColor(Color.parseColor("#eeeeee"));

                B1.setTextColor(Color.parseColor("#eeeeee"));
                B2.setTextColor(Color.parseColor("#eeeeee"));
                B3.setTextColor(Color.parseColor("#eeeeee"));
                B4.setTextColor(Color.parseColor("#eeeeee"));
                B5.setTextColor(Color.parseColor("#eeeeee"));
                B6.setTextColor(Color.parseColor("#eeeeee"));
                B7.setTextColor(Color.parseColor("#eeeeee"));
                B8.setTextColor(Color.parseColor("#eeeeee"));
                B9.setTextColor(Color.parseColor("#eeeeee"));
                B10.setTextColor(Color.parseColor("#eeeeee"));
                B11.setTextColor(Color.parseColor("#eeeeee"));
                B12.setTextColor(Color.parseColor("#eeeeee"));
                B13.setTextColor(Color.parseColor("#eeeeee"));
                B14.setTextColor(Color.parseColor("#eeeeee"));
                B15.setTextColor(Color.parseColor("#eeeeee"));
                B16.setTextColor(Color.parseColor("#eeeeee"));
                B17.setTextColor(Color.parseColor("#eeeeee"));
                B18.setTextColor(Color.parseColor("#eeeeee"));
                B19.setTextColor(Color.parseColor("#eeeeee"));
                B20.setTextColor(Color.parseColor("#eeeeee"));
                B21.setTextColor(Color.parseColor("#eeeeee"));
                B22.setTextColor(Color.parseColor("#eeeeee"));
                B23.setTextColor(Color.parseColor("#eeeeee"));
                B24.setTextColor(Color.parseColor("#eeeeee"));
                B25.setTextColor(Color.parseColor("#eeeeee"));
                B26.setTextColor(Color.parseColor("#eeeeee"));
                B27.setTextColor(Color.parseColor("#eeeeee"));
                B28.setTextColor(Color.parseColor("#eeeeee"));
                B29.setTextColor(Color.parseColor("#eeeeee"));
                B30.setTextColor(Color.parseColor("#eeeeee"));
                B31.setTextColor(Color.parseColor("#eeeeee"));
                B32.setTextColor(Color.parseColor("#eeeeee"));
                B33.setTextColor(Color.parseColor("#eeeeee"));
                B34.setTextColor(Color.parseColor("#eeeeee"));
                B35.setTextColor(Color.parseColor("#eeeeee"));
                B36.setTextColor(Color.parseColor("#eeeeee"));
                B37.setTextColor(Color.parseColor("#eeeeee"));
                B38.setTextColor(Color.parseColor("#eeeeee"));
                B39.setTextColor(Color.parseColor("#eeeeee"));

                IB1.setVisibility(View.GONE);
                IB2.setVisibility(View.VISIBLE);
                IB3.setVisibility(View.VISIBLE);
                IB4.setVisibility(View.GONE);
                IB5.setVisibility(View.GONE);
                IB6.setVisibility(View.VISIBLE);
                IB7.setVisibility(View.GONE);
                IB8.setVisibility(View.VISIBLE);
            }
        }
        else
        {
            if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
            {
                L1.setBackground(getDrawable(R.drawable.background_light));
                L2.setBackground(getDrawable(R.drawable.txt_view_edit_light));
                L3.setBackground(getDrawable(R.drawable.txt_view_edit_light));

                T1.setBackground(getDrawable(R.drawable.background_light));
                T2.setBackground(getDrawable(R.drawable.background_light));

                V4.setBackground(getDrawable(R.drawable.background_light));
                V5.setBackground(getDrawable(R.drawable.background_light));

                B1.setBackground(getDrawable(R.drawable.btn_edit_light));
                B2.setBackground(getDrawable(R.drawable.btn_edit_light));
                B3.setBackground(getDrawable(R.drawable.btn_edit_light));
                B4.setBackground(getDrawable(R.drawable.btn_edit_light));
                B5.setBackground(getDrawable(R.drawable.btn_edit_light));
                B6.setBackground(getDrawable(R.drawable.btn_edit_light));
                B7.setBackground(getDrawable(R.drawable.btn_edit_light));
                B8.setBackground(getDrawable(R.drawable.btn_edit_light));
                B9.setBackground(getDrawable(R.drawable.btn_edit_light));
                B10.setBackground(getDrawable(R.drawable.btn_edit_light));
                B11.setBackground(getDrawable(R.drawable.btn_edit_light));
                B12.setBackground(getDrawable(R.drawable.btn_edit_light));
                B13.setBackground(getDrawable(R.drawable.btn_edit_light));
                B14.setBackground(getDrawable(R.drawable.btn_edit_light));
                B15.setBackground(getDrawable(R.drawable.btn_edit_light));
                B16.setBackground(getDrawable(R.drawable.btn_edit_light));
                B17.setBackground(getDrawable(R.drawable.btn_edit_light));
                B18.setBackground(getDrawable(R.drawable.btn_edit_light));
                B19.setBackground(getDrawable(R.drawable.btn_edit_light));

                T1.setTextColor(Color.parseColor("#000000"));
                T2.setTextColor(Color.parseColor("#000000"));

                B1.setTextColor(Color.parseColor("#000000"));
                B2.setTextColor(Color.parseColor("#000000"));
                B3.setTextColor(Color.parseColor("#000000"));
                B4.setTextColor(Color.parseColor("#000000"));
                B5.setTextColor(Color.parseColor("#000000"));
                B6.setTextColor(Color.parseColor("#000000"));
                B7.setTextColor(Color.parseColor("#000000"));
                B8.setTextColor(Color.parseColor("#000000"));
                B9.setTextColor(Color.parseColor("#000000"));
                B10.setTextColor(Color.parseColor("#000000"));
                B11.setTextColor(Color.parseColor("#000000"));
                B12.setTextColor(Color.parseColor("#000000"));
                B13.setTextColor(Color.parseColor("#000000"));
                B14.setTextColor(Color.parseColor("#000000"));
                B15.setTextColor(Color.parseColor("#000000"));
                B16.setTextColor(Color.parseColor("#000000"));
                B17.setTextColor(Color.parseColor("#000000"));
                B18.setTextColor(Color.parseColor("#000000"));
                B19.setTextColor(Color.parseColor("#000000"));

                V4.setTextColor(Color.parseColor("#000000"));
                V5.setTextColor(Color.parseColor("#000000"));
            }
            else
            {
                L1.setBackground(getDrawable(R.drawable.background_light));
                L2.setBackground(getDrawable(R.drawable.txt_view_edit_light));
                L3.setBackground(getDrawable(R.drawable.txt_view_edit_light));
                linear.setBackground(getDrawable(R.drawable.txt_view_edit_light));
                linear2.setBackground(getDrawable(R.drawable.txt_view_edit_light));

                T1.setBackground(getDrawable(R.drawable.background_light));
                T2.setBackground(getDrawable(R.drawable.background_light));

                V4.setBackground(getDrawable(R.drawable.background_light));
                V5.setBackground(getDrawable(R.drawable.background_light));

                B1.setBackground(getDrawable(R.drawable.btn_edit_light));
                B2.setBackground(getDrawable(R.drawable.btn_edit_light));
                B3.setBackground(getDrawable(R.drawable.btn_edit_light));
                B4.setBackground(getDrawable(R.drawable.btn_edit_light));
                B5.setBackground(getDrawable(R.drawable.btn_edit_light));
                B6.setBackground(getDrawable(R.drawable.btn_edit_light));
                B7.setBackground(getDrawable(R.drawable.btn_edit_light));
                B8.setBackground(getDrawable(R.drawable.btn_edit_light));
                B9.setBackground(getDrawable(R.drawable.btn_edit_light));
                B10.setBackground(getDrawable(R.drawable.btn_edit_light));
                B11.setBackground(getDrawable(R.drawable.btn_edit_light));
                B12.setBackground(getDrawable(R.drawable.btn_edit_light));
                B13.setBackground(getDrawable(R.drawable.btn_edit_light));
                B14.setBackground(getDrawable(R.drawable.btn_edit_light));
                B15.setBackground(getDrawable(R.drawable.btn_edit_light));
                B16.setBackground(getDrawable(R.drawable.btn_edit_light));
                B17.setBackground(getDrawable(R.drawable.btn_edit_light));
                B18.setBackground(getDrawable(R.drawable.btn_edit_light));
                B19.setBackground(getDrawable(R.drawable.btn_edit_light));
                B20.setBackground(getDrawable(R.drawable.btn_edit_light));
                B21.setBackground(getDrawable(R.drawable.btn_edit_light));
                B22.setBackground(getDrawable(R.drawable.btn_edit_light));
                B23.setBackground(getDrawable(R.drawable.btn_edit_light));
                B24.setBackground(getDrawable(R.drawable.btn_edit_light));
                B25.setBackground(getDrawable(R.drawable.btn_edit_light));
                B26.setBackground(getDrawable(R.drawable.btn_edit_light));
                B27.setBackground(getDrawable(R.drawable.btn_edit_light));
                B28.setBackground(getDrawable(R.drawable.btn_edit_light));
                B29.setBackground(getDrawable(R.drawable.btn_edit_light));
                B30.setBackground(getDrawable(R.drawable.btn_edit_light));
                B31.setBackground(getDrawable(R.drawable.btn_edit_light));
                B32.setBackground(getDrawable(R.drawable.btn_edit_light));
                B33.setBackground(getDrawable(R.drawable.btn_edit_light));
                B34.setBackground(getDrawable(R.drawable.btn_edit_light));
                B35.setBackground(getDrawable(R.drawable.btn_edit_light));
                B36.setBackground(getDrawable(R.drawable.btn_edit_light));
                B37.setBackground(getDrawable(R.drawable.btn_edit_light));
                B38.setBackground(getDrawable(R.drawable.btn_edit_light));

                T1.setTextColor(Color.parseColor("#000000"));
                T2.setTextColor(Color.parseColor("#000000"));
                T4.setTextColor(Color.parseColor("#000000"));
                T5.setTextColor(Color.parseColor("#000000"));
                T6.setTextColor(Color.parseColor("#000000"));

                V1.setTextColor(Color.parseColor("#000000"));
                V2.setTextColor(Color.parseColor("#000000"));
                V3.setTextColor(Color.parseColor("#000000"));
                V4.setTextColor(Color.parseColor("#000000"));
                V5.setTextColor(Color.parseColor("#000000"));

                B1.setTextColor(Color.parseColor("#000000"));
                B2.setTextColor(Color.parseColor("#000000"));
                B3.setTextColor(Color.parseColor("#000000"));
                B4.setTextColor(Color.parseColor("#000000"));
                B5.setTextColor(Color.parseColor("#000000"));
                B6.setTextColor(Color.parseColor("#000000"));
                B7.setTextColor(Color.parseColor("#000000"));
                B8.setTextColor(Color.parseColor("#000000"));
                B9.setTextColor(Color.parseColor("#000000"));
                B10.setTextColor(Color.parseColor("#000000"));
                B11.setTextColor(Color.parseColor("#000000"));
                B12.setTextColor(Color.parseColor("#000000"));
                B13.setTextColor(Color.parseColor("#000000"));
                B14.setTextColor(Color.parseColor("#000000"));
                B15.setTextColor(Color.parseColor("#000000"));
                B16.setTextColor(Color.parseColor("#000000"));
                B17.setTextColor(Color.parseColor("#000000"));
                B18.setTextColor(Color.parseColor("#000000"));
                B19.setTextColor(Color.parseColor("#000000"));
                B20.setTextColor(Color.parseColor("#000000"));
                B21.setTextColor(Color.parseColor("#000000"));
                B22.setTextColor(Color.parseColor("#000000"));
                B23.setTextColor(Color.parseColor("#000000"));
                B24.setTextColor(Color.parseColor("#000000"));
                B25.setTextColor(Color.parseColor("#000000"));
                B26.setTextColor(Color.parseColor("#000000"));
                B27.setTextColor(Color.parseColor("#000000"));
                B28.setTextColor(Color.parseColor("#000000"));
                B29.setTextColor(Color.parseColor("#000000"));
                B30.setTextColor(Color.parseColor("#000000"));
                B31.setTextColor(Color.parseColor("#000000"));
                B32.setTextColor(Color.parseColor("#000000"));
                B33.setTextColor(Color.parseColor("#000000"));
                B34.setTextColor(Color.parseColor("#000000"));
                B35.setTextColor(Color.parseColor("#000000"));
                B36.setTextColor(Color.parseColor("#000000"));
                B37.setTextColor(Color.parseColor("#000000"));
                B38.setTextColor(Color.parseColor("#000000"));
                B39.setTextColor(Color.parseColor("#000000"));

                IB1.setVisibility(View.VISIBLE);
                IB2.setVisibility(View.GONE);
                IB3.setVisibility(View.GONE);
                IB4.setVisibility(View.VISIBLE);
                IB5.setVisibility(View.VISIBLE);
                IB6.setVisibility(View.GONE);
                IB7.setVisibility(View.VISIBLE);
                IB8.setVisibility(View.GONE);
            }
        }
    }

    public void btn2(View V)
    {
        T1.setText("");
        T2.setText("");
        V4.setText("");
        V5.setText("");
        cal_add = "";
        cal_sub = "";
        cal_mul = "";
        cal_div = "";
    }

    public void btn3(View V)
    {
        T1.setText("");
    }

    public void btn4(View V)
    {
        if(V4.getText().toString().equals(""))
        {
            cal_div = T1.getText().toString();
        }
        else
        {
            double a = Float.parseFloat(T1.getText().toString());
            double b = Float.parseFloat(cal_div);
            String e = V5.getText().toString();
            double c;
            if(e.equals("+")){c = a+b;} else if(e.equals("-")){c = b-a;} else if(e.equals("x")){c = a*b;} else{c = b/a;};
            String d = String.valueOf(c);
            cal_div = d;
        }
        V4.setText(cal_div);
        V5.setText("÷");
        T1.setText("");
        cal_add = "";
        cal_sub = "";
        cal_mul = "";
    }

    public void btn5(View V)
    {
        String t;
        t = T1.getText().toString() + "7";
        T1.setText(t);
    }

    public void btn6(View V)
    {
        String t;
        t = T1.getText().toString() + "8";
        T1.setText(t);
    }

    public void btn7(View V)
    {
        String t;
        t = T1.getText().toString() + "9";
        T1.setText(t);
    }

    public void btn8(View V)
    {
        if(V4.getText().toString().equals(""))
        {
            cal_mul = T1.getText().toString();
        }
        else
        {
            double a = Float.parseFloat(T1.getText().toString());
            double b = Float.parseFloat(cal_mul);
            String e = V5.getText().toString();
            double c;
            if(e.equals("+")){c = a+b;} else if(e.equals("-")){c = b-a;} else if(e.equals("÷")){c = b/a;} else{c = a*b;};
            String d = String.valueOf(c);
            cal_mul = d;
        }
        V4.setText(cal_mul);
        V5.setText("x");
        T1.setText("");
        cal_add = "";
        cal_sub = "";
        cal_div = "";
    }

    public void btn9(View V)
    {
        String t;
        t = T1.getText().toString() + "4";
        T1.setText(t);
    }

    public void btn10(View V)
    {
        String t;
        t = T1.getText().toString() + "5";
        T1.setText(t);
    }

    public void btn11(View V)
    {
        String t;
        t = T1.getText().toString() + "6";
        T1.setText(t);
    }

    public void btn12(View V)
    {
        if(V4.getText().toString().equals(""))
        {
            cal_sub = T1.getText().toString();
        }
        else
        {
            double a = Float.parseFloat(T1.getText().toString());
            double b = Float.parseFloat(cal_sub);
            String e = V5.getText().toString();
            double c;
            if(e.equals("+")){c = a+b;} else if(e.equals("x")){c = a*b;} else if(e.equals("÷")){c = b/a;} else{c = b-a;};
            String d = String.valueOf(c);
            cal_sub = d;
        }
        V4.setText(cal_sub);
        V5.setText("-");
        T1.setText("");
        cal_add = "";
        cal_mul = "";
        cal_div = "";
    }

    public void btn13(View V)
    {
        String t = T1.getText().toString() + "1";
        T1.setText(t);
    }

    public void btn14(View V)
    {
        String t;
        t = T1.getText().toString() + "2";
        T1.setText(t);
    }

    public void btn15(View V)
    {
        String t;
        t = T1.getText().toString() + "3";
        T1.setText(t);
    }

    public void btn16(View V)
    {
        if(V4.getText().toString().equals(""))
        {
            cal_add = T1.getText().toString();
        }
        else
        {
            double a = Float.parseFloat(T1.getText().toString());
            double b = Float.parseFloat(cal_add);
            String e = V5.getText().toString();
            double c;
            if(e.equals("-"))
            {
                c = b-a;
            }
            else if(e.equals("x"))
            {
                c = a*b;
            }
            else if(e.equals("÷"))
            {
                c = b/a;
            }
            else
            {
                c = a+b;
            }
            String d = String.valueOf(c);
            cal_add = d;
        }
        V4.setText(cal_add);
        V5.setText("+");
        T1.setText("");
        cal_sub = "";
        cal_mul = "";
        cal_div = "";
    }

    public void btn17(View V)
    {
        String t;
        t = T1.getText().toString() + "0";
        T1.setText(t);
    }

    public void btn18(View V)
    {
        String t;
        t = T1.getText().toString() + ".";
        T1.setText(t);
    }

    public void btn19(View V)
    {
        if((V4.getText().toString().equals("")) && !(T1.getText().toString().equals("")))
        {
            String d = T1.getText().toString();
            T2.setText(d);
        }
        else if(!(V4.getText().toString().equals("")) && T1.getText().toString().equals(""))
        {
            String d = V4.getText().toString();
            T1.setText("");
            T2.setText(d);
            V4.setText("");
            V5.setText("");
        }
        else if(cal_add != "")
        {
            double a = Float.parseFloat(T1.getText().toString());
            double b = Float.parseFloat(cal_add);
            double c = a+b;
            String d = String.valueOf(c);
            T1.setText("");
            T2.setText(d);
            V4.setText("");
            V5.setText("");
            cal_add = "";
        }
        else if(cal_sub != "")
        {
            double a = Float.parseFloat(T1.getText().toString());
            double b = Float.parseFloat(cal_sub);
            double c = b-a;
            String d = String.valueOf(c);
            T1.setText("");
            T2.setText(d);
            V4.setText("");
            V5.setText("");
            cal_sub = "";
        }
        else if(cal_mul != "")
        {
            double a = Float.parseFloat(T1.getText().toString());
            double b = Float.parseFloat(cal_mul);
            double c = a*b;
            String d = String.valueOf(c);
            T1.setText("");
            T2.setText(d);
            V4.setText("");
            V5.setText("");
            cal_mul = "";
        }
        else if(cal_div != "")
        {
            double a = Float.parseFloat(T1.getText().toString());
            double b = Float.parseFloat(cal_div);
            double c = b/a;
            String d = String.valueOf(c);
            T1.setText("");
            T2.setText(d);
            V4.setText("");
            V5.setText("");
            cal_div = "";
        }
        else if(cal_add.equals("") && cal_sub.equals("") && cal_mul.equals("") && cal_div.equals(""))
        {
            String d = T1.getText().toString();
            T1.setText("");
            T2.setText(d);
            V4.setText("");
            V5.setText("");
        }

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            if(!(T4.getText().toString().equals("")) && !(T5.getText().toString().equals("")))
            {
                double a = Float.parseFloat(T4.getText().toString());
                double b = Float.parseFloat(T5.getText().toString());
                double c = sqrt((((1-(a*a))*(1-(a*a)))+((2*b*a)*(2*b*a))));
                double d = (1/c);
                T6.setText(String.valueOf(d));
            }
        }
    }

    public void btn20(View V)
    {
        L5.setVisibility(View.GONE);
        L6.setVisibility(View.VISIBLE);
        IB1.setVisibility(View.VISIBLE);
    }

    public void btn39(View V)
    {

    }

    public void btn40(View V)
    {
        String e = T4.getText().toString();
        String f = T5.getText().toString();

        if(e.equals(""))
        {
            r = T1.getText().toString();
            T4.setText(r);
            T1.setText("");
        }
        else if(f.equals(""))
        {
            zeta = T1.getText().toString();
            T5.setText(zeta);
            T1.setText("");
        }
    }

    public void btn41(View V)
    {
        L5.setVisibility(View.VISIBLE);
        L6.setVisibility(View.GONE);
    }

    public void btn42(View V)
    {
        B39.setText("");
    }

    public void btn43(View V)
    {
        B39.setText("");
    }
}