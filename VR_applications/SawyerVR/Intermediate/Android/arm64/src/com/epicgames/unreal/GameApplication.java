package com.epicgames.unreal;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;

import com.epicgames.unreal.network.NetworkChangedManager;


public class GameApplication extends Application implements LifecycleObserver {
	private static final Logger Log = new Logger("UE", "GameApp");

	private static boolean isForeground = false;

	private static Context context;

	public static boolean AndroidFileServer_Verify(String Token)
	{
return (Token.equals("E2CDD8ED483126D11A93609EDDD26D37"));
	}


	@Override
	public void onCreate() {
		super.onCreate();
		GameApplication.context = getApplicationContext();
		GooglePlayGamesWrapper.Initialize(getApplicationContext());


		ProcessLifecycleOwner.get().getLifecycle().addObserver(this);

		NetworkChangedManager.getInstance().initNetworkCallback(this);
	}

	public static Context getAppContext() {
		return GameApplication.context;
	}

	@Override
	public void attachBaseContext(Context base) {
		super.attachBaseContext(base);

	}

	@Override
	public void onLowMemory() {
		super.onLowMemory();

	}

	@Override
	public void onTrimMemory(int level) {
		super.onTrimMemory(level);

	}

	@Override
	public void onConfigurationChanged (Configuration newConfig) {
		super.onConfigurationChanged(newConfig);

	}

	@OnLifecycleEvent(Lifecycle.Event.ON_START)
	void onEnterForeground() {
		Log.verbose("App in foreground");
		isForeground = true;
	}

	@OnLifecycleEvent(Lifecycle.Event.ON_STOP)
	void onEnterBackground() {
		Log.verbose("App in background");
		isForeground = false;
	}

	@SuppressWarnings("unused")
	public static boolean isAppInForeground() {
		return isForeground;
	}

	public static boolean isAppInBackground() {
		return !isForeground;
	}
}
