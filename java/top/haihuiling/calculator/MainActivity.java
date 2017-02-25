package top.haihuiling.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> inputs = new ArrayList<>();
    ArrayList<String> temp = new ArrayList<>();
    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnC;
    Button btnDiv;
    Button btnEqu;
    Button btnSub;
    Button btnAdd;
    Button btnMul;
    TextView result;
    Boolean isPressEqu = false;
    Boolean isPressDiv = false;
    Boolean isPressMul = false;
    Boolean isPressSub = false;
    Boolean isPressPlus = false;
//    DisplayMetrics  dm = new DisplayMetrics();
//    int screenWidth  = dm.widthPixels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化按钮
        initButton();
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // if(!isPressEqu){
                    doNumInput("0");
                    result.setText(result.getText()+"0");
                    isPressDiv = false;
                    isPressPlus = false;
                    isPressSub = false;
                    isPressMul = false;
                //}
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if(!isPressEqu) {
                    doNumInput("1");
                    result.setText(result.getText() + "1");
                    isPressDiv = false;
                    isPressPlus = false;
                    isPressSub = false;
                    isPressMul = false;
                //}
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if(!isPressEqu) {
                    doNumInput("2");
                    result.setText(result.getText() + "2");
                    isPressDiv = false;
                    isPressPlus = false;
                    isPressSub = false;
                    isPressMul = false;
                //}
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if(!isPressEqu) {
                    doNumInput("3");
                    result.setText(result.getText() + "3");
                    isPressDiv = false;
                    isPressPlus = false;
                    isPressSub = false;
                    isPressMul = false;
               // }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if(!isPressEqu) {
                    doNumInput("4");
                    result.setText(result.getText() + "4");
                    isPressDiv = false;
                    isPressPlus = false;
                    isPressSub = false;
                    isPressMul = false;
                //}
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if(!isPressEqu) {
                    doNumInput("5");
                    result.setText(result.getText() + "5");
                    isPressDiv = false;
                    isPressPlus = false;
                    isPressSub = false;
                    isPressMul = false;
                //}
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if(!isPressEqu) {
                    doNumInput("6");
                    result.setText(result.getText() + "6");
                    isPressDiv = false;
                    isPressPlus = false;
                    isPressSub = false;
                    isPressMul = false;
               // }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if(!isPressEqu) {
                    doNumInput("7");
                    result.setText(result.getText() + "7");
                    isPressDiv = false;
                    isPressPlus = false;
                    isPressSub = false;
                    isPressMul = false;
               // }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if(!isPressEqu) {
                    doNumInput("8");
                    result.setText(result.getText() + "8");
                    isPressDiv = false;
                    isPressPlus = false;
                    isPressSub = false;
                    isPressMul = false;
                //}
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if (!isPressEqu) {
                    doNumInput("9");
                    result.setText(result.getText() + "9");
                    isPressDiv = false;
                    isPressPlus = false;
                    isPressSub = false;
                    isPressMul = false;
                //}
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPressDiv){
                    inputs.add("/");
                    result.setText(result.getText()+"÷");
                    isPressDiv = true;
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPressSub&&!isPressEqu){
                    inputs.add("-");
                    result.setText(result.getText()+"-");
                    isPressSub = true;
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPressMul&&!isPressEqu){
                    inputs.add("*");
                    result.setText(result.getText()+"×");
                    isPressMul = true;
                }

            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPressPlus&&!isPressEqu){
                    inputs.add("+");
                    result.setText(result.getText()+"+");
                    isPressPlus = true;
                }
            }
        });
        //清除按钮
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputs.clear();
                temp.clear();
                isPressEqu = false;
                isPressDiv = false;
                isPressPlus = false;
                isPressSub = false;
                isPressMul = false;
                result.setText("");
            }
        });
        //重点处理等号
        btnEqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isPressEqu) {
                    if (inputs.size() == 0) {
                        result.setText("您还没输入呢!");
                        isPressEqu =  true;
                        return;
                    } else {
                        String first = inputs.get(0);
                        if (first.equals("+") || first.equals("-") || first.equals("/") || first.equals("*")) {
                            result.setText("无效的输入!");
                            isPressEqu =  true;
                            return;
                        }
                        String last = inputs.get(inputs.size() - 1);
                        if (last.equals("+") || last.equals("-") || last.equals("/") || last.equals("*")) {
                            result.setText("无效的输入!");
                            isPressEqu =  true;
                            return;
                        }
                        for (int index = 0; index < inputs.size(); index++) {
                            if (inputs.get(index).equals("*") || inputs.get(index).equals("/")) {
                                //取temp的最后一个和inputs的下一个
                                int tempSize = temp.size();
                                String lastTemp = temp.get(tempSize - 1);
                                String next = inputs.get(index + 1);
                                if (inputs.get(index).equals("*")) {
                                    temp.set(tempSize - 1, String.valueOf(Float.parseFloat(lastTemp) * Float.parseFloat(next)));
                                    index++;
                                } else {
                                    temp.set(tempSize - 1, String.valueOf(Float.parseFloat(lastTemp) / Float.parseFloat(next)));
                                    index++;
                                }
                            } else {
                                temp.add(inputs.get(index));
                            }
                        }
                        //只剩下加号和减号未处理
                        for (int i = 0; i < temp.size(); i++) {
                            if (temp.get(i).equals("-")) {
                                temp.set(i + 1, String.valueOf(Float.parseFloat(temp.get(i - 1)) - Float.parseFloat(temp.get(i + 1))));
                                i++;
                            } else if (temp.get(i).equals("+")) {
                                temp.set(i + 1, String.valueOf(Float.parseFloat(temp.get(i - 1)) +Float.parseFloat(temp.get(i + 1))));
                                i++;
                            }
                        }
                        result.setText(result.getText()+"="+doResult(temp.get(temp.size()-1)));
                    }
                    isPressEqu = true;
                    //加减乘除都设为true 防止在后边继续添加
                    isPressMul = true;
                    isPressPlus = true;
                    isPressSub = true;
                    isPressDiv = true;
                }else{
                    isPressEqu = true;
                }
            }
        });
    }

    protected  int initButton(){
        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btnDiv =(Button)findViewById(R.id.btnDiv);
        btnEqu =(Button)findViewById(R.id.btnEqu);
        btnC =(Button)findViewById(R.id.btnC);
        btnSub =(Button)findViewById(R.id.btnSub);
        btnAdd =(Button)findViewById(R.id.btnAdd);
        btnMul =(Button)findViewById(R.id.btnMul);
        result =(TextView)findViewById(R.id.tvResult);
        return  0;
    }
    protected  void doNumInput(String input){
        if(isPressEqu){
            inputs.clear();
            temp.clear();
            isPressEqu = false;
            isPressDiv = false;
            isPressPlus = false;
            isPressSub = false;
            isPressMul = false;
            result.setText("");
        }
        int size = inputs.size();
        if(size==0){
            inputs.add(input);
            return;
        }
        String last = inputs.get(size-1);
        //如果上一个输入是操作符 直接加入，否则last*10+input
        if(last.equals("+")||last.equals("-")||last.equals("*")||last.equals("/")){
            inputs.add(input);
        }else{
            inputs.set(size-1,String.valueOf(Integer.parseInt(last)*10+Integer.parseInt(input)));
        }
    }
    //处理结果 去除.0
    protected  String doResult(String result){
        float tempResultF = Float.parseFloat(result);
        int   tempResultI = new Float(tempResultF).intValue();
        if((tempResultF-tempResultI)>0.0000001){
            return   result;
        }
        return  String.valueOf(tempResultI);
    }
}
