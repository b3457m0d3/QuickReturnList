/*
 * Copyright 2013 Dave Morgan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.quickreturnlist;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A simple demonstration for our QuickReturnFrameLayout class.
 * @author Dave Morgan
 */
public class QuickReturnListDemoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initList();
    }

    
    private void initList(){
    	// populating our list
    	ListView lv = (ListView) findViewById(android.R.id.list);
    	String items[] = new String[30];
    	for(int i=0; i<items.length;){
    		items[i] = "List Item " + Integer.toString(++i);
    	}
    	lv.setAdapter(new ArrayAdapter<String>(this, R.layout.list_item, items));
    	
    	// just one line of code to make it work
    	((QuickReturnFrameLayout) findViewById(R.id.frame)).attach(lv);
    }
    
}
