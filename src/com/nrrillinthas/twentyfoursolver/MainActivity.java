package com.nrrillinthas.twentyfoursolver;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity{
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

	//String to store the answer
	private String answer;

	//declare text view and text box variables
	EditText input1;
	EditText input2;
	EditText input3;
	EditText input4;
	TextView text;




	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//assign textview and edittext to things in xml sheet.
		input1= (EditText) findViewById(R.id.editText1);
		input2= (EditText) findViewById(R.id.editText2);
		input3= (EditText) findViewById(R.id.editText3);
		input4= (EditText) findViewById(R.id.editText4);
		text=(TextView) findViewById(R.id.textView2);

		//declare button, this has to be done after setContentView
		Button button = (Button)findViewById(R.id.submit);
		button.setOnClickListener(new OnClickListener() { 

			public void onClick(View v) {

				//Get the input values as strings
				num1=input1.getText().toString();
				num2=input2.getText().toString();
				num3=input3.getText().toString();
				num4=input4.getText().toString();

				//check to see if there are input values.
				if (num1.isEmpty()|num2.isEmpty()|num3.isEmpty()|num4.isEmpty()){
					answer="Please input numbers";
				}
				
				//find solutions if there are inputs
				else{

				//make input values integers
				number1 = Integer.parseInt(num1);
				number2 = Integer.parseInt(num2);
				number3 = Integer.parseInt(num3);
				number4 = Integer.parseInt(num4);


				answer=solver.solve(number1, number2, number3, number4);
				}
				//set textView as the answer
				text.setText(answer);

			}
		});


	}


}