package app.neo.aecproject;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class CopyOfDatabase extends SQLiteOpenHelper {
	private static final String DB_NAME = "AECwords";
    private static final int DB_VERSION = 1;
    
    public static final String TABLE_NAME = "ttt";
   
  

    public static final String COL_ID = "_id";
    public static final String COL_COUNTRY = "name";  // name
    public static final String COL_TYPE = "type";     // type
    public static final String COL_AMOUNT = "amount";   //amount
    public static final String COL_MEAN = "mean";   //store
    
    public CopyOfDatabase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
}
    
    public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE "+ TABLE_NAME 
					+" (_id INTEGER PRIMARY KEY AUTOINCREMENT, " 
        			+ COL_COUNTRY + " TEXT, " + COL_TYPE + " TEXT, " 
        			+ COL_AMOUNT + " TEXT, " + COL_MEAN + " TEXT);");

		
		//Greet TH
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
					+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
					+ ") VALUES ('Sawatdi', 'Thailand1', 1, 'Hello');");  
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN
				+ ") VALUES ('Sabai di mai', 'Thailand1', 2, 'How are you?');");  
		
		
		  
		 
		//Days TH
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Wan Chan', 'Thailand2', 1, 'Monday');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Wan Angkhan', 'Thailand2', 2, 'Tuesday');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Wan Phut', 'Thailand2', 3, 'Wednesday');"); 
	
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Wan Pharuehatsabodi', 'Thailand2', 4, 'Thursday');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Wan Sook', 'Thailand2', 5, 'Friday');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Wan Sao', 'Thailand2', 6, 'Saturday');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Wan Ar Thit', 'Thailand2', 7, 'Sunday');"); 
		
		
		//Month TH
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Mokkarakhom', 'Thailand3', 1, 'January');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Kumphaphan', 'Thailand3', 2, 'February');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Meenakhom', 'Thailand3', 3, 'March');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Mesayon', 'Thailand3', 4, 'April');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Phruetsaphakhom', 'Thailand3', 5, 'May');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Mithunayon', 'Thailand3', 6, 'June');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Karakadakhom', 'Thailand3', 7, 'July');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Singhakhom', 'Thailand3', 8, 'August');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Kanyayon', 'Thailand3', 9, 'September');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Tulakhom', 'Thailand3', 10, 'October');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Phruetsachikayon', 'Thailand3', 11, 'November');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Thanwakhom', 'Thailand3', 12, 'December');"); 
		
		
		
		//Number TH
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Nueng', 'Thailand4', 1, 'One');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Song', 'Thailand4', 2, 'Two');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Sam', 'Thailand4', 3, 'Three');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Si', 'Thailand4', 4, 'Four');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Ha', 'Thailand4', 5, 'Five');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Hok', 'Thailand4', 6, 'Six');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Jet', 'Thailand4', 7, 'Seven');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Paet', 'Thailand4', 8, 'Eight');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Kao', 'Thailand4', 9, 'Nine');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Sip', 'Thailand4', 10, 'Ten');"); 
		
		
		
		//Saying Goodbye TH
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('La kon', 'Thailand5', 1, 'Goodbye');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Laeo Phop Kan Mai', 'Thailand5', 2, 'See you later');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Ratri Sawat', 'Thailand5', 3, 'Good Night');"); 
		
		
		
		//Greet ID
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Selamat Pagi', 'Indonesia1', 1, 'Good Morning');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Selamat Sore', 'Indonesia1', 1, 'Good Afternoon');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Selamat Malam', 'Indonesia1', 1, 'Good Evening');"); 
		
		
		
		
		//Days ID
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Hari Senin', 'Indonesia2', 1, 'Monday');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Hari Selasa', 'Indonesia2', 2, 'Tuesday');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Hari Rabu', 'Indonesia2', 3, 'Wednesday');"); 
	
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Hari Kamis', 'Indonesia2', 4, 'Thursday');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Hari Jumat', 'Indonesia2', 5, 'Friday');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Hari Sabtu', 'Indonesia2', 6, 'Saturday');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Hari Minggu', 'Indonesia2', 7, 'Sunday');"); 
		
		
		
		
		//Month ID
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Januari', 'Indonesia3', 1, 'January');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Februari', 'Indonesia3', 2, 'February');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Maret', 'Indonesia3', 3, 'March');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('April', 'Indonesia3', 4, 'April');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Mei', 'Indonesia3', 5, 'May');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Juni', 'Indonesia3', 6, 'June');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Juli', 'Indonesia3', 7, 'July');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Agustus', 'Indonesia3', 8, 'August');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('September', 'Indonesia3', 9, 'September');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Oktober', 'Indonesia3', 10, 'October');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('November', 'Indonesia3', 11, 'November');"); 
		
		db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
				+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
				+ ") VALUES ('Desember', 'Indonesia3', 12, 'December');"); 
		
		
		
		
		//Number ID
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Satu', 'Indonesia4', 1, 'One');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Dua', 'Indonesia4', 2, 'Two');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Tiga', 'Indonesia4', 3, 'Three');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Empat', 'Indonesia4', 4, 'Four');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Lima', 'Indonesia4', 5, 'Five');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Enam', 'Indonesia4', 6, 'Six');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Tujuh', 'Indonesia4', 7, 'Seven');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Delapan', 'Indonesia4', 8, 'Eight');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Sembilan', 'Indonesia4', 9, 'Nine');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Sepuluh', 'Indonesia4', 10, 'Ten');"); 
				
				
				
				
				//Saying Goodbye ID
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Selamat Jalan', 'Indonesia5', 1, 'Goodbye');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Sampai Jumpa Lagi', 'Indonesia5', 2, 'See you later');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Selamat Malam', 'Indonesia5', 3, 'Good Night');"); 	
				
				
				
				
				//Greet BN
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Selamat Pagi', 'Brunei1', 1, 'Good Morning');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Selamat Tengahari', 'Brunei1', 1, 'Good Afternoon');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Selamat Petang', 'Brunei1', 1, 'Good Evening');");  
				
				
				
				
				//Days BN
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Hari Isnin', 'Brunei2', 1, 'Monday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Hari Selasa', 'Brunei2', 2, 'Tuesday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Hari Rabu', 'Brunei2', 3, 'Wednesday');"); 
			
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Hari Khamis', 'Brunei2', 4, 'Thursday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Hari Jumaat', 'Brunei2', 5, 'Friday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Hari Sabtu', 'Brunei2', 6, 'Saturday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Hari Ahad', 'Brunei2', 7, 'Sunday');"); 
			
				
				
				
				
				//Month BN
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Januari', 'Brunei3', 1, 'January');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Februari', 'Brunei3', 2, 'February');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Mac', 'Brunei3', 3, 'March');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('April', 'Brunei3', 4, 'April');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Mei', 'Brunei3', 5, 'May');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Jun', 'Brunei3', 6, 'June');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Julai', 'Brunei3', 7, 'July');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Ogos', 'Brunei3', 8, 'August');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('September', 'Brunei3', 9, 'September');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Oktober', 'Brunei3', 10, 'October');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('November', 'Brunei3', 11, 'November');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Disember', 'Brunei3', 12, 'December');"); 
				
				
				
				
				
				//Number BN
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Satu', 'Brunei4', 1, 'One');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Dua', 'Brunei4', 2, 'Two');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Tiga', 'Brunei4', 3, 'Three');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Empat', 'Brunei4', 4, 'Four');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Lima', 'Brunei4', 5, 'Five');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Enam', 'Brunei4', 6, 'Six');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Tujuh', 'Brunei4', 7, 'Seven');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Lapan', 'Brunei4', 8, 'Eight');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Sembilan', 'Brunei4', 9, 'Nine');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Sepuluh', 'Brunei4', 10, 'Ten');"); 
				
				
				
				
				//Saying Goodbye BN
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Selamat Tinggal', 'Brunei5', 1, 'Goodbye');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Jumpa Lagi', 'Brunei5', 2, 'See you later');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Selamat Malam', 'Brunei5', 3, 'Good Night');");
				
				
				
				
				
				
				
				//Greet MY
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Selamat Pagi', 'Malaysia1', 1, 'Good Morning');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Selamat Tengahari', 'Malaysia1', 1, 'Good Afternoon');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Selamat Petang', 'Malaysia1', 1, 'Good Evening');");  
				
				
				
				
				//Days MY
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Hari Isnin', 'Malaysia2', 1, 'Monday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Hari Selasa', 'Malaysia2', 2, 'Tuesday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Hari Rabu', 'Malaysia2', 3, 'Wednesday');"); 
			
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Hari Khamis', 'Malaysia2', 4, 'Thursday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Hari Jumaat', 'Malaysia2', 5, 'Friday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Hari Sabtu', 'Malaysia2', 6, 'Saturday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Hari Ahad', 'Malaysia2', 7, 'Sunday');"); 
			
				
				
				
				
				//Month MY
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Januari', 'Malaysia3', 1, 'January');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Februari', 'Malaysia3', 2, 'February');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Mac', 'Malaysia3', 3, 'March');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('April', 'Malaysia3', 4, 'April');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Mei', 'Malaysia3', 5, 'May');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Jun', 'Malaysia3', 6, 'June');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Julai', 'Malaysia3', 7, 'July');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Ogos', 'Malaysia3', 8, 'August');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('September', 'Malaysia3', 9, 'September');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Oktober', 'Malaysia3', 10, 'October');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('November', 'Malaysia3', 11, 'November');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Disember', 'Malaysia3', 12, 'December');"); 
				
				
				
				
				
				//Number MY
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Satu', 'Malaysia4', 1, 'One');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Dua', 'Malaysia4', 2, 'Two');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Tiga', 'Malaysia4', 3, 'Three');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Empat', 'Malaysia4', 4, 'Four');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Lima', 'Malaysia4', 5, 'Five');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Enam', 'Malaysia4', 6, 'Six');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Tujuh', 'Malaysia4', 7, 'Seven');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Lapan', 'Malaysia4', 8, 'Eight');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Sembilan', 'Malaysia4', 9, 'Nine');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Sepuluh', 'Malaysia4', 10, 'Ten');"); 
				
				
				
				
				//Saying Goodbye MY
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Selamat Tinggal', 'Malaysia5', 1, 'Goodbye');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Jumpa Lagi', 'Malaysia5', 2, 'See you later');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Selamat Malam', 'Malaysia5', 3, 'Good Night');");
				
				
				
				
				
				//Greet LA
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
							+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
							+ ") VALUES ('Sa Bai Dee Chao', 'Laos1', 1, 'Hello');");  
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN
						+ ") VALUES ('Sabai Dee Bor', 'Laos1', 2, 'How are you?');");  
				
				
				
				
				
				//Days LA
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Mue Wan Chan', 'Laos2', 1, 'Monday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Mue Wan Angkhan', 'Laos2', 2, 'Tuesday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Mue Wan Phut', 'Laos2', 3, 'Wednesday');"); 
			
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Mue Wan Pharuehat', 'Laos2', 4, 'Thursday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Mue Wan Sook', 'Laos2', 5, 'Friday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Mue Wan Sao', 'Laos2', 6, 'Saturday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Mue Wan Ar Thit', 'Laos2', 7, 'Sunday');"); 
				
				
				
				
				
				//Month LA
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Mang Kon', 'Laos3', 1, 'January');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Kumpha', 'Laos3', 2, 'February');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Meena', 'Laos3', 3, 'March');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Mesa', 'Laos3', 4, 'April');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Phruetsapha', 'Laos3', 5, 'May');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Mithuna', 'Laos3', 6, 'June');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Kor La Kot', 'Laos3', 7, 'July');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Singha', 'Laos3', 8, 'August');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Kanya', 'Laos3', 9, 'September');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Tula', 'Laos3', 10, 'October');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Phuet Sa Chik', 'Laos3', 11, 'November');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Thanwa', 'Laos3', 12, 'December');"); 
				
				
				
				
				
				//Number LA
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Nueng', 'Laos4', 1, 'One');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Song', 'Laos4', 2, 'Two');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Sam', 'Laos4', 3, 'Three');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Si', 'Laos4', 4, 'Four');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Ha', 'Laos4', 5, 'Five');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Hok', 'Laos4', 6, 'Six');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Jet', 'Laos4', 7, 'Seven');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Paet', 'Laos4', 8, 'Eight');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Kao', 'Laos4', 9, 'Nine');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Sip', 'Laos4', 10, 'Ten');"); 
				
				
				
				
				
				//Saying Goodbye LA
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('La kon', 'Laos5', 1, 'Goodbye');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Phop Kan Mai', 'Laos5', 2, 'See you later');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Non Lap Fun Di', 'Laos5', 3, 'Good Night');"); 
				
				
				
				
				
				
				//Greet PH
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Kumusta', 'Philipines1', 1, 'Hello');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Magandang Umaga', 'Philipines1', 2, 'Good Morning');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Magandang Hapon', 'Philipines1', 3, 'Good Afternoon');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Magandang Gabi', 'Philipines1', 4, 'Good Evening');");  
				
				
				
				
				//Days PH
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Lunes', 'Philipines2', 1, 'Monday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Martes', 'Philipines2', 2, 'Tuesday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Miyerkules', 'Philipines2', 3, 'Wednesday');"); 
			
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Huwebes', 'Philipines2', 4, 'Thursday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Biyernes', 'Philipines2', 5, 'Friday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Sabado', 'Philipines2', 6, 'Saturday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Linggo', 'Philipines2', 7, 'Sunday');"); 
			
				
				
				
				
				//Month PH
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Enero', 'Philipines3', 1, 'January');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Pebrero', 'Philipines3', 2, 'February');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Marso', 'Philipines3', 3, 'March');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Abril', 'Philipines3', 4, 'April');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Mayo', 'Philipines3', 5, 'May');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Hunyo', 'Philipines3', 6, 'June');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Hulyo', 'Philipines3', 7, 'July');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Agosto', 'Philipines3', 8, 'August');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Setyembre', 'Philipines3', 9, 'September');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Oktubre', 'Philipines3', 10, 'October');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Nobyembre', 'Philipines3', 11, 'November');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Disyembre', 'Philipines3', 12, 'December');"); 
				
				
				
				
				
				//Number PH
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Isa', 'Philipines4', 1, 'One');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Dalawa', 'Philipines4', 2, 'Two');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Tatlo', 'Philipines4', 3, 'Three');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Apat', 'Philipines4', 4, 'Four');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Lima', 'Philipines4', 5, 'Five');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Anim', 'Philipines4', 6, 'Six');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Pito', 'Philipines4', 7, 'Seven');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Walo', 'Philipines4', 8, 'Eight');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Siyam', 'Philipines4', 9, 'Nine');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Sampu', 'Philipines4', 10, 'Ten');"); 
				
				
				
				
				//Saying Goodbye PH
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Paalam', 'Philipines5', 1, 'Goodbye');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Magkita Tayo Mamaya', 'Philipines5', 2, 'See you later');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Magandang Gabi', 'Philipines5', 3, 'Good Night');");
			
				
				
				//Greet SG
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Ni Hao', 'Singapore1', 1, 'Hello');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Nihao Ma ', 'Singapore1', 2, 'How are you?');"); 
				
				
				
				
				//Days SG
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Xing Qi Yi ', 'Singapore2', 1, 'Monday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Xing Qi Er', 'Singapore2', 2, 'Tuesday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Xing Qi San ', 'Singapore2', 3, 'Wednesday');"); 
			
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Xing Qi Si', 'Singapore2', 4, 'Thursday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Xing Qi Wu ', 'Singapore2', 5, 'Friday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Xing Qi Lii', 'Singapore2', 6, 'Saturday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Xing Qi Tian', 'Singapore2', 7, 'Sunday');"); 
				
				
				
				
				//Month SG
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Yi Yue', 'Singapore3', 1, 'January');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Er Yue', 'Singapore3', 2, 'February');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('San Yue', 'Singapore3', 3, 'March');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Si Yue', 'Singapore3', 4, 'April');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Wu Yue', 'Singapore3', 5, 'May');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Liu Yue', 'Singapore3', 6, 'June');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Qi Yue', 'Singapore3', 7, 'July');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Ba Yue', 'Singapore3', 8, 'August');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Jiu Yue', 'Singapore3', 9, 'September');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Shi Yue', 'Singapore3', 10, 'October');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Shi Yi Yue', 'Singapore3', 11, 'November');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Shi Er Yue', 'Singapore3', 12, 'December');"); 
				 
				
				
				//Number SG
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Yi', 'Singapore4', 1, 'One');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Er', 'Singapore4', 2, 'Two');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('San', 'Singapore4', 3, 'Three');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Si', 'Singapore4', 4, 'Four');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Wu', 'Singapore4', 5, 'Five');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Liu', 'Singapore4', 6, 'Six');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Qi', 'Singapore4', 7, 'Seven');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Ba', 'Singapore4', 8, 'Eight');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Jiu', 'Singapore4', 9, 'Nine');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Shi', 'Singapore4', 10, 'Ten');"); 
				
				
				
				
				//Saying Goodbye SG
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Zai Jian', 'Singapore5', 1, 'Goodbye');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Yi Huir Jian', 'Singapore5', 2, 'See you later');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Wan An', 'Singapore5', 3, 'Good Night');");
				
				
				
				
				//Greet VN
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Chao Anh', 'Vietnam1', 1, 'Hello');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Chi Khoe Khong', 'Vietnam1', 2, 'How are you?');"); 
				
				
				
				
				//Days VN
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Thu Hai', 'Vietnam2', 1, 'Monday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Thu Ba', 'Vietnam2', 2, 'Tuesday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Thu Tu', 'Vietnam2', 3, 'Wednesday');"); 
			
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Thu Nam', 'Vietnam2', 4, 'Thursday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Thu Sau', 'Vietnam2', 5, 'Friday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Thu Bay', 'Vietnam2', 6, 'Saturday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Chu Nhat', 'Vietnam2', 7, 'Sunday');"); 
				
				
				
				
				//Month VN
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Thang Mot', 'Vietnam3', 1, 'January');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Thang Hai', 'Vietnam3', 2, 'February');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Thang Ba', 'Vietnam3', 3, 'March');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Thang Tu', 'Vietnam3', 4, 'April');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Thang Nam', 'Vietnam3', 5, 'May');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Thang Sau', 'Vietnam3', 6, 'June');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Thang Bay', 'Vietnam3', 7, 'July');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Thang Tam', 'Vietnam3', 8, 'August');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Thang Chin', 'Vietnam3', 9, 'September');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Thang moui', 'Vietnam3', 10, 'October');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Thang Moui Mot', 'Vietnam3', 11, 'November');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Thang Moui Hai', 'Vietnam3', 12, 'December');"); 
				 
				
				
				//Number VN
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Mot', 'Vietnam4', 1, 'One');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Hai', 'Vietnam4', 2, 'Two');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Ba', 'Vietnam4', 3, 'Three');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Bon', 'Vietnam4', 4, 'Four');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Nam', 'Vietnam4', 5, 'Five');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Sau', 'Vietnam4', 6, 'Six');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Bay', 'Vietnam4', 7, 'Seven');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Tam', 'Vietnam4', 8, 'Eight');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Chin', 'Vietnam4', 9, 'Nine');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Muoi', 'Vietnam4', 10, 'Ten');"); 
				
				
				
				
				//Saying Goodbye VN
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Tam Biet', 'Vietnam5', 1, 'Goodbye');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Gap Lai Sau', 'Vietnam5', 2, 'See you later');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Dem Tot', 'Vietnam5', 3, 'Good Night');");
				
				
				
				
				
				//Greet KH
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Sous Day', 'Cambodia1', 1, 'Hello');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Sok Sabai Dee', 'Cambodia1', 2, 'How are you?');"); 
				
				
				
				
				//Days KH
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Ta Ngai Chan', 'Cambodia2', 1, 'Monday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Ta Ngai Ang Kea', 'Cambodia2', 2, 'Tuesday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Ta Ngai Pout', 'Cambodia2', 3, 'Wednesday');"); 
			
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Ta Ngai Pro Hoah', 'Cambodia2', 4, 'Thursday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Ta Ngai Sok', 'Cambodia2', 5, 'Friday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Ta Ngai Sao', 'Cambodia2', 6, 'Saturday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Ta Ngai A Thut', 'Cambodia2', 7, 'Sunday');"); 
				
				
				
				
				//Month KH
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Khae Makara', 'Cambodia3', 1, 'January');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Khae Kompheak', 'Cambodia3', 2, 'February');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Khae Meneah', 'Cambodia3', 3, 'March');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Khae Meysah', 'Cambodia3', 4, 'April');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Khae Osaphea', 'Cambodia3', 5, 'May');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Khae Maytona', 'Cambodia3', 6, 'June');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Khae Kakada', 'Cambodia3', 7, 'July');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Khae Seyha', 'Cambodia3', 8, 'August');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Khae Kanya', 'Cambodia3', 9, 'September');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Khae Tola', 'Cambodia3', 10, 'October');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Khae Vicheka', 'Cambodia3', 11, 'November');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Khae Thnou', 'Cambodia3', 12, 'December');"); 
				 
				
				
				//Number KH
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Muay', 'Cambodia4', 1, 'One');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Pee', 'Cambodia4', 2, 'Two');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Bei', 'Cambodia4', 3, 'Three');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Buan', 'Cambodia4', 4, 'Four');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Prahm', 'Cambodia4', 5, 'Five');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Prahm Muay', 'Cambodia4', 6, 'Six');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Prahm Pee', 'Cambodia4', 7, 'Seven');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Prahm Bei', 'Cambodia4', 8, 'Eight');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Prahm Buan', 'Cambodia4', 9, 'Nine');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Dohp', 'Cambodia4', 10, 'Ten');"); 
				
				
				
				
				//Saying Goodbye KH
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Chum Reap Leah', 'Cambodia5', 1, 'Goodbye');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Ka Juab Ka Nia Mai', 'Cambodia5', 2, 'See you later');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Reatrey Sous Dey', 'Cambodia5', 3, 'Good Night');");
				
				
				
				
				
				//Greet MM
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Min Ga Lar Bar', 'Myanmar1', 1, 'Hello');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Nei Kaon La', 'Myanmar1', 2, 'How are you?');"); 
				
				
				
				
				//Days MM
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Tha Nin La Ne', 'Myanmar2', 1, 'Monday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('In Ga Ne', 'Myanmar2', 2, 'Tuesday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Bo Ta Hu Ne', 'Myanmar2', 3, 'Wednesday');"); 
			
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Kya Tha Ba Dei Ne', 'Myanmar2', 4, 'Thursday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Tao Kya Ne', 'Myanmar2', 5, 'Friday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Sa Nei Ne', 'Myanmar2', 6, 'Saturday');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Tha Nin Ga Nei Way Ne', 'Myanmar2', 7, 'Sunday');"); 
				
				
				
				
				//Month MM
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Zan Na Wa Ri La', 'Myanmar3', 1, 'January');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Fe Phaw Wa Ri La', 'Myanmar3', 2, 'February');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Mat La', 'Myanmar3', 3, 'March');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('E Pyi La', 'Myanmar3', 4, 'April');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('May La', 'Myanmar3', 5, 'May');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Zun La', 'Myanmar3', 6, 'June');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Zu Lai La', 'Myanmar3', 7, 'July');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Ou Gout La', 'Myanmar3', 8, 'August');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Set Tin Ba La', 'Myanmar3', 9, 'September');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Au To Ba La', 'Myanmar3', 10, 'October');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('No Win Ba La', 'Myanmar3', 11, 'November');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('De Zen Ba La', 'Myanmar3', 12, 'December');"); 
				 
				
				
				//Number MM
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Tit', 'Myanmar4', 1, 'One');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Hni', 'Myanmar4', 2, 'Two');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Thoun', 'Myanmar4', 3, 'Three');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Lei', 'Myanmar4', 4, 'Four');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Nga', 'Myanmar4', 5, 'Five');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Chao', 'Myanmar4', 6, 'Six');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Kun Hni', 'Myanmar4', 7, 'Seven');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Shit', 'Myanmar4', 8, 'Eight');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Keo', 'Myanmar4', 9, 'Nine');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Se', 'Myanmar4', 10, 'Ten');"); 
				
				
				
				
				//Saying Goodbye MM
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Che Chon Mae', 'Myanmar5', 1, 'Goodbye');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Ar Tit Thui', 'Myanmar5', 2, 'See you Again');"); 
				
				db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Eigh Meh Kao Mah Ba Sae', 'Myanmar5', 3, 'Good Night');");
				
				
				
				
				
				
				
				
				

			
			//Greet TH
			db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
						+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN 
						+ ") VALUES ('Sawatdi', 'Thailand1', 1, 'Hello');");  
			
			db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_COUNTRY 
					+ ", " + COL_TYPE  + ", " + COL_AMOUNT + ", " + COL_MEAN
					+ ") VALUES ('Sabai di mai', 'Thailand1', 2, 'How are you?');");  
	}

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        onCreate(db);
	}
    
    
}
