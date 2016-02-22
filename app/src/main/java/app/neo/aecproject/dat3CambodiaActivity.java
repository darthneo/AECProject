package app.neo.aecproject;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.database.Cursor;
import android.database.Cursor;                                                                     
import android.database.sqlite.SQLiteDatabase;

public class dat3CambodiaActivity extends Activity {

	MediaPlayer mpEffect;
	SQLiteDatabase mDb;
	Database mHelper;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.datcambodia3_layout);
		
		
		 
		
		
		mHelper = new Database(this);
		mDb = mHelper.getWritableDatabase();

		/********************************************************************/
		/************** �����ǹ��������֡�ҡ�� Query �ͧ Cursor ******************/
		/********************************************************************/
		
		
		Cursor mCursor = mDb.rawQuery("SELECT * FROM " + Database.Cambodia 
		        + " WHERE " + Database.COL_TYPE + "='Cambodia3'" 
				+ " ORDER BY " + Database.COL_ID + " ASC", null);
		
		
/*		Cursor mCursor2 = mDb.rawQuery("SELECT * FROM " + Database.TABLE_NAME 
		        + " WHERE " + Database.COL_TYPE + "='aa'" 
				+ " ORDER BY " + Database.COL_COUNTRY + " ASC", null); */
		
		
	
			

		/********************************************************************/
		/********************************************************************/
		
		
		ArrayList<String> dirArray = new ArrayList<String>();
    	
    	mCursor.moveToFirst();
    	//mCursor2.moveToNext();
    	

		/********************************************************************/
    	/***** �óշ������ rawQuery ���ź��÷Ѵ�����������͡�֧�����Ũҡ�����������͡ ******/
		/********************************************************************/
    	
    	
		while ( !mCursor.isAfterLast() ){
			dirArray.add("\n" 
					
					+ "Word : " + mCursor.getString(mCursor.getColumnIndex(Database.COL_COUNTRY)) + "\n" 
	
					+ "Meaning : " + mCursor.getString(mCursor.getColumnIndex(Database.COL_MEAN)) + "\n"
					);
			mCursor.moveToNext();	
    	}

		
		/* while ( !mCursor2.isAfterLast() ){
			dirArray.add("\n" 
					+ "ID : " + mCursor2.getString(mCursor2.getColumnIndex(Database.COL_ID)) + "\n" 
					+ "Word : " + mCursor2.getString(mCursor2.getColumnIndex(Database.COL_COUNTRY)) + "\n" 
	
					+ "Mean : " + mCursor2.getString(mCursor2.getColumnIndex(Database.COL_STORE)) + "\n"
					);
			mCursor2.moveToNext();	
    	} */
		
		/********************************************************************/
    	/*********************************************************************/
		
		
		ListView listView1 = (ListView)findViewById(R.id.listView1);
		listView1.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, dirArray));
        
		
		
		
		
		
		
		//Media
		Button buttonSound1 = (Button)findViewById(R.id.btnJanuary);
		buttonSound1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				playSound(dat3CambodiaActivity.this, R.raw.januarykh);
			}
		});
		
		
		Button buttonSound2 = (Button)findViewById(R.id.btnFebruary);
		buttonSound2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				playSound(dat3CambodiaActivity.this, R.raw.februarykh);
			}
		});
				
		
		Button buttonSound3 = (Button)findViewById(R.id.btnMarch);
		buttonSound3.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				playSound(dat3CambodiaActivity.this, R.raw.marchkh);
			}
		});
				
		Button buttonSound4 = (Button)findViewById(R.id.btnApril);
		buttonSound4.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				playSound(dat3CambodiaActivity.this, R.raw.aprilkh);
			}
		});
				
		
		Button buttonSound5 = (Button)findViewById(R.id.btnMay);
		buttonSound5.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				playSound(dat3CambodiaActivity.this, R.raw.maykh);
			}
		});

		
		Button buttonSound6 = (Button)findViewById(R.id.btnJune);
		buttonSound6.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				playSound(dat3CambodiaActivity.this, R.raw.junekh);
			}
		});

		
		Button buttonSound7 = (Button)findViewById(R.id.btnJuly);
		buttonSound7.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				playSound(dat3CambodiaActivity.this, R.raw.julykh);
			}
		});
		
		Button buttonSound8 = (Button)findViewById(R.id.btnAugust);
		buttonSound8.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				playSound(dat3CambodiaActivity.this, R.raw.augustkh);
			}
		});
		
		Button buttonSound9 = (Button)findViewById(R.id.btnSeptember);
		buttonSound9.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				playSound(dat3CambodiaActivity.this, R.raw.septemberkh);
			}
		});
		
		Button buttonSound10 = (Button)findViewById(R.id.btnOctober);
		buttonSound10.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				playSound(dat3CambodiaActivity.this, R.raw.octoberkh);
			}
		});
		
		Button buttonSound11 = (Button)findViewById(R.id.btnNovember);
		buttonSound11.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				playSound(dat3CambodiaActivity.this, R.raw.novemberkh);
			}
		});
		
		Button buttonSound12 = (Button)findViewById(R.id.btnDecember);
		buttonSound12.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				playSound(dat3CambodiaActivity.this, R.raw.decemberkh);
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