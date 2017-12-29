package com.technotalkative.loopfindviewbyid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class LoopFindViewByIDActivity extends Activity implements OnClickListener{
	
	Button[] buttons;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        buttons = new Button[10];
        
        for(int i=0; i<buttons.length; i++) {
        	{
        	    String buttonID = "button" + (i+1);
        	    
        	    int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
        	    buttons[i] = ((Button) findViewById(resID));
        	    buttons[i].setOnClickListener(this);
        	}
        }
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		int index = 0;
		   for (int i = 0; i < buttons.length; i++)
		   {
		      if (buttons[i].getId() == v.getId())
		      {
		         index = i;
		         break;
		      }
		   }
		   
		  Toast.makeText(this, "Button clicked index => "+index, Toast.LENGTH_SHORT).show();
	}
}
   