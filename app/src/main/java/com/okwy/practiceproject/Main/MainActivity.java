package com.okwy.practiceproject.Main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.okwy.practiceproject.AndroidArchitecture.Views.NoteActivity;
import com.okwy.practiceproject.AppSettings.AppSettingsActivity;
import com.okwy.practiceproject.BottomNavigation.BottomNavigationActivity;
import com.okwy.practiceproject.BroadcastReceiver.BroadcastReceiverActivity;
import com.okwy.practiceproject.CoordinatorLayout.CoordinatorLayoutActivity;
import com.okwy.practiceproject.CustomViews.CustomViewActivity;
import com.okwy.practiceproject.DrawablesStylesThemes.ScoreKeeperActivity;
import com.okwy.practiceproject.IntentsWithActivities.IntentActivity;
import com.okwy.practiceproject.JobScheduler.JobSchedulerActivity;
import com.okwy.practiceproject.Localization.LocaleActivity;
import com.okwy.practiceproject.Main.Adapter.MainAdapter;
import com.okwy.practiceproject.MenusWithPickers.MenusWithPickersActivity;
import com.okwy.practiceproject.NavigationComponent.NavigationComponentActivity;
import com.okwy.practiceproject.NavigationDrawer.NavigationDrawerActivity;
import com.okwy.practiceproject.Notification.NotificationActivity;
import com.okwy.practiceproject.PagingWithRetrofit.PagingActivity;
import com.okwy.practiceproject.R;
import com.okwy.practiceproject.ReactiveProgramming.RxJavaActivity;
import com.okwy.practiceproject.Services.ServiceActivity;
import com.okwy.practiceproject.Snackbar.SnackbarActivity;
import com.okwy.practiceproject.TabNavigation.TabNavigationActivity;
import com.okwy.practiceproject.Toast.ToastActivity;
import com.okwy.practiceproject.VolleyPicasso.VolleyActivity;
import com.okwy.practiceproject.WorkManager.WorkManagerActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainAdapter.ListItemClickListener{

    private RecyclerView mainRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainRecycler = findViewById(R.id.mainRecycler);

        displayRecyclerView();
    }

    private void displayRecyclerView() {
        List<String> conceptList = new ArrayList<>();
        conceptList.add("Toast");
        conceptList.add("Snackbar");
        conceptList.add("Custom Views");
        conceptList.add("Notification");
        conceptList.add("Localization");
        conceptList.add("WorkManager");
        conceptList.add("JobScheduler");
        conceptList.add("Tab Navigation");
        conceptList.add("Bottom Navigation");
        conceptList.add("Navigation Drawer");
        conceptList.add("Navigation Component");
        conceptList.add("Menus And Pickers");
        conceptList.add("Reactive Programming");
        conceptList.add("Paging with Retrofit");
        conceptList.add("Volley with Picasso");
        conceptList.add("Coordinator Layout");
        conceptList.add("Foreground Service");
        conceptList.add("Broadcast Receivers");
        conceptList.add("Android Architecture");
        conceptList.add("Intents and Activities");
        conceptList.add("Drawables, Styles and Themes");
        conceptList.add("App Settings and Preferences");

        System.out.println(conceptList.toString());
        MainAdapter mainAdapter = new MainAdapter(this, conceptList, MainActivity.this);
        mainRecycler.setLayoutManager(new LinearLayoutManager(this));
        mainRecycler.setAdapter(mainAdapter);
    }


    @Override
    public void onListItemClick(String menuItem, int position) {
        switch (menuItem){
            case "Toast":
                startActivity(new Intent(this, ToastActivity.class));
                break;
            case "Snackbar":
                startActivity(new Intent(this, SnackbarActivity.class));
                break;
            case "Custom Views":
                startActivity(new Intent(this, CustomViewActivity.class));
                break;
            case "Notification":
                startActivity(new Intent(this, NotificationActivity.class));
                break;
            case "Localization":
                startActivity(new Intent(this, LocaleActivity.class));
                break;
            case "WorkManager":
                startActivity(new Intent(this, WorkManagerActivity.class));
                break;
            case "JobScheduler":
                startActivity(new Intent(this, JobSchedulerActivity.class));
                break;
            case "Reactive Programming":
                startActivity(new Intent(this, RxJavaActivity.class));
                break;
            case "Paging with Retrofit":
                startActivity(new Intent(this, PagingActivity.class));
                break;
            case "App Settings and Preferences":
                startActivity(new Intent(this, AppSettingsActivity.class));
                break;
            case "Tab Navigation":
                startActivity(new Intent(this, TabNavigationActivity.class));
                break;
            case "Bottom Navigation":
                startActivity(new Intent(this, BottomNavigationActivity.class));
                break;
            case "Navigation Drawer":
                startActivity(new Intent(this, NavigationDrawerActivity.class));
                break;
            case "Navigation Component":
                startActivity(new Intent(this, NavigationComponentActivity.class));
                break;
            case "Menus And Pickers":
                startActivity(new Intent(this, MenusWithPickersActivity.class));
                break;
            case "Volley with Picasso":
                startActivity(new Intent(this, VolleyActivity.class));
                break;
            case "Foreground Service":
                startActivity(new Intent(this, ServiceActivity.class));
                break;
            case "Broadcast Receivers":
                startActivity(new Intent(this, BroadcastReceiverActivity.class));
                break;
            case "Android Architecture":
                startActivity(new Intent(this, NoteActivity.class));
                break;
            case "Coordinator Layout":
                startActivity(new Intent(this, CoordinatorLayoutActivity.class));
                break;
            case "Intents and Activities":
                startActivity(new Intent(this, IntentActivity.class));
                break;
            case "Drawables, Styles and Themes":
                startActivity(new Intent(this, ScoreKeeperActivity.class));
                break;
        }
    }
}