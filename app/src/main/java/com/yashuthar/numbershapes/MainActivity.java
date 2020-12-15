package com.yashuthar.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    class Number
    {
        int number;
        public boolean isTriangular()
        {
            int x = 1;
            int triangularNumber = 1;
            while(triangularNumber < number){
                x++;
                triangularNumber = triangularNumber + x;
            }
            if(triangularNumber == number){
                return true;
            }
            else{
                return false;
            }

        }
        public boolean isSquare()
        {
            double squareroot = Math.sqrt(number);
            if(squareroot == Math.floor(squareroot))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }




    public void testNumber(View view)
    {
        String message = "";
        EditText userName = (EditText) findViewById(R.id.userNumber);
        if(userName.getText().toString().isEmpty())
        {
            message = "Please enter number";
        }
        else
        {
            Number myNumber = new Number();
            myNumber.number = Integer.parseInt(userName.getText().toString());

            if (myNumber.isTriangular()) {
                if (myNumber.isSquare()) {
                    message = myNumber.number + " is both Triangular and Square!";
                } else {
                    message = myNumber.number + " is Triangular, but not Square.";
                }
            } else {
                if (myNumber.isSquare()) {
                    message = myNumber.number + " is Square, but not Triangular";
                } else {
                    message = myNumber.number + " Neither Triangular nor Square.";
                }
            }
        }
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}