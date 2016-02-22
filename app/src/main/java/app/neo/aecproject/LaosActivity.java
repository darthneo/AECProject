package app.neo.aecproject;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.view.View.OnClickListener;


public class LaosActivity extends Activity {
	
	private Button btnGreet;
	private Button btnDay;
	private Button btnMonth;
	private Button btnNumber;
	private Button btnGoodbye;
	
	
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.laos_layout);
        
        
        
        btnGreet = (Button)findViewById(R.id.Greet);
        btnDay = (Button)findViewById(R.id.Days);
        btnMonth = (Button)findViewById(R.id.Month);
        btnNumber = (Button)findViewById(R.id.Number);
        btnGoodbye = (Button)findViewById(R.id.Goodbye);
     /*   btnDay = (Button) findViewById(R.id.Days);
        btnMonth = (Button)findViewById(R.id.Mouth);
        btnNumber = (Button)findViewById(R.id.Number);
        btnGoodbye = (Button)findViewById(R.id.Goodbye); */
        
        
        
       btnGreet.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent goGreet = new Intent(getApplicationContext(),dat1LaosActivity.class);
			startActivity(goGreet);
			
		}
	});
       
       
       
       
       
       btnDay.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent goDays = new Intent(getApplicationContext(),dat2LaosActivity.class);
			startActivity(goDays);
		}
	});
        
       
       
       
       btnMonth.setOnClickListener(new OnClickListener() {
      		
      		@Override
      		public void onClick(View v) {
      			// TODO Auto-generated method stub
      			Intent goMonth = new Intent(getApplicationContext(),dat3LaosActivity.class);
      			startActivity(goMonth);
      		}
      	});
       
       
       
       btnNumber.setOnClickListener(new OnClickListener() {
     		
     		@Override
     		public void onClick(View v) {
     			// TODO Auto-generated method stub
     			Intent goNumber = new Intent(getApplicationContext(),dat4LaosActivity.class);
     			startActivity(goNumber);
     		}
     	});
       
      
       btnGoodbye.setOnClickListener(new OnClickListener() {
    		
    		@Override
    		public void onClick(View v) {
    			// TODO Auto-generated method stub
    			Intent goGoodbye = new Intent(getApplicationContext(),dat5LaosActivity.class);
    			startActivity(goGoodbye);
    		}
    	});
    
        
    }
    
    
    

   
}