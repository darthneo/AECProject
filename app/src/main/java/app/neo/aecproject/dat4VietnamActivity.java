package app.neo.aecproject;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class dat4VietnamActivity extends Activity {
	
	MediaPlayer mpEffect;
	SQLiteDatabase mDb;
	Database mHelper;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.datvietnam4_layout);
		
		
		 
		
		
		mHelper = new Database(this);
		mDb = mHelper.getWritableDatabase();

		/********************************************************************/
		/************** แก้ในส่วนนี้เพื่อศึกษาการ Query ของ Cursor ******************/
		/********************************************************************/
		
		
		Cursor mCursor = mDb.rawQuery("SELECT * FROM " + Database.Vietnam 
		        + " WHERE " + Database.COL_TYPE + "='Vietnam4'" 
				+ " ORDER BY " + Database.COL_ID + " ASC", null);
		
		

		
		
	
			

		/********************************************************************/
		/********************************************************************/
		
		
		ArrayList<String> dirArray = new ArrayList<String>();
    	
    	mCursor.moveToFirst();
    	
    	

		/********************************************************************/
    	/***** กรณีที่แก้ไขใน rawQuery ให้ลบบรรทัดที่ไม่ได้เลือกดึงข้อมูลจากคอลัมน์นั้นๆออก ******/
		/********************************************************************/
    	
    	
		while ( !mCursor.isAfterLast() ){
			dirArray.add("\n" 
					
					+ "Word : " + mCursor.getString(mCursor.getColumnIndex(Database.COL_COUNTRY)) + "\n" 
	
					+ "Meaning : " + mCursor.getString(mCursor.getColumnIndex(Database.COL_MEAN)) + "\n"
					);
			mCursor.moveToNext();	
    	}

	
		
		/********************************************************************/
    	/*********************************************************************/
		
		
		ListView listView1 = (ListView)findViewById(R.id.listView1);
		listView1.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, dirArray));
        
		
		
		
		
		
		
		//Media
		Button buttonSound1 = (Button)findViewById(R.id.btnOne);
		buttonSound1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				playSound(dat4VietnamActivity.this, R.raw.onevn);
			}
		});
		
		
		Button buttonSound2 = (Button)findViewById(R.id.btnTwo);
		buttonSound2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				playSound(dat4VietnamActivity.this, R.raw.twovn);
			}
		});
				
		
		Button buttonSound3 = (Button)findViewById(R.id.btnThree);
		buttonSound3.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				playSound(dat4VietnamActivity.this, R.raw.threevn);
			}
		});
				
		Button buttonSound4 = (Button)findViewById(R.id.btnFour);
		buttonSound4.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				playSound(dat4VietnamActivity.this, R.raw.fourvn);
			}
		});
				
		
		Button buttonSound5 = (Button)findViewById(R.id.btnFive);
		buttonSound5.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				playSound(dat4VietnamActivity.this, R.raw.fivevn);
			}
		});

		
		Button buttonSound6 = (Button)findViewById(R.id.btnSix);
		buttonSound6.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				playSound(dat4VietnamActivity.this, R.raw.sixvn);
			}
		});

		
		Button buttonSound7 = (Button)findViewById(R.id.btnSeven);
		buttonSound7.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				playSound(dat4VietnamActivity.this, R.raw.sevenvn);
			}
		});
		
		Button buttonSound8 = (Button)findViewById(R.id.btnEight);
		buttonSound8.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				playSound(dat4VietnamActivity.this, R.raw.eightvn);
			}
		});
		
		Button buttonSound9 = (Button)findViewById(R.id.btnNine);
		buttonSound9.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				playSound(dat4VietnamActivity.this, R.raw.ninevn);
			}
		});
		
		Button buttonSound10 = (Button)findViewById(R.id.btnTen);
		buttonSound10.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				playSound(dat4VietnamActivity.this, R.raw.tenvn);
			}
		});
		
		
		
	}
	
	
	
	
	
	
	
	public void onPause() {
		super.onPause();
		mHelper.close();
		mDb.close();
	}
	
	public void onStop() {
		super.onStop();
		stopIfPlating();
	}
	
	public void playSound(Context context, int resId) {
		stopIfPlating();
		mpEffect = MediaPlayer.create(context, resId);
		mpEffect.start();
		mpEffect.setOnCompletionListener(new OnCompletionListener() {
			public void onCompletion(MediaPlayer mp) {
				mp.release();
			}
		});
	}
	
	public void stopIfPlating() {
		try {
			if(mpEffect != null && mpEffect.isPlaying()) {
				mpEffect.stop();
				mpEffect.release();
			}
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
	}

}