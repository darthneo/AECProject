package app.neo.aecproject;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.content.res.TypedArray;
import android.widget.AdapterView.OnItemClickListener;


public class MainActivity extends Activity {

	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        setContentView(R.layout.activity_main);

	        int[] array_res1 = getImageArray(R.array.my_suitimage_array
	                , R.drawable.ic_launcher);
	        
	        int[] array_res = getImageArray(R.array.my_image_array
	                , R.drawable.ic_launcher);
	        String[] array_string = getStringArray(R.array.my_string_array);
	        
	        ListView listView = (ListView)findViewById(R.id.listViewMain);
	        listView.setAdapter(new CustomListViewAdapter(getApplicationContext()
	                , android.R.id.text1, array_string, array_res));
	        listView.setOnItemClickListener(new OnItemClickListener() {

				@Override     // ไว้เพิ่มข้อมูล
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					  Intent intent;
		                switch(arg2) {
		                case 0 : 
		                    intent = new Intent(getApplicationContext()
		                            , ThailandActivity.class);
		                    startActivity(intent);
		                    break;
		                    
		                case 1 :
		                	intent = new Intent(getApplicationContext()
		                			, BruneiActivity.class);
		                	startActivity(intent);
		                	break;                    
		                	
		                	
		                case 2 :
		                	intent = new Intent(getApplicationContext()
		                			, CambodiaActivity.class);
		                	startActivity(intent);
		                	break;           
		                	
		                	
		                	
		                case 3 :
		                	intent = new Intent(getApplicationContext()
		                			, IndonesiaActivity.class);
		                	startActivity(intent);
		                	break;           
		                	
		                	
		                	
		                case 4 :
		                	intent = new Intent(getApplicationContext()
		                			, LaosActivity.class);
		                	startActivity(intent);
		                	break;           
		                	
		                	
		                	
		                case 5 :
		                	intent = new Intent(getApplicationContext()
		                			, MalaysiaActivity.class);
		                	startActivity(intent);
		                	break;           
		                	
		                	
		                case 6 :
		                	intent = new Intent(getApplicationContext()
		                			, MyanmarActivity.class);
		                	startActivity(intent);
		                	break;           
		                	
		                	
		                	
		                case 7 :
		                	intent = new Intent(getApplicationContext()
		                			, PhilipinesActivity.class);
		                	startActivity(intent);
		                	break;   
		                	
		                	
		                	
		                case 8 :
		                	intent = new Intent(getApplicationContext()
		                			, SingaporeActivity.class);
		                	startActivity(intent);
		                	break;   
		                	
		                	
		                case 9 :
		                	intent = new Intent(getApplicationContext()
		                			, VietnamActivity.class);
		                	startActivity(intent);
		                	break;   
					// TODO Auto-generated method stub
					
		                	
		                	// Case End
				}
				}
	        	
	        	
	        	
			}) ;
	        
	    }
	    
	    @Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
	    	AlertDialog.Builder dialog = new AlertDialog.Builder(this);
			dialog.setTitle("Exit");
			dialog.setIcon(R.drawable.ic_launcher);
			dialog.setCancelable(true);
			dialog.setMessage("Do you want to exit?");
			dialog.setPositiveButton("Yes", new OnClickListener() {
				public void onClick(DialogInterface dialog, int which) {
					finish();
				}
			});
			
			dialog.setNegativeButton("No", new OnClickListener() {
				public void onClick(DialogInterface dialog, int which) {
					dialog.cancel();
				}
			});
			
			dialog.show();			
	    	
		
	}

		public int[] getImageArray(int resId, int defResId) {
	        TypedArray my_image_array = getResources().obtainTypedArray(resId);
	        int[] array_res = new int[my_image_array.length()];
	        for(int i = 0 ; i < array_res.length ; i++) 
	            array_res[i] = my_image_array.getResourceId(i, defResId);
	        my_image_array.recycle();
	        return array_res;
	    }
	    
	    public String[] getStringArray(int resId) {
	        TypedArray my_string_array = getResources().obtainTypedArray(resId);
	        String[] array_string = new String[my_string_array.length()];
	        for(int i = 0 ; i < array_string.length ; i++) 
	            array_string[i] = my_string_array.getString(i);
	        my_string_array.recycle();
	        return array_string;
	    }
}
