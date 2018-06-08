package by.lipovtsev.anton.hack;

import android.app.Application;

import by.lipovtsev.anton.hack.utils.realm.CustomRealmConfiguration;
import io.realm.Realm;
import io.realm.RealmConfiguration;

public class HackApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(getApplicationContext());
        RealmConfiguration realmConfig = CustomRealmConfiguration.getRealmConfiguration();
        Realm.setDefaultConfiguration(realmConfig);
    }
}
