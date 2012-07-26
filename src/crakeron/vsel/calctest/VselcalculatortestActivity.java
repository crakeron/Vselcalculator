package crakeron.vsel.calctest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class VselcalculatortestActivity extends Activity {
	private EditText freqbox1;
	private EditText freqbox2;
	private EditText freqbox3;
	private EditText freqbox4;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        
        freqbox1 = (EditText) findViewById(R.id.freq1);
        freqbox2 = (EditText) findViewById(R.id.freq2);
        freqbox3 = (EditText) findViewById(R.id.freq3);
        freqbox4 = (EditText) findViewById(R.id.freq4);
    }
          
        
     
     
     /*String num_freq = spinner.getSelectedItem().toString();*/
     
    
    public int freq1;
    public int freq2;
    public int freq3;
    public int freq4;
    public int volt1;
    public int volt2;
    public int volt3;
    public int volt4;
    public boolean freq4ornot=false;
    
  
    
    
    
    public void button_pressed(View button) { 
    	//What to do when calculate button is pressed:
    	// 1. Grab values in textboxes freq1,2,3 (and 4, depending on Spinner value?) and store their values
    	grab_values(freq4ornot);
    	// 2. Call calculate function with 3 (or 4) arguments
    	calculate(freq1, freq2, freq3, freq4, freq4ornot);
    	// 3. call function to display each result in correct box
    	
    	//test stuff to check if grab_values works...OK! :D
    	String message= String.valueOf(freq1);
    	Toast toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT);       
    	toast.show();
    	//test if calculate (and formula) works....Ok!:D
    	String message2= String.valueOf(volt1);
    	Toast toast2 = Toast.makeText(getApplicationContext(), message2, Toast.LENGTH_SHORT);       
    	toast2.show();
    	
    	
    }
    
    public void grab_values(boolean freq4ornot){
    	
    	String freq1Value = freqbox1.getText().toString();//fetch what's in edittextbox and store it in a string
    	if(freq1Value!=""){
      	freq1 = Integer.parseInt(freq1Value);//transform the string into an int and store it in our variable
    	}
    	if(freq1Value=="") freq1=0;
    	
    	String freq2Value = freqbox2.getText().toString();
    	freq2 = Integer.parseInt(freq2Value);
    	String freq3Value = freqbox3.getText().toString();
    	freq3 = Integer.parseInt(freq3Value);
    	if (freq4ornot=true){
    		String freq4Value = freqbox4.getText().toString();
    		freq4 = Integer.parseInt(freq4Value);
    	}
    }

    public void calculate(int freq1,int freq2, int freq3, int freq4, boolean freq4ornot){
    	volt1 = formula(freq1);
    	volt2 = formula(freq2);
    	volt3 = formula(freq3);
        if (freq4ornot){
        	volt4 = formula(freq4);
           }
    }
    
    
    public int formula(int freq){
    	int volt = ((freq/20)+2);
    	return volt;
    }
}

   
    
    
  


    
 





