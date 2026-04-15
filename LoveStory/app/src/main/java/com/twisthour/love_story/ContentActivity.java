package com.twisthour.love_story;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
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
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.text.util.Linkify;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.gms.ads.AdView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.appbar.AppBarLayout;
import com.twisthour.love_story.Db.Helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

public class ContentActivity extends AppCompatActivity {
    AdView adview1;
     SharedPreferences data;
     AlertDialog.Builder dialog_copy;
     SharedPreferences f;
     ImageView imageview2;
     ImageView imageview3;
    TextView content_textview;
    TextView category_textview;
     ImageView imageview_back;
     ImageView imageview_format;
     LinearLayout linear1;
     LinearLayout linear10;
     LinearLayout linear11;
     LinearLayout linear5;
     LinearLayout linear7;
     LinearLayout linear9;
     LinearLayout linear_actionbar;
     LinearLayout linear_formatting;
     SeekBar seekbar1;
     SeekBar seekbar2;
     TextView titel_textview;
     TextView textview3;
     TextView textview4;
     ScrollView vscroll1;
     HashMap<String, Object> map_var = new HashMap<>();
     String aa = "";
     String bb = "";
     String cc = "";
     String code = "";
     double num = 0.0d;
     String colorPrimary = "";
     String colorPrimaryDark = "";
     String ColorText = "";
     String ColorTextToo = "";
     ArrayList<HashMap<String, Object>> map_list = new ArrayList<>();

    CoordinatorLayout coordinatorLayout;
    LinearLayout linear_bottom;
     ImageView share_bottom_imageview, copy_bottom_imageview, font_bottom_imageview;

     AppBarLayout appbarLayout;

     ImageView fvt_bottom_imageview_book;

    LinearLayout Love_rate ;


    Cursor isFav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        this.data = getSharedPreferences("data", 0);

        fvt_bottom_imageview_book = findViewById(R.id.Love_rate_imageview);
        ImageView copy_imageview = findViewById(R.id.copy_imageview);

         Love_rate = findViewById(R.id.Love_rate);
        LinearLayout copy_layout = findViewById(R.id.copy_layout);
        LinearLayout font = findViewById(R.id.font_layout);
        LinearLayout layout_share = findViewById(R.id.layout_share);

        layout_share.setOnClickListener(v -> _Share());

        Helper helper = new Helper(ContentActivity.this);

       //  isFav = helper.getAt(getIntent().getStringExtra(AppMeasurementSdk.ConditionalUserProperty.NAME),Helper.TYPE_FAV);



        copy_layout.setOnClickListener(v -> {



            copy();

        } );

        font.setOnClickListener(v -> {

            ContentActivity.this.num += 1.0d;
            if (ContentActivity.this.num == 1.0d) {
                ContentActivity.this._TransitionManager(ContentActivity.this.linear_formatting, 500.0d);
                ContentActivity.this.linear_formatting.setVisibility(View.VISIBLE);
                return;
            }
            ContentActivity.this.num = 0.0d;
            ContentActivity.this._TransitionManager(ContentActivity.this.linear_formatting, 500.0d);
            ContentActivity.this.linear_formatting.setVisibility(View.GONE);
        });



        initialize();
        initializeLogic();
    }

     void initialize() {
        this.linear1 =  findViewById(R.id.linear1);
        this.linear_actionbar =  findViewById(R.id.linear_actionbar);
        this.vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
        this.linear5 =  findViewById(R.id.linear5);
        this.linear_formatting =  findViewById(R.id.linear_formatting);
        this.imageview_back =   findViewById(R.id.imageview_back);
        this.titel_textview =   findViewById(R.id.titel_textview);
        this.category_textview =   findViewById(R.id.category_textview);
        this.imageview_format =   findViewById(R.id.imageview_format);
        this.linear11 =  findViewById(R.id.linear11);
        this.linear9 =  findViewById(R.id.linear9);
        this.linear10 =  findViewById(R.id.linear10);
        this.textview3 =   findViewById(R.id.textview3);
        this.textview4 =   findViewById(R.id.textview1m);
        this.imageview2 =   findViewById(R.id.imageview2);
        this.seekbar1 = (SeekBar) findViewById(R.id.seekbar1);
        this.imageview3 =   findViewById(R.id.imageview3);
        this.seekbar2 = (SeekBar) findViewById(R.id.seekbar2);
        this.linear7 =  findViewById(R.id.linear7);
        this.content_textview =   findViewById(R.id.content_textview);
        this.dialog_copy = new AlertDialog.Builder(this);
        this.f = getSharedPreferences("f", 0);

        this.coordinatorLayout = findViewById(R.id.parentLayout);
        this.linear_bottom = findViewById(R.id.linear_bottom);

        this.share_bottom_imageview = findViewById(R.id.share_bottom_imageview);
        //this.fvt_bottom_imageview = findViewById(R.id.Love_rate_imageview);
        this.copy_bottom_imageview = findViewById(R.id.copy_imageview);
        this.font_bottom_imageview = findViewById(R.id.font_bottom_imageview);



        this.appbarLayout = findViewById(R.id.appbarLayout);


        this.imageview_back.setOnClickListener(view -> ContentActivity.this.finish());

        this.imageview_format.setOnClickListener(view -> {
            ContentActivity.this.num += 1.0d;
            if (ContentActivity.this.num == 1.0d) {
                ContentActivity.this.num = 1.0d;
                ContentActivity.this._TransitionManager(ContentActivity.this.linear_formatting, 500.0d);
                ContentActivity.this.linear_formatting.setVisibility(View.VISIBLE);
                return;
            }
            ContentActivity.this.num = 0.0d;
            ContentActivity.this._TransitionManager(ContentActivity.this.linear_formatting, 500.0d);
            ContentActivity.this.linear_formatting.setVisibility(View.GONE);
        });

        this.textview4.setOnClickListener(view -> {
            ContentActivity.this.seekbar1.setProgress(3);
            ContentActivity.this.seekbar2.setProgress(2);
            SketchwareUtil.showMessage(ContentActivity.this.getApplicationContext(), "Reset to default");
        });



        this.seekbar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (i == 1) {
                    ContentActivity.this.f.edit().putString("font", "1").apply();
                    ContentActivity.this.titel_textview.setTextSize(14.0f);
                    ContentActivity.this.content_textview.setTextSize(12.0f);
                }
                if (i == 2) {
                    ContentActivity.this.f.edit().putString("font", "2").apply();
                    ContentActivity.this.titel_textview.setTextSize(16.0f);
                    ContentActivity.this.content_textview.setTextSize(14.0f);
                }
                if (i == 3) {
                    ContentActivity.this.f.edit().putString("font", "3").apply();
                    ContentActivity.this.titel_textview.setTextSize(18.0f);
                    ContentActivity.this.content_textview.setTextSize(16.0f);
                }
                if (i == 4) {
                    ContentActivity.this.f.edit().putString("font", "4").apply();
                    ContentActivity.this.titel_textview.setTextSize(20.0f);
                    ContentActivity.this.content_textview.setTextSize(18.0f);
                }
                if (i == 5) {
                    ContentActivity.this.f.edit().putString("font", "5").apply();
                    ContentActivity.this.titel_textview.setTextSize(22.0f);
                    ContentActivity.this.content_textview.setTextSize(20.0f);
                }
                if (i == 6) {
                    ContentActivity.this.f.edit().putString("font", "6").apply();
                    ContentActivity.this.titel_textview.setTextSize(24.0f);
                    ContentActivity.this.content_textview.setTextSize(22.0f);
                }
                if (i == 7) {
                    ContentActivity.this.f.edit().putString("font", "7").apply();
                    ContentActivity.this.titel_textview.setTextSize(26.0f);
                    ContentActivity.this.content_textview.setTextSize(24.0f);
                }
                if (i == 8) {
                    ContentActivity.this.f.edit().putString("font", "8").apply();
                    ContentActivity.this.titel_textview.setTextSize(28.0f);
                    ContentActivity.this.content_textview.setTextSize(26.0f);
                }
                if (i == 9) {
                    ContentActivity.this.f.edit().putString("font", "9").apply();
                    ContentActivity.this.titel_textview.setTextSize(30.0f);
                    ContentActivity.this.content_textview.setTextSize(28.0f);
                }
                if (i == 10) {
                    ContentActivity.this.f.edit().putString("font", "10").apply();
                    ContentActivity.this.titel_textview.setTextSize(32.0f);
                    ContentActivity.this.content_textview.setTextSize(30.0f);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        this.seekbar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (i == 1) {
                    ContentActivity.this.f.edit().putString("Spacing", "1").apply();
                    ContentActivity.this.content_textview.setLineSpacing(0.0f, 0.75f);
                }
                if (i == 2) {
                    ContentActivity.this.f.edit().putString("Spacing", "2").apply();
                    ContentActivity.this.content_textview.setLineSpacing(0.0f, 1.0f);
                }
                if (i == 3) {
                    ContentActivity.this.f.edit().putString("Spacing", "3").apply();
                    ContentActivity.this.content_textview.setLineSpacing(0.0f, 1.25f);
                }
                if (i == 4) {
                    ContentActivity.this.f.edit().putString("Spacing", "4").apply();
                    ContentActivity.this.content_textview.setLineSpacing(0.0f, 1.5f);
                }
                if (i == 5) {
                    ContentActivity.this.f.edit().putString("Spacing", "5").apply();
                    ContentActivity.this.content_textview.setLineSpacing(0.0f, 1.75f);
                }
                if (i == 6) {
                    ContentActivity.this.f.edit().putString("Spacing", "6").apply();
                    ContentActivity.this.content_textview.setLineSpacing(0.0f, 2.0f);
                }
                if (i == 7) {
                    ContentActivity.this.f.edit().putString("Spacing", "7").apply();
                    ContentActivity.this.content_textview.setLineSpacing(0.0f, 2.25f);
                }
                if (i == 8) {
                    ContentActivity.this.f.edit().putString("Spacing", "8").apply();
                    ContentActivity.this.content_textview.setLineSpacing(0.0f, 2.5f);
                }
                if (i == 9) {
                    ContentActivity.this.f.edit().putString("Spacing", "9").apply();
                    ContentActivity.this.content_textview.setLineSpacing(0.0f, 2.75f);
                }
                if (i == 10) {
                    ContentActivity.this.f.edit().putString("Spacing", "10").apply();
                    ContentActivity.this.content_textview.setLineSpacing(0.0f, 3.0f);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }

     void initializeLogic() {
        _ColorsOnly();
        getApplicationContext();

        ((ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE)).addPrimaryClipChangedListener(() -> {

        });
        this.num = 0.0d;
        this.linear_formatting.setVisibility(View.GONE);
        _click(this.imageview_back);
        _click(this.imageview_format);



        this.titel_textview.setText(getIntent().getStringExtra(AppMeasurementSdk.ConditionalUserProperty.NAME));
        this.content_textview.setText(getIntent().getStringExtra("content"));
        this.category_textview.setText(getIntent().getStringExtra("category"));



        Helper helper = new Helper(this);

        helper.add(getIntent().getStringExtra("content"),getIntent().getStringExtra("content"),getIntent().getStringExtra("category"),new Date().getTime(),Helper.TYPE_HISTORY);












        _Detect_Link(this.titel_textview);
        _Detect_Link(this.content_textview);
        _SelectableText(this.titel_textview);
        _SelectableText(this.content_textview);
        this.seekbar1.setMax(10);
        this.seekbar2.setMax(10);
        if (!this.f.getString("font_default", "").equals("true")) {
            this.seekbar1.setProgress(3);
            this.seekbar2.setProgress(2);
            this.f.edit().putString("font_default", "true").apply();
        }



       if (this.data.getString("theme", "").equals("night_theme")) {
            Window window2 = getWindow();
            window2.clearFlags(67108864);
            window2.addFlags(Integer.MIN_VALUE);
            window2.setStatusBarColor(Color.parseColor("#FF212121"));
            window2.setNavigationBarColor(Color.parseColor("#212121"));
            this.imageview_back.setImageResource(R.drawable.ic_arrow_back_white);
            this.imageview_format.setImageResource(R.drawable.ic_text_format_white);
            this.imageview2.setImageResource(R.drawable.ic_text_format_white);
            this.imageview3.setImageResource(R.drawable.ic_format_line_spacing_white);
            _Card_View(this.linear_formatting, 20.0d, this.colorPrimaryDark, 0.0d, "#E0E0E0");
            this.titel_textview.setTextColor(Color.parseColor(this.ColorText));
            this.content_textview.setTextColor(Color.parseColor(this.ColorText));
            this.textview3.setTextColor(Color.parseColor(this.ColorText));
            this.textview4.setTextColor(Color.parseColor(this.ColorText));
            this.coordinatorLayout.setBackgroundColor(getColor(R.color.darkColorPrimaryDark));
           linear5.setBackgroundColor(getColor(R.color.darkColorPrimary));
           appbarLayout.setBackgroundColor(getColor(R.color.darkColorPrimary));
           linear_bottom.setBackgroundColor(getColor(R.color.darkColorPrimary));



           this.share_bottom_imageview.setImageDrawable(getDrawable(R.drawable.share_white));
           this.fvt_bottom_imageview_book.setImageDrawable(getDrawable(R.drawable.baseline_favorite_border__white));
           this.copy_bottom_imageview.setImageDrawable(getDrawable(R.drawable.copy_white));
           this.font_bottom_imageview.setImageDrawable(getDrawable(R.drawable.ic_baseline_text_fields_24));

           if (isFav != null && isFav.getCount()>0){









                   fvt_bottom_imageview_book.setImageDrawable(getDrawable(R.drawable.fav_white));













           }





           Love_rate.setOnClickListener(new View.OnClickListener() {



               @Override
               public void onClick(View v) {




                   if (isFav != null && isFav.getCount()>0) return;


                   fvt_bottom_imageview_book.setImageDrawable(getDrawable(R.drawable.fav_white));


                   helper.add(getIntent().getStringExtra("content"),getIntent().getStringExtra("content"),getIntent().getStringExtra("category"),new Date().getTime(),Helper.TYPE_FAV);


               }
           });




       }

       else {
            Window window4 = getWindow();
            window4.clearFlags(67108864);
            window4.addFlags(Integer.MIN_VALUE);
            window4.getDecorView().setSystemUiVisibility(8192);
            window4.setStatusBarColor(Color.parseColor("#FFFFFF"));
            window4.setNavigationBarColor(Color.parseColor("#FFFFFF"));
            this.imageview_back.setImageResource(R.drawable.ic_arrow_back_grey);
            this.imageview_format.setImageResource(R.drawable.ic_text_format_grey);
            this.imageview2.setImageResource(R.drawable.ic_text_format_grey);
            this.imageview3.setImageResource(R.drawable.ic_format_line_spacing_grey);
            _Card_View(this.linear_formatting, 20.0d, this.colorPrimaryDark, 0.0d, "#E0E0E0");
            this.titel_textview.setTextColor(Color.parseColor(this.ColorText));
            this.content_textview.setTextColor(Color.parseColor(this.ColorText));
            this.textview3.setTextColor(Color.parseColor(this.ColorText));
            this.textview4.setTextColor(Color.parseColor(this.ColorText));
           this.coordinatorLayout.setBackgroundColor(getColor(R.color.white));
           linear5.setBackgroundColor(getColor(R.color.white));
           appbarLayout.setBackgroundColor(getColor(R.color.white));
           linear_bottom.setBackgroundColor(getColor(R.color.bottom_color));







           this.share_bottom_imageview.setImageDrawable(getDrawable(R.drawable.share_grey));
           this.fvt_bottom_imageview_book.setImageDrawable(getDrawable(R.drawable.ic_favourite_unselect));
           this.copy_bottom_imageview.setImageDrawable(getDrawable(R.drawable.ic_baseline_file_copy_24));
           this.font_bottom_imageview.setImageDrawable(getDrawable(R.drawable.baseline_text_fields__grey));




           if (isFav != null && isFav.getCount()>0){









                  fvt_bottom_imageview_book.setImageDrawable(getDrawable(R.drawable.ic_favourite_select));









           }



           Love_rate.setOnClickListener(new View.OnClickListener() {



               @Override
               public void onClick(View v) {




                   if (isFav != null && isFav.getCount()>0) return;


                   fvt_bottom_imageview_book.setImageDrawable(getDrawable(R.drawable.ic_favourite_select));


                   helper.add(getIntent().getStringExtra("content"),getIntent().getStringExtra("content"),getIntent().getStringExtra("category"),new Date().getTime(),Helper.TYPE_FAV);


               }
           });







       }
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


    @Override
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override
    public void onBackPressed() {

        finish();
    }

    @Override
    public void onStart() {
        super.onStart();


        if (this.f.getString("font", "").equals("1")) {
            this.seekbar1.setProgress(1);
            this.titel_textview.setTextSize(14.0f);
            this.content_textview.setTextSize(12.0f);
        }
        if (this.f.getString("font", "").equals("2")) {
            this.seekbar1.setProgress(2);
            this.titel_textview.setTextSize(16.0f);
            this.content_textview.setTextSize(14.0f);
        }
        if (this.f.getString("font", "").equals("3")) {
            this.seekbar1.setProgress(3);
            this.titel_textview.setTextSize(18.0f);
            this.content_textview.setTextSize(16.0f);
        }
        if (this.f.getString("font", "").equals("4")) {
            this.seekbar1.setProgress(4);
            this.titel_textview.setTextSize(20.0f);
            this.content_textview.setTextSize(18.0f);
        }
        if (this.f.getString("font", "").equals("5")) {
            this.seekbar1.setProgress(5);
            this.titel_textview.setTextSize(22.0f);
            this.content_textview.setTextSize(20.0f);
        }
        if (this.f.getString("font", "").equals("6")) {
            this.seekbar1.setProgress(6);
            this.titel_textview.setTextSize(24.0f);
            this.content_textview.setTextSize(22.0f);
        }
        if (this.f.getString("font", "").equals("7")) {
            this.seekbar1.setProgress(7);
            this.titel_textview.setTextSize(26.0f);
            this.content_textview.setTextSize(24.0f);
        }
        if (this.f.getString("font", "").equals("8")) {
            this.seekbar1.setProgress(8);
            this.titel_textview.setTextSize(28.0f);
            this.content_textview.setTextSize(26.0f);
        }
        if (this.f.getString("font", "").equals("9")) {
            this.seekbar1.setProgress(9);
            this.titel_textview.setTextSize(30.0f);
            this.content_textview.setTextSize(28.0f);
        }
        if (this.f.getString("font", "").equals("10")) {
            this.seekbar1.setProgress(10);
            this.titel_textview.setTextSize(32.0f);
            this.content_textview.setTextSize(30.0f);
        }
        if (this.f.getString("Spacing", "").equals("1")) {
            this.seekbar2.setProgress(1);
            this.content_textview.setLineSpacing(0.0f, 0.75f);
        }
        if (this.f.getString("Spacing", "").equals("2")) {
            this.seekbar2.setProgress(2);
            this.content_textview.setLineSpacing(0.0f, 1.0f);
        }
        if (this.f.getString("Spacing", "").equals("3")) {
            this.seekbar2.setProgress(3);
            this.content_textview.setLineSpacing(0.0f, 1.25f);
        }
        if (this.f.getString("Spacing", "").equals("4")) {
            this.seekbar2.setProgress(4);
            this.content_textview.setLineSpacing(0.0f, 1.5f);
        }
        if (this.f.getString("Spacing", "").equals("5")) {
            this.seekbar2.setProgress(5);
            this.content_textview.setLineSpacing(0.0f, 1.75f);
        }
        if (this.f.getString("Spacing", "").equals("6")) {
            this.seekbar2.setProgress(6);
            this.content_textview.setLineSpacing(0.0f, 2.0f);
        }
        if (this.f.getString("Spacing", "").equals("7")) {
            this.seekbar2.setProgress(7);
            this.content_textview.setLineSpacing(0.0f, 2.25f);
        }
        if (this.f.getString("Spacing", "").equals("8")) {
            this.seekbar2.setProgress(8);
            this.content_textview.setLineSpacing(0.0f, 2.5f);
        }
        if (this.f.getString("Spacing", "").equals("9")) {
            this.seekbar2.setProgress(9);
            this.content_textview.setLineSpacing(0.0f, 2.75f);
        }
        if (this.f.getString("Spacing", "").equals("10")) {
            this.seekbar2.setProgress(10);
            this.content_textview.setLineSpacing(0.0f, 3.0f);
        }
    }

     void _click(View view) {
        view.setClickable(true);
        view.setBackground(CircleDrawables.getSelectableDrawableFor(Color.parseColor(this.colorPrimaryDark)));
    }

     void _Card_View(View view, double d, String str, double d3, String str2) {
        if (d3 == 0.0d) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius((float) d);
            gradientDrawable.setColor(Color.parseColor("#" + str.replace("#", "")));
            view.setBackground(gradientDrawable);
            view.setElevation((float) 2.0);
            return;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setStroke((int) d3, Color.parseColor("#" + str2.replace("#", "")));
        gradientDrawable2.setCornerRadius((float) d);
        gradientDrawable2.setColor(Color.parseColor("#" + str.replace("#", "")));
        view.setBackground(gradientDrawable2);
        view.setElevation((float) 2.0);
    }

     void _Detect_Link(TextView textView) {
        textView.setClickable(true);
        Linkify.addLinks(textView, Linkify.ALL);
        textView.setLinkTextColor(Color.parseColor("#FF2196F3"));
        textView.setLinksClickable(true);
    }

     void copy() {
        this.aa = "";
        this.bb = this.content_textview.getText().toString();
        this.cc = "";

                ContentActivity.this.code = ContentActivity.this.aa.concat("\n\n".concat(ContentActivity.this.bb.concat("\n\n".concat(ContentActivity.this.cc))));
                ContentActivity contentActivity = ContentActivity.this;
                ContentActivity.this.getApplicationContext();
                ((ClipboardManager) contentActivity.getSystemService(Context.CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", ContentActivity.this.code));
                SketchwareUtil.showMessage(ContentActivity.this.getApplicationContext(), "কপি সম্পন্ন হয়েছে");

    }

     void _Share() {
        this.aa = this.titel_textview.getText().toString();
        this.bb = this.content_textview.getText().toString();
        this.cc = "* Download more our apps from the link given below :  https://play.google.com/store/apps/developer?id=Yeasin+Rabbi";
        this.code = this.aa.concat("\n\n".concat(this.bb.concat("\n\n".concat(this.cc))));
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", this.code);
        intent.putExtra("android.intent.extra.SUBJECT", "");
        startActivity(Intent.createChooser(intent, "Share text using"));
    }

    public class TypefaceSpan extends MetricAffectingSpan {
         Typeface mTypeface;
         LruCache<String, Typeface> sTypefaceCache = new LruCache<>(12);

        public TypefaceSpan(Context context, String str) {
            this.mTypeface = this.sTypefaceCache.get(str);
            if (this.mTypeface == null) {
                this.mTypeface = Typeface.createFromAsset(context.getApplicationContext().getAssets(), String.format("fonts/%s", str));
                this.sTypefaceCache.put(str, this.mTypeface);
            }
        }

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

     void _SelectableText(TextView textView) {
        textView.setTextIsSelectable(true);
    }

    public void _TransitionManager(View view, double d) {
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.setDuration((long) d);
        TransitionManager.beginDelayedTransition((ViewGroup) view, autoTransition);
    }

     void _ColorsOnly() {
        if (this.data.getString("theme", "").equals("theme4th_unused")) {
            this.colorPrimary = "#006064";
            this.colorPrimaryDark = "#FFFFFF";
            this.ColorText = "#FFFFFF";
            this.ColorTextToo = "#000000";
        } else if (this.data.getString("theme", "").equals("night_theme")) {
            this.colorPrimary = "#424242";
            this.colorPrimaryDark = "#171717";
            this.ColorText = "#FFFFFF";
        } else if (this.data.getString("theme", "").equals("theme_2nd_unused")) {
            this.colorPrimary = "#FFF3E0";
            this.colorPrimaryDark = "#FFE0B2";
            this.ColorText = "#000000";
        } else {
            this.colorPrimary = "#FFFFFF";
            this.colorPrimaryDark = "#E0E0E0";
            this.ColorText = "#000000";
        }
    }


}