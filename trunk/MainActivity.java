package com.example.samplejsontester;

import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.rikt.tech.and.jsonreceiver.JsonDataReceiver;

public class MainActivity extends Activity {
	JsonDataReceiver json;
	JSONObject jsonObject;
	TextView tv;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		json = new JsonDataReceiver(
				
				getApplicationContext());
            // here i am passing url and with which key and data has to be saved
		jsonObject = json.getDataReceived("http://test.teamkollab.com:8080/SkyReach/Categories","urlkey");
		tv = (TextView) findViewById(R.id.tv);
		tv.setText(jsonObject.toString());
	}

}
