package top.haihuiling.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * @author haihuiling
 * @date 2017-02-26
 */
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
    Button btndot;
    Button backspace;
    TextView result;
    Boolean isPressEqu = false;
    Boolean isPressDiv = false;
    Boolean isPressMul = false;
    Boolean isPressSub = false;
    Boolean isPressPlus = false;
    String lastResult ="";
    Boolean isInvalid = false;
    Boolean isHaveFloat = false;//是否输入了浮点数
    int floatNum = 0;//输入浮点数的位数
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
                    doNumInput("0");
                    result.setText(result.getText()+"0");
                    isPressDiv = false;
                    isPressPlus = false;
                    isPressSub = false;
                    isPressMul = false;
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    doNumInput("1");
                    result.setText(result.getText() + "1");
                    isPressDiv = false;
                    isPressPlus = false;
                    isPressSub = false;
                    isPressMul = false;
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    doNumInput("2");
                    result.setText(result.getText() + "2");
                    isPressDiv = false;
                    isPressPlus = false;
                    isPressSub = false;
                    isPressMul = false;
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    doNumInput("3");
                    result.setText(result.getText() + "3");
                    isPressDiv = false;
                    isPressPlus = false;
                    isPressSub = false;
                    isPressMul = false;
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    doNumInput("4");
                    result.setText(result.getText() + "4");
                    isPressDiv = false;
                    isPressPlus = false;
                    isPressSub = false;
                    isPressMul = false;
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    doNumInput("5");
                    result.setText(result.getText() + "5");
                    isPressDiv = false;
                    isPressPlus = false;
                    isPressSub = false;
                    isPressMul = false;
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    doNumInput("6");
                    result.setText(result.getText() + "6");
                    isPressDiv = false;
                    isPressPlus = false;
                    isPressSub = false;
                    isPressMul = false;
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    doNumInput("7");
                    result.setText(result.getText() + "7");
                    isPressDiv = false;
                    isPressPlus = false;
                    isPressSub = false;
                    isPressMul = false;
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    doNumInput("8");
                    result.setText(result.getText() + "8");
                    isPressDiv = false;
                    isPressPlus = false;
                    isPressSub = false;
                    isPressMul = false;
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    doNumInput("9");
                    result.setText(result.getText() + "9");
                    isPressDiv = false;
                    isPressPlus = false;
                    isPressSub = false;
                    isPressMul = false;
            }
        });
        //处理小数点
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //第一位不能输入小数点
                if(!isHaveFloat && !isPressEqu&&inputs.size()!=0){
                    result.setText(result.getText() + ".");
                    isPressDiv = false;
                    isPressPlus = false;
                    isPressSub = false;
                    isPressMul = false;
                    isHaveFloat = true;
                    floatNum =1;
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isInvalid){
                    result.setText("");
                    isInvalid = false;
                }
                    if(isPressEqu){
                        inputs.add(lastResult);
                        isPressEqu = false;
                        result.setText("Ans");
                    }
                    if(!isPressDiv) {
                        inputs.add("/");
                        result.setText(result.getText() + "÷");
                        isPressDiv = true;
                        isHaveFloat =false;
                        floatNum =0;
                    }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isInvalid){
                    result.setText("");
                    isInvalid = false;
                }
                    if(isPressEqu){
                        inputs.add(lastResult);
                        isPressEqu = false;
                        result.setText("Ans");
                    }
                    if(!isPressSub) {
                        inputs.add("-");
                        result.setText(result.getText() + "-");
                        isPressSub = true;
                        isHaveFloat =false;
                        floatNum =0;
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isInvalid){
                    result.setText("");
                    isInvalid = false;
                }
                if(isPressEqu){
                    inputs.add(lastResult);
                    isPressEqu = false;
                    result.setText("Ans");
                    }
                    if(!isPressMul){
                        inputs.add("*");
                        result.setText(result.getText()+"×");
                        isPressMul = true;
                        isHaveFloat =false;
                        floatNum =0;
                    }
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isInvalid){
                    result.setText("");
                    isInvalid = false;
                }
                if (isPressEqu) {
                    inputs.add(lastResult);
                    isPressEqu = false;
                    result.setText("Ans");
                }
                if (!isPressPlus){
                    inputs.add("+");
                    result.setText(result.getText() + "+");
                    isPressPlus = true;
                    isHaveFloat =false;
                    floatNum =0;
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
                isHaveFloat=false;
                floatNum =0;
                result.setText("");
            }
        });
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isPressEqu && inputs.size()>0) {
                    String last = inputs.get(inputs.size() - 1);
                    if(result.getText().toString().equals("Ans")){
                        result.setText("");
                        inputs.clear();
                        return;
                    }
                    if(last.equals("+")||last.equals("-")||last.equals("*")||last.equals("/")){
                        inputs.remove(inputs.size()-1);
                        result.setText(result.getText().subSequence(0,result.getText().length()));
                    }else {
                        //如果是两位数以上
                        if(Float.parseFloat(last)>10){
                            if(isFloat(last)){
                                 isHaveFloat = true;
                                 floatNum = last.split("\\.")[1].length();
                                 inputs.set(inputs.size()-1,String.valueOf(new BigDecimal(last).subtract(new BigDecimal(Math.pow(10,-(floatNum))*Integer.parseInt(last.split("\\.")[1].substring(floatNum-1,floatNum)))).floatValue()));
                                 if(result.getText().toString().endsWith(".")){
                                     result.setText(result.getText().subSequence(0,result.getText().length()-2));
                                 }else {
                                     result.setText(result.getText().subSequence(0,result.getText().length()-1));
                                 }

                            }else {
                                isHaveFloat = false;
                                floatNum =0;
                                inputs.set(inputs.size()-1,String.valueOf(Integer.parseInt(doResult(last))/10));
                                if(result.getText().toString().endsWith(".")){
                                    result.setText(result.getText().subSequence(0,result.getText().length()-2));
                                }else {
                                    result.setText(result.getText().subSequence(0,result.getText().length()-1));
                                }
                            }
                        }else {
                            if(isFloat(last)){
                                isHaveFloat = true;
                                floatNum = last.split("\\.")[1].length();
                                inputs.set(inputs.size()-1,String.valueOf(new BigDecimal(last).subtract(new BigDecimal(Math.pow(10,-(floatNum))*Integer.parseInt(last.split("\\.")[1].substring(floatNum-1,floatNum)))).floatValue()));
                                if(result.getText().toString().endsWith(".")){
                                    result.setText(result.getText().subSequence(0,result.getText().length()-2));
                                }else {
                                    result.setText(result.getText().subSequence(0,result.getText().length()-1));
                                }
                            }else {
                                isHaveFloat = false;
                                floatNum =0;
                                inputs.remove(inputs.size()-1);
                                if(result.getText().toString().endsWith(".")){
                                    result.setText(result.getText().subSequence(0,result.getText().length()-2));
                                }else {
                                    result.setText(result.getText().subSequence(0,result.getText().length()-1));
                                }
                            }
                        }
                    }
                }
                Log.v("#########",inputs.toString());
            }
        });
        //重点处理等号
        btnEqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isPressEqu) {
                    if (inputs.size() == 0) {
                        result.setText("您还没输入呢!");
                        inputs.clear();
                        temp.clear();
                        isInvalid =true;
                        return;
                    } else {
                        String first = inputs.get(0);
                        if (first.equals("+") || first.equals("-") || first.equals("/") || first.equals("*")) {
                            result.setText("无效的输入!");
                            inputs.clear();
                            temp.clear();
                            isInvalid =true;
                            return;
                        }
                        String last = inputs.get(inputs.size() - 1);
                        if (last.equals("+") || last.equals("-") || last.equals("/") || last.equals("*")) {
                            result.setText("无效的输入!");
                            inputs.clear();
                            temp.clear();
                            isInvalid =true;
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
                                temp.set(i + 1, String.valueOf(new BigDecimal(temp.get(i - 1)).subtract(new BigDecimal(temp.get(i + 1)))));
                                i++;
                            } else if (temp.get(i).equals("+")) {
                                temp.set(i + 1, String.valueOf(new BigDecimal(temp.get(i - 1)).add(new BigDecimal(temp.get(i + 1)))));
                                i++;
                            }
                        }
                        //result.setText(temp.get(temp.size()-1));
                        result.setText(result.getText()+"="+doResult(temp.get(temp.size()-1)));
                        lastResult = doResult(temp.get(temp.size()-1));
                        inputs.clear();
                        temp.clear();
                    }
                    isPressEqu = true;
                    isPressDiv = false;
                    isPressPlus = false;
                    isPressSub = false;
                    isPressMul = false;
                    isHaveFloat = false;
                    floatNum =0;
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
        btndot = (Button)findViewById(R.id.btndot);
        backspace = (Button)findViewById(R.id.btnbackspace);
        return  0;
    }
    protected  void doNumInput(String input){
        if(isInvalid){
            result.setText("");
            isInvalid = false;
        }
        if(isPressEqu){
            inputs.clear();
            temp.clear();
            isPressEqu = false;
            isPressDiv = false;
            isPressPlus = false;
            isPressSub = false;
            isPressMul = false;
            isHaveFloat =false;
            floatNum =0;
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
            Log.v("########",String.valueOf(isHaveFloat));
            if(!isHaveFloat){
                inputs.set(size-1,String.valueOf(Integer.parseInt(last)*10+Integer.parseInt(input)));
            }else{
                inputs.set(size-1,String.valueOf(new BigDecimal(last).add(new BigDecimal(Math.pow(10,-floatNum)*Integer.parseInt(input))).floatValue()));
                Log.v("#######",inputs.toString());
            }
        }
        if(isHaveFloat){
            floatNum++;
        }
    }
    //处理结果 去除.0
    protected  String doResult(String result){
        BigDecimal tempResultBig = new BigDecimal(result);
        BigDecimal  tempResultI = new BigDecimal(tempResultBig.intValue());
        if(Math.abs(tempResultBig.subtract(tempResultI).doubleValue())>0.00000001){
            return  result;
        }
        return  String.valueOf(tempResultI);
    }
    //判断是否为浮点数
    protected  Boolean isFloat(String result){
        if(result.equals("+")||result.equals("-")||result.equals("*")||result.equals("/")){
            return false;
        }
        BigDecimal tempResultBig = new BigDecimal(result);
        BigDecimal  tempResultI = new BigDecimal(tempResultBig.intValue());
        if(Math.abs(tempResultBig.subtract(tempResultI).doubleValue())>0.00000001){
            return  true;
        }
        return  false;
    }
}
