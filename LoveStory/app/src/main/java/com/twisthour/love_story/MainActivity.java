package com.twisthour.love_story;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.Log;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.navigation.NavigationView;
import com.twisthour.love_story.Beans.HistoryAdapter;
import com.twisthour.love_story.Beans.HistoryModel;
import com.twisthour.love_story.Db.Helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity  {


    DrawerLayout _drawer;
    ImageView _drawer_imageview13;
    LinearLayout _drawer_linear1;
    LinearLayout _drawer_linear10;

    LinearLayout _drawer_linear4;
    LinearLayout _drawer_linear9;

    ScrollView _drawer_vscroll1;
    AlertDialog.Builder backpress;
    SharedPreferences data;
    AlertDialog.Builder feedback;

    ImageView imageview10;
    ImageView imageview11;
    ImageView imageview12;
    ImageView imageview13;
    ImageView imageview14;
    ImageView imageview15;
    ImageView imageview16;
    ImageView imageview6;
    ImageView imageview7;
    ImageView imageview8;

    ImageView imageview9;


    ImageView imageview_drawer;

    ImageView imageview_share;
    ImageView imageview_rate;


    LinearLayout linear1;
    LinearLayout linear10;

    LinearLayout linear4;
    LinearLayout linear9;
    LinearLayout linear_actionbar;
    LinearLayout linear_bar_2;
    LinearLayout linear_bar_3;
    LinearLayout linear_download;
    LinearLayout linear_exit;
    LinearLayout linear_feedback;
    LinearLayout linear_fire_update;
    LinearLayout linear_menu;
    LinearLayout linear_more;
    LinearLayout linear_rating;
    LinearLayout linear_sub_tab_1;
    LinearLayout linear_sub_tab_10;
    LinearLayout linear_sub_tab_11;
    LinearLayout linear_sub_tab_12;
    LinearLayout linear_sub_tab_2;
    LinearLayout linear_sub_tab_3;
    LinearLayout linear_sub_tab_4;
    LinearLayout linear_sub_tab_5;
    LinearLayout linear_sub_tab_6;
    LinearLayout linear_sub_tab_7;
    LinearLayout linear_sub_tab_8;
    LinearLayout linear_sub_tab_9;
    LinearLayout linear_tab_1;
    LinearLayout linear_tab_10;
    LinearLayout linear_tab_11;
    LinearLayout linear_tab_12;
    LinearLayout linear_tab_2;
    LinearLayout linear_tab_3;
    LinearLayout linear_tab_4;
    LinearLayout linear_tab_5;
    LinearLayout linear_tab_6;
    LinearLayout linear_tab_7;
    LinearLayout linear_tab_8;
    LinearLayout linear_tab_9;
    LinearLayout linear_tab_bar_1;
    LinearLayout linear_tab_bar_2;
    LinearLayout linear_tab_bar_3;

    Switch list_toggle;

    LinearLayout linear_theme;
    LinearLayout linear_toolbar;
    LinearLayout lw1;
    LinearLayout lw2;
    LinearLayout lw3;

    ProgressDialog prog;
    TextView textview1;
    TextView category_titel5;
    TextView category_titel6;
    TextView category_titel7;
    TextView category_titel8;
    TextView category_titel9;
    TextView textview15;
    TextView textview16;
    TextView textview17;
    TextView category_titel10;
    TextView category_titel12;
    TextView category_titel11;
    TextView category_titel1;
    TextView textview2;
    TextView textview20;
    TextView textview3;
    TextView textview5;
    TextView category_titel2;
    TextView textview7;
    TextView category_titel3;
    TextView category_titel4;
    LinearLayout theme1_button;
    LinearLayout theme_2nd_unused_button;
    LinearLayout night_theme_button;
    LinearLayout theme4th_unused_button;
    TimerTask tmr;
    TextView tw1;
    TextView tw2;
    TextView tw3;

    TextView textView2;


    ScrollView vscroll1;
    Timer _timer = new Timer();
    String fontName = "";
    String typeace = "";
    String aa = "";
    String bb = "";
    String code = "";
    String colorPrimary = "";
    String colorPrimaryDark = "";
    String ColorText = "";
    double Radius = 0.0d;
    double Shadow = 0.0d;
    double Stroke = 0.0d;
    String ColorTextToo = "";
    String urlString = "";
    String img_name = "";
    String img_path = "";
    HashMap<String, Object> fb_map = new HashMap<>();
    String AppName = "";
    HashMap<String, Object> fire_map = new HashMap<>();
    String Fire_Action_Url = "";
    ArrayList<String> list = new ArrayList<>();
    ArrayList<HashMap<String, Object>> fb_map_list = new ArrayList<>();
    Intent i = new Intent();
    Intent web = new Intent();
    Intent dev = new Intent();
    Intent apps = new Intent();

    BottomNavigationView bottomNavigationView;

    LinearLayout container;
    TextView textView1;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;
    TextView textView10;
    TextView titel_textView2;
    TextView textView11;

    TextView privacy;
    TextView terms_and_conditions;
    TextView licence;
    TextView version;
    AlertDialog alert;
    LinearLayout themeLayout;

    BottomSheetDialog bottomSheetDialog;
    AlertDialog builder;

    private LinearLayout linear_fav_main;
    private LinearLayout linear_settngs_main;
    private LinearLayout linear_history_main;

    private RecyclerView history_rv;
    private List<HistoryModel> historyModelList;
    private HistoryAdapter historyAdapter;


    private RecyclerView fav_rv;
    private List<HistoryModel> favModelList;
    private HistoryAdapter favAdapter;

    ImageView history_all_delete_imageview;
    ImageView favorite_all_delete_imageview;

    TextView histoytextview, historysubtextview, favoritetextview, favoritesubtextview;

    LinearLayout historymainlayout;
    LinearLayout historytoolbar;
    LinearLayout favoritetoolbar;
    LinearLayout faboritemainlayout;

    TextView adapter_title;

    ImageView historyimageview;
    ImageView favoriteimageview;


    //  String demo_interstitial;
    //  String demo_appId =
    // String demo_banner = "";

    public static String demo_interstitial = "";
    public static String demo_appId = "";
    public static String demo_banner = "";

    long back_pressed;

    private Switch hourly, salary;
    private Boolean hrlySwitch, slrySwitch;
    private Double hrly, slry, tax;
    private SharedPreferences pref;

    private static  String TAG = "tag";
    SwitchCompat switchCompat;
    Button btNext,btExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);


        // Assign variable
        switchCompat=findViewById(R.id.switch_compat);


        // Save switch state in shared preferences
        SharedPreferences sharedPreferences=getSharedPreferences("save",MODE_PRIVATE);
        switchCompat.setChecked(sharedPreferences.getBoolean("value",true));

        switchCompat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switchCompat.isChecked())
                {
                    // When switch checked
                    SharedPreferences.Editor editor=getSharedPreferences("save",MODE_PRIVATE).edit();
                    editor.putBoolean("value",true);
                    editor.apply();
                    switchCompat.setChecked(true);
                    MainActivity.this._theme("night_theme");
                }
                else
                {
                    // When switch unchecked
                    MainActivity.this._theme("theme1");
                    SharedPreferences.Editor editor=getSharedPreferences("save",MODE_PRIVATE).edit();
                    editor.putBoolean("value",false);
                    editor.apply();
                    switchCompat.setChecked(false);
                }
            }
        });








        LinearLayout bannerContainer = findViewById(R.id.bannerContainer);


        this.data = getSharedPreferences("data", 0);


        historyimageview = findViewById(R.id.history_imagview);
        favoriteimageview = findViewById(R.id.Favorite_imageview);


        historymainlayout = findViewById(R.id.History_Main_layout);
        historytoolbar = findViewById(R.id.History_toolbar);


        favoritetoolbar = findViewById(R.id.Favorite_toolbar);
        faboritemainlayout = findViewById(R.id.Favorite_Main_leyout);


        adapter_title = findViewById(R.id.adapter_title);


        histoytextview = findViewById(R.id.History_Titeltextview);
        historysubtextview = findViewById(R.id.History_sub_Titeltextview);

        favoritetextview = findViewById(R.id.Favorite_Titeltextview);
        favoritesubtextview = findViewById(R.id.Favorite_sub_Titeltextview);

        history_all_delete_imageview = findViewById(R.id.history_all_delete_imageview);
        favorite_all_delete_imageview = findViewById(R.id.favorite_all_delete_imageview);


        history_rv = findViewById(R.id.history_rv);
        fav_rv = findViewById(R.id.fav_rv);


        historyModelList = new ArrayList<>();
        historyAdapter = new HistoryAdapter(historyModelList);
        history_rv.setLayoutManager(new LinearLayoutManager(this));
        history_rv.setAdapter(historyAdapter);

        loadHistory();


        favModelList = new ArrayList<>();
        favAdapter = new HistoryAdapter(favModelList);
        fav_rv.setLayoutManager(new LinearLayoutManager(this));
        fav_rv.setAdapter(favAdapter);

        loadFav();


        LinearLayout Main_linear_settings = findViewById(R.id.Main_linear_settings);
        LinearLayout Main_linear_favorite = findViewById(R.id.Main_linear_favorite);
        LinearLayout Main_linear_history = findViewById(R.id.Main_linear_history);

        bottomNavigationView = findViewById(R.id.bottom_navigation);


        themeLayout = findViewById(R.id.themeLayout);


        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:

                    vscroll1.setVisibility(View.VISIBLE);
                    Main_linear_settings.setVisibility(View.GONE);
                    Main_linear_favorite.setVisibility(View.GONE);
                    Main_linear_history.setVisibility(View.GONE);

                    linear_actionbar.setVisibility(View.VISIBLE);
                    return true;


                case R.id.histoy:

                    vscroll1.setVisibility(View.GONE);
                    Main_linear_history.setVisibility(View.VISIBLE);
                    Main_linear_settings.setVisibility(View.GONE);
                    Main_linear_favorite.setVisibility(View.GONE);
                    linear_actionbar.setVisibility(View.GONE);
                    loadHistory();
                    return true;

                case R.id.bookmark:


                    vscroll1.setVisibility(View.GONE);
                    Main_linear_settings.setVisibility(View.GONE);
                    Main_linear_favorite.setVisibility(View.VISIBLE);
                    Main_linear_history.setVisibility(View.GONE);
                    linear_actionbar.setVisibility(View.GONE);
                    loadFav();

                    return true;
                case R.id.Settings:


                    Main_linear_settings.setVisibility(View.VISIBLE);
                    Main_linear_history.setVisibility(View.GONE);
                    Main_linear_favorite.setVisibility(View.GONE);
                    linear_actionbar.setVisibility(View.GONE);
                    vscroll1.setVisibility(View.GONE);


                    return true;
            }

            return false;
        });



        initialize();
        initializeLogic();

    }


    private void loadFav() {

        Cursor cursor = new Helper(this).getAllFav();

        if (cursor != null && cursor.getCount() > 0) {

            favModelList.clear();

            while (cursor.moveToNext()) {

                HistoryModel model = new HistoryModel(
                        cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getLong(4),
                        1
                );


                favModelList.add(model);

            }


            favAdapter.notifyDataSetChanged();


        }

    }

    private void loadHistory() {

        Cursor cursor = new Helper(this).getAllHistory();

        if (cursor != null && cursor.getCount() > 0) {

            historyModelList.clear();

            while (cursor.moveToNext()) {

                HistoryModel model = new HistoryModel(
                        cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getLong(4),
                        2
                );


                historyModelList.add(model);

            }


            historyAdapter.notifyDataSetChanged();


        }


    }

    void initialize() {

        this.imageview_drawer = findViewById(R.id.imageview_drawer);


        Toolbar toolbar = findViewById(R.id._toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout _drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, _drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        _drawer.addDrawerListener(toggle);
        toggle.syncState();


        this.imageview_drawer.setOnClickListener(view -> _drawer.openDrawer(GravityCompat.START));


        this.textView1 = findViewById(R.id.t1);
        this.textView2 = findViewById(R.id.t2);
        this.textView3 = findViewById(R.id.t3);
        this.textView4 = findViewById(R.id.t4);
        this.textView5 = findViewById(R.id.t5);
        this.textView6 = findViewById(R.id.t6);
        this.textView7 = findViewById(R.id.t7);
        this.textView8 = findViewById(R.id.t8);
        this.textView9 = findViewById(R.id.t9);
        this.textView10 = findViewById(R.id.t10);
        this.textView11 = findViewById(R.id.t11);


        titel_textView2 = findViewById(R.id.main_sub_titel_textview);

        this.privacy = findViewById(R.id.privacy);
        this.terms_and_conditions = findViewById(R.id.terms_and_conditions);
        this.licence = findViewById(R.id.licence);
        this.version = findViewById(R.id.version);


        LinearLayout moreapp = findViewById(R.id.moreapp);
        LinearLayout rateus = findViewById(R.id.rateus);
        LinearLayout share_app = findViewById(R.id.share_app);


        moreapp.setOnClickListener(v -> MainActivity.this._More_Apps());
        rateus.setOnClickListener(v -> MainActivity.this._Rate_Apps());
        share_app.setOnClickListener(v -> MainActivity.this._Share());


        this.linear1 = findViewById(R.id.linear1);
        this.linear_actionbar = findViewById(R.id.linear_actionbar);
        this.vscroll1 = findViewById(R.id.vscroll1);
        this.linear_toolbar = findViewById(R.id.linear_toolbar);

        this.linear_menu = findViewById(R.id.linear_menu);
        this.imageview_share = findViewById(R.id.imageview_share);
        this.imageview_rate = findViewById(R.id.imageview_rate);
        this.textview1 = findViewById(R.id.main_titel_textview);
        //  this.textview2 = findViewById(R.id.textview2);
        this.linear4 = findViewById(R.id.linear4);
        this.linear9 = findViewById(R.id.linear9);
        this.linear_tab_bar_1 = findViewById(R.id.linear_tab_bar_1);
        this.linear_tab_bar_2 = findViewById(R.id.linear_tab_bar_2);
        this.linear_tab_bar_3 = findViewById(R.id.linear_tab_bar_3);
        this.linear10 = findViewById(R.id.linear10);
        this.linear_tab_1 = findViewById(R.id.linear_tab_1);
        this.linear_tab_2 = findViewById(R.id.linear_tab_2);
        this.linear_tab_3 = findViewById(R.id.linear_tab_3);
        this.linear_sub_tab_1 = findViewById(R.id.linear_sub_tab_1);
        this.imageview6 = findViewById(R.id.imageview6);
        this.category_titel1 = findViewById(R.id.textview1m);
        this.linear_sub_tab_2 = findViewById(R.id.linear_sub_tab_2);
        this.imageview7 = findViewById(R.id.imageview7);
        this.category_titel2 = findViewById(R.id.textview2m);
        this.linear_sub_tab_3 = findViewById(R.id.linear_sub_tab_3);
        this.imageview8 = findViewById(R.id.imageview8);
        this.category_titel3 = findViewById(R.id.textview3m);
        this.linear_tab_4 = findViewById(R.id.linear_tab_4);
        this.linear_tab_5 = findViewById(R.id.linear_tab_5);
        this.linear_tab_6 = findViewById(R.id.linear_tab_6);
        this.linear_sub_tab_4 = findViewById(R.id.linear_sub_tab_4);
        this.imageview9 = findViewById(R.id.imageview9);
        this.category_titel4 = findViewById(R.id.textview4m);
        this.linear_sub_tab_5 = findViewById(R.id.linear_sub_tab_5);
        this.imageview10 = findViewById(R.id.imageview10);
        this.category_titel5 = findViewById(R.id.textview5m);
        this.linear_sub_tab_6 = findViewById(R.id.linear_sub_tab_6);
        this.imageview11 = findViewById(R.id.imageview11);
        this.category_titel6 = findViewById(R.id.textview6m);
        this.linear_tab_7 = findViewById(R.id.linear_tab_7);
        this.linear_tab_12 = findViewById(R.id.linear_tab_12);
        this.linear_tab_8 = findViewById(R.id.linear_tab_8);
        this.linear_tab_9 = findViewById(R.id.linear_tab_9);
        this.linear_sub_tab_7 = findViewById(R.id.linear_sub_tab_7);
        this.imageview12 = findViewById(R.id.imageview12);
        this.category_titel7 = findViewById(R.id.textview7m);
        this.linear_sub_tab_8 = findViewById(R.id.linear_sub_tab_8);
        this.imageview13 = findViewById(R.id.imageview13);
        this.category_titel8 = findViewById(R.id.textview8m);
        this.linear_sub_tab_9 = findViewById(R.id.linear_sub_tab_9);
        this.imageview14 = findViewById(R.id.imageview14);
        this.category_titel9 = findViewById(R.id.textview9m);
        this.linear_tab_10 = findViewById(R.id.linear_tab_10);
        this.linear_tab_11 = findViewById(R.id.linear_tab_11);
        this.linear_sub_tab_10 = findViewById(R.id.linear_sub_tab_10);
        this.imageview15 = findViewById(R.id.imageview15);
        this.category_titel10 = findViewById(R.id.textview10m);
        this.linear_sub_tab_11 = findViewById(R.id.linear_sub_tab_11);
        this.linear_sub_tab_12 = findViewById(R.id.linear_sub_tab_12);
        this.imageview16 = findViewById(R.id.imageview16);
        this.category_titel11 = findViewById(R.id.textview11m);
        this.category_titel12 = findViewById(R.id.textview12m);


        // Your Category Titel Here


        this.category_titel1.setText("ভালোবাসার মেসেজ");
        this.category_titel2.setText(" অ্যাটিটিউড স্ট্যাটাস");
        this.category_titel3.setText("বিখ্যাত মনীষীদের বাণী");
        this.category_titel4.setText("কষ্টের স্ট্যাটাস");
        this.category_titel5.setText("ফেসবুক স্ট্যাটাস");
        this.category_titel6.setText("রোমান্টিক স্ট্যাটাস");
        this.category_titel7.setText("বাস্তব জীবন নিয়ে কিছু কথা");
        this.category_titel8.setText("মধ্যবিত্ত পরিবার নিয়ে উক্তি");
        this.category_titel9.setText("জন্মদিনের শুভেচ্ছা");
        this.category_titel10.setText("মোটিভেশনাল উক্তি");
        this.category_titel11.setText(" লাভ কবিতা ");
        this.category_titel12.setText("গল্প");


        this._drawer_linear1 = findViewById(R.id.linear1);
        this._drawer_linear1 = findViewById(R.id.linear1);
        this._drawer_vscroll1 = findViewById(R.id.vscroll1);
        this._drawer_imageview13 = findViewById(R.id.imageview13);
        this._drawer_linear4 = findViewById(R.id.linear4);
        this._drawer_linear9 = findViewById(R.id.linear9);
        this._drawer_linear10 = findViewById(R.id.linear10);


        this.feedback = new AlertDialog.Builder(this);
        this.backpress = new AlertDialog.Builder(this);


        this.imageview_share.setOnClickListener(view -> MainActivity.this._Share());


        this.linear_tab_1.setOnClickListener(new AnonymousClass8());
        this.linear_tab_2.setOnClickListener(new AnonymousClass9());
        this.linear_tab_3.setOnClickListener(new AnonymousClass10());
        this.linear_tab_4.setOnClickListener(new AnonymousClass11());
        this.linear_tab_5.setOnClickListener(new AnonymousClass12());
        this.linear_tab_6.setOnClickListener(new AnonymousClass13());
        this.linear_tab_7.setOnClickListener(new AnonymousClass14());
        this.linear_tab_8.setOnClickListener(new AnonymousClass15());
        this.linear_tab_9.setOnClickListener(new AnonymousClass16());
        this.linear_tab_10.setOnClickListener(new AnonymousClass17());
        this.linear_tab_11.setOnClickListener(new AnonymousClass18());
        this.linear_tab_12.setOnClickListener(new AnonymousClass19());

    }

    void initializeLogic() {

        if (this.data.getString("theme", "").equals("")) {
            _theme("theme1");
        } else {
            _theme(this.data.getString("theme", ""));
        }


        this.vscroll1.setVerticalScrollBarEnabled(false);
    }


    void _colors(String str) {
        if (str.equals("night_theme")) {

            this.category_titel11.setTextColor(getColor(R.color.white));
            this.category_titel12.setTextColor(getColor(R.color.white));

            LinearLayout view = findViewById(R.id.bg);

            String colorbackground = "#FFFFFFFF";
            view.setBackground(getResources().getDrawable(R.color.darkColorPrimaryDark));

            historyimageview.setImageResource(R.drawable.baseline_history_white);
            favoriteimageview.setImageResource(R.drawable.fav_white);

            history_all_delete_imageview.setImageResource(R.drawable.delete_white);
            favorite_all_delete_imageview.setImageResource(R.drawable.delete_white);

            historymainlayout.setBackgroundColor(getColor(R.color.darkColorPrimaryDark));
            historytoolbar.setBackgroundColor(getColor(R.color.darkColorPrimary));
            faboritemainlayout.setBackgroundColor(getColor(R.color.darkColorPrimaryDark));
            favoritetoolbar.setBackgroundColor(getColor(R.color.darkColorPrimary));
            histoytextview.setTextColor(getColor(R.color.white));
            historysubtextview.setTextColor(getColor(R.color.white));


            favoritetextview.setTextColor(getColor(R.color.white));
            favoritesubtextview.setTextColor(getColor(R.color.white));


            this.textView1.setTextColor(getResources().getColor(R.color.white));
            this.textView2.setTextColor(getResources().getColor(R.color.white));
            this.textView3.setTextColor(getResources().getColor(R.color.white));
            this.textView4.setTextColor(getResources().getColor(R.color.white));
            this.textView4.setText("Dark theme is applied ");
            this.textView5.setTextColor(getResources().getColor(R.color.white));
            this.textView6.setTextColor(getResources().getColor(R.color.white));
            this.textView7.setTextColor(getResources().getColor(R.color.white));
            this.textView8.setTextColor(getResources().getColor(R.color.white));
            this.textView9.setTextColor(getResources().getColor(R.color.white));
            this.textView10.setTextColor(getResources().getColor(R.color.white));
            this.textView11.setTextColor(getResources().getColor(R.color.white));
            this.privacy.setTextColor(getResources().getColor(R.color.white));
            this.terms_and_conditions.setTextColor(getResources().getColor(R.color.white));
            this.licence.setTextColor(getResources().getColor(R.color.white));
            this.version.setTextColor(getResources().getColor(R.color.white));
            this.imageview_share.setImageDrawable(getResources().getDrawable(R.drawable.share_white));
            this.imageview_rate.setImageDrawable(getResources().getDrawable(R.drawable.rate_white));

            titel_textView2.setTextColor(getColor(R.color.white));

            this.colorPrimary = "#424242";
            this.colorPrimaryDark = "#171717";
            this.ColorText = "#FFFFFF";


            Window window = getWindow();
            window.setStatusBarColor(Color.parseColor("#424242"));
            window.setNavigationBarColor(Color.parseColor("#424242"));


            this.imageview_drawer.setImageResource(R.drawable.ic_menu_white);


            this.textview1.setTextColor(Color.parseColor(this.ColorText));
            this.category_titel1.setTextColor(Color.parseColor(this.ColorText));
            this.category_titel2.setTextColor(Color.parseColor(this.ColorText));
            this.category_titel3.setTextColor(Color.parseColor(this.ColorText));
            this.category_titel4.setTextColor(Color.parseColor(this.ColorText));
            this.category_titel5.setTextColor(Color.parseColor(this.ColorText));
            this.category_titel6.setTextColor(Color.parseColor(this.ColorText));
            this.category_titel7.setTextColor(Color.parseColor(this.ColorText));
            this.category_titel8.setTextColor(Color.parseColor(this.ColorText));
            this.category_titel9.setTextColor(Color.parseColor(this.ColorText));
            this.category_titel10.setTextColor(Color.parseColor(this.ColorText));
            this.category_titel1.setTextColor(Color.parseColor(this.ColorText));
            this.category_titel2.setTextColor(Color.parseColor(this.ColorText));


            themeLayout.setOnClickListener(v -> showAlertDialog());


            history_all_delete_imageview.setOnClickListener(v -> history_delete_dialog());


            favorite_all_delete_imageview.setOnClickListener(v -> favorite_delete_dialog());


        } else {


            favorite_all_delete_imageview.setOnClickListener(v -> favorite_delete_dialog());

            this.category_titel11.setTextColor(getColor(R.color.black));
            this.category_titel12.setTextColor(getColor(R.color.black));


            history_all_delete_imageview.setOnClickListener(v -> history_delete_dialog());


            themeLayout.setOnClickListener(v -> lightshowAlertDialog());


            historyimageview.setImageResource(R.drawable.bottom_nav_menu_history);
            favoriteimageview.setImageResource(R.drawable.ic_favourite_select_);

            history_all_delete_imageview.setImageResource(R.drawable.delete_grey);
            favorite_all_delete_imageview.setImageResource(R.drawable.delete_grey);


            historymainlayout.setBackgroundColor(getColor(R.color.white_primary_dark));
            historytoolbar.setBackgroundColor(getColor(R.color.white_primary));
            faboritemainlayout.setBackgroundColor(getColor(R.color.white_primary_dark));
            favoritetoolbar.setBackgroundColor(getColor(R.color.white_primary));

            histoytextview.setTextColor(getColor(R.color.black));
            historysubtextview.setTextColor(getColor(R.color.black));


            favoritetextview.setTextColor(getColor(R.color.black));
            favoritesubtextview.setTextColor(getColor(R.color.black));

            this.textView1.setTextColor(getResources().getColor(R.color.black));
            this.textView2.setTextColor(getResources().getColor(R.color.black));
            this.textView3.setTextColor(getResources().getColor(R.color.black));
            this.textView4.setTextColor(getResources().getColor(R.color.black));
            this.textView4.setText("Light theme is applied");
            this.textView5.setTextColor(getResources().getColor(R.color.black));
            this.textView6.setTextColor(getResources().getColor(R.color.black));
            this.textView7.setTextColor(getResources().getColor(R.color.black));
            this.textView8.setTextColor(getResources().getColor(R.color.black));
            this.textView9.setTextColor(getResources().getColor(R.color.black));
            this.textView10.setTextColor(getResources().getColor(R.color.black));
            this.textView11.setTextColor(getResources().getColor(R.color.black));
            this.privacy.setTextColor(getResources().getColor(R.color.black));
            this.terms_and_conditions.setTextColor(getResources().getColor(R.color.black));
            this.licence.setTextColor(getResources().getColor(R.color.black));
            this.version.setTextColor(getResources().getColor(R.color.black));
            titel_textView2.setTextColor(getColor(R.color.black));
            this.imageview_share.setImageDrawable(getResources().getDrawable(R.drawable.share_grey));
            this.imageview_rate.setImageDrawable(getResources().getDrawable(R.drawable.star_grey));
            LinearLayout view = findViewById(R.id.bg);

            String colorbackground = "#FFFFFFFF";
            view.setBackground(getResources().getDrawable(R.color.white));


            this.colorPrimary = "#FFFFFF";
            this.colorPrimaryDark = "#E0E0E0";
            this.ColorText = "#000000";
            Window window4 = getWindow();
            window4.clearFlags(67108864);
            window4.addFlags(Integer.MIN_VALUE);
            window4.setStatusBarColor(Color.parseColor("#FFFFFFFF"));
            window4.getDecorView().setSystemUiVisibility(8192);
            window4.setNavigationBarColor(Color.parseColor("#FFFFFFFF"));
            this.imageview_drawer.setImageResource(R.drawable.baseline_dehaze_grey);


            this.textview1.setTextColor(Color.parseColor(this.ColorText));
            this.category_titel1.setTextColor(Color.parseColor(this.ColorText));
            this.category_titel2.setTextColor(Color.parseColor(this.ColorText));
            this.category_titel3.setTextColor(Color.parseColor(this.ColorText));
            this.category_titel4.setTextColor(Color.parseColor(this.ColorText));
            this.category_titel5.setTextColor(Color.parseColor(this.ColorText));
            this.category_titel6.setTextColor(Color.parseColor(this.ColorText));
            this.category_titel7.setTextColor(Color.parseColor(this.ColorText));
            this.category_titel8.setTextColor(Color.parseColor(this.ColorText));
            this.category_titel9.setTextColor(Color.parseColor(this.ColorText));
            this.category_titel10.setTextColor(Color.parseColor(this.ColorText));
            this.category_titel1.setTextColor(Color.parseColor(this.ColorText));

        }


        this.Radius = 10.0d;
        this.Shadow = 2.0d;
        this.Stroke = 5.0d;
        _extra();
    }


    public void _theme(String str) {
        this.data.edit().putString("theme", str).apply();
        _colors(str);
    }

    void _extra() {
        _CardStyle(this.linear_actionbar, 5.0d, 0.0d, this.colorPrimary, false);
        _CardStyle(this.linear_toolbar, 8.0d, 0.0d, this.colorPrimary, false);
        _CardStyle(this.linear1, 0.0d, 0.0d, this.colorPrimaryDark, false);
        _click(this.imageview_drawer);
        _click(this.imageview_share);
        _Card_View(this.linear_tab_1, this.Radius, this.colorPrimaryDark, this.Shadow, this.Stroke, this.colorPrimary);
        _Card_View(this.linear_tab_2, this.Radius, this.colorPrimaryDark, this.Shadow, this.Stroke, this.colorPrimary);
        _Card_View(this.linear_tab_3, this.Radius, this.colorPrimaryDark, this.Shadow, this.Stroke, this.colorPrimary);
        _Card_View(this.linear_tab_4, this.Radius, this.colorPrimaryDark, this.Shadow, this.Stroke, this.colorPrimary);
        _Card_View(this.linear_tab_5, this.Radius, this.colorPrimaryDark, this.Shadow, this.Stroke, this.colorPrimary);
        _Card_View(this.linear_tab_6, this.Radius, this.colorPrimaryDark, this.Shadow, this.Stroke, this.colorPrimary);
        _Card_View(this.linear_tab_7, this.Radius, this.colorPrimaryDark, this.Shadow, this.Stroke, this.colorPrimary);
        _Card_View(this.linear_tab_8, this.Radius, this.colorPrimaryDark, this.Shadow, this.Stroke, this.colorPrimary);
        _Card_View(this.linear_tab_9, this.Radius, this.colorPrimaryDark, this.Shadow, this.Stroke, this.colorPrimary);
        _Card_View(this.linear_tab_10, this.Radius, this.colorPrimaryDark, this.Shadow, this.Stroke, this.colorPrimary);
        _Card_View(this.linear_tab_11, this.Radius, this.colorPrimaryDark, this.Shadow, this.Stroke, this.colorPrimary);
        _Card_View(this.linear_tab_12, this.Radius, this.colorPrimaryDark, this.Shadow, this.Stroke, this.colorPrimary);

        _Card_View(this.linear_sub_tab_1, this.Radius, this.colorPrimary, this.Shadow, 0.0d, "");
        _Card_View(this.linear_sub_tab_2, this.Radius, this.colorPrimary, this.Shadow, 0.0d, "");
        _Card_View(this.linear_sub_tab_3, this.Radius, this.colorPrimary, this.Shadow, 0.0d, "");
        _Card_View(this.linear_sub_tab_4, this.Radius, this.colorPrimary, this.Shadow, 0.0d, "");
        _Card_View(this.linear_sub_tab_5, this.Radius, this.colorPrimary, this.Shadow, 0.0d, "");
        _Card_View(this.linear_sub_tab_6, this.Radius, this.colorPrimary, this.Shadow, 0.0d, "");
        _Card_View(this.linear_sub_tab_7, this.Radius, this.colorPrimary, this.Shadow, 0.0d, "");
        _Card_View(this.linear_sub_tab_8, this.Radius, this.colorPrimary, this.Shadow, 0.0d, "");
        _Card_View(this.linear_sub_tab_9, this.Radius, this.colorPrimary, this.Shadow, 0.0d, "");
        _Card_View(this.linear_sub_tab_10, this.Radius, this.colorPrimary, this.Shadow, 0.0d, "");
        _Card_View(this.linear_sub_tab_11, this.Radius, this.colorPrimary, this.Shadow, 0.0d, "");
        _Card_View(this.linear_sub_tab_12, this.Radius, this.colorPrimary, this.Shadow, 0.0d, "");


    }

    void _CardStyle(final View view, double d, double d2, String str, boolean z) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setCornerRadius((int) d2);
        view.setBackground(gradientDrawable);
        view.setElevation((int) d);
        if (z) {


            view.setOnTouchListener((view2, motionEvent) -> {
                switch (motionEvent.getAction()) {
                    case 0:
                        ObjectAnimator objectAnimator = new ObjectAnimator();
                        objectAnimator.setTarget(view);
                        objectAnimator.setPropertyName("scaleX");
                        objectAnimator.setFloatValues(0.9f);
                        objectAnimator.setDuration(100L);
                        objectAnimator.start();
                        ObjectAnimator objectAnimator2 = new ObjectAnimator();
                        objectAnimator2.setTarget(view);
                        objectAnimator2.setPropertyName("scaleY");
                        objectAnimator2.setFloatValues(0.9f);
                        objectAnimator2.setDuration(100L);
                        objectAnimator2.start();
                        break;
                    case 1:
                        ObjectAnimator objectAnimator3 = new ObjectAnimator();
                        objectAnimator3.setTarget(view);
                        objectAnimator3.setPropertyName("scaleX");
                        objectAnimator3.setFloatValues(1.0f);
                        objectAnimator3.setDuration(100L);
                        objectAnimator3.start();
                        ObjectAnimator objectAnimator4 = new ObjectAnimator();
                        objectAnimator4.setTarget(view);
                        objectAnimator4.setPropertyName("scaleY");
                        objectAnimator4.setFloatValues(1.0f);
                        objectAnimator4.setDuration(100L);
                        objectAnimator4.start();
                        break;
                }
                return false;
            });
        }
    }

    void _click(View view) {

        view.setClickable(true);
        view.setBackground(CircleDrawables.getSelectableDrawableFor(Color.parseColor(this.colorPrimaryDark)));
    }


    public static class CircleDrawables {
        public static Drawable getSelectableDrawableFor(int i) {
            return new RippleDrawable(ColorStateList.valueOf(i), new ColorDrawable(Color.parseColor("#00ffffff")), getRippleColor(i));
        }

        static Drawable getRippleColor(int i) {
            float[] fArr = new float[180];
            Arrays.fill(fArr, 80.0f);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(i);
            return shapeDrawable;
        }

        static int lightenOrDarken(int i, double d) {
            return canLighten(i, d) ? lighten(i, d) : darken(i, d);
        }

        static int lighten(int i, double d) {
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            return Color.argb(Color.alpha(i), lightenColor(red, d), lightenColor(green, d), lightenColor(blue, d));
        }

        static int darken(int i, double d) {
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            return Color.argb(Color.alpha(i), darkenColor(red, d), darkenColor(green, d), darkenColor(blue, d));
        }

        static boolean canLighten(int i, double d) {
            return canLightenComponent(Color.red(i), d) && canLightenComponent(Color.green(i), d) && canLightenComponent(Color.blue(i), d);
        }

        static boolean canLightenComponent(int i, double d) {
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            if (red + (red * d) < 255.0d) {
                if ((green * d) + green < 255.0d && blue + (blue * d) < 255.0d) {
                    return true;
                }
            }
            return false;
        }

        static int darkenColor(int i, double d) {
            return (int) Math.max(i - (i * d), 0.0d);
        }

        static int lightenColor(int i, double d) {
            return (int) Math.min(i + (i * d), 255.0d);
        }
    }

    void _radius(View view, String str, double d) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setCornerRadius((int) d);
        view.setBackground(gradientDrawable);
    }

    public void _Card_View(View view, double d, String str, double d2, double d3, String str2) {
        if (d3 == 0.0d) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius((float) d);
            gradientDrawable.setColor(Color.parseColor("#" + str.replace("#", "")));
            view.setBackground(gradientDrawable);
            view.setElevation((float) d2);
            return;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setStroke((int) d3, Color.parseColor("#" + str2.replace("#", "")));
        gradientDrawable2.setCornerRadius((float) d);
        gradientDrawable2.setColor(Color.parseColor("#" + str.replace("#", "")));
        view.setBackground(gradientDrawable2);
        view.setElevation((float) d2);
    }

    void _rippleRoundStroke(View view, String str, String str2, double d, double d2, String str3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setCornerRadius((float) d);
        gradientDrawable.setStroke((int) d2, Color.parseColor("#" + str3.replace("#", "")));
        view.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{Color.parseColor(str2)}), gradientDrawable, null));
    }


    public class AnonymousClass8 implements View.OnClickListener {
        AnonymousClass8() {
        }

        @Override
        public void onClick(View view) {
            MainActivity.this._Card_View(MainActivity.this.linear_tab_1, MainActivity.this.Radius, MainActivity.this.colorPrimary, MainActivity.this.Shadow, MainActivity.this.Stroke, MainActivity.this.colorPrimary);
            MainActivity.this.tmr = new TimerTask() {
                @Override
                public void run() {

                    MainActivity.this.runOnUiThread(() -> {
                        MainActivity.this._Card_View(MainActivity.this.linear_tab_1, MainActivity.this.Radius, MainActivity.this.colorPrimaryDark, MainActivity.this.Shadow, MainActivity.this.Stroke, MainActivity.this.colorPrimary);
                        MainActivity.this.i.putExtra("Type", "Type_1");
                        MainActivity.this.i.setClass(MainActivity.this.getApplicationContext(), BookViewActivity.class);
                        MainActivity.this.startActivity(MainActivity.this.i);
                    });
                }
            };
            MainActivity.this._timer.schedule(MainActivity.this.tmr, 150L);
        }
    }


    public class AnonymousClass9 implements View.OnClickListener {
        AnonymousClass9() {
        }

        @Override
        public void onClick(View view) {
            MainActivity.this._Card_View(MainActivity.this.linear_tab_2, MainActivity.this.Radius, MainActivity.this.colorPrimary, MainActivity.this.Shadow, MainActivity.this.Stroke, MainActivity.this.colorPrimary);
            MainActivity.this.tmr = new TimerTask() {
                @Override
                public void run() {

                    MainActivity.this.runOnUiThread(() -> {
                        MainActivity.this._Card_View(MainActivity.this.linear_tab_2, MainActivity.this.Radius, MainActivity.this.colorPrimaryDark, MainActivity.this.Shadow, MainActivity.this.Stroke, MainActivity.this.colorPrimary);
                        MainActivity.this.i.putExtra("Type", "Type_2");
                        MainActivity.this.i.setClass(MainActivity.this.getApplicationContext(), BookViewActivity.class);
                        MainActivity.this.startActivity(MainActivity.this.i);
                    });
                }
            };
            MainActivity.this._timer.schedule(MainActivity.this.tmr, 150L);
        }
    }

    public class AnonymousClass10 implements View.OnClickListener {
        AnonymousClass10() {
        }

        @Override
        public void onClick(View view) {
            MainActivity.this._Card_View(MainActivity.this.linear_tab_3, MainActivity.this.Radius, MainActivity.this.colorPrimary, MainActivity.this.Shadow, MainActivity.this.Stroke, MainActivity.this.colorPrimary);
            MainActivity.this.tmr = new TimerTask() {
                @Override
                public void run() {
                    MainActivity.this.runOnUiThread(() -> {
                        MainActivity.this._Card_View(MainActivity.this.linear_tab_3, MainActivity.this.Radius, MainActivity.this.colorPrimaryDark, MainActivity.this.Shadow, MainActivity.this.Stroke, MainActivity.this.colorPrimary);
                        MainActivity.this.i.putExtra("Type", "Type_3");
                        MainActivity.this.i.setClass(MainActivity.this.getApplicationContext(), BookViewActivity.class);
                        MainActivity.this.startActivity(MainActivity.this.i);
                    });
                }
            };
            MainActivity.this._timer.schedule(MainActivity.this.tmr, 150L);
        }
    }

    public class AnonymousClass11 implements View.OnClickListener {
        AnonymousClass11() {
        }

        @Override
        public void onClick(View view) {
            MainActivity.this._Card_View(MainActivity.this.linear_tab_4, MainActivity.this.Radius, MainActivity.this.colorPrimary, MainActivity.this.Shadow, MainActivity.this.Stroke, MainActivity.this.colorPrimary);
            MainActivity.this.tmr = new TimerTask() {
                @Override
                public void run() {
                    MainActivity.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            MainActivity.this._Card_View(MainActivity.this.linear_tab_4, MainActivity.this.Radius, MainActivity.this.colorPrimaryDark, MainActivity.this.Shadow, MainActivity.this.Stroke, MainActivity.this.colorPrimary);
                            MainActivity.this.i.putExtra("Type", "Type_4");
                            MainActivity.this.i.setClass(MainActivity.this.getApplicationContext(), BookViewActivity.class);
                            MainActivity.this.startActivity(MainActivity.this.i);
                        }
                    });
                }
            };
            MainActivity.this._timer.schedule(MainActivity.this.tmr, 150L);
        }
    }


    public class AnonymousClass12 implements View.OnClickListener {
        AnonymousClass12() {
        }

        @Override
        public void onClick(View view) {
            MainActivity.this._Card_View(MainActivity.this.linear_tab_5, MainActivity.this.Radius, MainActivity.this.colorPrimary, MainActivity.this.Shadow, MainActivity.this.Stroke, MainActivity.this.colorPrimary);
            MainActivity.this.tmr = new TimerTask() {
                @Override
                public void run() {

                    MainActivity.this.runOnUiThread(() -> {
                        MainActivity.this._Card_View(MainActivity.this.linear_tab_5, MainActivity.this.Radius, MainActivity.this.colorPrimaryDark, MainActivity.this.Shadow, MainActivity.this.Stroke, MainActivity.this.colorPrimary);
                        MainActivity.this.i.putExtra("Type", "Type_5");
                        MainActivity.this.i.setClass(MainActivity.this.getApplicationContext(), BookViewActivity.class);
                        MainActivity.this.startActivity(MainActivity.this.i);
                    });
                }
            };
            MainActivity.this._timer.schedule(MainActivity.this.tmr, 150L);
        }
    }

    public class AnonymousClass13 implements View.OnClickListener {
        AnonymousClass13() {
        }

        @Override
        public void onClick(View view) {
            MainActivity.this._Card_View(MainActivity.this.linear_tab_6, MainActivity.this.Radius, MainActivity.this.colorPrimary, MainActivity.this.Shadow, MainActivity.this.Stroke, MainActivity.this.colorPrimary);
            MainActivity.this.tmr = new TimerTask() {
                @Override
                public void run() {
                    MainActivity.this.runOnUiThread(() -> {
                        MainActivity.this._Card_View(MainActivity.this.linear_tab_6, MainActivity.this.Radius, MainActivity.this.colorPrimaryDark, MainActivity.this.Shadow, MainActivity.this.Stroke, MainActivity.this.colorPrimary);
                        MainActivity.this.i.putExtra("Type", "Type_6");
                        MainActivity.this.i.setClass(MainActivity.this.getApplicationContext(), BookViewActivity.class);
                        MainActivity.this.startActivity(MainActivity.this.i);
                    });
                }
            };
            MainActivity.this._timer.schedule(MainActivity.this.tmr, 150L);
        }
    }


    public class AnonymousClass14 implements View.OnClickListener {
        AnonymousClass14() {
        }

        @Override
        public void onClick(View view) {
            MainActivity.this._Card_View(MainActivity.this.linear_tab_7, MainActivity.this.Radius, MainActivity.this.colorPrimary, MainActivity.this.Shadow, MainActivity.this.Stroke, MainActivity.this.colorPrimary);
            MainActivity.this.tmr = new TimerTask() {
                @Override
                public void run() {
                    MainActivity.this.runOnUiThread(() -> {
                        MainActivity.this._Card_View(MainActivity.this.linear_tab_7, MainActivity.this.Radius, MainActivity.this.colorPrimaryDark, MainActivity.this.Shadow, MainActivity.this.Stroke, MainActivity.this.colorPrimary);
                        MainActivity.this.i.putExtra("Type", "Type_7");
                        MainActivity.this.i.setClass(MainActivity.this.getApplicationContext(), BookViewActivity.class);
                        MainActivity.this.startActivity(MainActivity.this.i);
                    });
                }
            };
            MainActivity.this._timer.schedule(MainActivity.this.tmr, 150L);
        }
    }


    public class AnonymousClass15 implements View.OnClickListener {
        AnonymousClass15() {
        }

        @Override
        public void onClick(View view) {
            MainActivity.this._Card_View(MainActivity.this.linear_tab_8, MainActivity.this.Radius, MainActivity.this.colorPrimary, MainActivity.this.Shadow, MainActivity.this.Stroke, MainActivity.this.colorPrimary);
            MainActivity.this.tmr = new TimerTask() {
                @Override
                public void run() {
                    MainActivity.this.runOnUiThread(() -> {
                        MainActivity.this._Card_View(MainActivity.this.linear_tab_8, MainActivity.this.Radius, MainActivity.this.colorPrimaryDark, MainActivity.this.Shadow, MainActivity.this.Stroke, MainActivity.this.colorPrimary);
                        MainActivity.this.i.putExtra("Type", "Type_8");
                        MainActivity.this.i.setClass(MainActivity.this.getApplicationContext(), BookViewActivity.class);
                        MainActivity.this.startActivity(MainActivity.this.i);
                    });
                }
            };
            MainActivity.this._timer.schedule(MainActivity.this.tmr, 150L);
        }
    }


    public class AnonymousClass16 implements View.OnClickListener {
        AnonymousClass16() {
        }

        @Override
        public void onClick(View view) {
            MainActivity.this._Card_View(MainActivity.this.linear_tab_9, MainActivity.this.Radius, MainActivity.this.colorPrimary, MainActivity.this.Shadow, MainActivity.this.Stroke, MainActivity.this.colorPrimary);
            MainActivity.this.tmr = new TimerTask() {
                @Override
                public void run() {
                    MainActivity.this.runOnUiThread(() -> {
                        MainActivity.this._Card_View(MainActivity.this.linear_tab_9, MainActivity.this.Radius, MainActivity.this.colorPrimaryDark, MainActivity.this.Shadow, MainActivity.this.Stroke, MainActivity.this.colorPrimary);
                        MainActivity.this.i.putExtra("Type", "Type_9");
                        MainActivity.this.i.setClass(MainActivity.this.getApplicationContext(), BookViewActivity.class);
                        MainActivity.this.startActivity(MainActivity.this.i);
                    });
                }
            };
            MainActivity.this._timer.schedule(MainActivity.this.tmr, 150L);
        }
    }


    public class AnonymousClass17 implements View.OnClickListener {
        AnonymousClass17() {
        }

        @Override
        public void onClick(View view) {
            MainActivity.this._Card_View(MainActivity.this.linear_tab_10, MainActivity.this.Radius, MainActivity.this.colorPrimary, MainActivity.this.Shadow, MainActivity.this.Stroke, MainActivity.this.colorPrimary);
            MainActivity.this.tmr = new TimerTask() {
                @Override
                public void run() {

                    MainActivity.this.runOnUiThread(() -> {
                        MainActivity.this._Card_View(MainActivity.this.linear_tab_10, MainActivity.this.Radius, MainActivity.this.colorPrimaryDark, MainActivity.this.Shadow, MainActivity.this.Stroke, MainActivity.this.colorPrimary);
                        MainActivity.this.i.putExtra("Type", "Type_10");
                        MainActivity.this.i.setClass(MainActivity.this.getApplicationContext(), BookViewActivity.class);
                        MainActivity.this.startActivity(MainActivity.this.i);
                    });
                }
            };
            MainActivity.this._timer.schedule(MainActivity.this.tmr, 150L);
        }
    }

    public class AnonymousClass18 implements View.OnClickListener {
        AnonymousClass18() {
        }

        @Override
        public void onClick(View view) {
            MainActivity.this._Card_View(MainActivity.this.linear_tab_11, MainActivity.this.Radius, MainActivity.this.colorPrimary, MainActivity.this.Shadow, MainActivity.this.Stroke, MainActivity.this.colorPrimary);
            MainActivity.this.tmr = new TimerTask() {
                @Override
                public void run() {

                    MainActivity.this.runOnUiThread(() -> {
                        MainActivity.this._Card_View(MainActivity.this.linear_tab_11, MainActivity.this.Radius, MainActivity.this.colorPrimaryDark, MainActivity.this.Shadow, MainActivity.this.Stroke, MainActivity.this.colorPrimary);
                        MainActivity.this.i.putExtra("Type", "Type_11");
                        MainActivity.this.i.setClass(MainActivity.this.getApplicationContext(), BookViewActivity.class);
                        MainActivity.this.startActivity(MainActivity.this.i);
                    });
                }
            };
            MainActivity.this._timer.schedule(MainActivity.this.tmr, 150L);
        }
    }

    public class AnonymousClass19 implements View.OnClickListener {
        AnonymousClass19() {
        }

        @Override
        public void onClick(View view) {
            MainActivity.this._Card_View(MainActivity.this.linear_tab_12, MainActivity.this.Radius, MainActivity.this.colorPrimary, MainActivity.this.Shadow, MainActivity.this.Stroke, MainActivity.this.colorPrimary);
            MainActivity.this.tmr = new TimerTask() {
                @Override
                public void run() {

                    MainActivity.this.runOnUiThread(() -> {
                        MainActivity.this._Card_View(MainActivity.this.linear_tab_12, MainActivity.this.Radius, MainActivity.this.colorPrimaryDark, MainActivity.this.Shadow, MainActivity.this.Stroke, MainActivity.this.colorPrimary);
                        MainActivity.this.i.putExtra("Type", "Type_12");
                        MainActivity.this.i.setClass(MainActivity.this.getApplicationContext(), BookViewActivity.class);
                        MainActivity.this.startActivity(MainActivity.this.i);
                    });
                }
            };
            MainActivity.this._timer.schedule(MainActivity.this.tmr, 150L);
        }
    }


    public void _Share() {
        this.aa = "'Love Story ' এপ্লিকেশনটি আমার খুবই ভালো লেগেছে, আশা করি আপনারও অনেক ভালো লাগবে। নিচের লিংক থেকে আপনি অ্যাপ ইনস্টল করতে পারবেন।";
        this.bb = "https://play.google.com/store/apps/details?id=com.twisthour.love_story";
        this.code = this.aa.concat("\n\n".concat(this.bb));
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", this.code);
        intent.putExtra("android.intent.extra.SUBJECT", "Love Story ");
        startActivity(Intent.createChooser(intent, "Share App using"));
    }


    public void _More_Apps() {
        this.web.setAction("android.intent.action.VIEW");
        this.web.setData(Uri.parse("https://play.google.com/store/apps/developer?id=Yeasin+Rabbi"));
        startActivity(this.web);
    }


    public void _Rate_Apps() {
        this.web.setAction("android.intent.action.VIEW");
        this.web.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.twisthour.love_story"));
        startActivity(this.web);
    }


    public class TypefaceSpan extends MetricAffectingSpan {
        Typeface mTypeface;

        @Override
        public void updateMeasureState(TextPaint textPaint) {
            textPaint.setTypeface(this.mTypeface);
            textPaint.setFlags(textPaint.getFlags() | Paint.SUBPIXEL_TEXT_FLAG);
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setTypeface(this.mTypeface);
            textPaint.setFlags(textPaint.getFlags() | Paint.SUBPIXEL_TEXT_FLAG);
        }
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);

        } else {



           dialog();
         //   if (back_pressed + 1000 > System.currentTimeMillis()) {
         //       super.onBackPressed();
         //   } else {
        //        Toast.makeText(getBaseContext(),
        //                        "Press once again to exit!", Toast.LENGTH_SHORT)
        //                .show();
       //     }
        //    back_pressed = System.currentTimeMillis();

        }

    }

    private void dialog() {

        LayoutInflater inflater = getLayoutInflater();
        View dialoglayout = inflater.inflate(R.layout.dialog_name, null);
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setView(dialoglayout);


        TextView textView1 = dialoglayout.findViewById(R.id.textView1);
        TextView textView2 = dialoglayout.findViewById(R.id.textView2);
        TextView textView3 = dialoglayout.findViewById(R.id.textView3);
        TextView textView4 = dialoglayout.findViewById(R.id.textView4);
        TextView textView5 = dialoglayout.findViewById(R.id.textView5);


        textView3.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://play.google.com/store/apps/details?id=com.twisthour.love_story"));
            startActivity(intent);
        });
        textView4.setOnClickListener(v -> builder.dismiss());
        textView5.setOnClickListener(v -> finish());



        // dialog night
        if (this.data.getString("theme", "").equals("night_theme")) {

            dialoglayout.setBackground(getResources().getDrawable(R.color.darkColorPrimaryDark));


            textView1.setTextColor(getResources().getColor(R.color.white));
            textView2.setTextColor(getResources().getColor(R.color.white_dark));
            textView3.setTextColor(getResources().getColor(R.color.white));
            textView4.setTextColor(getResources().getColor(R.color.white));
            textView5.setTextColor(getResources().getColor(R.color.ligtht_blue));


        } else {

            dialoglayout.setBackground(getResources().getDrawable(R.color.white));


            textView1.setTextColor(getResources().getColor(R.color.black));
            textView2.setTextColor(getResources().getColor(R.color.black));
            textView3.setTextColor(getResources().getColor(R.color.black));
            textView4.setTextColor(getResources().getColor(R.color.md_deep_orange_A400));
            textView5.setTextColor(getResources().getColor(R.color.ligtht_blue));


        }


        builder = alertDialog.create();
        builder.show();

    }


    @SuppressLint("NotifyDataSetChanged")
    private void history_delete_dialog() {

        LayoutInflater inflater = getLayoutInflater();
        View dialoglayout = inflater.inflate(R.layout.dialog_history, null);
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setView(dialoglayout);


        TextView textView1 = dialoglayout.findViewById(R.id.textView1);
        TextView textView2 = dialoglayout.findViewById(R.id.textView2);
        TextView textView3 = dialoglayout.findViewById(R.id.textView3);
        TextView textView4 = dialoglayout.findViewById(R.id.textView4);
        TextView textView5 = dialoglayout.findViewById(R.id.textView5);

        textView2.setText("In this case, all item history will be deleted\nAre you sure you want to delete this" +
                "\nitem?");

        textView3.setOnClickListener(v -> {

            new Helper(MainActivity.this).deleteHis();
            historyModelList.clear();
            historyAdapter.notifyDataSetChanged();


        });
        textView4.setOnClickListener(v -> builder.dismiss());
        textView5.setOnClickListener(v -> {

            new Helper(MainActivity.this).deleteHis();
            historyModelList.clear();
            historyAdapter.notifyDataSetChanged();
            builder.dismiss();
            Toast.makeText(MainActivity.this, "Deleted successfully", Toast.LENGTH_SHORT).show();


        });


        if (this.data.getString("theme", "").equals("night_theme")) {

            dialoglayout.setBackground(getResources().getDrawable(R.color.darkColorPrimaryDark));


            textView1.setTextColor(getResources().getColor(R.color.white));
            textView2.setTextColor(getResources().getColor(R.color.white_dark));
            textView3.setTextColor(getResources().getColor(R.color.colorAccent));
            textView4.setTextColor(getResources().getColor(R.color.white_dark));
            textView5.setTextColor(getResources().getColor(R.color.white));


        } else {

            dialoglayout.setBackground(getResources().getDrawable(R.color.white));


            textView1.setTextColor(getResources().getColor(R.color.black));
            textView2.setTextColor(getResources().getColor(R.color.black_light));
            textView3.setTextColor(getResources().getColor(R.color.colorAccent));
            textView4.setTextColor(getResources().getColor(R.color.black_light));
            textView5.setTextColor(getResources().getColor(R.color.white));


        }


        builder = alertDialog.create();
        builder.show();

    }

    @SuppressLint("NotifyDataSetChanged")
    private void favorite_delete_dialog() {

        LayoutInflater inflater = getLayoutInflater();
        View dialoglayout = inflater.inflate(R.layout.dialog_history, null);
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setView(dialoglayout);


        TextView textView1 = dialoglayout.findViewById(R.id.textView1);
        TextView textView2 = dialoglayout.findViewById(R.id.textView2);
        TextView textView3 = dialoglayout.findViewById(R.id.textView3);
        TextView textView4 = dialoglayout.findViewById(R.id.textView4);
        TextView textView5 = dialoglayout.findViewById(R.id.textView5);

        textView2.setText("In this case, all item favorite will be deleted \nAre you sure you want to delete this" +
                "\nitem?");

        textView3.setOnClickListener(v -> {

            new Helper(MainActivity.this).deleteFav();
            favModelList.clear();
            favAdapter.notifyDataSetChanged();


        });
        textView4.setOnClickListener(v -> builder.dismiss());
        textView5.setOnClickListener(v -> {

            new Helper(MainActivity.this).deleteFav();
            favModelList.clear();
            favAdapter.notifyDataSetChanged();

            builder.dismiss();
            Toast.makeText(MainActivity.this, "Deleted successfully", Toast.LENGTH_SHORT).show();


        });


        if (this.data.getString("theme", "").equals("night_theme")) {

            dialoglayout.setBackground(getResources().getDrawable(R.color.darkColorPrimaryDark));


            textView1.setTextColor(getResources().getColor(R.color.white));
            textView2.setTextColor(getResources().getColor(R.color.white_dark));
            textView3.setTextColor(getResources().getColor(R.color.colorAccent));
            textView4.setTextColor(getResources().getColor(R.color.white_dark));
            textView5.setTextColor(getResources().getColor(R.color.white));


        } else {

            dialoglayout.setBackground(getResources().getDrawable(R.color.white));


            textView1.setTextColor(getResources().getColor(R.color.black));
            textView2.setTextColor(getResources().getColor(R.color.black_light));
            textView3.setTextColor(getResources().getColor(R.color.colorAccent));
            textView4.setTextColor(getResources().getColor(R.color.black_light));
            textView5.setTextColor(getResources().getColor(R.color.white));


        }


        builder = alertDialog.create();
        builder.show();

    }


    void showAlertDialog() {

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this, R.style.DialogThemeDark);


        alertDialog.setTitle(Html.fromHtml(" " + "<b>" + "Theme" + "</b>", Html.FROM_HTML_MODE_LEGACY));


        String[] items = {"Follow System", "Light", "Dark "};
        int checkedItem = 2;
        alertDialog.setSingleChoiceItems(items, checkedItem, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:

                        break;
                    case 1:
                        MainActivity.this._theme("theme1");
                        alert.dismiss();

                        break;
                    case 2:
                        MainActivity.this._theme("night_theme");
                        alert.dismiss();
                        break;

                }
            }
        });


        if (this.data.getString("theme", "").equals("night_theme")) {


        } else {


            String colorbackground = "#FFFFFFFF";

        }


        alert = alertDialog.create();
        alert.setCanceledOnTouchOutside(true);
        alert.show();
    }

    void lightshowAlertDialog() {

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this, R.style.DialogThemelight);


        alertDialog.setTitle(Html.fromHtml(" " + "<b>" + "Theme" + "</b>", Html.FROM_HTML_MODE_LEGACY));


        String[] items = {"Follow System", "Light", "Dark "};
        int checkedItem = 1;
        alertDialog.setSingleChoiceItems(items, checkedItem, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:

                        break;
                    case 1:
                        MainActivity.this._theme("theme1");
                        alert.dismiss();

                        break;
                    case 2:
                        MainActivity.this._theme("night_theme");
                        alert.dismiss();
                        break;

                }
            }
        });

        alert = alertDialog.create();
        alert.setCanceledOnTouchOutside(true);
        alert.show();
    }


}