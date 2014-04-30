package com.example.helloworld2;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.os.Build;

public class HelloWorldActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_hello_world);
        initDisplayButton();
        initClearButton();

    }
    
    private void initDisplayButton() { 	
    	Button displayButton = (Button) findViewById(R.id.buttonDisplay);
    	displayButton.setOnClickListener(new OnClickListener(){
    		
    		@Override
    		public void onClick (View args0){
    			EditText editName = (EditText) findViewById (R.id.editTextName);
    			TextView textDisplay = (TextView) findViewById (R.id.textView2);
    			String nameToDisplay = editName.getText().toString();
    			textDisplay.setText("Hello, " + nameToDisplay);
    		}
    	});
    }
    
    private void initClearButton() {
    	Button clearButton = (Button) findViewById(R.id.buttonClear);
    	clearButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				EditText editName = (EditText) findViewById(R.id.editTextName);
				editName.setText("");
				
				TextView textDisplay = (TextView) findViewById (R.id.textView2);
				textDisplay.setText(R.string.hello_world);
				
			}
    		
    	});
    	
    }
}
