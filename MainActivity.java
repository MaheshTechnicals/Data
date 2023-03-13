package com.mycompany.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity
{ 

	private EditText num1;
	private EditText num2; 
	private Button btn;
	private TextView ans;




    @Override
    protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		num1 = findViewById(R.id.f1);
		num2 = findViewById(R.id.f2);
		btn = findViewById(R.id.btn);
		ans = findViewById(R.id.ans);

		Toast.makeText(getApplicationContext(), "Enter value first", Toast.LENGTH_SHORT).show();

		btn.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View V)
				{



					double m1 =Double.parseDouble(num1.getText().toString()); 
					double m2 =Double.parseDouble(num2.getText().toString());

					//double m3 =(m1 / m2) * 100;
					//ans.setText(String.valueOf(m3 + "%"));

					if (num1.getText() == null || num2.getText() == null)
					{
						// Show a Toast message if the text is empty

						Toast.makeText(getApplicationContext(), "Enter value first", Toast.LENGTH_SHORT).show();

					}
					else
					{
						// Do something else if the text is not empty
						// ...
						double m3 =(m1 / m2) * 100;
						ans.setText(String.valueOf(m3 + "%"));
					}

					


					return ;
				}

				private void Activity()
				{
					return ;
				}

			});


		return;
	}

} 
