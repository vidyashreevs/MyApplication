package edison.vidya.myapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class TimerActivity extends Activity implements View.OnClickListener {
    private boolean flag1 = false;
    private boolean flag2 = false;
    private boolean flag3 = false;
    private boolean flag4 = false;

    NumberPicker np, np1, np2, np3, np5, np6, np7, np8, np9;
    Button sunday, monday, tuesday, wednesday, thusday, friday, saturday, setoperation, timerlist, settimer;
    TextView tvon, tvoff, tvvv,label;
    CheckBox cb_rgb, cb_switch21,cb_switch51,cb_switch2,cb_switch3,cb_switch8,cb_dimmer,cb_curtain,cb_projector,cb_pir,cb_bell,cb_dog,cb_geyser,cb_sprinkler,cb_ac,cb_doorlock, cb_add_user;
    LinearLayout repeat;
    ArrayList aa,aa1,aa2;
    String name,name1,name2;
    ListView mtv;
    Button flash, fade, strobe, smooth;
    TextView tvspeed;
    SeekBar brightness;
    Context context;
    RadioButton rb1,rb2,rb3,rb_reppattern;
    LinearLayout ld1,ld2,ld3,ld4,ld5,ld6;
    View alertLayout;
    Button colorview;
    int color_bright;
    Object fsfs_speed, tvspeed1,color_fsfs;
    Integer rrr, ggg, bbb;
    private Button save,cancel;
    private String fsfs;
    int nnp1;
    int nnp2;
    int nnp3;
    int nnp4;
    int nnp5;
    int nnp6;
    int nnp7;
    int nnp8;
    int nnp9;
    int a, b, c, d, e, f, g;
    String fromtime, totime,zero,zero1,abcd,repdata,pushtype,one, two, three, four,check1;
    String nnnp1, nnnp2, nnnp3, nnnp4, nnnp5, nnnp6, nnnp7;
    private String responseBody;
    private String r;
    private String switch_data;
    Button s1,s2,s3,s4,s5,fan_dec,fan_inc;
    Spinner fan_speed;
    private String fanspeed;
    private String switch_onoff;
     ArrayList<Object> bulbon;
    private String rep_weekly;
    private String alert_msg;
    private String device_name;
    private String num_switch;
    private String off_data;
    private String on_data;
    private String xyz;
    private String device_type;
    private String devnum;
    private String roomnum;
    List ar_num_switch = new ArrayList();
    List ar_off_data = new ArrayList();
    List ar_on_data = new ArrayList();
    private String resp;
    private String[] numbers;
    private String[] displayedValues,displayedValues2;
    private String choosenValue,choosenValue2;
    private String rrrr,gggg,bbbb;
    ImageView i;
    private String dim_brightness;
    private Button bthigh,btlow,btmedium,btopen,btstop,btclose,btopen_sheer,btclose_sheer,btstop_sheer,btopen_curtain,btclose_curtain,btstop_curtain;
    private String cur_status;
    private CheckBox cb_switch1, cb_user_setting_app;
    private CheckBox cb_server_ip;
    private CheckBox cb_user_sett_app_pwd;
    private CheckBox cb_macid;
    private CheckBox cb_delete_user,pir_lightval;
    private Context mContext;

    public  static final String[] titles = new String[] { "Strawberry",
            "Banana", "Orange", "Mixed",  "Banana", "Orange", "Mixed" };
    public static final Integer[] images = { R.drawable.blue_button,
            R.drawable.blue_button, R.drawable.blue_button, R.drawable.blue_button ,
            R.drawable.blue_button, R.drawable.blue_button, R.drawable.blue_button };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.device_list);

        cb_rgb = (CheckBox) findViewById(R.id.cb_rgb);
        cb_switch1 = (CheckBox) findViewById(R.id.cb_switch1);
        cb_switch21 = (CheckBox) findViewById(R.id.cb_switch21);
        cb_switch51 = (CheckBox) findViewById(R.id.cb_switch51);
        cb_switch2 = (CheckBox) findViewById(R.id.cb_switch2);
        cb_switch3 = (CheckBox) findViewById(R.id.cb_switch3);
        cb_switch8 = (CheckBox) findViewById(R.id.cb_switch8);
        cb_dimmer = (CheckBox) findViewById(R.id.cb_dimmer);
        cb_curtain= (CheckBox) findViewById(R.id.cb_curtain);
        cb_projector= (CheckBox) findViewById(R.id.cb_projector);
        cb_pir= (CheckBox) findViewById(R.id.cb_pir);
        cb_bell= (CheckBox) findViewById(R.id.cb_bell);
        cb_dog= (CheckBox) findViewById(R.id.cb_dog);
        cb_geyser= (CheckBox) findViewById(R.id.cb_geyser);
        cb_sprinkler= (CheckBox) findViewById(R.id.cb_sprinkler);
        cb_ac= (CheckBox) findViewById(R.id.cb_ac);
        cb_doorlock= (CheckBox) findViewById(R.id.cb_doorlock);
        cb_add_user = (CheckBox) findViewById(R.id.cb_add_user);
        cb_server_ip = (CheckBox) findViewById(R.id.cb_server_ip);
        cb_user_sett_app_pwd = (CheckBox) findViewById(R.id.cb_user_sett_app_pwd);
        cb_user_setting_app = (CheckBox) findViewById(R.id.cb_user_setting_app);
        cb_macid = (CheckBox) findViewById(R.id.cb_macid);
        cb_delete_user = (CheckBox) findViewById(R.id.delete_user);
        pir_lightval = (CheckBox) findViewById(R.id.pir_lightval);

        cb_delete_user.setOnClickListener(this);
        cb_switch21.setOnClickListener(this);
        cb_switch51.setOnClickListener(this);
        cb_switch1.setOnClickListener(this);
        cb_switch2.setOnClickListener(this);
        cb_switch3.setOnClickListener(this);
        cb_switch8.setOnClickListener(this);
        cb_rgb.setOnClickListener(this);
        cb_dimmer.setOnClickListener(this);
        cb_curtain.setOnClickListener(this);
        cb_projector.setOnClickListener(this);
        cb_pir.setOnClickListener(this);

        cb_bell.setOnClickListener(this);
        cb_dog.setOnClickListener(this);
        cb_geyser.setOnClickListener(this);
        cb_sprinkler.setOnClickListener(this);
        cb_ac.setOnClickListener(this);
        cb_doorlock.setOnClickListener(this);
        cb_add_user.setOnClickListener(this);
        cb_server_ip.setOnClickListener(this);
        cb_user_sett_app_pwd.setOnClickListener(this);
        cb_user_setting_app.setOnClickListener(this);
        cb_macid.setOnClickListener(this);
        pir_lightval.setOnClickListener(this);

        context=this;
        //mtv= (ListView) findViewById(R.id.mtv);

        boolean checked = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("checkBox1", false);
        cb_switch21.setChecked(checked);

        boolean checked2 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("checkBox1", false);
        cb_switch51.setChecked(checked2);
    }


    @Override
    public void onClick(View view) {
        if (view == cb_rgb) {
            if (cb_rgb.isChecked()) {
                final LayoutInflater inflater1 = getLayoutInflater();
                alertLayout = inflater1.inflate(R.layout.popup_rgb, null);
                AlertDialog.Builder alert = new AlertDialog.Builder(TimerActivity.this, R.style.popup_theme);
                alert.setView(alertLayout);
                alert.setCancelable(true);
                final AlertDialog dialog1 = alert.create();
                dialog1.show();
                int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.70);
                int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.40);
                dialog1.getWindow().setLayout(width, height);
             //   dialog1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
             //   dialog.show();
                dialog1.show();
            }
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        else if (view == cb_switch21) {

            if (cb_switch21.isChecked()) {
                final LayoutInflater inflater1 = getLayoutInflater();
                alertLayout = inflater1.inflate(R.layout.popup_swb2plus1, null);
                AlertDialog.Builder alert = new AlertDialog.Builder(TimerActivity.this, R.style.popup_theme);
                alert.setView(alertLayout);
                alert.setCancelable(true);
                final AlertDialog dialog1 = alert.create();
                dialog1.show();
                int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.60);
                int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.33);
                dialog1.getWindow().setLayout(width, height);
                dialog1.show();
            }
        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        else if (view == cb_switch51) {
            if (cb_switch51.isChecked()) {
                final LayoutInflater inflater1 = getLayoutInflater();
                alertLayout = inflater1.inflate(R.layout.popup_switch5plus1, null);
                AlertDialog.Builder alert = new AlertDialog.Builder(TimerActivity.this, R.style.popup_theme);
                alert.setView(alertLayout);
                alert.setCancelable(true);
                final AlertDialog dialog1 = alert.create();
                dialog1.show();
                int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.60);
                int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.33);
                dialog1.getWindow().setLayout(width, height);
                dialog1.show();

            }
        }
        else if (view == cb_switch1) {
            if (cb_switch1.isChecked()) {
                final LayoutInflater inflater1 = getLayoutInflater();
                alertLayout = inflater1.inflate(R.layout.pop_swb1, null);
                AlertDialog.Builder alert = new AlertDialog.Builder(TimerActivity.this, R.style.popup_theme);
                alert.setView(alertLayout);
                alert.setCancelable(true);
                final AlertDialog dialog1 = alert.create();
                dialog1.show();
                int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.58);
                int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.28);
                dialog1.getWindow().setLayout(width, height);
                dialog1.show();

            }
        }
        else if (view == cb_switch2) {
            if (cb_switch2.isChecked()) {
                final LayoutInflater inflater1 = getLayoutInflater();
                alertLayout = inflater1.inflate(R.layout.popup_swb2, null);
                AlertDialog.Builder alert = new AlertDialog.Builder(TimerActivity.this, R.style.popup_theme);
                alert.setView(alertLayout);
                alert.setCancelable(true);
                final AlertDialog dialog1 = alert.create();
                dialog1.show();
                int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.60);
                int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.33);
                dialog1.getWindow().setLayout(width, height);
                dialog1.show();

            }
        }
        else if (view == cb_switch3) {
            if (cb_switch3.isChecked()) {
                final LayoutInflater inflater1 = getLayoutInflater();
                alertLayout = inflater1.inflate(R.layout.popup_swb3, null);
                AlertDialog.Builder alert = new AlertDialog.Builder(TimerActivity.this, R.style.popup_theme);
                alert.setView(alertLayout);
                alert.setCancelable(true);
                final AlertDialog dialog1 = alert.create();
                dialog1.show();
                int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.60);
                int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.33);
                dialog1.getWindow().setLayout(width, height);
                dialog1.show();
            }
        }
        else if (view == cb_switch8) {
            if (cb_switch8.isChecked()) {
                final LayoutInflater inflater1 = getLayoutInflater();
                alertLayout = inflater1.inflate(R.layout.popup_swb8, null);
                AlertDialog.Builder alert = new AlertDialog.Builder(TimerActivity.this, R.style.popup_theme);
                alert.setView(alertLayout);
                alert.setCancelable(true);
                final AlertDialog dialog1 = alert.create();
                dialog1.show();
                int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.60);
                int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.33);
                dialog1.getWindow().setLayout(width, height);
                dialog1.show();
            }
        }
        else if (view == cb_dimmer) {
            if (cb_dimmer.isChecked()) {

            }
        }
        else if (view == cb_curtain) {
            if (cb_curtain.isChecked()) {
                final LayoutInflater inflater1 = getLayoutInflater();
                alertLayout = inflater1.inflate(R.layout.popup_curtain, null);
                AlertDialog.Builder alert = new AlertDialog.Builder(TimerActivity.this, R.style.popup_theme);
                alert.setView(alertLayout);
                alert.setCancelable(true);
                final AlertDialog dialog1 = alert.create();
                dialog1.show();
                int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.60);
                int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.30);
                dialog1.getWindow().setLayout(width, height);
                dialog1.show();
            }
        }
        else if (view == cb_add_user) {
            if (cb_add_user.isChecked()) {
                final LayoutInflater inflater1 = getLayoutInflater();
                alertLayout = inflater1.inflate(R.layout.popup_adduser, null);
                AlertDialog.Builder alert = new AlertDialog.Builder(TimerActivity.this, R.style.popup_theme);
                alert.setView(alertLayout);
                alert.setCancelable(true);
                final AlertDialog dialog1 = alert.create();
                dialog1.show();

                int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.75);
                int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.32);
                dialog1.getWindow().setLayout(width, height);
                dialog1.show();
            }
        }
        else if (view == cb_server_ip) {
            if (cb_server_ip.isChecked()) {
                final LayoutInflater inflater1 = getLayoutInflater();
                alertLayout = inflater1.inflate(R.layout.popup_serverip, null);
                AlertDialog.Builder alert = new AlertDialog.Builder(TimerActivity.this, R.style.popup_theme);
                alert.setView(alertLayout);
                alert.setCancelable(true);
                final AlertDialog dialog1 = alert.create();
                dialog1.show();

                int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.65);
                int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.30);
                dialog1.getWindow().setLayout(width, height);
                dialog1.show();
            }
        }
        else if (view == cb_user_sett_app_pwd) {
            if (cb_user_sett_app_pwd.isChecked()) {
                final LayoutInflater inflater1 = getLayoutInflater();
                alertLayout = inflater1.inflate(R.layout.popup_user_sett_app_pwd, null);
                AlertDialog.Builder alert = new AlertDialog.Builder(TimerActivity.this, R.style.popup_theme);
                alert.setView(alertLayout);
                alert.setCancelable(true);
                final AlertDialog dialog1 = alert.create();
                dialog1.show();

                int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.65);
                int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.30);
                dialog1.getWindow().setLayout(width, height);
                dialog1.show();
            }
        }
        else if (view == cb_user_setting_app) {
            if (cb_user_setting_app.isChecked()) {
                final LayoutInflater inflater1 = getLayoutInflater();
                alertLayout = inflater1.inflate(R.layout.user_settings_app, null);
                AlertDialog.Builder alert = new AlertDialog.Builder(TimerActivity.this, R.style.popup_theme);
                alert.setView(alertLayout);
                alert.setCancelable(true);
                final AlertDialog dialog1 = alert.create();
                dialog1.show();

                int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.65);
                int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.30);
                dialog1.getWindow().setLayout(width, height);
                dialog1.show();
            }
        }
        else if (view == cb_macid) {
            if (cb_macid.isChecked()) {
                final LayoutInflater inflater1 = getLayoutInflater();
                alertLayout = inflater1.inflate(R.layout.bluetooth_dialog, null);
                AlertDialog.Builder alert = new AlertDialog.Builder(TimerActivity.this, R.style.popup_theme);
                alert.setView(alertLayout);
                alert.setCancelable(true);
                final AlertDialog dialog1 = alert.create();
                dialog1.show();

                int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.80);
                int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.20);
                dialog1.getWindow().setLayout(width, height);
                dialog1.show();
            }
        }
        else if (view == cb_delete_user) {
            if (cb_delete_user.isChecked()) {
                List<RowItem> rowItems;
                mContext = getApplicationContext();
                final LayoutInflater inflater1 = getLayoutInflater();
                alertLayout = inflater1.inflate(R.layout.delete_user_popup, null);
                AlertDialog.Builder alert = new AlertDialog.Builder(TimerActivity.this, R.style.popup_theme);
                alert.setView(alertLayout);
                ListView lv = alertLayout.findViewById(R.id.listvie_deleteuser);

                rowItems = new ArrayList<RowItem>();
                for (int i = 0; i < titles.length; i++) {
                    RowItem item = new RowItem(images[i], titles[i]);
                    rowItems.add(item);
                }
                Custom_Adapter adapter = new Custom_Adapter(this, rowItems);
                lv.setAdapter(adapter);

                //   lv.setAdapter(new Custom_Adapter(mContext,names));
                alert.setCancelable(true);
                final AlertDialog dialog1 = alert.create();
                dialog1.show();

                int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.70);
                int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.35);
                dialog1.getWindow().setLayout(width, height);
                dialog1.show();

            }
        }

        else if (view == pir_lightval) {
            if (pir_lightval.isChecked()) {
                List<RowItem> rowItems;
                mContext = getApplicationContext();
                final LayoutInflater inflater1 = getLayoutInflater();
                alertLayout = inflater1.inflate(R.layout.pop_pirlightvaluesett, null);
                AlertDialog.Builder alert = new AlertDialog.Builder(TimerActivity.this, R.style.popup_theme);
                alert.setView(alertLayout);
                alert.setCancelable(true);
                Spinner spinlightval = (Spinner) alertLayout.findViewById(R.id.spinlightval);
                ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(
                        this, R.array.swbnum, android.R.layout.simple_spinner_item);
                adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinlightval.setAdapter(adapter1);
                final AlertDialog dialog1 = alert.create();
                dialog1.show();
                int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.70);
                int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.30);
                dialog1.getWindow().setLayout(width, height);
                dialog1.show();

            }
        }

    }
}

