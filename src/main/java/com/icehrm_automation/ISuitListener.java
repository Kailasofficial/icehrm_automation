package com.icehrm_automation;

import org.testng.ISuite;

public interface ISuitListener {

	default void onStart(ISuite suite) {
		
	}
	default void onFinish(ISuite suite) {
		
	}
}
