package com.example.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

//    String allowedChars = "";
//    int max_length;
//    private static final String NUMBERS = "0123456789";
//    private static final String UPPER_ALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//    private static final String LOWER_ALPHABETS = "abcdefghijklmnopqrstuvwxyz";
//    private static final String SPECIALCHARACTERS = "!@#$%^&*()_-+=<>?/{}~|";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_2b);

//        TextView price=findViewById(R.id.price);
//
//        SpannableString string = new SpannableString("141.800 đ");
//        string.setSpan(new StrikethroughSpan(), 0, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//        price.setText(string);


//        CheckBox lower = findViewById(R.id.chk_lower);
//        CheckBox upcase = findViewById(R.id.chk_upcase);
//        CheckBox number = findViewById(R.id.chk_number);
//        CheckBox symbol = findViewById(R.id.chk_symbol);
//
//        TextView tvPassShow = findViewById(R.id.pass);
//        Button btnGenerator = findViewById(R.id.generator);
//        btnGenerator.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });


//        Random rn = new Random();
//        StringBuilder sb = new StringBuilder(max_length);
//
//        if(lower.isChecked()){
//            allowedChars +="abcdefghijklmnopqrstuvwxyz";
//            sb.append(lower.charAt(rn.nextInt(lower.length()-1)));
//        }
//        else if(upcase.isChecked()){
//            allowedChars +="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        }
//        else if(number.isChecked()){
//            allowedChars +="0123456789";
//        }
//        else if(symbol.isChecked()){
//            allowedChars +="!@#$%^&*()_-+=<>?/{}~|";
//        }
    }
//    private static String generateRandomPassword(int max_length, boolean upperCase, boolean lowerCase, boolean numbers, boolean specialCharacters)
//    {
//        String upperCaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String lowerCaseChars = "abcdefghijklmnopqrstuvwxyz";
//        String numberChars = "0123456789";
//        String specialChars = "!@#$%^&*()_-+=<>?/{}~|";
//        String allowedChars = "";
//
//        Random rn = new Random();
//        StringBuilder sb = new StringBuilder(max_length);
//
//        //this will fulfill the requirements of atleast one character of a type.
//        if(upperCase) {
//            allowedChars += upperCaseChars;
//            sb.append(upperCaseChars.charAt(rn.nextInt(upperCaseChars.length()-1)));
//        }
//
//        if(lowerCase) {
//            allowedChars += lowerCaseChars;
//            sb.append(lowerCaseChars.charAt(rn.nextInt(lowerCaseChars.length()-1)));
//        }
//
//        if(numbers) {
//            allowedChars += numberChars;
//            sb.append(numberChars.charAt(rn.nextInt(numberChars.length()-1)));
//        }
//
//        if(specialCharacters) {
//            allowedChars += specialChars;
//            sb.append(specialChars.charAt(rn.nextInt(specialChars.length()-1)));
//        }
//
//
//        //fill the allowed length from different chars now.
//        for(int i=sb.length();i < max_length;++i){
//            sb.append(allowedChars.charAt(rn.nextInt(allowedChars.length())));
//        }
//
//        return  sb.toString();
//    }
}