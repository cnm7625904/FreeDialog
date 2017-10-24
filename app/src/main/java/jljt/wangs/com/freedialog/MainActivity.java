package jljt.wangs.com.freedialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.support.v7.widget.AppCompatButton;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
  private AppCompatButton btn_give;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_give= (AppCompatButton) findViewById(R.id.btn_give);
        btn_give.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_Dialog();
            }
        });
    }
    //此为DEMO可自己进行封装
    private void show_Dialog()
    {
        //创建兼容包dialog
        final AppCompatDialog dialog=new AppCompatDialog(MainActivity.this,R.style.dialog);
        //设置布局
        dialog.setContentView(R.layout.dialog_full);
       //设置宽高
        int devicewidth=DimenUtil.getScreenWidth(MainActivity.this);
        int deviceheight=DimenUtil.getScreenHeight(MainActivity.this);
        Window dialogWindow=dialog.getWindow();
        WindowManager.LayoutParams lp=dialogWindow.getAttributes();
        if(dialog!=null){
            lp.width=devicewidth;
            lp.height=deviceheight;
            lp.gravity= Gravity.CENTER;
        }
        dialog.show();
        AppCompatButton button=dialogWindow.findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }
}
