package com.nrrillinthas.twentyfoursolver;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

//The input values as strings
	private String num1;
	private String num2;
	private String num3;
	private String num4;
	
	
//The input value converted to integers
	private int number1;
	private int number2;
	private int number3;
	private int number4;



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//declare button, this has to be done after setContentView
		Button button = (Button)findViewById(R.id.submit);
		button.setOnClickListener(this);

	}

    // This class is called once the button is pressed
    public void onClick(View v) {
    	
    	
    	//Get the input values as strings
    	EditText input1= (EditText) findViewById(R.id.editText1);
    	num1=input1.getText().toString();
    	EditText input2= (EditText) findViewById(R.id.editText2);
    	num2=input2.getText().toString();
    	EditText input3= (EditText) findViewById(R.id.editText3);
    	num3=input3.getText().toString();
    	EditText input4= (EditText) findViewById(R.id.editText4);
    	num4=input4.getText().toString();
    	
    	//declare textView where the answer will go
        TextView text = (TextView) findViewById(R.id.textView2);
        
        
        //make input values integers
        number1 = Integer.parseInt(num1);
        number2 = Integer.parseInt(num2);
        number3 = Integer.parseInt(num3);
        number4 = Integer.parseInt(num4);

        //set textView as the answer (this does not work)
    	text.setText(solver.solve(number1,number2,number3,number4));
    	
    	/**
    	 * When I say this
    	 * 
    	 * text.setText(solver.solve(3,5,7,3));
    	 * 
    	 * instead it works fine with those integers, so the problem must be the number
    	 * integers but I'm not sure where it is.  Did I do parseInt wrong or something?
    	 * 
    	 */
    }
}