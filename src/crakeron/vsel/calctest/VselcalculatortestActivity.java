package crakeron.vsel.calctest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class VselcalculatortestActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
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
    	// 1. Grab values in freq1,2,3 (and 4, depending on Spinner value?)
    	// 2. Call calculate function with 3 (or 4) arguments
    	// 3. call function to display each result in correct box
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

   
    
    
  


    
 





