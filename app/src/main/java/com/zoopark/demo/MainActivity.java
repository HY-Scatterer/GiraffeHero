package com.zoopark.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.zoopark.demo.animation.activity.HomeAnimActivity;
import com.zoopark.demo.complex.ComplexPageActivity;
import com.zoopark.demo.empty.EmptyViewActivity;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	/** Click *************************************************************************************/

	public void onEmptyViewClick(View view) {
		startActivity(new Intent(this, EmptyViewActivity.class));
	}

	public void onAnimationClick(View view) {
		startActivity(new Intent(this, HomeAnimActivity.class));
	}

	public void onComplexPageClick(View view) {
		startActivity(new Intent(this, ComplexPageActivity.class));
	}
}
